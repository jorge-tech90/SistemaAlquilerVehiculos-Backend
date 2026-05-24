package com.unir.alquiler.service;

import com.unir.alquiler.client.VehiculoClient;
import com.unir.alquiler.dto.SolicitudAlquilerDTO;
import com.unir.alquiler.dto.VehiculoDTO;
import org.springframework.stereotype.Service;

@Service
public class OperacionService {

    private final VehiculoClient vehiculoClient;

    public OperacionService(VehiculoClient vehiculoClient) {
        this.vehiculoClient = vehiculoClient;
    }

    public String registrarAlquiler(SolicitudAlquilerDTO solicitud) {
        VehiculoDTO vehiculo = vehiculoClient.obtenerPorId(solicitud.getVehiculoId());

        if (!"DISPONIBLE".equalsIgnoreCase(vehiculo.getEstado())) {
            return "El vehículo no está disponible para alquiler.";
        }

        vehiculo.setEstado("NO_DISPONIBLE");
        vehiculoClient.actualizar(vehiculo.getId(), vehiculo);

        return "Alquiler registrado correctamente para el cliente: " + solicitud.getCliente();
    }

    public String cancelarAlquiler(Long vehiculoId) {
        VehiculoDTO vehiculo = vehiculoClient.obtenerPorId(vehiculoId);

        vehiculo.setEstado("DISPONIBLE");
        vehiculoClient.actualizar(vehiculo.getId(), vehiculo);

        return "Alquiler cancelado correctamente. El vehículo vuelve a estar disponible.";
    }
}
package com.unir.alquiler.service;

import com.unir.alquiler.model.EstadoVehiculo;
import com.unir.alquiler.model.Vehiculo;
import com.unir.alquiler.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    private final VehiculoRepository repository;

    public VehiculoService(VehiculoRepository repository) {
        this.repository = repository;
    }

    public Vehiculo crear(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    public List<Vehiculo> listar() {
        return repository.findAll();
    }

    public Vehiculo consultarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
    }

    public Vehiculo actualizar(Long id, Vehiculo vehiculo) {
        Vehiculo existente = consultarPorId(id);

        existente.setMarca(vehiculo.getMarca());
        existente.setModelo(vehiculo.getModelo());
        existente.setPlaca(vehiculo.getPlaca());
        existente.setAnio(vehiculo.getAnio());
        existente.setPrecioDia(vehiculo.getPrecioDia());
        existente.setEstado(vehiculo.getEstado());

        return repository.save(existente);
    }

    public void eliminar(Long id) {
        Vehiculo existente = consultarPorId(id);
        repository.delete(existente);
    }

    public List<Vehiculo> buscarPorMarca(String marca) {
        return repository.findByMarcaIgnoreCase(marca);
    }

    public List<Vehiculo> buscarPorModelo(String modelo) {
        return repository.findByModeloIgnoreCase(modelo);
    }

    public List<Vehiculo> buscarPorEstado(EstadoVehiculo estado) {
        return repository.findByEstado(estado);
    }
}
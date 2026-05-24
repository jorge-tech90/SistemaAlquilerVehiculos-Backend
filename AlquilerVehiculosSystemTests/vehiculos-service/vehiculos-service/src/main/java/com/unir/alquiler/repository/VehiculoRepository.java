package com.unir.alquiler.repository;

import com.unir.alquiler.model.EstadoVehiculo;
import com.unir.alquiler.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findByMarcaIgnoreCase(String marca);

    List<Vehiculo> findByModeloIgnoreCase(String modelo);

    List<Vehiculo> findByEstado(EstadoVehiculo estado);
}
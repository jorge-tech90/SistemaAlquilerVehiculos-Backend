package com.unir.alquiler.client;

import com.unir.alquiler.dto.VehiculoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "vehiculos-service", url = "http://vehiculos-service:8081")
public interface VehiculoClient {

    @GetMapping("/api/vehiculos/{id}")
    VehiculoDTO obtenerPorId(@PathVariable("id") Long id);

    @PutMapping("/api/vehiculos/{id}")
    VehiculoDTO actualizar(@PathVariable("id") Long id, @RequestBody VehiculoDTO vehiculo);
}
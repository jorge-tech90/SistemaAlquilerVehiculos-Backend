package com.unir.alquiler.controller;

import com.unir.alquiler.model.EstadoVehiculo;
import com.unir.alquiler.model.Vehiculo;
import com.unir.alquiler.service.VehiculoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final VehiculoService service;

    public VehiculoController(VehiculoService service) {
        this.service = service;
    }

    @PostMapping
    public Vehiculo crear(@Valid @RequestBody Vehiculo vehiculo) {
        return service.crear(vehiculo);
    }

    @GetMapping
    public List<Vehiculo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Vehiculo consultar(@PathVariable Long id) {
        return service.consultarPorId(id);
    }

    @PutMapping("/{id}")
    public Vehiculo actualizar(@PathVariable Long id, @Valid @RequestBody Vehiculo vehiculo) {
        return service.actualizar(id, vehiculo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    @GetMapping("/buscar/marca/{marca}")
    public List<Vehiculo> buscarPorMarca(@PathVariable String marca) {
        return service.buscarPorMarca(marca);
    }

    @GetMapping("/buscar/modelo/{modelo}")
    public List<Vehiculo> buscarPorModelo(@PathVariable String modelo) {
        return service.buscarPorModelo(modelo);
    }

    @GetMapping("/buscar/estado/{estado}")
    public List<Vehiculo> buscarPorEstado(@PathVariable EstadoVehiculo estado) {
        return service.buscarPorEstado(estado);
    }
}
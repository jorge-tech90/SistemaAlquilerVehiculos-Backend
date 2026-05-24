package com.unir.alquiler.controller;

import com.unir.alquiler.dto.SolicitudAlquilerDTO;
import com.unir.alquiler.service.OperacionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operaciones")
public class OperacionController {

    private final OperacionService service;

    public OperacionController(OperacionService service) {
        this.service = service;
    }

    @PostMapping("/alquiler")
    public String registrarAlquiler(@RequestBody SolicitudAlquilerDTO solicitud) {
        return service.registrarAlquiler(solicitud);
    }

    @PutMapping("/alquiler/{vehiculoId}/cancelar")
    public String cancelarAlquiler(@PathVariable Long vehiculoId) {
        return service.cancelarAlquiler(vehiculoId);
    }
}
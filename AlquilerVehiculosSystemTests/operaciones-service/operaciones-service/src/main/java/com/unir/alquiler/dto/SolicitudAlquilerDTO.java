package com.unir.alquiler.dto;

public class SolicitudAlquilerDTO {

    private Long vehiculoId;
    private String cliente;
    private String fechaInicio;
    private String fechaFin;

    public Long getVehiculoId() {
        return vehiculoId;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setVehiculoId(Long vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
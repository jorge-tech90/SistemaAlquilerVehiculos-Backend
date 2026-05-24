package com.unir.alquiler.dto;

public class VehiculoDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private Integer anio;
    private Double precioDia;
    private String estado;

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getAnio() {
        return anio;
    }

    public Double getPrecioDia() {
        return precioDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setPrecioDia(Double precioDia) {
        this.precioDia = precioDia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
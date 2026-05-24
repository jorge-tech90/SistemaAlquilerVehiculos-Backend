package com.unir.alquiler.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    @Column(unique = true)
    private String placa;

    @NotNull
    private Integer anio;

    @NotNull
    private Double precioDia;

    @Enumerated(EnumType.STRING)
    private EstadoVehiculo estado = EstadoVehiculo.DISPONIBLE;

    public Vehiculo() {
    }

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

    public EstadoVehiculo getEstado() {
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

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
}
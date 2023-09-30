package com.edu.gt.resource.alumno;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Jose
 */
public class AlumnoResponse {
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;

    public Long getCarnet() {
        return carnet;
    }

    public void setCarnet(Long carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
}

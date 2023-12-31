package com.edu.gt.resource.catedratico;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Jose
 */
public class CatedraticoResponse {
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Long getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(Long codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
}

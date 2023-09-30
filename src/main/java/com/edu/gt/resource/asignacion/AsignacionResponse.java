package com.edu.gt.resource.asignacion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Jose
 */
public class AsignacionResponse {
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long id;
    private Long carnet;
    private Long idCurso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarnet() {
        return carnet;
    }

    public void setCarnet(Long carnet) {
        this.carnet = carnet;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }
    
        
}

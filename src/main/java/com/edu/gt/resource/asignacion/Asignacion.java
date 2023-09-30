package com.edu.gt.resource.asignacion;

import jakarta.persistence.*;

/**
 *
 * @author Jose
 */
@Entity
public class Asignacion {
    
    private Long id;
    private Long carnet;
    private Long idCurso;

    public Asignacion() {
    }

    public Asignacion(Long carnet, Long idCurso) {
        this.carnet = carnet;
        this.idCurso = idCurso;
    }

    @Id
    @SequenceGenerator(name = "asignacionSeq", sequenceName = "asignacion_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "asignacionSeq")

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

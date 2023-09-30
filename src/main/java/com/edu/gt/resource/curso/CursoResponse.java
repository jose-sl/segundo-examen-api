package com.edu.gt.resource.curso;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Jose
 */
public class CursoResponse {
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long id;
    private String titulo;
    private Long numMaxAlumnos;
    private Long creditos;
    private Long codigoCatedratico;
    private Long alumnosAsignados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(Long numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public Long getCreditos() {
        return creditos;
    }

    public void setCreditos(Long creditos) {
        this.creditos = creditos;
    }

    public Long getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(Long codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }

    public Long getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(Long alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }
    
    
    
}

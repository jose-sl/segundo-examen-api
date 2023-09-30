package com.edu.gt.resource.curso;

import jakarta.persistence.*;

/**
 *
 * @author Jose
 */
@Entity
@NamedQuery(name = "Curso.findAll",
      query = "SELECT c FROM Curso c ORDER BY c.id ")
public class Curso {
    
    private Long id;
    private String titulo;
    private Long numMaxAlumnos;
    private Long creditos;
    private Long codigoCatedratico;
    private Long alumnosAsignados;

    public Curso() {
    }

    public Curso(String titulo, Long numMaxAlumnos, Long creditos, Long codigoCatedratico, Long alumnosAsignados) {
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.codigoCatedratico = codigoCatedratico;
        this.alumnosAsignados = alumnosAsignados;
    }    
    
    public boolean verificarEspacio(){
        return true;
    }

    @Id
    @SequenceGenerator(name = "cursoSeq", sequenceName = "curso_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "cursoSeq")
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

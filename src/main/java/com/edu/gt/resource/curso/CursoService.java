package com.edu.gt.resource.curso;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 *
 * @author Jose
 */
@ApplicationScoped
public class CursoService {
    
    @Inject
    EntityManager em;

    public Curso[] consultarCursos() {
        return em.createNamedQuery("Curso.findAll", Curso.class)
                .getResultList().toArray(new Curso[0]);
    }    
    
    @Transactional
    public void crearCurso(CursoRequest cursoRequest) {
        Curso curso = new Curso(
                cursoRequest.getTitulo(), 
                cursoRequest.getNumMaxAlumnos(),
                cursoRequest.getCreditos(),
                cursoRequest.getCodigoCatedratico(),
                cursoRequest.getAlumnosAsignados()
        );
        em.persist(curso);
    }
    
    @Transactional
    public void actualizarCurso(CursoRequest cursoRequest) {
        Curso curso = em.find(Curso.class, cursoRequest.getId());

        curso.setTitulo(cursoRequest.getTitulo());
        curso.setNumMaxAlumnos(cursoRequest.getNumMaxAlumnos());
        curso.setCreditos(cursoRequest.getCreditos());
        curso.setCodigoCatedratico(cursoRequest.getCodigoCatedratico());
        curso.setAlumnosAsignados(cursoRequest.getAlumnosAsignados());
    }
    
    @Transactional
    public void eliminarCurso(CursoRequest cursoRequest) {
        Curso curso = em.find(Curso.class, cursoRequest.getId());
        em.remove(curso);
    }
}

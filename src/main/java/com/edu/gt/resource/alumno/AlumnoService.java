package com.edu.gt.resource.alumno;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 *
 * @author Jose
 */
@ApplicationScoped
public class AlumnoService {
    
    @Inject
    EntityManager em;

    public Alumno[] consultarAlumnos() {
        return em.createNamedQuery("Alumno.findAll", Alumno.class)
                .getResultList().toArray(new Alumno[0]);
    }    
    
    @Transactional
    public void crearAlumno(AlumnoRequest alumnoRequest) {
        Alumno alumno = new Alumno(
                alumnoRequest.getNombre(), 
                alumnoRequest.getDireccion(),
                alumnoRequest.getTelefono(),
                alumnoRequest.getEdad()                
        );
        em.persist(alumno);
    }
    
    @Transactional
    public void actualizarAlumno(AlumnoRequest alumnoRequest) {
        Alumno alumno = em.find(Alumno.class, alumnoRequest.getCarnet());

        alumno.setDireccion(alumnoRequest.getDireccion());
        alumno.setNombre(alumnoRequest.getNombre());
        alumno.setEdad(alumnoRequest.getEdad());
        alumno.setTelefono(alumnoRequest.getTelefono());
    }
    
    @Transactional
    public void eliminarAlumno(AlumnoRequest alumnoRequest) {
        Alumno alumno = em.find(Alumno.class, alumnoRequest.getCarnet());
        em.remove(alumno);
    }
}

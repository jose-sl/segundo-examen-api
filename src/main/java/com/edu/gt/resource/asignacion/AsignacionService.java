package com.edu.gt.resource.asignacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 *
 * @author Jose
 */
@ApplicationScoped
public class AsignacionService {
    
    @Inject
    EntityManager em;
    
    @Transactional
    public void crearAsignacion(AsignacionRequest asignacionRequest) {
        Asignacion asignacion = new Asignacion(
                asignacionRequest.getCarnet(), 
                asignacionRequest.getIdCurso()
        );
        em.persist(asignacion);
    }
}

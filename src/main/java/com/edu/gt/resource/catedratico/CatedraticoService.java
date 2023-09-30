package com.edu.gt.resource.catedratico;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 *
 * @author Jose
 */
@ApplicationScoped
public class CatedraticoService {
    
    @Inject
    EntityManager em;

    public Catedratico[] consultarCatedraticos() {
        return em.createNamedQuery("Catedratico.findAll", Catedratico.class)
                .getResultList().toArray(new Catedratico[0]);
    }    
    
    @Transactional
    public void crearCatedratico(CatedraticoRequest catedraticoRequest) {
        Catedratico catedratico = new Catedratico(
                catedraticoRequest.getNombre(), 
                catedraticoRequest.getDireccion(),
                catedraticoRequest.getTelefono(),
                catedraticoRequest.getProfesion()                
        );
        em.persist(catedratico);
    }
    
    @Transactional
    public void actualizarCatedratico(CatedraticoRequest catedraticoRequest) {
        Catedratico catedratico = em.find(Catedratico.class, catedraticoRequest.getCodigoCatedratico());

        catedratico.setDireccion(catedraticoRequest.getDireccion());
        catedratico.setNombre(catedraticoRequest.getNombre());
        catedratico.setProfesion(catedraticoRequest.getProfesion());
        catedratico.setTelefono(catedraticoRequest.getTelefono());
    }
    
    @Transactional
    public void eliminarCatedratico(CatedraticoRequest catedraticoRequest) {
        Catedratico catedratico = em.find(Catedratico.class, catedraticoRequest.getCodigoCatedratico());
        em.remove(catedratico);
    }
}

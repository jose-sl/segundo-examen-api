package com.edu.gt.resource.curso;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Jose
 */
@Path("/curso")
public class CursoResource {
    
    @Inject
    CursoService cursoService;
    
    @GET
    @Path("/consultar")
    public Curso[] consultarCursos() {
        return cursoService.consultarCursos();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/crear")
    public MensajeResponse crearCurso(CursoRequest cursoRequest){
        cursoService.crearCurso(cursoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Curso creado");
        return response;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/actualizar")
    public MensajeResponse actualizarCurso(CursoRequest cursoRequest) {
        cursoService.actualizarCurso(cursoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Curso actualizado");
        return response;
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/eliminar")
    public MensajeResponse eliminarCurso(CursoRequest cursoRequest) {
        cursoService.eliminarCurso(cursoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Curso eliminado");
        return response;
    }    
}

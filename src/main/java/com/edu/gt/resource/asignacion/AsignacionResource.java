package com.edu.gt.resource.asignacion;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Jose
 */
@Path("/asignacion")
public class AsignacionResource {
    
    @Inject
    AsignacionService asignacionService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/crear")
    public MensajeResponse crearAsignacion(AsignacionRequest asignacionRequest){
        asignacionService.crearAsignacion(asignacionRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Asignación realizada");
        return response;
    }
   
}

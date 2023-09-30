package com.edu.gt.resource.catedratico;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Jose
 */
@Path("/catedratico")
public class CatedraticoResource {
    
    @Inject
    CatedraticoService catedraticoService;
    
    @GET
    @Path("/consultar")
    public Catedratico[] consultarCatedraticos() {
        return catedraticoService.consultarCatedraticos();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/crear")
    public MensajeResponse crearCatedratico(CatedraticoRequest catedraticoRequest){
        catedraticoService.crearCatedratico(catedraticoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Catedrático creado");
        return response;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/actualizar")
    public MensajeResponse actualizarCatedratico(CatedraticoRequest catedraticoRequest) {
        catedraticoService.actualizarCatedratico(catedraticoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Catedrático actualizado");
        return response;
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/eliminar")
    public MensajeResponse eliminarCatedratico(CatedraticoRequest catedraticoRequest) {
        catedraticoService.eliminarCatedratico(catedraticoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Catedrático eliminado");
        return response;
    }    
}

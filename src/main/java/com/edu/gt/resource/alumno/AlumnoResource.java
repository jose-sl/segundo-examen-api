package com.edu.gt.resource.alumno;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Jose
 */
@Path("/alumno")
public class AlumnoResource {
    
    @Inject
    AlumnoService alumnoService;
    
    @GET
    @Path("/consultar")
    public Alumno[] consultarAlumnos() {
        return alumnoService.consultarAlumnos();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/crear")
    public MensajeResponse crearAlumno(AlumnoRequest alumnoRequest){
        alumnoService.crearAlumno(alumnoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Alumno creado");
        return response;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/actualizar")
    public MensajeResponse actualizarAlumno(AlumnoRequest alumnoRequest) {
        alumnoService.actualizarAlumno(alumnoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Alumno actualizado");
        return response;
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/eliminar")
    public MensajeResponse eliminarAlumno(AlumnoRequest alumnoRequest) {
        alumnoService.eliminarAlumno(alumnoRequest);
        MensajeResponse response = new MensajeResponse();
        response.setRespuesta("Alumno eliminado");
        return response;
    }    
}

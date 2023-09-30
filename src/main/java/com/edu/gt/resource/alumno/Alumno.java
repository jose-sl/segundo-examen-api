package com.edu.gt.resource.alumno;

import jakarta.persistence.*;

/**
 *
 * @author Jose
 */
@Entity
@NamedQuery(name = "Alumno.findAll",
      query = "SELECT a FROM Alumno a ORDER BY a.carnet ")
public class Alumno {
    
    private Long carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;

    public Alumno() {
    }

    public Alumno(String nombre, String direccion, String telefono, String edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }   
    
    public void imprimirDatos(){
        System.out.println("Carnet: " + this.carnet);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Edad: " + this.edad);
    }

    @Id
    @SequenceGenerator(name = "alumnoSeq", sequenceName = "alumno_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "alumnoSeq")
    public Long getCarnet() {
        return carnet;
    }

    public void setCarnet(Long carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}

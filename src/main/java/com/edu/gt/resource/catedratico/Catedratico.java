package com.edu.gt.resource.catedratico;

import jakarta.persistence.*;

/**
 *
 * @author Jose
 */
@Entity
@NamedQuery(name = "Catedratico.findAll",
      query = "SELECT c FROM Catedratico c ORDER BY c.codigoCatedratico ")
public class Catedratico {
    
    private Long codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico() {
    }

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }
    
    public void imprimirDatos(){
        System.out.println("Codigo Catedratico: " + this.codigoCatedratico);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Profesion: " + this.profesion);
    }

    @Id
    @SequenceGenerator(name = "catedraticoSeq", sequenceName = "catedratico_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "catedraticoSeq")
    public Long getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(Long codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
}

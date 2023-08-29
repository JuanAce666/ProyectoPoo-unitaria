package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.LocalValidacion;
import org.example.validaciones.OfertaValidacion;

public class Local {
    private int id;
    private String nit;
    private String nombre;
    private int ubicacion;
    private String descripcion;

    private LocalValidacion validacion = new LocalValidacion();

    private Util util= new Util();


    public Local() {
    }

    public Local(int id, String nit, String nombre, int ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local " +
                "id: " + id +
                ", nit: '" + nit + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", ubicacion: " + ubicacion +
                ", descripcion: '" + descripcion + '\'' +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            this.validacion.validarNit(nit);
            this.nit=nit;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacion.validarNombre(nombre);
            this.nombre=nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
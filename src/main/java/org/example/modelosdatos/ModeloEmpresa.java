package org.example.modelosdatos;


import jakarta.persistence.*;

@Entity
public class ModeloEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private int id;
    @Column(name = "nit_empresa")
    private String nit;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ubicacion")
    private int ubicacion;
    @Column(name = "descripcion")
    private String descripcion;

    public ModeloEmpresa() {
    }

    public ModeloEmpresa(int id, String nit, String nombre, int ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
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
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

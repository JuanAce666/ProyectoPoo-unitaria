package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity

public class ModeloUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id;
    @Column(name = "documento")
    private String documento;
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "ubicacion")
    private int ubicacion;

    public ModeloUsuario() {
    }

    public ModeloUsuario(int id, String documento, String nombre, String correo, int ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
}

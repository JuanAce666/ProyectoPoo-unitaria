package org.example.modelos;

public class UsuarioMembresia extends Usuario {

    private Double costoMensual;

    public UsuarioMembresia() {
    }

    public UsuarioMembresia(int id, String documento, String nombre, String correo, int ubicacion, Double costoMensual) {
        super(id, documento, nombre, correo, ubicacion);
        this.costoMensual = costoMensual;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public void agregarInvitado(){}

}

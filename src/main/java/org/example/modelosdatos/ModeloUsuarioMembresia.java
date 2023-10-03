package org.example.modelosdatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioMembresia extends ModeloUsuario {

    @Column(name = "valor_mensual")
    private Double costoMensual;

    @Column(name = "cedula_invitado")
    private Integer cedulaInvitado;


    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(int id, String documento, String nombre, String correo, int ubicacion, Double costoMensual, Integer cedulaInvitado) {
        super(id, documento, nombre, correo, ubicacion);
        this.costoMensual = costoMensual;
        this.cedulaInvitado = cedulaInvitado;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public Integer getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(Integer cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }
}

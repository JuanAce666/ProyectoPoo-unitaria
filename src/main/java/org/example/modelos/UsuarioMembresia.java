package org.example.modelos;

import org.example.modelos.interfaces.IAnalitica;
import org.example.modelos.interfaces.IReporte;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {

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

    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }

    @Override
    public void limpiarDatos(UsuarioMembresia datos) {
        
    }

    @Override
    public void calcularDispersion(UsuarioMembresia datos) {

    }
}

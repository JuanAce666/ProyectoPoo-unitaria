package org.example.modelos;

import org.example.modelos.interfaces.IReporte;

public class EmpresaCultural extends Empresa implements IReporte {
    private String entidad;
    private String mision;
    //private String emailContacto;
    //private String numeroContacto;


    public EmpresaCultural() {
    }

    public EmpresaCultural(int id, String nit, String nombre, int ubicacion, String descripcion, String entidad, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
    }
    @Override
    public Double cobrar(){
        return null;
    }

    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }
}

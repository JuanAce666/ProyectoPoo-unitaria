package org.example.entidades;

public class EmpresaPrivada extends Empresa {

    private String representanteLegal;
    private Double cedula;

    @Override
    public Double cobrar(){
        return null;
    }
}

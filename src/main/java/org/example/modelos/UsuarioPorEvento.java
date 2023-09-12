package org.example.modelos;

public class UsuarioPorEvento extends Usuario {

    private double costoPorEvento;

    public UsuarioPorEvento() {
    }

    public UsuarioPorEvento(Integer id, String documento, String nombres, String correo, Integer ubicacion, double costoPorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoPorEvento = costoPorEvento;
    }

    public double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }

    public void calcularDescuentoPorEvento(){

    }
}

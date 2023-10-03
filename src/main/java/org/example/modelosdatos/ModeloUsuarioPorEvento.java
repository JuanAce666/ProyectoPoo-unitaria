package org.example.modelosdatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioPorEvento extends ModeloUsuario{

    @Column(name = "costo_evento")
    private double costoPorEvento;

    public ModeloUsuarioPorEvento() {
    }

    public ModeloUsuarioPorEvento(int id, String documento, String nombre, String correo, int ubicacion, double costoPorEvento) {
        super(id, documento, nombre, correo, ubicacion);
        this.costoPorEvento = costoPorEvento;
    }

    public double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }
}

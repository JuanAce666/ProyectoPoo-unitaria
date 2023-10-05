package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity
public class ModeloEmpresaPrivada extends ModeloEmpresa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "representante_legal")
    private String representanteLegal;
    @Column(name = "cedula")
    private Double cedula;

    public ModeloEmpresaPrivada() {
    }

    public ModeloEmpresaPrivada(int id, String nit, String nombre, int ubicacion, String descripcion, String representanteLegal, Double cedula) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.representanteLegal = representanteLegal;
        this.cedula = cedula;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Double getCedula() {
        return cedula;
    }

    public void setCedula(Double cedula) {
        this.cedula = cedula;
    }
}

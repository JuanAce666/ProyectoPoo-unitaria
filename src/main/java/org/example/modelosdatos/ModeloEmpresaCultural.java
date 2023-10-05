package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity
public class ModeloEmpresaCultural extends ModeloEmpresa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "mision")
    private String mision;

    public ModeloEmpresaCultural() {
    }

    public ModeloEmpresaCultural(int id, String nit, String nombre, int ubicacion, String descripcion, String entidad, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }
}

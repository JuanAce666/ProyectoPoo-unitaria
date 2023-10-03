package org.example.modelosdatos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class ModeloOferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferta")
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_inicio")
    private LocalDate fechainicio;
    @Column(name = "fecha_fin")
    private LocalDate fechafin;
    @Column(name = "costo_persona")
    private double costopersona;
    @Column(name = "id_local")
    private int idlocal;

    public ModeloOferta() {
    }

    public ModeloOferta(int id, String titulo, String descripcion, LocalDate fechainicio, LocalDate fechafin, double costopersona, int idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(double costopersona) {
        this.costopersona = costopersona;
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }
}

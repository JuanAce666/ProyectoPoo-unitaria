package org.example.modelosdatos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ModeloReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private int id;
    @Column(name = "num_personas")
    private int numeroPer;
    @Column(name = "id_oferta")
    private int idoferta;
    @Column(name = "costo_total")
    private double costototal;
    @Column(name = "fecha_reserva")
    private LocalDate fechareserva;

    public ModeloReserva() {
    }

    public ModeloReserva(int id, int numeroPer, int idoferta, double costototal, LocalDate fechareserva) {
        this.id = id;
        this.numeroPer = numeroPer;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPer() {
        return numeroPer;
    }

    public void setNumeroPer(int numeroPer) {
        this.numeroPer = numeroPer;
    }

    public int getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(int idoferta) {
        this.idoferta = idoferta;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public LocalDate getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(LocalDate fechareserva) {
        this.fechareserva = fechareserva;
    }
}

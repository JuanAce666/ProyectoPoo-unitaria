package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int numeroPer;
    private int idoferta;
    private double costototal;
    private LocalDate fechareserva;
    private Util util= new Util();
    private ReservaValidacion validacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(int id, int numeroPer, int idoferta, double costototal, LocalDate fechareserva) {
        this.id = id;
        this.numeroPer = numeroPer;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
    }

    @Override
    public String toString() {
        return "Reserva " +
                "id: " + id +
                ", numeroPer: " + numeroPer +
                ", id oferta: " + idoferta +
                ", costo total: " + costototal +
                ", fecha reserva: " + fechareserva +
                ' ';
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
        try {
            this.validacion.numeroPer(numeroPer);
            this.numeroPer = numeroPer;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
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

    public void setFechareserva(String fechareserva) {
        try {
            this.validacion.validarFechaRes(fechareserva);
            this.fechareserva=this.util.convertirStringEnLocalDatee(fechareserva);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

}
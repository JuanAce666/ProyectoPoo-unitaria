package org.example;

import org.example.modelos.*;
import org.example.validaciones.OfertaValidacion;
import org.example.validaciones.UsuarioValidacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UsuarioValidacion usuarioValidacion = new UsuarioValidacion();
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        Scanner wea= new Scanner(System.in);
        Usuario objetoUsuario = new Usuario();
        Empresa objetoEmpresa = new Empresa() {
            @Override
            public Double cobrar() {
                return null;
            }
        };
        Oferta objetoOferta = new Oferta();
        Reserva objetoReserva = new Reserva();

        System.out.println("Registrate por favor: ");

        System.out.println("Digite su nombre ");
        objetoUsuario.setNombre(wea.nextLine());

        System.out.println("Ingrese su ubicación");
        objetoUsuario.setUbicacion(wea.nextInt());
        wea.nextLine();

        System.out.println("Ingrese su correo");
        objetoUsuario.setCorreo(wea.nextLine());

        System.out.println("Ingrese fecha inicio");
        objetoOferta.setFechainicio(wea.nextLine());

        System.out.println("ingrese fecha fin");
        objetoOferta.setFechafin(wea.nextLine());

        System.out.println("Ingrese el costo de la persona");
        objetoOferta.setCostopersona(Double.valueOf(wea.nextLine()));

        System.out.println("Ingrese el nit");
        objetoEmpresa.setNit(wea.nextLine());

        System.out.println("Ingrese el nombre de la empresa");
        objetoEmpresa.setNombre(wea.nextLine());

        System.out.println("Ingrese la fecha de reserva");
        objetoReserva.setFechareserva(wea.nextLine());

        System.out.println("Ingrese el numero de personas para reservar");
        objetoReserva.setNumeroPer(wea.nextInt());

        System.out.println("registro completo");
    }
}
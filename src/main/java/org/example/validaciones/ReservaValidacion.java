package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class ReservaValidacion {
    //metodos ordinarios
    private Util util = new Util();
    public Boolean validarFechaRes(String fechaRes)throws Exception{
        if (!util.buscarCoincidencia(fechaRes,"^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHAOTRO.getMensaje());
        }return true;
    }

    public boolean numeroPer(int numeroPer)throws Exception{
        if (4 < numeroPer){
            throw new Exception(Mensaje.CANTIDAD_PERSONAS_RESERVA.getMensaje());
        }return true;
    }
}
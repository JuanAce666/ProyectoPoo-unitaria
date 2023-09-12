package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class UsuarioMembresiaValidacion {

    public boolean validarTopePago(Double pagoMensual) throws Exception{

        if(pagoMensual<=0){
            throw new Exception(Mensaje.COSTO_NEGATIVO_MEMBRESIA.getMensaje());
        }
        if(pagoMensual>=100000){
            throw new Exception(Mensaje.TOPE_MEMBRESIA.getMensaje());
        }
        return true;
    }
}

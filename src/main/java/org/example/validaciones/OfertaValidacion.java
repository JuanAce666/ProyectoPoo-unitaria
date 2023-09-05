package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;



public class OfertaValidacion {
    //metodos ordinarios

    private Util util = new Util();
    public Boolean validarTitulo(String titulo)throws Exception{
        if (!util.buscarCoincidencia(titulo,"^[a-zA-Z]+$")){
            throw new Exception(Mensaje.FORMATO_OFERTA.getMensaje());
        }
        if (titulo.length()>20){
            throw new Exception(Mensaje.LONGITUD_TITULO.getMensaje());
        }return true;

    }
    public Boolean validarFormatoFecha(String fecha)throws Exception{
        if (!util.buscarCoincidencia(fecha,"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        //LocalDate nuevaFecha = validarFecha(fecha);
        return true;
    }

    public Boolean validarDiferenciaFechas(LocalDate fechaInicio, LocalDate fechaFin)throws Exception{
        if(fechaFin.isBefore(fechaInicio)){
            throw new Exception(Mensaje.FECHA_INICIO_FIN.getMensaje());
        }else{
            return true;
        }


    }
    public Boolean validarCostoPersona(Double costo)throws Exception {
        if (costo < 0 ){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        }return true;

    }

}
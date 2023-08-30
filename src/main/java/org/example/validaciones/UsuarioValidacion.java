package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {
    private Util util = new Util();
    public boolean validarNombre(String nombre)throws Exception{
        if (!util.buscarCoincidencia(nombre,  "^[a-zA-Z]+$")){
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }
        if (nombre.length()<10){
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());
        }return true;
    }
    public boolean validarUbicacion(Integer ubicacion)throws Exception{
        if (ubicacion == 1 || ubicacion == 2 || ubicacion == 3 || ubicacion == 4){
            return true;
        }else {
            throw new  Exception (Mensaje.FORMATO_UBICACION.getMensaje());
        }
    }

    public boolean validarCorreo(String correo)throws Exception{
        if (!util.buscarCoincidencia(correo,"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception(Mensaje.FORMATO_CORREO.getMensaje());
        }return true;
    }


}
package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaValidacion {

    private Util util = new Util();
    public boolean validarNit(String nit) throws Exception {
        if (!util.buscarCoincidencia(nit, "\\d{10}")) {
            throw new Exception(Mensaje.FORMATO_LOCAL.getMensaje());
        }
        if (nit.length() != 10) {
            throw new Exception(Mensaje.LONGITUD_NIT.getMensaje());}
        return true;
    }

    public boolean validarNombre(String nombre)throws Exception{
        if (!util.buscarCoincidencia(nombre,"^[a-zA-Z0-9 ]+$" )){
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());

        }
        if (nombre.length()>=30){
            throw new Exception(Mensaje.LONGITUD_NOMBRE_NIT.getMensaje());
        }return true;
    }

}
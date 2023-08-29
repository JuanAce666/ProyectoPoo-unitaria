package org.example.utilidades;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Boolean buscarCoincidencia(String cadena, String expresionRegular){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }
    }
    public LocalDate convertirStringEnLocalDate(String fecha){
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate nuevaFecha = LocalDate.parse(fecha,formatear);
        return nuevaFecha;
    }

    public LocalDate convertirStringEnLocalDatee(String fecha){
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate nuevaFechaa = LocalDate.parse(fecha,formatear);
        return nuevaFechaa;
    }



}
package org.example.utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("revisa el nombre que ingreso"),
    LONGITUD_NOMBRE("la longitud del nombre es corta"),
    FORMATO_CORREO("El correo es invalido"),
    FORMATO_UBICACION("la ubicacion es invalida"),
    LONGITUD_NIT("Longitud nit no puede superar los 10 numeros"),
    LONGITUD_NOMBRE_NIT("El nombre no puede superar los 30 caracteres"),
    FORMATO_LOCAL("nit invalido"),
    FORMATO_OFERTA("titulo invalido"),
    LONGITUD_TITULO("El titulo no puede sobrepasar los 20 caracteres"),
    FORMATO_FECHA("Revise el formato de la fecha que se ingreso"),
    FECHA_INICIO_FIN("La fecha inicial no puede ser mayor a la fecha final"),
    COSTO_PERSONA("El costo no puede ser negativo"),
    CANTIDAD_PERSONAS_RESERVA("el numero de personas solo pueden ser 4 "),
    FORMATO_FECHAOTRO("Por Favor Revise el formato de la fecha que esta ingresando"),
    TOPE_MEMBRESIA("EL TOPE NO PUEDE SER MAYOR 0 IGUAL A 100.000"),
    COSTO_NEGATIVO_MEMBRESIA("NO PUEDE SER NEGATIVO");
    private String mensaje;
    Mensaje(String mensaje){this.mensaje = mensaje;}
    public String getMensaje(){return mensaje;}

    public void setMensaje(String mensaje){this.mensaje = mensaje;}

}
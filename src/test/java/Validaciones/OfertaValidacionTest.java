package Validaciones;
import org.example.utilidades.Mensaje;
import org.example.validaciones.OfertaValidacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class OfertaValidacionTest {

    OfertaValidacion OfertaValidacion;

    @BeforeEach
    public void configurarPrueba2s() {
        System.out.println("Estoy ejecutando la prueba");
        this.OfertaValidacion = new OfertaValidacion();
    }

    @Test
    public void validarTituloCorrecto() {
        String titulo = "TituloValido";
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Assertions.assertDoesNotThrow(() -> ofertaValidacion.validarTitulo(titulo));
    }

    @Test
    public void validarTituloIncorrecto() {
        String titulo = "TituloInválido123"; // Un título inválido que contiene números
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> ofertaValidacion.validarTitulo(titulo));
        Assertions.assertEquals(Mensaje.FORMATO_OFERTA.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarTituloLongitudExcedida() {
        String titulo = "TituloConUnaLongitudMuyLarga"; // Título con más de 20 caracteres
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> ofertaValidacion.validarTitulo(titulo));
        Assertions.assertEquals(Mensaje.LONGITUD_TITULO.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarFormatoFechaCorrecto() {
        String fecha = "31/12/2023";
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Assertions.assertDoesNotThrow(() -> ofertaValidacion.validarFormatoFecha(fecha));
    }

    @Test
    public void validarFormatoFechaIncorrecto() {
        String fecha = "2023-12-31"; // Formato incorrecto
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> ofertaValidacion.validarFormatoFecha(fecha));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarDiferenciaFechasCorrecto() {
        LocalDate fechaInicio = LocalDate.of(2023, 12, 31);
        LocalDate fechaFin = LocalDate.of(2024, 1, 1);
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Assertions.assertDoesNotThrow(() -> ofertaValidacion.validarDiferenciaFechas(fechaInicio, fechaFin));
    }

    @Test
    public void validarDiferenciaFechasIncorrecto() {
        LocalDate fechaInicio = LocalDate.of(2024, 1, 1);
        LocalDate fechaFin = LocalDate.of(2023, 12, 31); // Fecha final antes de la fecha inicial
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> ofertaValidacion.validarDiferenciaFechas(fechaInicio, fechaFin));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_FIN.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarCostoPersonaCorrecto() {
        Double costo = 50.0;
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Assertions.assertDoesNotThrow(() -> ofertaValidacion.validarCostoPersona(costo));
    }

    @Test
    public void validarCostoPersonaIncorrecto() {
        Double costo = -10.0; // Costo negativo
        org.example.validaciones.OfertaValidacion ofertaValidacion = new org.example.validaciones.OfertaValidacion();
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> ofertaValidacion.validarCostoPersona(costo));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(), excepcion.getMessage());
    }
}

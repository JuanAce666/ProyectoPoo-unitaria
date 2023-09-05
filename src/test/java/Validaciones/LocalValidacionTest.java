package Validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.validaciones.LocalValidacion;


public class LocalValidacionTest {

    LocalValidacion localValidacion;

    @BeforeEach
    public void configurarPrueba2s() {
        System.out.println("Estoy ejecutando la prueba");
        this.localValidacion = new LocalValidacion();
    }


    @Test
    public void validarNitFormatoIncorrecto() {
        String nit = "12345";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> localValidacion.validarNit(nit));
        Assertions.assertEquals(Mensaje.FORMATO_LOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNitLongitudIncorrecta() {
        String nit = "12345678901";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> localValidacion.validarNit(nit));
        Assertions.assertEquals(Mensaje.FORMATO_LOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNitCorrecto() {
        String nit = "1234567890";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> localValidacion.validarNit(nit));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreFormatoIncorrecto() {
        String nombre = "Nombre Inválido 123$";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> localValidacion.validarNombre(nombre));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreLongitudExcedida() {
        String nombre = "Nombre Muy Largo y Excedido de 30 Caracteres";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> localValidacion.validarNombre(nombre));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE_NIT.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreCorrecto() {
        String nombre = "Nombre Correcto";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> localValidacion.validarNombre(nombre));
        Assertions.assertTrue(respuesta);
    }

}

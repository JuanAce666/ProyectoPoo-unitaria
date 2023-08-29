package Validaciones;

import org.example.utilidades.Mensaje;
import org.example.validaciones.UsuarioValidacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //Preparo la prueba
    UsuarioValidacion usuarioValidacion;

    @BeforeEach //palabra reservada que le da funcionalidad al metodo de la prueba (Preparar la prueba para ejecutarla)

    public void configurarPruebas(){
        System.out.println("Estoy ejecuntando la prueba");
        this.usuarioValidacion=new UsuarioValidacion();
    }
    @Test //para ejecutarlas
    public void validarNombreFallaPorNombreCorto(){
        //prepare
        String nombrePrueba = "Juan";
        //ejecute
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(),respuesta.getMessage());
        //verifique
    }

    @Test
    public void validarNombreFallaPorCaracteres(){
        String nombrePrueba = " 22";
        Exception respuesta2 = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(),respuesta2.getMessage());
    }
    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba = "JuanAcevedo";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoCorrecto(){
        String correoPrueba = "juan@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoIncorrecto (){
        String correoPrueba = "juan.com";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_CORREO.getMensaje(),respuesta.getMessage());
    }
}
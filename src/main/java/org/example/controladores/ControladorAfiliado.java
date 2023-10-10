package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.servicios.ServicioAfiliado;

public class ControladorAfiliado {

    //llamar a la clase que valida
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    //llamar al servicio
    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado(String nombre, String documento, String correo,Integer ubicacion){

        //utilizar los SET del usuario membresia para validar los datos
        this.usuarioMembresia.setNombre(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);

        //SI todos los datos del usuario se cargaron con el set y no hubo errores
        //llamo al servicio para guardar los datos
        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);

    }
}

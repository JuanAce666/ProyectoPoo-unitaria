package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioAfiliado {

    public void registrarAfiliado(UsuarioMembresia usuarioMembresia){
        //Nombre del traductor para hacer la persistencia
        String configuracionPersistencia = "conexionbd";

        //crear una variable para la conexion
        //creamos una variable para manejar la conexion
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try{
          entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
          entityManager = entityManagerFactory.createEntityManager();

          //crear un modelo de dato y lo voy a cargar con informacion
           ModeloUsuarioMembresia modeloUsuarioMembresia = new ModeloUsuarioMembresia();
           modeloUsuarioMembresia.setNombre(usuarioMembresia.getNombre());
           modeloUsuarioMembresia.setDocumento(usuarioMembresia.getDocumento());

           //inicie la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.persist(modeloUsuarioMembresia);

            //registro de la operacion o confirmacion
            entityManager.getTransaction().commit();
            System.out.println("Exito en la transaccion, afiliado registrado con exito");
        }catch (Exception error){
            System.out.println("fallamos "+error.getMessage());
        }finally {
            if (entityManager != null){
                entityManager.close();
            }

            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }

    }

    public List<ModeloUsuarioMembresia> buscarAfiliados(){
        return null;
    }
}

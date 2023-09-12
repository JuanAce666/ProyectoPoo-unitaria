package org.example.modelos;

public class EmpresaCultural extends Empresa {
    private String entidad;
    private String mision;
    //private String emailContacto;
    //private String numeroContacto;


    public EmpresaCultural() {
    }

    public EmpresaCultural(int id, String nit, String nombre, int ubicacion, String descripcion, String entidad, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
    }
    @Override
    public Double cobrar(){
        return null;
    }
}

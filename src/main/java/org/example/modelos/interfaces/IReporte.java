package org.example.modelos.interfaces;

public interface IReporte {
     void generarReporte(String datos);
     void buscarReporte(Integer id);
     void editarReporte(Integer id,String datos);

}

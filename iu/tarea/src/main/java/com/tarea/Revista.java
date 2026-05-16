package com.tarea;

public class Revista extends Recurso {
 
    private String mes;
    private int edicion;
 
    public Revista(String id, String titulo, String mes, int edicion) {
        super(id, titulo, Tiporecurso.REVISTA);
        this.mes = mes;
        this.edicion = edicion;
    }
 
    @Override
    public void mostrarDetallesEspecificos() {
        System.out.println("Mes: " + mes);
        System.out.println("Edición: " + edicion);
    }
 
    // Getters y setters propios
    public String getMes()   { return mes; }
    public int getEdicion()  { return edicion; }
 
    public void setMes(String mes) {
        if (mes != null && !mes.isEmpty()) this.mes = mes;
    }
    public void setEdicion(int edicion) {
        if (edicion > 0) this.edicion = edicion;
    }
}
package com.tarea;

public abstract class Recurso {

    private String id;
    private String titulo;
    private boolean disponible;
    private Tiporecurso tipo;
 
    public Recurso(String id, String titulo, Tiporecurso tipo) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.disponible = true;
    }
    public abstract void mostrarDetallesEspecificos();

    public void mostrarFichaTecnica() {
        System.out.println("---------------------------");
        System.out.println("[" + tipo + "] ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        mostrarDetallesEspecificos(); 
    }
 
    // Getters
    public String getId()           { return id; }
    public String getTitulo()       { return titulo; }
    public Tiporecurso getTipo()    { return tipo; }
    public boolean isDisponible()   { return disponible; }
 
    // Setters con validación
    public void setId(String id) {
        if (id != null && !id.isEmpty()) this.id = id;
    }
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) this.titulo = titulo;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
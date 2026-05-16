package com.tarea;

public class Libro extends Recurso {
 
    private String autor;
    private int paginas;
 
    public Libro(String id, String titulo, String autor, int paginas) {
        super(id, titulo, Tiporecurso.LIBRO);
        this.autor = autor;
        this.paginas = paginas;
    }
 
    @Override
    public void mostrarDetallesEspecificos() {
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
 
    // Getters y setters propios
    public String getAutor()    { return autor; }
    public int getPaginas()     { return paginas; }
 
    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) this.autor = autor;
    }
    public void setPaginas(int paginas) {
        if (paginas > 0) this.paginas = paginas;
    }
}
package com.tarea;

public class Main {
    public static void main(String[] args) {
 
        Biblioteca miBiblioteca = new Biblioteca();
 
        Libro libro1 = new Libro("L001", "Cien años de soledad", "Gabriel García Márquez", 471);
        Revista revista1 = new Revista("R001", "National Geographic", "Mayo", 245);
        Digital digital1 = new Digital("D001", "Introducción a Java", "PDF", "https://ejemplo.com/java");
 
        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);
        miBiblioteca.registrarRecurso(digital1);
 
        miBiblioteca.mostrarInventario();

        miBiblioteca.filtrarPorTipo(Tiporecurso.REVISTA);

        System.out.println("\nBuscando recurso L001...");
        Recurso encontrado = miBiblioteca.buscarPorId("L001");
        if (encontrado != null) {
            System.out.println("Resultado de búsqueda: " + encontrado.getTitulo());
        }
        System.out.println("\n--- Simulando préstamo del libro ---");
        libro1.setDisponible(false);
        libro1.mostrarFichaTecnica();
    }
}
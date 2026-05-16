package com.tarea;

import java.util.ArrayList;
import java.util.List;
 
public class Biblioteca {
 
    private List<Recurso> inventario;
 
    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void registrarRecurso(Recurso r) {
        if (r != null) {
            inventario.add(r);
            System.out.println("✔ Recurso registrado: [" + r.getTipo() + "] " + r.getTitulo());
        }
    }
 
    public List<Recurso> filtrarPorTipo(Tiporecurso tipo) {
        List<Recurso> resultado = new ArrayList<>();
        for (Recurso r : inventario) {
            if (r.getTipo() == tipo) {
                resultado.add(r);
            }
        }
        System.out.println("\n--- Recursos de tipo: " + tipo + " ---");
        if (resultado.isEmpty()) {
            System.out.println("No se encontraron recursos de ese tipo.");
        } else {
            for (Recurso r : resultado) {
                r.mostrarFichaTecnica();
            }
        }
        return resultado;
    }
 
    public Recurso buscarPorId(String id) {
        for (Recurso r : inventario) {
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        System.out.println("No se encontró ningún recurso con ID: " + id);
        return null;
    }
 
    public void mostrarInventario() {
        System.out.println("\n===== INVENTARIO COMPLETO =====");
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Recurso r : inventario) {
                r.mostrarFichaTecnica();
            }
        }
        System.out.println("===== FIN DEL INVENTARIO =====\n");
    }
}

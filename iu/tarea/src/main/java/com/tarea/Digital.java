package com.tarea;

public class Digital extends Recurso {
 
    private String formato;
    private String url;
 
    public Digital(String id, String titulo, String formato, String url) {
        super(id, titulo, Tiporecurso.DIGITAL);
        this.formato = formato;
        this.url = url;
    }
 
    @Override
    public void mostrarDetallesEspecificos() {
        System.out.println("Formato: " + formato);
        System.out.println("URL: " + url);
    }
 
    // Getters y setters propios
    public String getFormato()  { return formato; }
    public String getUrl()      { return url; }
 
    public void setFormato(String formato) {
        if (formato != null && !formato.isEmpty()) this.formato = formato;
    }
    public void setUrl(String url) {
        if (url != null && !url.isEmpty()) this.url = url;
    }
}

// Libro.java
package model;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private TipoPasta tipoPasta;
    
    // Constructor
    public Libro(int id, String titulo, String autor, String isbn, TipoPasta tipoPasta) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.tipoPasta = tipoPasta;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public TipoPasta getTipoPasta() { return tipoPasta; }
    public void setTipoPasta(TipoPasta tipoPasta) { this.tipoPasta = tipoPasta; }
}

// TipoPasta.java
package model;

public class TipoPasta {
    private int id;
    private String descripcion;
    
    // Constructor
    public TipoPasta(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
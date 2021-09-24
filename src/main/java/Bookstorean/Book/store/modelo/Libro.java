package Bookstorean.Book.store.modelo;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity

@Table(name = "libros")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long ISBN;

    private String Titulo;
    private String Autor;
    private Long Precio;
    private Long Cantidad;
    private String Categoría;

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Long getPrecio() {
        return Precio;
    }

    public void setPrecio(Long precio) {
        Precio = precio;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String categoría) {
        Categoría = categoría;
    }
}

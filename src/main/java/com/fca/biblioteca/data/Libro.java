package com.fca.biblioteca.data;

import java.time.Year;

import jakarta.persistence.*;

@Entity
@Table(name="libro")

public class Libro {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idLibro;
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String edicion;
    private String isbn;
    private int existencia;

    public Libro() {}

// Getters y Setters

    public int getIdlibro() {
        return idLibro;
    }

    public void setIdlibro(int idlibro) {
        this.idLibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getanioPublicacion() {
        return anioPublicacion;
    }

    public void setAniopublicacion(int aniopublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

}

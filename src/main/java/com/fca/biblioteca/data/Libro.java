package com.fca.biblioteca.data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlibro")
    private Integer idLibro;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "aniopublicacion")
    private Integer anioPublicacion;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "edicion")
    private String edicion;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "existencia")
    private Integer existencia;

    // Relaciones

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)

    private List<AutorLibro> autores;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private List<Prestamo> prestamos;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
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

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public List<AutorLibro> getAutores() {
        return autores;
    }

    public void setAutores(List<AutorLibro> autores) {
        this.autores = autores;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}

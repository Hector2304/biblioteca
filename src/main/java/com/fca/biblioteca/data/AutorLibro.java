package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autorlibro")
public class AutorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idautorlibro")
    private Integer idAutorLibro;

    @ManyToOne
    @JoinColumn(name = "idautor", referencedColumnName = "idautor", nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro", nullable = false)
    private Libro libro;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdAutorLibro() {
        return idAutorLibro;
    }

    public void setIdAutorLibro(Integer idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}

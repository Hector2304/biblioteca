package com.fca.biblioteca.data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idautor")
    private Integer idAutor;

    @OneToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona", nullable = false)
    private Persona persona;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<AutorLibro> autorLibros;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<AutorLibro> getAutorLibros() {
        return autorLibros;
    }

    public void setAutorLibros(List<AutorLibro> autorLibros) {
        this.autorLibros = autorLibros;
    }
}

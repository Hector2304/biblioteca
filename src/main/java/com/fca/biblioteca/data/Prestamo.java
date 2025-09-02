package com.fca.biblioteca.data;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprestamo")
    private Integer idPrestamo;

    @ManyToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro", nullable = false)
    private Libro libro;

    @Column(name = "fechaprestamo")
    private LocalDate fechaPrestamo;

    @Column(name = "diasprestamo")
    private Integer diasPrestamo;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Integer getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }
}

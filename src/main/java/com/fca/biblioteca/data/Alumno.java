package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    private Integer idAlumno;

    @OneToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona", nullable = false)
    private Persona persona;

    @Column(name = "numerocuenta", nullable = false, unique = true)
    private String numeroCuenta;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}

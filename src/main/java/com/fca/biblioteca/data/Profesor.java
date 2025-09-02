package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprofesor")
    private Integer idProfesor;

    // Relación con Persona
    @OneToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona", nullable = false)
    private Persona persona;

    @Column(name = "numerotrabajador", nullable = false)
    private String numeroTrabajador;

    // =============================
    // Getters y Setters
    // =============================

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }
}

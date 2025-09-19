package com.fca.biblioteca.domain;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class LibroDomain {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarLibrosDisponibles(String titulo,  String edicion){

        if (titulo == null || edicion == null || titulo.isEmpty() || edicion.isEmpty()) {
            return new ArrayList<>();
        }

        Predicate<Libro> filtroLibro = libro -> libro !=null && libro.getTitulo().equals(titulo)
                && libro.getEdicion().equals(edicion);
       Predicate<Libro> filtroDisponible = disponible -> disponible !=null && disponible.getExistencia()>0;
        return libroRepository.findAll()
                .stream()
                .filter(filtroLibro.and(filtroDisponible))
                .collect(Collectors.toList());
        //return  libroRepository.findByTituloContainingIgnoreCase(titulo);
    }
}

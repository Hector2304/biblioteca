package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {

    private final LibroDomain libroDomain;
    //Inyección por constructor
    public LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }
    // @RequestMapping(value = "/libros", method = RequestMethod.GET)
    @GetMapping("/libros")
    public List<Libro> getLibrosPorTitulo(@RequestParam String titulo,
                                          @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo, edicion);
    }
}

package com.mycompany.gestionbiblioteca.people;

import com.mycompany.gestionbiblioteca.libros.Libro;

public interface ManejoLibros {
    void prestamoLibro(Libro libro);
    void devolverLibro(Libro libro);
}

package com.mycompany.gestionbiblioteca;

import com.mycompany.gestionbiblioteca.libros.Libro;
import com.mycompany.gestionbiblioteca.people.CategoriaUsuario;
import com.mycompany.gestionbiblioteca.people.Estudiante;
import com.mycompany.gestionbiblioteca.people.Profesor;
import java.io.IOException;

public class GestionBiblioteca {

    public static void main(String[] args) throws IOException {
        
        //Creando el usuario estudiante
        Estudiante estudiante = new Estudiante("Anamaria", "192240", CategoriaUsuario.ESTUDIANTE);
        Estudiante estudiante1 = new Estudiante("Yuliana", "192240", CategoriaUsuario.ESTUDIANTE);
        
        //Agregando estudiantes a la lista
        estudiante.agregarEsudiates(estudiante);
        estudiante.agregarEsudiates(estudiante1);
        
        //Creando el usuario profesor
        Profesor profesor = new Profesor("Samuel", "251456", CategoriaUsuario.PROFESOR);
        Profesor profesor1 = new Profesor("Alejandro", "251456", CategoriaUsuario.PROFESOR);
        
        //Agregando profesores a la lista
        profesor.agregarProfesores(profesor);
        profesor.agregarProfesores(profesor1);
        
        //Creando los diferentes libros
        Libro libro = new Libro("Harry Poter",1 , "J. K. Rowling");
        Libro libro1 = new Libro("A traves de mi venta",2 , "J. K. Rowling");
        Libro libro2 = new Libro("Culpa mia",3 , "J. K. Rowling");
        Libro libro3 = new Libro("Harry",4 , "J. K. Rowling");
        
        //Agregando los libros a la lista
        libro.agregarLibros(libro);
        libro.agregarLibros(libro1);
        libro.agregarLibros(libro2);
        libro.agregarLibros(libro3);
        
        //Estudiante haciendo prestamos
        estudiante.prestamoLibro(libro);
        estudiante.prestamoLibro(libro1);
        estudiante1.prestamoLibro(libro2);
        estudiante1.prestamoLibro(libro3);
      
        //Estudiante devolviendo libros
        estudiante.devolverLibro(libro);
        estudiante.devolverLibro(libro1);
        estudiante1.devolverLibro(libro2);
        estudiante1.devolverLibro(libro3);
        
        //Para mostrar estudiantes en un archivo de texto
        estudiante.mostrarEstudiantesFichero();
        
        //Para mostrar profesores en un archivo de texto
        profesor.mostrarProfesoresFichero();
        
        //Para mostrar los libros en un archivo de texto
        libro.mostrarLibroFichero();
        
        
        
        
    } 
}

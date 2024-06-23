package com.mycompany.gestionbiblioteca.people;

import com.mycompany.gestionbiblioteca.libros.Libro;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario implements ManejoLibros{
    
    private final int maxLibros = 5;
    private int contLibros;
    private List<Profesor> profesores = new ArrayList<>();
    
    public Profesor(String nombre, String ID, CategoriaUsuario categoria) {
        super(nombre, ID, categoria);
    }

    //Metodo para prestar un libro
    @Override
    public void prestamoLibro(Libro libro) {
        
        if(contLibros >= maxLibros ){
            System.out.println("No se pueden prestar mas de tres libros");
            return;
        }
        
        if(libro.isDisponible()){
            libro.setDisponible(false);
            System.out.println("Libro prestado: " + libro.getNombre());
            contLibros++;
        }else{
            System.out.println("El libro no esta disponible");
        }
    }

    //Metodo para devolver un libro
    @Override
    public void devolverLibro(Libro libro) {
       if(!libro.isDisponible()){
            libro.setDisponible(true);
            System.out.println("Libro devuelto: " + libro.getNombre());
            contLibros--;
        }else{
            System.out.println("El libro ya esta disponible");
        } 
    }

    //Metodo para agregar profesores a la lista
    public void agregarProfesores(Profesor profesor){
        profesores.add(profesor);
    }
    
    //Metodo para mostrar profesores en un archivo de texto
    public void mostrarProfesoresFichero() throws IOException{
        File file = new File("Profesores.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(Profesor profesor : profesores){
            bw.write("Nombre: " + profesor.getNombre() + "\n" + "ID: " + profesor.getID() + "\n\n");
        }
        
        bw.close();
        fw.close();
    }
}

package com.mycompany.gestionbiblioteca.libros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private int ID;
    private String autor;
    private boolean disponible = true;
    private List<Libro> libros;

    public Libro(String nombre, int ID, String autor) {
        this.nombre = nombre;
        this.ID = ID;
        this.autor = autor;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    //Setter para cambiar el estado de la disponibilidad del libro
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //Metodo para agregar libros a las listas
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }
    
    //Mostrar libros en un fichero
    public void mostrarLibroFichero() throws IOException{
        File file = new File("Libros.txt");
        FileWriter fw = new FileWriter(file);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(Libro libro : libros){
            bw.write("Nombre: " + libro.nombre + "\n" + "ID: " + libro.ID + "\n" + "Autor: " + libro.autor + "\n\n");
        }
        bw.close();
        fw.close();
    }
    
    
    
    
}

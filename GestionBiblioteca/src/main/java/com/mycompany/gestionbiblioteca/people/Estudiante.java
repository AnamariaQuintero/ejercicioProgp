package com.mycompany.gestionbiblioteca.people;
    
import com.mycompany.gestionbiblioteca.libros.Libro;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario implements ManejoLibros{
    
    private final int maxLibros = 3;
    private int contLibros = 0;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Estudiante(String nombre, String ID, CategoriaUsuario categoria) {
        super(nombre, ID, categoria);
    }
    
    //Metodo para prestar un libro
    @Override
    public void prestamoLibro(Libro libro) {
        
        if(contLibros >= maxLibros){
            System.out.println("No se pueden prestar mas de tres libros");
            return;
        }
        
        if(libro.isDisponible()  && (this.getCategoria() == CategoriaUsuario.ESTUDIANTE)){
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
    
    //Metodo para agregar estudiantes a la lista
    public void agregarEsudiates(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    //Metodo para mostrar estudiantes en un fichero
    public void mostrarEstudiantesFichero() throws IOException{
        File file = new File("Estudiantes.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(Estudiante estudiante : estudiantes){
            bw.write("Nombre: " + estudiante.getNombre() + "\n" + "ID: " + estudiante.getID() + "\n\n");
        }
        
        bw.close();
        fw.close();
    }
}

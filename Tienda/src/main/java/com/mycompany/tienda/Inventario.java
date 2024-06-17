package com.mycompany.tienda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inventario {
    
    private List<Producto> productos;
    String codigoUnico;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    //Metodo para agregar los productos a la lista 
    public void agregarProductos(Producto producto){
        productos.add(producto);
    }
    
    //Metodo para cambiar el precio de un producto
    public void cambiarPrecio(String nombre, double nuevoPrecio){
        for(Producto producto : productos){
            if(producto.getNombre().equalsIgnoreCase(nombre)){
                producto.setPrecio(nuevoPrecio);
                System.out.println("El nuevo precio del producto " + nombre + " es: " + nuevoPrecio);
                return;
            }
        }
        System.out.println("Producto no encontrado " + nombre);
    }
    
    //Metodo para mostrar los productos por categoria
    public void productosCategoria() throws IOException {
        File file = new File("Productos.txt");
        FileWriter fw = new FileWriter(file);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            // Para mostrar los productos por categoría y contamos el total
            for (Categoria categoria : Categoria.values()) {
                int cantidadProductos = 0;
                bw.write("Productos en categoría " + categoria + "\n" );
                for (Producto producto : productos) {
                    if (producto.getCategoria() == categoria) {
                        bw.write("- " + producto.getNombre() + "\n");
                        cantidadProductos++;
                    }
                }
                bw.write("Cantidad de productos en " + categoria + ":" + cantidadProductos + "\n\n");
            }

            // Para mostrar la cantidad total de productos en el inventario
            int totalProductos = productos.size();
            bw.write("La cantidad de productos en el inventario son: " + totalProductos + "\n");
        }catch(Exception e){
            bw.write("Ocurrio un error");
        }finally{
            bw.close();
            fw.close();
        }
        
    }

}   

package com.mycompany.drogueria.proveedor;

import com.mycompany.drogueria.productos.CategoriaProductos;
import com.mycompany.drogueria.productos.Productos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String nombre;
    private String ID;
    private CategoriaProductos categoria;
    private List<Productos> listaProductos;
    private List<Proveedor> listaProveedor;

    public Proveedor(String nombre, String ID, CategoriaProductos categoria) {
        this.nombre = nombre;
        this.ID = ID;
        this.categoria = categoria;
        this.listaProductos = new ArrayList<>();
        this.listaProveedor = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public CategoriaProductos getCategoria() {
        return categoria;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public List<Proveedor> getListaProveedor() {
        return listaProveedor;
    }
    
    //Metodo para agregar proveedores a la lista
    public void agregarProveedores(Proveedor proveedor){
        listaProveedor.add(proveedor);
    }

    //Metodo para agregar productos a la lista
    public void agregarALaLista(Productos producto, CategoriaProductos categoria){
        if(this.categoria == categoria){
            listaProductos.add(producto);
        }
    }
    
    //Metodo para mostrar en un fichero
    public void mostrarEnFichero() throws IOException{
        File file = new File("Proveedores.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            for(Proveedor proveedor : listaProveedor){
                bw.write("Nombre proveedor: " + proveedor.getNombre() + "\n");
                for(Productos producto : listaProductos){
                    if(producto.getProveedor().equals(proveedor)){
                        bw.write("Productos: " + producto.getNombre() + "\n\n");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }finally{
            bw.close();
            fw.close();
        }
    }
    
}

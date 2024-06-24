package com.mycompany.drogueria.ventas;

import com.mycompany.drogueria.cliente.CategoriaCliente;
import com.mycompany.drogueria.cliente.Cliente;
import com.mycompany.drogueria.productos.Productos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ventas {
    private Productos producto;
    private Cliente cliente;
    private int cantidadProducto;
    private double total;
    private List<Ventas> ventas = new ArrayList<>();

    public Ventas(Productos producto, Cliente cliente, int cantidadProducto) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidadProducto = cantidadProducto;
    }
    
    //Metodo para verificar que se pueda vender y si es cliente resgistrado
    public void venderRegistrado(){
        if(cantidadProducto < producto.getCantidad() && cliente.getCategoria() == CategoriaCliente.CLIENTEREGISTRADO){
            System.out.println("La venta se puede hacer");
            total = ((producto.getCantidad() * producto.getPrecio()) - cliente.getDescuento());
            System.out.println("El total de la venta es: " + total);
        }else{
            System.out.println("La cantidad de producto no esta disponible");
        }
    }
    
    //Metodo para vender si no es cliente registrado
    public void venderNoRegistrado(){
        if(cantidadProducto < producto.getCantidad()){
            System.out.println("Se puede vender");
             total = ((producto.getCantidad() * producto.getPrecio()));
             System.out.println("El total de la venta es: " + total);
        }
    }
    
    //Metodo para agregar las ventas
    public void agregarALaLista(Ventas venta){
        ventas.add(venta);
    }
    
    //Metodo para mostrar en el fichero
    public void mostrarEnFichero() throws IOException{
        File file = new File("Ventas.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(Ventas venta : ventas){
            bw.write("Ventas: \n" + "Nombre producto: " + producto.getNombre() + "\n" + "Cantidad vendida: " + cantidadProducto);
        }
        
        bw.close();
        fw.close();
    }
    
}

package com.mycompany.drogueria.cliente;

import com.mycompany.drogueria.productos.Productos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Clientes implements GenerarDescuento{
    
    private double descuento;
    private boolean registrado;
    private List<Cliente> listaClientes;

    public Cliente( boolean registrado, String nombre, int edad, String ID, String direccion, String telefono, CategoriaCliente categoria) {
        super(nombre, edad, ID, direccion, telefono, categoria);
        this.registrado = registrado;
        this.listaClientes = new ArrayList<>();
    }

    //Getter para poder ver el descuento
    public double getDescuento() {
        return descuento;
    }
    
    //Getter para saber si esta registrado
    public boolean isRegistrado() {
        return registrado;
    }
    
    //Getter para la lista

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    //Metodo para generar descuento si es cliente registrado
    @Override
    public void generarDescuento(Productos producto){
        if(this.getCategoria() == CategoriaCliente.CLIENTEREGISTRADO && registrado == true){
            System.out.println("Por ser cliente registrado se le genero un descuento del 3%");
            descuento = ((producto.getCantidad() * producto.getPrecio())*0.03);
        }
    }
    
    //Metodo para agregar los clientes a la lista
    public void agregarClientes(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    //Metodo para mostrar los clientes en fichero
    public void mostrarEnFichero() throws IOException{
        File file = new File("Clientes.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(Cliente cliente : listaClientes){
            if(this.isRegistrado() == true && this.getCategoria() == CategoriaCliente.CLIENTEREGISTRADO){
                bw.write("Clientes registrados: " + cliente.getNombre() + "\n\n");
            }else {
                bw.write("Clientes no registrados: " + cliente.getNombre() + "\n\n");
            }
        }
        
        bw.close();
        fw.close();
    }
}

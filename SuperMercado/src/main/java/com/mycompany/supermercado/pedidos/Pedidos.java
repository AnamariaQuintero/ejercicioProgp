package com.mycompany.supermercado.pedidos;

import com.mycompany.supermercado.people.Clientes;
import com.mycompany.supermercado.productos.Producto;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private List<Producto> productos;
    private Clientes cliente;

    public Pedidos() {
        this.productos = new ArrayList<>();
    }
    
    //Metodo para agregar producto
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    
}

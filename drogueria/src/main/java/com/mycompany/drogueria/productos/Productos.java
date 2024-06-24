package com.mycompany.drogueria.productos;

import com.mycompany.drogueria.proveedor.Proveedor;

public class Productos {
    private String nombre;
    private String ID;
    private double precio;
    private int cantidad;
    private CategoriaProductos categoria;
    private Proveedor proveedor; 


    public Productos(String nombre, String ID, double precio, int cantidad, CategoriaProductos categoria, Proveedor proveedor) {
        this.nombre = nombre;
        this.ID = ID;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProductos getCategoria() {
        return categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    
    //Metodo para mostrar los productos y la cantidad de productos que hay en cada categoria

    
}

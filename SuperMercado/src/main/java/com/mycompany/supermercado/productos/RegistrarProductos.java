package com.mycompany.supermercado.productos;

public class RegistrarProductos {
    private String nombre;
    private double precio;
    private Categoria categoria;
    private int cantidad;

    public RegistrarProductos(String nombre, double precio, Categoria categoria, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}

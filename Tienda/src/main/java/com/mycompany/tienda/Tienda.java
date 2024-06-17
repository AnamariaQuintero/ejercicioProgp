package com.mycompany.tienda;

import java.io.IOException;
import java.util.List;

public class Tienda {

    public static void main(String[] args) throws IOException {
        

        Producto producto = new Producto("Laptop", Categoria.ELECTRONICA,2.500,6);
        Producto producto1 = new Producto("Gaseosa", Categoria.BEBIDAS,2.500,6);
        Producto producto2 = new Producto("Celular", Categoria.ELECTRONICA,2.500,6);
        Producto producto3 = new Producto("Manzana", Categoria.FRUTAS,2.500,6);
        Producto producto4 = new Producto("Jugo", Categoria.BEBIDAS,2.500,6);

        producto.generarCodigo();
        producto1.generarCodigo();
        producto2.generarCodigo();
        producto3.generarCodigo();
        producto4.generarCodigo();
        
        
        Inventario inventario = new Inventario();
        inventario.agregarProductos(producto);
        inventario.agregarProductos(producto1);
        inventario.agregarProductos(producto2);
        inventario.agregarProductos(producto3);
        inventario.agregarProductos(producto4);
        
        inventario.cambiarPrecio("Laptop", 6.999);
        inventario.cambiarPrecio("gaseosa", 6.999);
        
        inventario.productosCategoria();
        
        
        
        
        
    }
}

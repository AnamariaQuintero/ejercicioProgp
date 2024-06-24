package com.mycompany.drogueria;

import com.mycompany.drogueria.cliente.CategoriaCliente;
import com.mycompany.drogueria.cliente.Cliente;
import com.mycompany.drogueria.productos.CategoriaProductos;
import com.mycompany.drogueria.productos.Productos;
import com.mycompany.drogueria.proveedor.Proveedor;
import com.mycompany.drogueria.ventas.Ventas;
import java.io.IOException;

public class Drogueria {

    public static void main(String[] args) throws IOException {
       
        //Para registrar un cliente
        Cliente cliente = new Cliente(true, "Anamaria", 18, "192240", "La ermita", "3177027366", CategoriaCliente.CLIENTEREGISTRADO);
        Cliente cliente1 = new Cliente(false, "Anamaria", 18, "192240", "La ermita", "3177027366", CategoriaCliente.CLIENTENOREGISTRADO);
        
        //Para agregar cliente a la lista
        cliente.agregarClientes(cliente);
        cliente.agregarClientes(cliente1);
        
        //Para registrar un proveedor
        Proveedor proveedor = new Proveedor("Julia", "65d5", CategoriaProductos.MEDICAMENTOS);
        Proveedor proveedor1 = new Proveedor("Sofia", "65d5", CategoriaProductos.COSMETICOS);
        
        //Para registrar un producto
        Productos producto = new Productos("Acetaminofen", "1535", 3.599, 26, CategoriaProductos.MEDICAMENTOS,proveedor);
//        Productos producto1 = new Productos("Labial", "1535", 3.599, 15, CategoriaProductos.COSMETICOS);
//        Productos producto2 = new Productos("Aceite de argan", "1535", 3.599, 35, CategoriaProductos.ACEITES);

        //Para agregrar proveedores a la lista
        proveedor.agregarProveedores(proveedor);
        proveedor.agregarProveedores(proveedor1);
        
        //Para agregar productos a la lista del proveedor
        proveedor.agregarALaLista(producto, CategoriaProductos.MEDICAMENTOS);
        proveedor.agregarALaLista(producto, CategoriaProductos.COSMETICOS);
        
        //Para hacer una venta
        Ventas venta = new Ventas(producto, cliente, 20);
        venta.venderRegistrado();
        
        //Para agregar la venta a la lista 
        venta.agregarALaLista(venta);
        
        //Para mostrar las ventas en el fichero
        venta.mostrarEnFichero();
        
        //Para mostrar los proveedores en un fichero
        proveedor.mostrarEnFichero();
        
        //Para mostrar los clientes en ficheros
        cliente.mostrarEnFichero();
    }
}

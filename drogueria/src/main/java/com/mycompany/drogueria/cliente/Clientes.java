package com.mycompany.drogueria.cliente;

public class Clientes {
    private String nombre;
    private int edad;
    private String ID;
    private String direccion;
    private String telefono;
    private CategoriaCliente categoria;

    public Clientes(String nombre, int edad, String ID, String direccion, String telefono, CategoriaCliente categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.direccion = direccion;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getID() {
        return ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public CategoriaCliente getCategoria() {
        return categoria;
    }

    
    
}

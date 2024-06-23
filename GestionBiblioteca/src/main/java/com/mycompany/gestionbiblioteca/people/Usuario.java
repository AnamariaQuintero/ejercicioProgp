package com.mycompany.gestionbiblioteca.people;

public class Usuario {
    private String nombre;
    private String ID;
    private CategoriaUsuario categoria;

    public Usuario(String nombre, String ID, CategoriaUsuario categoria) {
        this.nombre = nombre;
        this.ID = ID;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public CategoriaUsuario getCategoria() {
        return categoria;
    }
}

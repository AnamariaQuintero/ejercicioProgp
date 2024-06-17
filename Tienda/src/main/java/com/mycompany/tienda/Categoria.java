package com.mycompany.tienda;

public enum Categoria {
    FRUTAS,
    BEBIDAS,
    ELECTRONICA;
    
    @Override    
    public String toString() {
        return this.name().toLowerCase();
    }
}

package com.mycompany.tienda;

import java.io.*;
import java.util.Random;

public class Producto extends RegistroProducto {

    String codigoUnico;
    
    public Producto(String nombre, Categoria categoria, double precio, int cantidad) {
        super(nombre, categoria, precio, cantidad);
    }
     
    //Metodo para generar un codigo unico
    public void generarCodigo() throws IOException{
        Random random = new Random();
        
        File file = new File("CodigoProducto.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            int numAleatorio = random.nextInt(1000);
        
            this.codigoUnico = this.getNombre().substring(0,3) + this.getCategoria().toString().substring(0,3) + numAleatorio;

            bw.write("El codigo del producto " + this.getNombre() + " es: " + codigoUnico);
            bw.newLine();
            
        }catch(Exception e){
            bw.write("Ocurrio un error");
            bw.newLine();
        }finally{
            bw.close();
            fw.close();
        }
    }
}

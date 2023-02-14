/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio2_Factura_con_referencia;

import java.util.ArrayList;

/**
 *
 * @author samuel.hernandez
 */
public class BD_Producto {
    private ArrayList<Producto> productos;
    
    private static int ultimaRef;
    
    public BD_Producto() {
        productos=new ArrayList<>();
        ultimaRef=1;
        
    }
    
    public void add(String descripcion, double precioU){
        String nuevaRef=String.format("REF%d", ultimaRef);
        ultimaRef++;
        
        Producto p=new Producto(nuevaRef, descripcion,precioU);
        productos.add(p);
        
        
    }
    public void buscar(String ref){
        
    }
    
    public void listarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto.aCadena());
            
        }
    }
    
    
    
}

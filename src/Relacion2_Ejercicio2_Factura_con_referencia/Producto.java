/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio2_Factura_con_referencia;

/**
 *
 * @author samuel.hernandez
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;
    
    public Producto(String ref, String desc, double precioU){
        this.descripcion=desc;
        this.ref=ref;
        this.precioUnitario=precioU;
    }
    
    public void aCadena(){
        
    }
    
}

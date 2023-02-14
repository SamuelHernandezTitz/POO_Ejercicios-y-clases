/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio2_Factura_con_referencia;

/**
 *
 * @author samuel.hernandez
 */
public class Linea_Factura {
    private Producto producto;
    private int cantidad;
    private double importeLinea;
    
    
    public Linea_Factura(Producto producto, int cantidad){
        this.cantidad=cantidad;
        this.importeLinea=this.precioU*this.cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    
    public void imprimirLinea(){
        System.out.printf("%d   %s      %.2f      %.2f", cantidad, descripcion, precioUnitario, importeLinea);    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

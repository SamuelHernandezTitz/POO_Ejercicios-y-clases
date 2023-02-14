/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11_Factura;

/**
 *
 * @author samuel.hernandez
 */
public class Linea_Factura {
    private String refProducto;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double importeLinea;
    
    public Linea_Factura(String ref, String desc, int cantidad, double precioU){
        this.refProducto=refProducto;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
        this.importeLinea=this.cantidad*this.precioUnitario;
        
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
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

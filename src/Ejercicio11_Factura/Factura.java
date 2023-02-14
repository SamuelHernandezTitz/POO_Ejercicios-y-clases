/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11_Factura;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author samuel.hernandez
 */
public class Factura {
    private String cif;
    private LocalDate fecha;
    private ArrayList<Linea_Factura> lineas;
    private final double IVA;
    
    public Factura(String cif, LocalDate fecha){
        this.cif=cif;
        this.fecha=fecha;
        lineas = new ArrayList<>();
        IVA=21;
        
        
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getIVA(){
        return IVA;
    }
    
    public void añadirLinea(String ref, String descripcion, int cantidad, double precioUnidad){
                
        this.lineas.add(new Linea_Factura(ref,descripcion,cantidad,precioUnidad));
        System.out.println(".......linea añadida");
        
    }
    
    private double getSubtotal(){
        double subtotal=0;
        for (Linea_Factura linea : lineas) {
            subtotal=subtotal+linea.getImporteLinea();
        }
        
        return subtotal;
    }
    
    private double getIVAsubtotal(){
        return this.getSubtotal()*(this.IVA/100);
    }
    
    private double getTotal(){
        return this.getSubtotal()+this.getIVAsubtotal();
    }
    
    
    
    
    public void imprimirFactura(){
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("===================================================");
        System.out.println("                 FACTURA");
        System.out.println("CIF:   "+this.cif);
        System.out.println("Fecha: "+this.fecha.format(dtf));
        System.out.println("");
        System.out.println("CANT    DESCRIPCION   PRECIO U    IMPORTE");
        System.out.println("---------------------------------------------");
        for (Linea_Factura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("");
        System.out.printf("                          Subtotal: %.2f €\n",this.getSubtotal());
        System.out.printf("                          IVA %.0f:   %.2f €\n",this.IVA,this.getIVAsubtotal());
        System.out.printf("                          TOTAL:    %.2f €\n",this.getTotal());
        System.out.println("===================================================");
    }
    
    
    
    
}

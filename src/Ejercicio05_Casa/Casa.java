/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05_Casa;

/**
 *
 * @author samuel.hernandez
 */
public class Casa {
    private String propietario;
    private double precioVenta;
    private int supPlanta1;
    private int supPlanta2;
    
    public Casa (String p, int sup1, int sup2, double pr){
        this.propietario=p;
        this.supPlanta1=sup1;
        this.supPlanta2=sup2;
        this.precioVenta=pr;
        
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getSupPlanta1() {
        return supPlanta1;
    }

    public void setSupPlanta1(int supPlanta1) {
        this.supPlanta1 = supPlanta1;
    }

    public int getSupPlanta2() {
        return supPlanta2;
    }

    public void setSupPlanta2(int supPlanta2) {
        this.supPlanta2 = supPlanta2;
    }
    
    private int CalcularSupTotal(){
        int supTotal;
        supTotal=this.supPlanta1+this.supPlanta2;
        return supTotal;
        
    }
    
    public void imprimirDatos(){
        System.out.printf("%10s  %5d m2   %.0f€\n",this.propietario,CalcularSupTotal(),this.precioVenta);
        
        
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10_Coche;

/**
 *
 * @author samuel.hernandez
 */




public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[] ruedas;
    
    public Coche(String marca, String modelo, int cv, TipoCombustible combus, TipoCambio cambio, int radio){
        this.marca=marca;
        this.modelo=modelo;
        this.motor=new Motor(cv, combus, cambio);
        
        this.ruedas=new Rueda[5];
        
        for (int i = 0; i < ruedas.length; i++) {
            this.ruedas[i]=new Rueda(radio);
            
        }
        
       
    }
    public void cambiarRueda(int numRueda){
        if (numRueda>=1 && numRueda<=4) {
        }else{
            System.out.println("ERROR: rueda incorrecta");
        }    
    }
    
    public void recorrer(int kmRecorridos){
        int kmactuales=this.motor.getKm();
        this.motor.setKm(kmactuales+kmRecorridos);
    }
    
    public void imprimirFicha(){
        System.out.println("");
        System.out.println("Ficha edel coche");
        System.out.println("================================");
        System.out.println("Marca/modelo: "+this.marca);
    }
    
    
    
    
    
    
}

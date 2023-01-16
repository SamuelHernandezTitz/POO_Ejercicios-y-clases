/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Bicicileta;

/**
 *
 * @author samuel.hernandez
 */
public class Bicicleta {
    
    private int revoluciones;
    private int piñonActual;
    private final String propietario;
    
    
    public Bicicleta(String p){
        this.revoluciones=0;
        this.piñonActual=3;
        this.propietario=p;
    }

    public String getPropietario() {
        return propietario;
    }
    
    public void pedalear(){
        if(this.revoluciones==0){
            this.revoluciones=1;
        }else{
            this.revoluciones=this.revoluciones*2;
        }    
    }
    public void frenar(){
        if(this.revoluciones==1){
            this.revoluciones=0;
        }else{
            this.revoluciones=this.revoluciones/2;
        }
    }
    public void cambiarPiñon(int piñon){
        if(piñon>=1 && piñon<=5){
            this.piñonActual=piñon;
        }else{
            System.out.println("ERROR: piñon incorrecto");
        }
    }
    public void mostrarVelocidad(){
        
        switch(this.piñonActual){
            case 1:
                System.out.println("Velocidad actual: "+(this.revoluciones*2));
                break;
            case 2:
                System.out.println("Velocidad actual: "+(this.revoluciones*1.5));
                break;
            case 3:
                System.out.println("Velocidad actual: "+(this.revoluciones*1));
                break;
            case 4:
                System.out.println("Velocidad actual: "+(this.revoluciones*0.5));
                break;
            case 5:  
                System.out.println("Velocidad actual: "+(this.revoluciones*0.3));
                break;
            default:
                
        }
        
    }
    public double obtenerVelocidad(){
        double velocidad=0;
        switch(this.piñonActual){
            case 1:
                velocidad=this.revoluciones*2;
                break;
            case 2:
                velocidad=this.revoluciones*1.5;
                break;
            case 3:
                velocidad=this.revoluciones*2;
                break;
            case 4:
                velocidad=this.revoluciones*2;
                break;
            case 5:  
                velocidad=this.revoluciones*2;
                break;
            default:
        
        }
        return velocidad;
    }    
}

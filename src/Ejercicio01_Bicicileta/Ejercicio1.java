/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01_Bicicileta;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicicleta mibicicleta = new Bicicleta("Juan");
        
        Bicicleta tubicicleta = new Bicicleta("Alicia");
        
        mibicicleta.pedalear();
        mibicicleta.pedalear();
        mibicicleta.cambiarPiñon(2);
        
        tubicicleta.pedalear();
        tubicicleta.pedalear();
        tubicicleta.pedalear();
        tubicicleta.cambiarPiñon(6);
        
        tubicicleta.pedalear();
        tubicicleta.pedalear();
        tubicicleta.pedalear();
        tubicicleta.cambiarPiñon(5);
        
        mibicicleta.mostrarVelocidad();
        tubicicleta.mostrarVelocidad();
        System.out.println("===============================");
        System.out.println(mibicicleta.getPropietario()+": La velocidad actual es "+mibicicleta.obtenerVelocidad());
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

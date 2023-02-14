/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10_Coche;

import java.util.Scanner;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        
        Coche cocheVolvo=new Coche("VOLVO", "XC60", 140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        
        
        System.out.println("Creando un nuevo coche: ");
        System.out.println("  Marca:");
        String marca=s.nextLine();
        System.out.println("  Modelo:");
        String modelo=s.nextLine();
        System.out.println("  Potencia(CV):");
        int potencia=Integer.parseInt(s.nextLine());
        System.out.println("Combustible [DIESEL|GASOFA]:");
        String combustible=s.nextLine();
        if (combustible.equalsIgnoreCase("diesel")) {
            TipoCombustible tipoCombus=TipoCombustible.DIESEL;
        }else{
            TipoCombustible tipoCombus=TipoCombustible.GASOLINA;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

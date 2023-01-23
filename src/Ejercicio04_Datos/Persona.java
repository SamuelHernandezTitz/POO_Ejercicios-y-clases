/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04_Datos;

/**
 *
 * @author samuel.hernandez
 */
public class Persona {
    private String nombre;
    private String email;
    
    public Persona(String n,String e){
        this.nombre=n;
        this.email=e;
    }
    
    public void imprimirDatos(){
        System.out.println(this.nombre+" - "+this.email);
        
    }
    
    
}

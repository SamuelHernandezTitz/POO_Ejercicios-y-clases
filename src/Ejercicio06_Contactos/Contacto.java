/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio06_Contactos;

/**
 *
 * @author samuel.hernandez
 */
public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorId=0;

    public Contacto(String nombre, String email, String telefono) {
        Contacto.contadorId++;
        this.id = contadorId;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public static int getContador(){
        return contadorId;
    }
    
    
    
    public void imprimirContacto(){
        
        System.out.printf("%-4d %10s %20s %10s\n",id,nombre,email,telefono);
//        System.out.println("Contacto:"+getId());
//        System.out.println("Nombre:"+getNombre());
//        System.out.println("Email:"+getEmail());
//        System.out.println("Telefono:"+getTelefono()+"\n");
     
    }
    
}

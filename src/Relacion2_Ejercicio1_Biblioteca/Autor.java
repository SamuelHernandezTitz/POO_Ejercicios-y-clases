/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio1_Biblioteca;

/**
 *
 * @author samuel.hernandez
 */
public class Autor {
    private int id;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String email;
    
    public Autor(int id, String nombre1, String nombre2, String ap1, String ap2, String email){
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.apellido1=ap1;
        this.apellido2=ap2;
        this.email=email;
        this.id=(int)(Math.random()*1000);
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    public String getNombreCita(){
        
       StringBuilder sb=new StringBuilder();
       sb.append(apellido1);
       sb.append(", ");
       sb.append(nombre1.charAt(0));
       sb.append(".");
       if (nombre2!=null){
            sb.append(nombre2.charAt(0));
            sb.append(". ");
       }
       return sb.toString();
        
    }
}    
        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio07_Agenda_de_contactos;

/**
 *
 * @author samuel.hernandez
 */
public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    

    public Contacto(String nombre, String email, String telefono) {
        this.id=id;
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
    
    public String aCadena(){   
        String contacto = String.format("%s %s %s %d", nombre, email, telefono, id);
        return contacto;
    }
}

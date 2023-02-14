/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio1_Biblioteca;

import java.util.ArrayList;

/**
 *
 * @author samuel.hernandez
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    
    public Biblioteca(String nombre){
        this.nombre=nombre;
        listaLibros=new ArrayList();
        listaAutores=new ArrayList();
        
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void addLibro(){
        
        libros.add(Libro);
        
    }
    
    public void addAutor(){
        
        
        autores.add(Autor);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void listarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro);
            
        }
 
    public void listarAutores(){
        for (Autor autore : autores) {
            System.out.println(autore);
            
        }
    }
            
        
    }
    
    
    
}

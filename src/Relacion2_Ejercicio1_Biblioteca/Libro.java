/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion2_Ejercicio1_Biblioteca;

import Utilidades.Utilidades;

/**
 *
 * @author samuel.hernandez
 */
public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado;
    
    public Libro(String titulo, Autor autor, int año){
        this.codigo = Utilidades.generarCodigoLibro();
        this.autor=autor;
        this.titulo=titulo;
        this.año=año;
        this.prestado=false;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    
    public void imprimir(){
          if (this.prestado==true){
            System.out.printf("\033[31mP  %5s - %15s (%d) - %s\033[30m\n",this.codigo,
                                             this.titulo,
                                             this.año,
                                             this.autor.getNombreCita());
        }else{
            System.out.printf("\033[32m   %5s - %15s (%d) - %s\033[30m\n",this.codigo,
                                             this.titulo,
                                             this.año,
                                             this.autor.getNombreCita());
            
        }
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void imprimirLibro(){
        System.out.println("Libro: "+titulo+", "+año+" de "+autor);
        
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03_Libros;

/**
 *
 * @author samuel.hernandez
 */
public class Libros {
    private String isbn;
    private String tit;
    private String autor;
    private int año;
    
    
    //Primer constructor
    public Libros(String isbn, String autor, String tit, int year){
        this.isbn=isbn;
        this.tit=tit;
        this.autor=autor;
        this.año=año;
        
        
    }
    public Libros(String tit, String aut, int year){
        this.isbn=null;
        this.tit=tit;
        this.autor=autor;
        this.año=año;
    }

    public String getIsbn() {
        
        String isbnnull;
        if(this.isbn==null){
            isbnnull=String.format("***[%s] no tiene ISBN***", this.tit);
            return isbnnull;
        }else{
            return isbn;
        }
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String citaBibliografica(){
        String cita;
        cita=String.format("%s (%d, %s",this.autor,this.año,this.tit);
        return cita;
    }
    
    
    
    
}

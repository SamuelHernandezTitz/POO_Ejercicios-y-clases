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
        isbn=isbn.toUpperCase();
        
        if(this.checkIsbn(isbn)){
            this.isbn=isbn;
        }else{
            System.out.println("ERROR: isbn incorrecto");
        }
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
        cita=String.format("%s (%d), %s",this.tit,this.año,this.autor);
        return cita;
    }
    
    private boolean checkIsbn(String isbn){
        isbn=isbn.toUpperCase();
        
        boolean isbnCorrecto=true;
        
        if(isbn.length()!=4) isbnCorrecto=false;
        
        char letra = isbn.charAt(0);
        if(letra <'A' || letra>'Z') isbnCorrecto=false;;  
        
        char digito1=isbn.charAt(1);
        if(digito1 <'0' || digito1 >'9') isbnCorrecto=false;
     
        char digito2=isbn.charAt(2);
        if(digito2 <'0' || digito2 >'9') isbnCorrecto=false;
        
        char digito3=isbn.charAt(3);
        if(digito3 <'0' || digito3 >'9') isbnCorrecto=false;
             
        if(isbnCorrecto==false){
            return false;
        }else{
            return true;
        }
    }
    
    
        
        
    }
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio03_Libros;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Libros libro1 = new Libros("1984","G.Orswell",1984);
//        Libros libro2 = new Libros("L001","Moby Dick","H.Melvill",1851);
//        Libros libro3 = new Libros("50 sombras","Mike.M.",2010);
//        
//        libro1.setIsbn("H777");
//        
//        System.out.println(libro1.getIsbn());
//        System.out.println(libro2.getIsbn());
//        System.out.println(libro3.getIsbn());
//        
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());
//        System.out.println(libro3.citaBibliografica());
        
        Libros [] listaLibros=new Libros[10];
        
        Libros unLibro;
        int totalLibros=0;
        
        unLibro=new Libros("1984","G.Orswell",1984);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        unLibro=new Libros("L001","Moby Dick","H.Melvill",1851);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        unLibro=new Libros("50 sombras","Mike.M.",2010);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        listaLibros[0].setIsbn("L002");
        
        for (int i = 0; i < totalLibros; i++){
            System.out.println(listaLibros[i].citaBibliografica());
        
        }
        
    }
    
}

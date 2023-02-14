/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11_Factura;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        Factura factura1=new Factura("B30341111",LocalDate.now());
        
        factura1.añadirLinea("REF004","Barra de pan",2,0.80);
        factura1.añadirLinea("REF001","Leche",1,1.5);
        
        factura1.imprimirFactura();
        
        System.out.println("Añadiendo uan nueva linea....");
        System.out.println(".............................");
        System.out.print("Ref: ");
        String ref=s.nextLine();
        System.out.print("Descripcion: ");
        String descripcion=s.nextLine();
        System.out.print("Cantidad: ");
        int cantidad=Integer.parseInt(s.nextLine());
        System.out.print("Precio Unidad: ");
        double precioUnidad=Double.parseDouble(s.nextLine());
        
        factura1.añadirLinea(ref,descripcion,cantidad,precioUnidad);
        
        factura1.imprimirFactura();
        
        
    }
    
}

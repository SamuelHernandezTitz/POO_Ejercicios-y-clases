/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio05_Casa;

import java.util.Scanner;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Casa [] listaCasas = new Casa[50];
        int totalCasas=0;
        int opcion=0;
        
        listaCasas[totalCasas]=new Casa("Juan",30,45,120000);
        totalCasas++;
        listaCasas[totalCasas]=new Casa("Pedro",120,0,100000);
        totalCasas++;
        listaCasas[totalCasas]=new Casa("Alicia",70,70,150000);
        totalCasas++;
        
        
        
        do {
            System.out.println("\n\n\n===================");
            System.out.printf("    MENU CASAS         \n");
            System.out.println("===================");
            
            System.out.println("1. Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propieatio");
            System.out.println("4. Buscar (precio)");
            System.out.println("5. Salir");
           
            System.out.print("\nElige opcion:");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                        System.out.println("====  Alta de nueva casa ====");
                        System.out.print("Nuevo propietario:");
                        String propietario=s.nextLine();
                        System.out.print("Superficie PLANTA1:");
                        int p1=Integer.parseInt(s.nextLine());
                        System.out.print("Superficie PLANTA2:");
                        int p2=Integer.parseInt(s.nextLine());
                        System.out.print("Precio de Venta:");
                        double precio=Double.parseDouble(s.nextLine());

                        listaCasas[totalCasas]=new Casa(propietario,p1,p2,precio);
                        totalCasas++;
                        break;
                case 2:
                        System.out.println("====  Litado de casas ====");
                        for (int i = 0; i < totalCasas ; i++) {
                                System.out.print("CASA "+(i+1)+"-->");
                                listaCasas[i].imprimirDatos();
                        }
                       break;
                case 3:
                        System.out.println("====  Cambiar propietario ====");
                        //Listo las casas
                        for (int i = 0; i < totalCasas ; i++) {
                            System.out.print("CASA "+(i+1)+"-->");
                            listaCasas[i].imprimirDatos();
                        }
                        System.out.print("Numero de casa a modificar:");
                        int numCasa=Integer.parseInt(s.nextLine());
                        System.out.print("Nuevo propietario:");
                        String nuevoPropietario=s.nextLine();
                        listaCasas[numCasa-1].setPropietario(nuevoPropietario);
                    
                        break;
                case 4:
                        buscarCasas(listaCasas,totalCasas);
                        break;
                case 5:
                        break;
                default:
                        System.out.println("Opción no valida");
                    
            }
            
        } while (opcion != 5);
        System.out.println("-----------------");
        System.out.println("PROGRAMA CERRADO.");
     
        
    }

    
    private static void buscarCasas(Casa[] listaCasas, int totalCasas) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("\n====  Buscar casas por precio ====");
        System.out.print("¿Cual es el precio máximo?");
        int precioMax=Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < totalCasas ; i++) {
            
            if (listaCasas[i].getPrecioVenta()<=precioMax){
               System.out.print("CASA "+(i+1)+"-->");
               listaCasas[i].imprimirDatos();
            }
        }
    
    }
    
    
}
    
    


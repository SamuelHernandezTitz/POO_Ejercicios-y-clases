/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02_Cubo;

/**
 *
 * @author samuel.hernandez
 */
public class Cubo {
    private int capMax;
    private int contenido;
    
    public Cubo(int capMax){
        this.capMax=capMax;
        this.contenido=0;
    }
    public void llenar(){
        this.contenido=this.capMax;
    }
    public void vaciar(){
        this.contenido=0;
    }
    public void rellenarx(int litros){
        if((this.contenido+litros)>this.capMax){
            System.out.println("ERROR: Cubo desbordado");
        }else{
            this.contenido=this.contenido+litros;

        }
    }
    public void pintarCubo(){
        for (int nivel=this.capMax; nivel>0; nivel--){
            if(this.contenido>=nivel){
                System.out.println("#~~~~~~#");
            }else{
                System.out.println("#      #");
            }    
        }
        System.out.println("########");
    }
    
}

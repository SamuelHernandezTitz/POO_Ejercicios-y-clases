/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author samuel.hernandez
 */
public class Utilidades {
    
    public static boolean checkEmail(String email){
    
        if(email.contains("@") && 
           email.contains(".") && 
          (email.indexOf("@")<email.indexOf("."))){
            return true;
        }else{
            return false;
        }
    }
}    
    

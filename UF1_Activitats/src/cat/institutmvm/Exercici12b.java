/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
//Pre: Introdueix un número i
public class Exercici12b {
    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "El doble del número és: ";
    private static final String MSG_3 = "El el triple del número és: ";
    
   public static void main(String[] arg) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextFloat();
        System.out.println(MSG_2 + num*2);
        System.out.println(MSG_3 + num*3); 
        
       
   }
            
    
}

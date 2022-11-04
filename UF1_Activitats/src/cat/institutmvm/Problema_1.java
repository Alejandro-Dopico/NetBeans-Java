/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *  Alejandro
 *  Killian
 *  Iván
 */
public class Problema_1 {
    private static final String MSG_1 = "Introdueix el número de pagines: ";
    private static final String MSG_2 = "El resultat es: ";

    public static void main(String[] args) {   
    int n1;
    Scanner sc = new Scanner(System.in);
    System.out.println(MSG_1);
    n1 = sc.nextInt();    
    if(n1<=15){
        System.out.println("Es gratuit");
        }
        if(n1<=100 && n1>15){
            System.out.println("El preu es 2.99");   
            }
            if(n1<=300 && n1>100){
                System.out.println("El preu es 9.99"); 
                }
                if(n1<=700 && n1>300){
                    System.out.println("El preu es 19.99"); 
                }
                else{
                    System.out.println("El preu no es disponible");         
                }
    }
}

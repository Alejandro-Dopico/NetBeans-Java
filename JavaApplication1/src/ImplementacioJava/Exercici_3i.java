/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

// Alejandro Garcia Dopico

import java.util.Scanner;

public class Exercici_3i {
    private static final String MSG_1 = "Introdueix un número: ";
    public static void main(String[] args) {
        System.out.println("Nom: Alejandro"); 
        System.out.println("Cognoms: Garcia Dopico");
        System.out.println("INS Manuel Vázquez Montalbán");
        System.out.println("Data d'edició: 27/10/22");
        System.out.println("Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)");
        System.out.println("Nom del mòdul: Programació");
        System.out.print("\n");
        float num1, num2;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 > num2){
                System.out.println("El número més gran és: " + num1);
            }
            else if(num2 > num1) {
                System.out.println("El número més gran és: " + num2);
            }           
            else {
                 System.out.println("Els números son iguals"); 
                    }
  }
}    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

import java.util.Scanner;

// Alejandro Garcia Dopico

public class Exercici_3k {
    private static final String MSG_1 = "Introdueix dos números i primer el més gran: ";
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
            if(num1 % num2 == 0){
                System.out.println("El valor introduït es multiple");
            }
            else {
                System.out.println("El valor introduït no es multiple");
            }
        }
}    
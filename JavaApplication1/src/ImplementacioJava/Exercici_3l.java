/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

import java.util.Scanner;

// Alejandro Garcia Dopico

public class Exercici_3l {
    private static final String MSG_1 = "Introdueix el número de litres: ";

    public static void main(String[] args) {
        System.out.println("Nom: Alejandro"); 
        System.out.println("Cognoms: Garcia Dopico");
        System.out.println("INS Manuel Vázquez Montalbán");
        System.out.println("Data d'edició: 27/10/22");
        System.out.println("Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)");
        System.out.println("Nom del mòdul: Programació");
        System.out.print("\n");
        
        float num1;    
        int fixa = 6;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 <= 50){
                System.out.println("La cuota a pagar es: " + fixa);
            }
            else if (num1 >= 50 && num1 <= 200) {
                total = (num1 * 0.1) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
            else if (num1 > 200){
                total = (num1 * 0.3) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
        }
}    
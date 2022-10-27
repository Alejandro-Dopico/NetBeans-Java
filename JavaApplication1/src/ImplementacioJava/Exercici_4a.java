/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

// Alejandro Garcia Dopico

import java.util.Scanner;

public class Exercici_4a {
    private static final String MSG_1 = "Introdueix el mes: ";

    public static void main(String[] args) {
        System.out.println("Nom: Alejandro"); 
        System.out.println("Cognoms: Garcia Dopico");
        System.out.println("INS Manuel Vázquez Montalbán");
        System.out.println("Data d'edició: 27/10/22");
        System.out.println("Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)");
        System.out.println("Nom del mòdul: Programació");
        System.out.print("\n");
        
        float num1;    
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 == 1){
                System.out.println("Enero");
            }
            else if (num1 == 2) {
                System.out.println("febrero");
            }
            else if (num1 == 3){
                System.out.println("Marzo");
            }
            else if (num1 == 4){
                System.out.println("Abril");
            }
            else if (num1 == 5) {
                System.out.println("Mayo");
            }
            else if (num1 == 6){
                System.out.println("Junio");
            }
            else if (num1 == 7){
                System.out.println("Julio");
            }
            else if (num1 == 8) {
                System.out.println("Agosto");
            }
            else if (num1 == 9){
                System.out.println("Septiembre");
            }
            else if (num1 == 10){
                System.out.println("Octubre");
            }
            else if (num1 == 11) {
                System.out.println("Noviembre");
            }
            else if (num1 == 12){
                System.out.println("Diciembre");
            }
            else if (num1 < 1 || num1 > 12){
                System.out.println("Error");
            }
        }
}    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

// Alejandro Garcia Dopico

import java.util.Scanner;

public class Exercici_3h {
    private static final String MSG_1 = "Introdueix un número: ";
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
            if(num1 % 2 == 0){
                System.out.println("Par i elevat al quadrat: " + num1*num1*num1*num1);
            }
            else {
                System.out.println("Senar i elevat al cub: " + num1*num1*num1);
            }           
  }
}    
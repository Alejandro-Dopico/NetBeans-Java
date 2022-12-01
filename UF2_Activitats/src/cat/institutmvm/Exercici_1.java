/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */
///Pre: Crea un programa que demani un nombre per teclat i validi si aquest és natural
public class Exercici_1 {

    private static final String MSG_1 = "Introdueix un número: ";
    private static final String MSG_2 = "Error:, torna'hi ";

    public static void main(String[] args) {
        Valida method = new Valida();
        int num1 = method.valid();
        int num2 = method.valid();
        int num3 = method.valid();
        
        System.out.println(num1+" "+ num2 +" " + num3);
    }

    public int valid() {
        int num=0;
        boolean valorCorrecte; 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num = sc.nextInt();
                if(num < 0){
                    System.out.println(MSG_2);
                }
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (!valorCorrecte || num < 1);
        return num;
    }
}
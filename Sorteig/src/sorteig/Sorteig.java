/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorteig;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */

//Pre: Emmagatzarem dades per fer un projecte.

public class Sorteig {

    private static final String MSG_1 = "Introdueix el teu ID: ";
    private static final String MSG_2 = "Introdueix la teva edad: ";
    private static final String MSG_3 = "Quin tipus de venda es?";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades, torna'hi: ";
    private static final String MSG_7 = "Programa finalitzat per error en dades";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat";

    public static void main(String[] args) {
        int id = 0, edad = 0, venda, ic, telefon, i = 0, rest;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20 + "\n" + "\n" + MSG_1);
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                do {
                    rest = sc.nextInt();
                    if (rest <= 999 && rest >= 111) {
                        id = id + rest;
                    } else {
                        i++;
                        sc.next();
                        System.out.println(MSG_6);
                    }
                } while (i < 3);
            } else {
                i++;
                sc.next();
                System.out.println("\n" + MSG_6);
            }
        } while (!valorCorrecte && i < 3);
        System.out.println("\n" + MSG_2);
        rest = 0;
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                do {
                    rest = sc.nextInt();
                    if (rest <= 120 && rest >= 14) {
                        edad = edad + rest;                    
                    } 
                    else {
                        i++;
                        sc.next();
                        System.out.println(MSG_6);
                    }
                } while (i < 3);
            } 
            else {
                i++;
                sc.next();
                System.out.println("\n" + MSG_6);
            }
        }    
        while (i < 3);
    }
}
    


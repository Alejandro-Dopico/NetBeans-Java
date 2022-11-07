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

//Pre: Emmagatzemem 20 valors en el rang de l'1 al 9.
public class Exercici29 {

    private static final String MSG_1 = "Introdueix 20 números: ";
    private static final String MSG_2 = "Error, aquet valor no entra en els parametres: ";
    private static final String MSG_3 = "La matriu  de dreta a esquerra: ";
    private static final String MSG_4 = "La matriu d'esquerra a dreta: ";
    
    public static void main(String[] args) {
        int[] arrayEnters = new int[20];
        int i;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (i = 0; i < arrayEnters.length; i++) {
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    arrayEnters[i] = sc.nextInt();
                    if(arrayEnters[i] >= 1 && arrayEnters[i] <= 9) {                 
                    }
                } else {
                    sc.next();
                    System.out.println("\n" + MSG_2);
                }
            } while (!valorCorrecte);
        }
        System.out.println(MSG_3);
        for (i = 0; i < arrayEnters.length; i++) {
            System.out.print(arrayEnters[i]);
        }
        System.out.println("\n" + MSG_4);
        for (i = 19; i >= 0; i--) {
            System.out.print(arrayEnters[i]);
        }   
    }
}
//Post: Ensenyarem els números emmagatzemats acendentemente i descendent.

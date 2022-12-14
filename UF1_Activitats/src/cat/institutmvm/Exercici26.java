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

//Pre: Almacena 20 valores enteros y clasificalos
public class Exercici26 {

    private static final String MSG_1 = "Introdueix 5 números: ";
    private static final String MSG_2 = "Aquest es el resultat: ";
    private static final String MSG_3 = "Error, torna a introduïr: ";

    public static void main(String[] args) {
        int[] arrayEnters = new int[5];
        int i;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);

        for (i = 0; i < arrayEnters.length; i++) {
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    arrayEnters[i] = sc.nextInt();
                    if (arrayEnters[i] % 5 == 0) {
                        arrayEnters[i] = arrayEnters[i] + 3;
                    } else {
                        if (arrayEnters[i] % 3 == 0) {
                            arrayEnters[i] = arrayEnters[i] - 2;
                        } else {
                            arrayEnters[i] = arrayEnters[i] + 0;
                        }
                    }
                }
                else{
                    sc.next();
                    System.out.println("\n" + MSG_3);
                }
            }while (!valorCorrecte);
        }
        System.out.println(MSG_2 + "\n");
        for (i = 0; i < arrayEnters.length; i++) {
            System.out.println(arrayEnters[i]);
        }
    }
}

//Post: Tendremos los valores almacenados segun si es divisible entre 5 o 3
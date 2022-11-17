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

//Pre: guardem valors en un array.
public class Exercici30 {

    private static final String MSG_1 = "Introdueix els valors: " + "\nPrimera fila: ";
    private static final String MSG_2 = "Error, aquet valor no entra en els parametres: ";
    private static final String MSG_3 = "Pasem a la seguent fila: ";
    private static final String MSG_4 = "Printem la matriu tansposta";
    
    public static void main(String[] args) {
        int[][] arrayTwo = new int[7][3];
        int i, j;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (i = 0; i < arrayTwo.length; i++) {
            for (j = 0; j < 3; j++) {
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        do{
                            arrayTwo[i][j] = sc.nextInt();
                            if(arrayTwo[i][j] < 1 || arrayTwo[i][j] > 9){
                                System.out.println(MSG_2);
                            }
                        }while (arrayTwo[i][j] <1 || arrayTwo[i][j] > 9);
                    } else {
                        sc.next();
                        System.out.println(MSG_2);
                    }
                } while (!valorCorrecte);
            }
            if(i < 6){
            System.out.println("\n" + MSG_3 + "\n");
            }
        }
        System.out.println(MSG_4);
        for (i = 0; i < 3 ; i++) {
            for (j = 0; j < arrayTwo.length; j++) {
                arrayTwo[j][i] = arrayTwo[i][j];
                System.out.print(arrayTwo[i][j]);
            }
        }
    }
}
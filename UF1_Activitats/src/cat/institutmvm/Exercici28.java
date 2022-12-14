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

//Pre: Almacenaremos las notas de los alumnos
public class Exercici28 {

    private static final String MSG_1 = "Escriu les notes del primer alumne: ";
    private static final String MSG_2 = "Pasem al seguent alumne: ";
    private static final String MSG_3 = "Error, torna a introduïr: ";
    private static final String MSG_4 = "La nota mitja del alumne: ";
    private static final String MSG_5 = "Pasem al seguent alumne: ";

    public static void main(String[] args) {
        boolean valorCorrecte;
        int[][] arrayTwo = new int[10][6];
        int nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[j].length; j++) {
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayTwo[i][j] = sc.nextInt();
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                    }
                } while (!valorCorrecte);
            }
            if(i < 9){
            System.out.println("\n" + MSG_2 + "\n");
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[j].length; j++) {
                nota = nota + arrayTwo[i][j];
            }
            System.out.println(MSG_4 + nota/6);
            nota = 0;
            if(i < 9){
                System.out.println("\n" + MSG_5);
            }
        }
    }
}
//Post: Daremos la media de las notas de cada alumno

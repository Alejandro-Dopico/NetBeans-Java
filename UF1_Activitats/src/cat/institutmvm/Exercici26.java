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

    private static final String MSG_1 = "Introdueix un número: ";

    public static void main(String[] args) {
        int[] arrayEnters = new int[20];
        int i, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 0; i < arrayEnters.length; i++) {
            if(arrayEnters[i] % 5 == 0){
                num= num + i;
            }
            if(arrayEnters[i] % 3 == 0){
                arrayEnters[i] = i - 3;
                }
                else
                        arrayEnters[i] = i + 0;                         
        }
    }
}
//Post: Tendremos los valores almacenados segun si es divisible entre 5 o 3
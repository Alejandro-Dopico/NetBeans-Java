/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
*/

public class Exercici_6b {
    private static final String MSG_1 = "Introdueix el mes: ";

    public static void main(String[] args) {       
        int mes, any;    
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        mes = sc.nextInt();
        any = sc.nextInt();
        if (mes % 2 == 0){
            if (mes == 2){
                if (any % 4 == 0){
                    System.out.println(case: 2);
                }
                else
                    System.out.println(case: 1);
            }
            else
                System.out.println(case: 3);
        }
        else {
            System.out.println(case: 4);
        }
        switch (mes) {
            case 1:
                System.out.println("28");
                break;
            case 2:
                System.out.println("29");
                break;
            case 3:
                System.out.println("30");
                break;
            case 4:
                System.out.println("31");
                break;
        }
}
               
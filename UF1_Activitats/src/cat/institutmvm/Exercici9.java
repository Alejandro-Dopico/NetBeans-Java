/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

//Pre: Introdueix un número y especifica si es entre 5 y 50.
public class Exercici9 {
    private static final String MSG_1 ="Introdueix un número: ";
            
    public static void main(String[] args) {
        int num1;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();            
        if(num1 >= 5 && num1 <= 50){
            System.out.println("El número compleix el rang"); //Printamos directamente en la propia línea
            }
        else {
            System.out.println("El número no compleix el rang");
          }               
        }
}            
//Post: Ens donara el resultat dintre del rang



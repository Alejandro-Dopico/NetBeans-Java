/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Exercici8 {
        private static final String MSG_1 = "Introdueix un número: ";
        
        public static void main(String[] args) {
            int num1;        
            Scanner sc = new Scanner(System.in);
            System.out.println(MSG_1);
            num1 = sc.nextInt();            
            if(num1 >= 0){
                System.out.println("El numero es natural");
            }
            else {
                System.out.println("El numero no es natural");
            }               
        }
}            



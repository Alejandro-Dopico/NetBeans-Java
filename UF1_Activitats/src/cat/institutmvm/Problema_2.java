/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *  Alejandro
 *  Killian
 *  Iván
 */

public class Problema_2 {

    public static void main(String[] args) { 
        int n1, n2, n3, suma, suma2, suma3;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        suma= n1+n2;
        suma2= n2+n3;
        suma3= n1+n3;
        if(suma > n3){
            System.out.println("Es un triangle"); 
        }
        if(suma2> n1){
            System.out.println("Es un triangle");
        }
        if(suma3> n2){
            System.out.println("Es un triangle");
        }  
        else  {
            System.out.println("No es un triangle"); 
                } 
            
        }
}

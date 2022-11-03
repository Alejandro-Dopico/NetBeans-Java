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

public class Exercici31 {
    private static final String MSG_1 = "Indrodueix un nombre: ";
    private static final String MSG_2 = "Error, Torna a introduir un nombre: ";
    
    public static void main(String[] args){
        int num, res = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);  
        do{
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num = sc.nextInt();
                while(num != 0){
                        num = (num / 10);
                        res = res + 1;
                }
            }
            else{
                sc.next();
                System.out.println(MSG_2);
            }
        }while(!valorCorrecte);
        System.out.println(res);
    }
}
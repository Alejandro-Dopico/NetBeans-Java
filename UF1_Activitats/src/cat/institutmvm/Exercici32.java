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

public class Exercici32 {
    private static final String MSG_1 = "Introdueix el preu base: ";
    private static final String MSG_2 = "Introdueix el numero d'unitats: ";
    private static final String MSG_3 = "Introdueix la categoria: " + "\nPer a les categories 1 i 2, s'aplica un IVA superreduït (4%)" + "\nPer a les categories 3 i 4, s'aplica un IVA reduït (8%)" + "\nPer a la resta de categories, s'aplica l'IVA general (21%)";
    private static final String MSG_10 = "Error, Torna'hi";
    private static final float IVA21 = 0.21F;
    private static final float IVA8 = 0.08F;
    private static final float IVA4 = 0.04F;
    
    public static void main(String[] args){
        int categoria = 0;
        float preubase, unitats, preufinal;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println(MSG_1);  
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                preubase = sc.nextFloat();
            }
            else{
                sc.next();
                System.out.println(MSG_10);
            }
        }
        while(!valorCorrecte);
        do{
            System.out.println("\n" + MSG_2);  
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                unitats = sc.nextFloat();
            }
            else{
                sc.next();
                System.out.println(MSG_10);
            }
        }
        while(!valorCorrecte);
        do{
            System.out.println("\n" + MSG_3);  
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                categoria = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println(MSG_10);
            }
        }
        while(!valorCorrecte);
        if(categoria <= 2)
            preufinal= unitats*preubase
            
            

                
        }
    }
}
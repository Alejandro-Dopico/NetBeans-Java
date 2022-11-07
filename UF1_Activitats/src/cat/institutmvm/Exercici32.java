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
    private static final String MSG_3 = "Introdueix la categoria: " + "\n1-Medicaments: IVA(4%)" + "\n2-Farines: IVA(4%)" + "\n3-Medicaments veterinaris: IVA(8%)" + "\n4-Aigues: IVA(8%)" + "\n5-Cosmètics: IVA(21%)" + "\n6-Begudes alcohòliques: IVA(21%)\n";
    private static final String MSG_4 = "Introduiex un valor del 1 al 6";
    private static final String MSG_10 = "Error, Torna'hi";
    private static final float IVA21 = 0.21F;
    private static final float IVA8 = 0.08F;
    private static final float IVA4 = 0.04F;
    
    public static void main(String[] args){
        int categoria = 0;
        float preubase= 0, unitats= 0, preufinal= 0;
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
            if(valorCorrecte && categoria <= 6 && categoria >=1){
                    categoria = sc.nextInt();
                }
            else{
                sc.next();
                System.out.println(MSG_10);
            }
        }
        while(!valorCorrecte);
        do{
            if(categoria <= 6 && categoria >=1){
            switch(categoria) {
                case 1:
                    if(categoria <= 6 && categoria >= 1){
                    preufinal= (preubase*unitats*IVA4);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    }
                    else {
                        System.out.println(MSG_4);
                    }
                    break;
                case 2:
                    preufinal= (preubase*unitats*IVA4);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    break;
                case 3:
                    preufinal= (preubase*unitats*IVA8);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    break;
                case 4:
                    preufinal= (preubase*unitats*IVA8);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    break;
                case 5:
                    preufinal= (preubase*unitats*IVA21);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    break;
                case 6:
                    preufinal= (preubase*unitats*IVA21);
                    preufinal= (preubase*unitats) + preufinal;
                    System.out.println("\nEl cost es de " + preufinal +"€");
                    break;  
                default:
                    System.out.println("Error");
            }
        }
            else{
                sc.next();
                System.out.println(MSG_10);
            }
        }
        while(!valorCorrecte);
        if(preufinal >= 100) {
            System.out.println("\nEl cost d'enviament es 3 €\n");
            System.out.println("El total amb l'enviament es: " + (preufinal + 3)+"€");       
        }
        else if (preufinal >= 500 && preufinal <= 100) {
            System.out.println("\nEl cost d'enviament es 20 €\n");
            System.out.println("El total amb l'enviament es: " + (preufinal + 20)+"€");
        }
        else {
            System.out.println("\nEl cost d'enviament es 50 €\n");
            System.out.println("El total amb l'enviament es: " + (preufinal + 50)+"€");
        }
    }
}



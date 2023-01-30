/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutmvm.app;

import institutmvm.utils.Methods;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, resultat = 0;
        Methods met = new Methods();
        Scanner sc = new Scanner(System.in);
       
        /*
        
        //Exercici_1:
              
        System.out.println("Introdueix la base: ");
        num1 = met.valorCorrecte(sc);
        System.out.println("Introdueix el exponent: ");
        num2 = met.valorCorrecte(sc);
               
        resultat = met.ex1(num1, num2);
        
        System.out.println("Aquí esta la potencia: " + resultat);
        
        

        //Exercici_2:
        String text;

        System.out.println("Introdueix un text: ");
        text = sc.nextLine();

        text = text.toUpperCase();
        System.out.println("El convertim a MAYUS: " + text);

        System.out.print("Introdueix n1: ");
        int n1 = sc.nextInt();
        System.out.print("Introdueix n2: ");
        int n2 = sc.nextInt();
        System.out.println("Substring de n1, n2: " + text.substring(n1, n2));

        System.out.print("Introdueix el caracter a remplaça: ");
        char caracter = sc.next().charAt(0);
        System.out.print("El que cambiemt: ");
        char canvi = sc.next().charAt(0);
        text = text.replace(caracter, canvi);
        System.out.println("El text modificatt: " + text);

        System.out.print("Introdueix text afegir: ");
        String afegir = sc.nextLine();
        text = text + afegir;
        System.out.println("Resultat del text: " + text);

        System.out.print("Introdueix el caracter a buscar: ");
        char search = sc.next().charAt(0);
        System.out.println("Primera aparicio del caracter: " + text.indexOf(search));
      
        
        
        //Exercici 3:
        System.out.println("Introdueix un text per teclat: ");
        String text2 = sc.nextLine();
        System.out.println("Aquesta es la seva longitud: " + text2.length());
        System.out.println("Introdueix un enter: ");
        num3 = sc.nextInt();
        num3 = Math.abs(num3);
        System.out.println("Aquest es el valor absolut: " + num3);
        System.out.println("Introdueix un text: ");
        String text3 = sc.nextLine();
        System.out.println("Introdueix la comprovacio: ");
        String text4 = sc.nextLine();
        System.out.println("Si la cadena es troba, true, en el cas que no false: " + text3.equals(text4));
        
        */
        
        //Exercici_4:
        int size = 0, min = 0, max = 0, mitjana = 0;
        boolean  exit = false;
        
        System.out.println("Introdueix el tamany del array: (valors entre 0 y 20)");
        do{
            size = sc.nextInt();
            exit = met.rang(size, 0, 20);
        } while (exit != true);
        
        int[] array = new int[size];
        
        System.out.println("Entre quin rang vols els valors? ");
        min = met.valorCorrecte(sc);
        max = met.valorCorrecte(sc);
        
        for(int i = 0; i < array.length; i++){
            array[i] = met.aleatori(min, max);
        }
        
        mitjana = met.Mitjana(array, size);
        
        System.out.println("Aquesta es la mitjana de tot els valors: " + mitjana);
        sc.close(); 
    }  
}

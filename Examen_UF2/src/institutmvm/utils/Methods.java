/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutmvm.utils;
import java.util.Scanner;
/**
 *
 * @author alumne_1r
 */
public class Methods {

    //Exercici_1: 
    public int ex1(int base, int exponente) {
        int resultat = 1;

        if (base > 0 && exponente == 0) {
            return resultat;
        } else if (base == 0 && exponente >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultat = resultat * base;
            }
            return resultat;
        }
    }

    //Validacio de rang
    public boolean rang(int num, int first, int last) {
        boolean exit = false;

        if (num >= first && num <= last) {
            exit = true;
        } else {
            System.out.println("Valor incorrecte.");
        }
        return exit;
    }

    //Validacio de número natural.
    public int valorCorrecte(Scanner sc) {
        boolean exit = false, valorCorrecte;
        int num = 0;

        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num = sc.nextInt();
                exit = true;
            } else {
                System.out.println("Error, tprna'hi.");
                sc.next();
            }

        } while (exit != true);
        return num;
    }

    //Genera un número aleatori.
    public int aleatori(int min, int max) {

        return (int) (Math.random() * (max - min) + min);

    }

    //Mitjana array.
    public int Mitjana(int[] array, int size) {
        int total = 0, mitjana = 0;

        for (int i = 0; i < size; i++) {
            total = total + array[i];
        }
        mitjana = total / size;
        return mitjana;

    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    


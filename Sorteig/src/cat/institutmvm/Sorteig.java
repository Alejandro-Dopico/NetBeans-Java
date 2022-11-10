/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

//Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors.
public class Sorteig {
    
    private static final String MSG_1 = "Introdueix el teu ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat per error en dades.";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat";

    public static void main(String[] args) {

        int id = 0, edat = 0, tipus, compra, telefon, i = 0, j = 0;
        boolean valorCorrecte = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                id = sc.nextInt();
                if (id >= 111 && id <= 999) {
                    j = 3;
                } else {
                    System.out.println(MSG_6);
                    i++;
                }
            } else {
                sc.next();
                System.out.println(MSG_6);
                i++;
            }
            if (i == 3) {
                j = 3;
            }
        } while (j < 3);
        if (i == 3) {
            System.out.println(MSG_7);
        } else {
            j = 0;
            i = 0;
            do {
                System.out.println(MSG_2);
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    edat = sc.nextInt();
                    if (edat >= 14 && edat <= 120) {
                        j = 3;
                    } else {
                        System.out.println(MSG_6);
                        i++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_6);
                    i++;
                }
                if (i == 3) {
                    j = 3;
                }
            } while (j < 3);
            if (i == 3) {
                System.out.println(MSG_7);
            }
            else {
                System.out.println(MSG_3);
                tipus = sc.nextInt();
                switch (tipus){
                    
                    case 1:
                }
            }
        }
    }
}

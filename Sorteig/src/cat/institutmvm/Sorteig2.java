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

//Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors.
public class Sorteig2 {
    private static final String MSG_1 = "Introdueix el teu ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat per error en dades.";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat";   
    
    public static void main(String[] args) {

        int id = 0, edat, tlfn, tipo, cont = 0;
        boolean correcte;
        double imp;

        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20);
        do {

            if (cont < 3 && id < 111 || id > 999) {

                System.out.println(MSG_1);
                correcte = sc.hasNextInt();
                if (correcte) {
                    id = sc.nextInt();

                    if (id < 111 || id > 999) {
                        System.out.println(MSG_6);
                        id = 0;


                    }
                } else {
                    sc.next();
                    System.out.println(MSG_6);
                    id = 0;


                }
                cont++;
                if (cont == 3 && id < 111 || id > 999) {
                    System.out.println(MSG_7);
                }
            }

        } while (cont < 3 && id < 111 || id > 999);
    }

}    


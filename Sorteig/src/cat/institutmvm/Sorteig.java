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
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat per error en dades.";
    private static final String MSG_8 = "Programa finalitzat per error en dades.";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final int MAXID = 999;
    private static final int MINID = 111;
    private static final int MAXEDAT = 120;
    private static final int MINEDAT = 14;
    private static final int MAXCOMPRA = 1000;
    private static final int MINCOMPRA = 0;
    private static final int MAXTLF = 999999999;
    private static final int MINTLF = 111111111;

    public static void main(String[] args) {

        int id = 0, edat = 0, tipus, compra, telefon, i = 0;
        boolean valorCorrecte = false, exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                id = sc.nextInt();
                if (id >= MINID && id <= MAXID) {
                    exit = true;
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
                exit = true;
            }
        } while (exit != true);
        if (i == 3) {
            System.out.println(MSG_7);
        } else {
            exit = false;
            i = 0;
            do {
                System.out.println(MSG_2);
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    edat = sc.nextInt();
                    if (edat >= MINEDAT && edat <= MAXEDAT) {
                        exit = true;
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
                    exit = true;
                }
            } while (exit != true);
            if (i == 3) {
                System.out.println(MSG_7);
            } else {

                exit = false;
                do {
                    System.out.println(MSG_3);
                    tipus = sc.nextInt();
                    switch (tipus) {

                        case 0:
                            System.out.println("Venda lliure (0)");
                            exit = true;
                            break;
                        case 1:
                            System.out.println("Pensionista (1)");
                            exit = true;
                            break;
                        case 2:
                            System.out.println("Carnet Jove (2)");
                            exit = true;
                            break;
                        case 3:
                            System.out.println("Soci (3)");
                            exit = true;
                            break;
                        default:
                            i++;
                            System.out.println(MSG_6);
                            break; 
                        }
                        if (i == 3) {
                            exit = true;
                    }
                } while (exit != true);
                if (i == 3) {
                    System.out.println(MSG_7);
                } else {
                    i = 0;
                    exit = false;
                    System.out.println(MSG_4);
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            compra = sc.nextInt();
                            if (compra >= MINCOMPRA && compra <= MAXCOMPRA) {
                                exit = true;
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
                            exit = true;
                        }
                    } while (exit != true);
                    if (i == 3) {
                        System.out.println(MSG_7);
                    } else {
                        System.out.println(MSG_3);
                    }
                    i = 0;
                    exit = false;
                    System.out.println(MSG_5);
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            telefon = sc.nextInt();
                            if (telefon >= MINTLF && telefon <= MAXTLF) {
                                exit = true;
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
                            exit = true;
                        }
                    } while (exit != true);
                    if (i == 3) {
                        System.out.println(MSG_7);
                    } else {
                        System.out.println(MSG_8);
                    }               
                }
            }
        }
    }
}
    

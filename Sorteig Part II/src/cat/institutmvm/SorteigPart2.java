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
///Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors.
public class SorteigPart2 {

    private static final String MSG_1 = "Introdueix el ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat per error en dades.";  
    private static final String MSG_8 = "ID        EDAT        TIPUS           IMPORT          TELÈFON";
    private static final String MSG_9 = "Seguent persona: ";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat" + "\nIntrodueix el número de clients:";
    private static final String TYPE_0 = "Lliure";
    private static final String TYPE_1 = "Pension";
    private static final String TYPE_2 = "Carnet";
    private static final String TYPE_3 = "Soci";
    private static final int MAXID = 999;
    private static final int MINID = 111;
    private static final int MAXEDAT = 120;
    private static final int MINEDAT = 14;
    private static final int MAXCOMPRA = 1000;
    private static final int MINCOMPRA = 0;
    private static final int TLF = 9;
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        int tlf = 0, res = 0, compra = 0, telefon = 0, size = 0, numpersona = 0;
        int j = 0;
        boolean valorCorrecte = false, exit = false;
        String out = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_20);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                size = sc.nextInt();
            } else {
                sc.next();
            }
        } while (!valorCorrecte);

        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayTipus = new int[size];
        int[] arrayImport = new int[size];
        int[] arrayTelefon = new int[size];
        int[] arrayTlf = new int[size];
        int[] arrayOut = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(MSG_1);
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    arrayId[i] = sc.nextInt();
                    if (arrayId[i] <= MAXID && arrayId[i] >= MINID) {
                        exit = true;
                    } else {
                        System.out.println("\n" + MSG_6);
                        j++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_6);
                    j++;
                }
                if (j == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (j == 3) {
                System.out.println(MSG_7);
                break;
            } else {
                exit = false;
                j = 0;
                System.out.println(MSG_2);
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayEdat[i] = sc.nextInt();
                        if (arrayEdat[i] >= MINEDAT && arrayEdat[i] <= MAXEDAT) {
                            exit = true;
                        } else {
                            System.out.println("\n" + MSG_6);
                            j++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_6);
                        j++;
                    }
                    if (j == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (j == 3) {
                    System.out.println(MSG_7);
                } else {
                    j = 0;
                    exit = false;
                    System.out.println(MSG_3);
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            arrayTipus[i] = sc.nextInt();
                            switch (arrayTipus[i]) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                case 0:
                                    System.out.println("Venda lliure (0)");
                                    arrayOut[i] = 0;
                                    exit = true;
                                    break;
                                case 1:
                                    System.out.println("Pensionista (1)");
                                    arrayOut[i] = 1;
                                    exit = true;
                                    break;
                                case 2:
                                    System.out.println("Carnet Jove (2)");
                                    arrayOut[i] = 2;
                                    exit = true;
                                    break;
                                case 3:
                                    System.out.println("Soci (3)");
                                    arrayOut[i] = 3;
                                    exit = true;
                                    break;
                                default:
                                    j++;
                                    System.out.println(MSG_6);
                                    break;
                            }
                        } else {
                            sc.next();
                            System.out.println(MSG_6);
                            j++;
                        }
                        if (j == 3) {
                            exit = true;
                        }
                    } while (exit != true);
                    if (j == 3) {
                        System.out.println(MSG_7);
                    } else { //Repetim amb la mateix estructura les altres variables.
                        j = 0;
                        exit = false;
                        System.out.println("\n" + MSG_4);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                arrayImport[i] = sc.nextInt();
                                if (arrayImport[i] >= MINCOMPRA && arrayImport[i] <= MAXCOMPRA) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_6);
                                    j++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_6);
                                j++;
                            }
                            if (j == 3) {
                                exit = true;
                            }
                        } while (exit != true);
                        if (j == 3) {
                            System.out.println(MSG_7);
                        } else {
                            j = 0;
                            System.out.println("\n" + MSG_5);
                            exit = false;
                            do { //Repetim amb la mateix estructura les altres variables, amb un while més. 
                                tlf = 0;
                                res = 0;
                                valorCorrecte = sc.hasNextInt();
                                if (valorCorrecte) {
                                    arrayTelefon[i] = sc.nextInt();
                                    arrayTlf[i] = arrayTlf[i] + arrayTelefon[i];
                                    while (arrayTelefon[i] != 0) { //Aquí verificarem el número de xifres que te el valor.   
                                        arrayTelefon[i] = (arrayTelefon[i] / 10); //Dividem entre 10 per saber el número de xifres.
                                        res = res + 1;
                                    }
                                    if (res == TLF) { //Si el número de xifres es 9, s'emmagatzera.
                                        exit = true;
                                    } else {
                                        System.out.println(MSG_6);
                                        j++;
                                    }
                                } else {
                                    sc.next();
                                    System.out.println(MSG_6);
                                    j++;
                                }
                                if (j == 3) {
                                    exit = true;
                                }
                            } while (exit != true);
                            if (j == 3) {
                                System.out.println(MSG_7);
                            }
                        }
                    }
                }
            }
            numpersona++;
            System.out.println("\n" + MSG_9);
        }
        System.out.println("\nA continuació mostrem les dades:");
        System.out.println("\n" + MSG_8);
        for (int i = 0; i < size; i++) {
            System.out.print(ANSI_BLUE + arrayId[i] + "\t" + "    " + arrayEdat[i] + "\t" + "   " + ANSI_BLUE);
            switch (arrayTipus[i]) {

                case 0:
                    System.out.print(ANSI_BLUE + "Venda lliure" + ANSI_BLUE);
                    break;
                case 1:
                    System.out.print(ANSI_BLUE + "Pensionista" + ANSI_BLUE);
                    break;
                case 2:
                    System.out.print(ANSI_BLUE + "Carnet Jove" + ANSI_BLUE);
                    break;
                case 3:
                    System.out.print(ANSI_BLUE + "Soci" + ANSI_BLUE);
                    break;        
            }
            System.out.print("\t" + "   " + ANSI_BLUE + arrayImport[i] + "\t" + "    "+ arrayTlf[i] + ANSI_BLUE + "\n");
        }
    }
}
//Post: Printarem el resultat emmagatzemat, a més amb color blau. Si hem introduit malament 3 vegadas, el programa es finalitzarà.   
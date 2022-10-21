/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Exercici_N12_c {

    private static final String MSG_1 = "Introduce 3 números:";
    private static final String MSG_2 = "La suma de los dos primeros es más grande";
    private static final String MSG_3 = "La suma de los dos primeros es más pequeño";

    public static void main(String[] arg) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if ((num1 + num2) > num3) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }

}

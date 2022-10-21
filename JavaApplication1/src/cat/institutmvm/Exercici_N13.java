/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Exercici_N13 {

    private static final String MSG_1 = "Introduce 5 números";
    private static final String MSG_2 = "Esta es la media: ";

    public static void main(String[] arg) {
        int num1, num2, num3, num4, num5, media;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();
        media = (num1 + num2 + num3 + num4 + num5);
        System.out.println(MSG_2 + media / 5);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Exercici_N12_a {
    private static final String MSG_1="Introduce la base ";
    private static final String MSG_2="Introduce la altura ";
    private static final String MSG_3="El área és ";

    public static void main(String[] arg) {
        float base, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        base = sc.nextFloat();
        System.out.println(MSG_2);
        altura = sc.nextFloat();
        area = (base * altura) / 2;
        System.out.println(MSG_3 + area);              
    }
    
}

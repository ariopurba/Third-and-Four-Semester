/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekursif;

import java.util.Scanner;

/**
 *
 * @author old
 */
public class RekursifPemangkatan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BIlangan x pangkat y");
        System.out.println("Bil X");
        int x = scan.nextInt();
        System.out.println("Bil Y");
        int y = scan.nextInt();
        System.out.println(x + "dipangkatkan" + y + " " + pangkatRekursif(x, y));
    }

    public static int pangkatRekursif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatRekursif(x, y - 1);
        }
    }
}

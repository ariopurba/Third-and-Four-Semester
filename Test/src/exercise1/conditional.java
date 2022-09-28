/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author old
 */
public class conditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int n = scan.nextInt();
        
        if (n > 0) {
            System.out.println(n+" Bilangan positif");
        }else if (n == 0) {
            System.out.println("Angka nol");
        }
        else{
            System.out.println(n+" Bilangan negatif");
        }
    }
}

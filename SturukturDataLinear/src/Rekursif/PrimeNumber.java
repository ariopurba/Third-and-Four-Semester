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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Bilangan: ");
        int n = scan.nextInt();
        System.out.println("Bilangan Prima: ");
        for(int i = 0; i <= n; i++){
            if(primeCheck(i)){
                System.out.println(i+ ", ");
            }
        }
        
    }
    public static int PrimeNumbers(int n, int h){
        if (h == 1){
            return 1;
        }else if (n % h == 0){
            return 1 + PrimeNumbers(n, --h);
        }else{
            return 0 + PrimeNumbers(n, --h);
        }
    }
    public static boolean primeCheck(int n){
        if (n > 1){
            return (PrimeNumbers(n, n) == 2);
        }else{
            return false;
        }
    }
            
}

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
public class ReverseString {
    void  reverse(String str1){
        if ((str1 == null) || (str1.length() <= 1)) {
            System.out.println(str1);
        }else{
            System.out.print(str1.charAt(str1.length()-1));
            reverse(str1.substring(0, str1.length()- 1));
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Kata yang akan dibalikkan: ");
        String str1 = scan.next();
        
        System.out.print("Kata Yang Sudah Dibalikkan : ");
        ReverseString obj = new ReverseString();
        obj.reverse(str1);
    }
}

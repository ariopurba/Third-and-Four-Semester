/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author old
 */
public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);
    
    public static String input(String info){
        System.out.println(info +" : ");
        String data = scanner.nextLine();
        return data;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.util.Random;

/**
 *
 * @author old
 */
public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            int nilai = random.nextInt(1000);
            System.out.println(nilai);
        }
    }
}

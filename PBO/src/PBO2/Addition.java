/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        //menyediakan user input dari JOptionPane input dialog
        String firstNumber = JOptionPane.showInputDialog("Masukkan Nilai integer Pertama");
        String secondNumber = JOptionPane.showInputDialog("Masukkan Nilai integer kedua");
        
        //konversi String input ke nilai int untuk dikalkulasi
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        //tampilkan hasilnya di JOptionPane Massege dialog
        JOptionPane.showMessageDialog(null, "The sum is "+sum,
                "Hasil Penjumlahan dari dua integer",JOptionPane.PLAIN_MESSAGE);
    }
}

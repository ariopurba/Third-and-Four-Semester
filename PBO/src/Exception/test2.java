/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author old
 */
public class test2 {

    public static void main(String[] args) {
        do {
            try {
                int a = Integer.parseInt(JOptionPane.showInputDialog(null, "data int"));

                System.out.println(a);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Input anda salah");
            }
            
        } while (true);

    }
}

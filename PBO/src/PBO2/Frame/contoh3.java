/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2.Frame;

import javax.swing.*;
public class contoh3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.show();
        
        JDialog dlg = new JDialog(frame, "Dialog 1", true);
        dlg.setSize(200, 100);
        dlg.show();
    }
}

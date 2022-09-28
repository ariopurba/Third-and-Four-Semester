/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2.Frame;

import javax.swing.*;

public class contoh2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();

        int result = JOptionPane.showConfirmDialog(frame, "Contoh dialog konfirmasi ...", "Judul Dialog", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        String pesan;
        if (result == JOptionPane.OK_OPTION) {
            pesan = "Anda memilih ok";

        } else if (result == JOptionPane.CANCEL_OPTION) {
            pesan = "Anda memilih cencel";
        } else {
            pesan = "anda tidak memilih apapun";
        }
        JOptionPane.showMessageDialog(frame, pesan, "Pilihan Anda", JOptionPane.INFORMATION_MESSAGE);
    }
}

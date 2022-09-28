/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomponenGUI;

/**
 *
 * @author Rafael Mahesa
 */
import javax.swing.*;
public class ctDialog {
    public static void main(String[] args) {
	JFrame frame = new JFrame("Contoh Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.show();

	JOptionPane.showConfirmDialog(frame,
            "Contoh dialog konfirmasi ...",
            "Judul Dialog",
            JOptionPane.OK_CANCEL_OPTION, 	//Jenis Tombol
            JOptionPane.QUESTION_MESSAGE);	//Icon
    }
}

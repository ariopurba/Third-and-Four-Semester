/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Rafael Mahesa
 */
import javax.swing.JDialog;
public class JDialogMain {
    public static void main(String[] args) {
        JDialog defaultJDialog;
        defaultJDialog = new JDialog();
        defaultJDialog.setSize(500, 500);
        defaultJDialog.setTitle("Try Dialog");
        defaultJDialog.setVisible(true);
    }
}
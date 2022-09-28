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
import javax.swing.*;
public class TextAreaExample {
    TextAreaExample() {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome");
        area.setBounds(10, 30, 200, 200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new TextAreaExample();
    }
}

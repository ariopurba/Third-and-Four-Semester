/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Rafael Mahesa
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test36 extends JFrame {
  public void Test() {
    JButton jbtOK = new JButton("OK");
    add(jbtOK);
    jbtOK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("The OK button is clicked");
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new Test36();
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
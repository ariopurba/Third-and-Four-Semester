/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Rafael Mahesa
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test_05 extends JFrame implements ActionListener {
  public Test_05() {
    JButton jbtOK = new JButton("OK");
    getContentPane().add(jbtOK);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("The OK button is clicked");
  }

  public static void main(String[] args) {
    JFrame frame = new Test();
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
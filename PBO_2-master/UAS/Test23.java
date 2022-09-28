/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test23 extends A {
  public static void main(String[] args) {
    A frame = new Test23();
    frame.setSize(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  JButton jbtOK = new JButton("OK");

  public Test23() {
    getContentPane().add(jbtOK);
    jbtOK.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    

    if (e.getSource() == jbtOK)
      System.out.println("OK button is clicked");
  }
}

class A extends JFrame implements ActionListener {
  JButton jbtCancel = new JButton("Cancel");

  public A() {
    getContentPane().setLayout(new FlowLayout());
    getContentPane().add(jbtCancel);
    jbtCancel.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbtCancel)
      System.out.println("Cancel button is clicked");
  }
}
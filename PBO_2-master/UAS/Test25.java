/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Test25 extends JFrame {
  public Test25() {
    Border border = new TitledBorder("My button");
    JButton jbt1 = new JButton("OK");
    JButton jbt2 = new JButton("Cancel");
    jbt1.setBorder(border);
    jbt2.setBorder(border);
    add(jbt1, BorderLayout.NORTH);
    add(jbt2, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    JFrame frame = new Test25();
    frame.setSize(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
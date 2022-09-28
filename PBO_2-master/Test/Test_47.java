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
import javax.swing.*;

public class Test_47 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Frame");
    frame.add(new JButton("OK"));
    frame.add(new JButton("Cancel"));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
} 
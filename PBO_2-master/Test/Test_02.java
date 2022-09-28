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
import javax.swing.*;

public class Test_02 {
  public static void main(String[] args) {
    JFrame f1 = new JFrame("My Frame");
    JFrame f2 = f1;
    JFrame f3 = f2;
    f1.setVisible(true);
    f2.setVisible(true);
    f3.setVisible(true);
  }
} 
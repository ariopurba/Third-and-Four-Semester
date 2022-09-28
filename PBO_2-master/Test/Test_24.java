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

public class Test_24 {
   public static void main(String[] args) {
     JButton jbtOK = new JButton("OK");
     System.out.print(jbtOK.isVisible() + ", ");

     JFrame frame = new JFrame();
     System.out.println(frame.isVisible());
   }
} 
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
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
public class TryGridLayout {
  static JFrame aWindow = new JFrame("This is a Grid Layout"); 
  public static void main(String[] args) {
    Toolkit theKit = aWindow.getToolkit();          
    Dimension wndSize = theKit.getScreenSize();  
    aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);  
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridLayout grid = new GridLayout(3,4,30,20);   
    Container content = aWindow.getContentPane(); 
    content. setLayout(grid); 
    EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);     
    JButton button;                                             
    for(int i = 1; i <= 10; i++) {
      content.add(button = new JButton("Press " + i));          
      button.setBorder(edge);                                       }
    aWindow.setVisible(true);                              
  }
}

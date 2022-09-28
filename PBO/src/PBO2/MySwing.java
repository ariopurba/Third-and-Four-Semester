/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author old
 */
public class MySwing extends JFrame {

    public MySwing() {
        initComponents();
    }

    private void initComponents() {
        //buat JPanel sebagai contentPane
        JPanel kontenPane = new JPanel(new BorderLayout());
        kontenPane.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        kontenPane.add(new Button("OK"), BorderLayout.CENTER);
        kontenPane.add(new JButton("Close"),BorderLayout.PAGE_END);
        
        //set sebagai content-pane dari JFrame
        kontenPane.setOpaque(true);
        setContentPane(kontenPane);

    }
    public static void main(String args[]){
        JFrame jf = new MySwing();
        jf.setSize(400, 300);
        jf.setTitle("Coba Konten Pane");
        jf.setVisible(true);
    }
}

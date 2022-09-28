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
import java.awt.*;
import javax.swing.*;
public class MySwing extends JFrame {
    public MySwing() {
        initComponents();
    }
    private void initComponents() {
        //Buat JPanel sebagai contentPane
	   JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        contentPane.add( new JButton("OK"), BorderLayout.CENTER);
        contentPane.add( new JButton("Close"), BorderLayout.PAGE_END);

        //set sebagai content-pane dari JFrame
        contentPane.setOpaque(true);
        setContentPane(contentPane);
    }
    public static void main(String args[ ]) {
        JFrame jf = new MySwing();
        jf.setSize( 400, 300 );
        jf.setTitle("Try Contentpane");
        jf.setVisible(true);
     }
}
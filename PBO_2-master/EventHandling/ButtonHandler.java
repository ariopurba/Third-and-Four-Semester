/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

/**
 *
 * @author Rafael Mahesa
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A sample handler for processing action events of buttons.
 */
class ButtonHandler implements ActionListener {

//----------------------------------
//    Constructors
//----------------------------------
    /**
     * Default constructor
     */
    public ButtonHandler() {

    }

//-------------------------------------------------
//      Public Methods:
//
//          void    actionPerformed   (   ActionEvent        )
//
//------------------------------------------------
    /**
     * Standard method to respond the action event.
     *
     * @param event the ActionEvent object
     *
     */
    public void actionPerformed(ActionEvent event) {

        JButton clickedButton = (JButton) event.getSource();

        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();

        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();
        String buttonText = clickedButton.getText();

        frame.setTitle("You clicked " + buttonText);
    }

}

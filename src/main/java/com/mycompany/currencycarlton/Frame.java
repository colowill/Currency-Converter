package com.mycompany.currencycarlton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author 2headaxe
 */
public class Frame implements ActionListener {
    
    // Initilization of UI components
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JComboBox fromBox = new JComboBox();
    JComboBox toBox = new JComboBox();
    JButton convert = new JButton("CONVERT");
    
    Frame() {
        
        frame.setTitle("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 360);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

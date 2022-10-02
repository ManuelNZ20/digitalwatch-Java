package com.navarroz.frame;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormClass extends JFrame {

    JPanel panel;
    JLabel horas;

    public FormClass() {
        setSize(500, 250);
        setDefaultCloseOperation(3);
        initComponent();
        setLocationRelativeTo(null);
    }

    public void initComponent() {
        initComponentPanel();
        initComponenteJLabel();

    }

    public void initComponentPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void initComponenteJLabel() {
        horas = new JLabel("00");
        horas.setFont(new Font("Source Sans Pro", 0, 50));
        horas.setBounds(10,10,50,50);
        panel.add(horas);
    }

}

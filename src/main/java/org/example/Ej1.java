package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ej1 extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ej1 frame = new Ej1();
            frame.setVisible(true);
        });
    }

    public Ej1(){
        setTitle("Ejercicio 1");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //Co null aparece no centro
        setLayout(new BorderLayout());

        JButton jButton = new JButton("Eaaa");
        jButton.setSize(100,50);

        jButton.addActionListener(e -> System.out.println("Holaaa"));

        add(jButton);
    }
}
package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej2 extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ej2 frame = new Ej2();
            frame.setVisible(true);

        });
    }

    public Ej2() {
        setTitle("Ej2");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //Co null aparece no centro
        setLayout(new BorderLayout());

        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");

        aceptar.addActionListener(e -> System.out.println("Aceptado"));

        cancelar.addActionListener(e -> System.out.println("Cancelado"));

        add(aceptar);
        add(cancelar);
    }

}

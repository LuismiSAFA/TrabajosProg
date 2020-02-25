package PEP2T_5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Walkman {
    public static void main(String[] args) {
        JFrame marco = new JFrame("Ejercicio EP2T_5 JAVA");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel etiqueta = new JLabel("Mi Walkman en Java");

        JButton boton1 = new JButton("Rewind");
        JButton boton2 = new JButton("Stop");
        JButton boton3 = new JButton("Play");
        JButton boton4 = new JButton("FF");
        JButton boton5 = new JButton("Rec");
        JTextField campotexto = new JTextField(32);
        marco.setSize(400, 150);

        marco.add(panel1, BorderLayout.NORTH);
        panel1.add(etiqueta);
        marco.add(panel2, BorderLayout.CENTER);
        panel2.add(campotexto);
        marco.add(panel3, BorderLayout.SOUTH);
        panel3.add(boton1 );
        panel3.add(boton2 );
        panel3.add(boton3);
        panel3.add(boton4);
        panel3.add(boton5);

        panel1.setBorder(new EmptyBorder(5,10,5,10));
        panel3.setBorder(new EmptyBorder(5,10,5,10));

        ActionListener actionListener = e -> campotexto.setText("Estoy rebobinando");
        ActionListener actionListener2 = e -> campotexto.setText("Quieto parao");
        ActionListener actionListener3 = e -> campotexto.setText("Soy gitano y vengo a u casamiento...");
        ActionListener actionListener4 = e -> campotexto.setText("Voy palante");
        ActionListener actionListener5 = e -> campotexto.setText("Estoy grabando");

        boton1.addActionListener(actionListener);
        boton2.addActionListener(actionListener2);
        boton3.addActionListener(actionListener3);
        boton4.addActionListener(actionListener4);
        boton5.addActionListener(actionListener5);

        marco.setVisible(true);
    }



}

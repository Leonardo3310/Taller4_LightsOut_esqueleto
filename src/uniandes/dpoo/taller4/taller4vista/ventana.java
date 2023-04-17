package uniandes.dpoo.taller4.taller4vista;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ventana extends JFrame { //implements ActionListener {
   
    //private Container container;
    private JLabel jugadas;
    private JLabel jugadores;


    public ventana()
    {
        setTitle("Lights Out");
        setSize(600, 600);
        setLayout(new BorderLayout());
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel norte = new JPanel();
        norte.setBackground(Color.GREEN); //deberia ponerlo en otra clase

        JLabel hola = new JLabel("paula cabrona");
        norte.add(hola);

        add(norte, BorderLayout.NORTH);
        //container = getContentPane();
       // container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        
       
    }

    

    
    
}

package uniandes.dpoo.taller4.taller4vista;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PanelNorte extends JPanel{
    
    JRadioButton facil;
    JRadioButton medio;
    JRadioButton dificil;

    JComboBox<String> combotamanios;

    private Interfaz interfaz;

    public PanelNorte(Interfaz interfaz)
    {
        this.interfaz = interfaz;
        setBackground(Color.CYAN.darker()); //deberia ponerlo en otra clase

        JLabel tamanio = new JLabel("Table Size");
        this.add(tamanio);  

        String[] tamanios = {"4x4","5x5", "6x6","7x7","8x8","9x9"};     
        combotamanios = new JComboBox<>(tamanios);
        this.add(combotamanios);

        JLabel dificultad = new JLabel("Dificultad:");
        this.add(dificultad);

        facil = new JRadioButton("Facil");
        medio = new JRadioButton("Medio");
        dificil = new JRadioButton("Dificil");
        ButtonGroup dificultades = new ButtonGroup();
        dificultades.add(facil);
        dificultades.add(medio);
        dificultades.add(dificil);
        this.add(facil);
        this.add(medio);
        this.add(dificil);
        combotamanios.addActionListener(interfaz);
        facil.addActionListener(interfaz);
        medio.addActionListener(interfaz);
        dificil.addActionListener(interfaz);



        //JRadioButton facil = new JRadioButton();

    }
    
}
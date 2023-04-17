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


public class PanelNorte extends JPanel { //mplements ActionListener{
    
    public PanelNorte()
    {
        
        setBackground(Color.CYAN.darker()); //deberia ponerlo en otra clase

        JLabel tamanio = new JLabel("Table Size");
        add(tamanio);  

        String[] tamanios = {"5x5", "6x6","7x7"};     
        JComboBox combotamanios = new JComboBox<>(tamanios);
        add(combotamanios);

        JLabel dificultad = new JLabel("Dificultad:");
        add(dificultad);

        JRadioButton facil = new JRadioButton("Facil");
        JRadioButton medio = new JRadioButton("Medio");
        JRadioButton dificil = new JRadioButton("Dificil");
        ButtonGroup dificultades = new ButtonGroup();
        dificultades.add(facil);
        dificultades.add(medio);
        dificultades.add(dificil);
        add(facil);
        add(medio);
        add(dificil);


        //JRadioButton facil = new JRadioButton();

    }
    
}
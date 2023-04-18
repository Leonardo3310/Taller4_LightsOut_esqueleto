package uniandes.dpoo.taller4.taller4vista;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Interfaz extends JFrame {

    //private Container container;



    public Interfaz() {
        setTitle("Lights Out");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        
        PanelNorte norte = new PanelNorte();
        PanelEast oriente = new PanelEast();
        PanelSouth sur = new PanelSouth();
        PanelWest occidente = new PanelWest(5);

        add(norte, BorderLayout.NORTH);
        add(oriente, BorderLayout.EAST);
        add(sur, BorderLayout.SOUTH);
        add(occidente, BorderLayout.WEST);
        setVisible(true);
    }

}   

    

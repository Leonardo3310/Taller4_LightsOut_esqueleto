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
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String nickname = JOptionPane.showInputDialog("Type your name please");
        PanelNorte norte = new PanelNorte();
        PanelEast oriente = new PanelEast();
        PanelWest occidente = new PanelWest(5,3);
        //PanelSouth sur = new PanelSouth(occidente.jugadas(), nickname);
         
        add(norte, BorderLayout.NORTH);
        add(oriente, BorderLayout.EAST);
        add(occidente, BorderLayout.WEST);
        //add(sur, BorderLayout.SOUTH);
        setVisible(true);


        while (true)
        {   
            
            PanelSouth sur = new PanelSouth(occidente.jugadas(), nickname);
            //this.remove(sur);
            add(sur, BorderLayout.SOUTH);
            setVisible(true);
            //sur.removeAll();
            //sur.revalidate();
            //sur.repaint();
            
            
        }
        
    }

}   

    

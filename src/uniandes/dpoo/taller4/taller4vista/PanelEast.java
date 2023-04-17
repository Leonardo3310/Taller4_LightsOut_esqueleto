package uniandes.dpoo.taller4.taller4vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PanelEast extends JPanel{

        public PanelEast()
        {
        
        
        setBackground(Color.GRAY.brighter()); //deberia ponerlo en otra clase
        setSize(200, 500);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        

        JButton nuevo = new JButton("        Nuevo        ");
        JButton reset = new JButton("      Reiniciar      ");
        JButton top = new JButton("       Top  10       ");
        JButton playerchange = new JButton("Cambiar Jugador");

        
        setAlignmentY(Component.CENTER_ALIGNMENT);
        add(nuevo);
        add(reset);
        add(top);
        add(playerchange);
        

        


        //JRadioButton facil = new JRadioButton();

    }    
}
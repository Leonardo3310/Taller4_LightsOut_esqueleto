package uniandes.dpoo.taller4.taller4vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PanelEast extends JPanel {

        JButton nuevo;
        JButton reset;
        JButton top;
        JButton playerchange;
        private Interfaz interfaz;

        public PanelEast(Interfaz interfaz)
        {
        
        this.interfaz = interfaz;
        setBackground(Color.GRAY.brighter()); //deberia ponerlo en otra clase
        setSize(200, 500);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        

        this.nuevo = new JButton("        Nuevo        ");
        
        this.reset = new JButton("       Reiniciar      ");
        
        this.top = new JButton("       Top  10       ");
        
        //top.setBackground(Color.MAGENTA);
        this.playerchange = new JButton("Cambiar Jugador");
        


        
        setAlignmentY(Component.CENTER_ALIGNMENT);
        playerchange.addActionListener(interfaz);
        nuevo.addActionListener(interfaz);
        reset.addActionListener(interfaz);
        top.addActionListener(interfaz);
        this.add(Box.createVerticalGlue());
        this.add(nuevo);
        this.add(reset);
        this.add(top);
        this.add(playerchange);
        this.add(Box.createVerticalGlue());
        
        
    }
}

        

        
        //JRadioButton facil = new JRadioButton();

    

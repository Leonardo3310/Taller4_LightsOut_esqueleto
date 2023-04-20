package uniandes.dpoo.taller4.taller4vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PanelEast extends JPanel implements ActionListener{

        public PanelEast()
        {
        
        
        setBackground(Color.GRAY.brighter()); //deberia ponerlo en otra clase
        setSize(200, 500);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        

        JButton nuevo = new JButton("        Nuevo        ");
        nuevo.addActionListener(this);
        JButton reset = new JButton("       Reiniciar      ");
        reset.addActionListener(this);
        JButton top = new JButton("       Top  10       ");
        top.addActionListener(this);
        //top.setBackground(Color.MAGENTA);
        JButton playerchange = new JButton("Cambiar Jugador");
        playerchange.addActionListener(this);


        
        setAlignmentY(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());
        add(nuevo);
        add(reset);
        add(top);
        add(playerchange);
        add(Box.createVerticalGlue());
        
        
        

        


        //JRadioButton facil = new JRadioButton();

    }    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("        Nuevo        "))
        {
            
        }
        else if (comando.equals("       Reiniciar      "))
        {

        }
    }
}
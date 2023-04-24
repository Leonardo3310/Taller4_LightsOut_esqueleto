package uniandes.dpoo.taller4.taller4vista;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Interfaz extends JFrame implements ActionListener{

    PanelNorte arriba = new PanelNorte(this);
    PanelEast derecha = new PanelEast(this);
    PanelWest tablero = new PanelWest(5,3,this);

    PanelSouth abajo;
    int dificultad = 3;
    int size = 5;

    JButton nuevo;
    JButton reset;
    JButton top;
    JButton playerchange;

    JRadioButton facil;
    JRadioButton medio;
    JRadioButton dificil;

    JComboBox<String> combotamanios;


    public Interfaz() {
        setTitle("Lights Out");
        setSize(800, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        String nickname = JOptionPane.showInputDialog("Type your name please");
        
        //PanelSouth sur = new PanelSouth(occidente.jugadas(), nickname);
         
        this.add(arriba, BorderLayout.NORTH);
        this.add(derecha, BorderLayout.EAST);
        this.add(tablero, BorderLayout.WEST);
        //add(sur, BorderLayout.SOUTH);
        setVisible(true);


        while (true)
        {   
            
            PanelSouth abajo = new PanelSouth(tablero.jugadas(), nickname);
            //this.remove(sur);
            this.add(abajo, BorderLayout.SOUTH);
            setVisible(true);
            //sur.removeAll();
            //sur.revalidate();
            //sur.repaint();
            
            
        }
        
    }

    public void nuevoJuego()
    {
        tablero.nuevoPanel(size, dificultad);
    }

    @Override
	public void actionPerformed(ActionEvent e)
	{

		// Botones panel de la derecha

		nuevo = derecha.nuevo;
		reset = derecha.reset;
		top = derecha.reset;
		playerchange = derecha.playerchange;

		// Botones panel de arriba

		facil = arriba.facil;
		medio = arriba.medio;
		dificil = arriba.medio;

		combotamanios = arriba.combotamanios;

		// Panel de la derecha

		if (e.getSource() == nuevo)
		{
			nuevoJuego();
		}

		else if (e.getSource() == reset)
		{
	
			tablero.nuevoPanel(size, dificultad);
			//elDeAbajo.cantidadJugadas.setText("0");
		}

		//else if (e.getSource() == top)
		//{
			//ventanaTop10.changeVisibility();
		//}

		else if (e.getSource() == playerchange)
		{
			//new IngresarNombre();
		}

		// Panel de arriba

		else if (e.getSource() == facil)
		{
			dificultad = 3;
			nuevoJuego();
		}

		else if (e.getSource() == medio)
		{
			dificultad = 5;
			nuevoJuego();
		}

		else if (e.getSource() == dificil)
		{
			dificultad = 7;
			nuevoJuego();
		}

		else if (e.getSource() == combotamanios)
		{
			String selectedSize = (String) combotamanios.getSelectedItem();
			if (selectedSize.equals("4x4"))
			{
				size = 4;
				nuevoJuego();
			}

			else if (selectedSize.equals("5x5"))
			{
				size = 5;
				nuevoJuego();
			}

			else if (selectedSize.equals("6x6"))
			{
				size = 6;
				nuevoJuego();
			}

			else if (selectedSize.equals("7x7"))
			{
				size = 7;
				nuevoJuego();
			}

			else if (selectedSize.equals("8x8"))
			{
				size = 8;
				nuevoJuego();
			}

			else if (selectedSize.equals("9x9"))
			{
				size = 9;
				nuevoJuego();
			}

		}

	}
} 

    

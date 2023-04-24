package uniandes.dpoo.taller4.taller4vista;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Interfaz extends JFrame implements ActionListener{

    PanelNorte arriba = new PanelNorte(this);
    PanelEast derecha = new PanelEast(this);
    PanelWest tablero = new PanelWest(4,3,this);

    PanelSouth abajo;
    int dificultad = 3;
    int size = 4;

    JButton nuevo;
    JButton reset;
    JButton top;
    JButton playerchange;

    JRadioButton facil;
    JRadioButton medio;
    JRadioButton dificil;

	String nickname;

    JComboBox<String> combotamanios;


    public Interfaz() {
        setTitle("Lights Out");
        setSize(760, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        nickname = JOptionPane.showInputDialog("Type your name please");
        
        //PanelSouth sur = new PanelSouth(occidente.jugadas(), nickname);
         
        this.add(arriba, BorderLayout.NORTH);
        this.add(derecha, BorderLayout.EAST);
        this.add(tablero, BorderLayout.WEST);
        //add(sur, BorderLayout.SOUTH);
        setVisible(true);


        while (true)
        {   
            
            PanelSouth abajo = new PanelSouth(tablero.jugadas(), nickname);
            this.add(abajo, BorderLayout.SOUTH);
            setVisible(true);
            
            
            
        }
        
    }

    public void nuevoJuego(int tamanio)
    {
		this.size = tamanio;
        tablero.nuevoPanel(this.size, this.dificultad);
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
		dificil = arriba.dificil;

		combotamanios = arriba.combotamanios;

		// Panel de la derecha

		if (e.getSource() == nuevo)
		{
			nuevoJuego(size);
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
			nickname = JOptionPane.showInputDialog("Type your name please");
		}

		// Panel de arriba

		else if (e.getSource() == facil)
		{
			dificultad = 3;
			nuevoJuego(size);
		}

		else if (e.getSource() == medio)
		{
			dificultad = 5;
			nuevoJuego(size);
		}

		else if (e.getSource() == dificil)
		{
			dificultad = 7;
			nuevoJuego(size);
		}

		else if (e.getSource() == combotamanios)
		{
			String selectedSize = (String) combotamanios.getSelectedItem();
			if (selectedSize.equals("4x4"))
			{
				size = 4;
				nuevoJuego(4);
			}

			else if (selectedSize.equals("5x5"))
			{
				size = 5;
				nuevoJuego(5);
			}

			else if (selectedSize.equals("6x6"))
			{
				size = 6;
				nuevoJuego(6);
			}

			
			
		}

	}
} 

    

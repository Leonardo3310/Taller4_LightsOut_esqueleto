package uniandes.dpoo.taller4.taller4vista;
import uniandes.dpoo.taller4.modelo.*;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.*;
import java.net.*;

public class PanelWest extends JPanel implements MouseListener {
    private boolean[][] lights;
    private Tablero tablero;
    private int tamanio;
    

    public PanelWest(int tamanio) 
    {
        this.tamanio = tamanio;
        //this.tablero = new Tablero(tamanio);
        lights = new boolean[this.tamanio][this.tamanio+1];
        //this.lights = tablero.darTablero();
        addMouseListener(this);
        setPreferredSize(new Dimension(601, 501));
        setMinimumSize(new Dimension(601, 501));
        //lights = new boolean[5][6];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                lights[i][j] = true;
            }
        }

    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    @Override
    public void paintComponent(Graphics g) {
        int boxWidth = 600 / this.tamanio+1;
        int boxHeight = 500 / this.tamanio;

        int y = 0;
        for (int row = 0; row < this.tamanio; row++) {
            int x = 0;
            for (int col = 0; col < this.tamanio; col++) {
                if (lights[row][col]==true) {
                    g.setColor(Color.YELLOW);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x, y, boxWidth, boxHeight);

                g.setColor(Color.BLUE);
                g.drawRect(x, y, boxWidth, boxHeight);
                x += boxWidth;
            }
            y += boxHeight;
        }
    }

    // called when the mouse is pressed - determines what row/column the user
    // has clicked
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int boxWidth = panelWidth / lights[0].length;
        int boxHeight = panelHeight / lights.length;

        int col = mouseX / boxWidth;
        int row = mouseY / boxHeight;

        toggle(row, col);
        //this.tablero.jugar(col, row);
        repaint();
    }

   
    public void toggle1(int row, int col) {

        if (row >= 0 && col >= 0 && row < lights.length && 
            col < lights[0].length)
        {
            if (lights[row][col] == true) {
                lights[row][col] = false;
            } else {
                lights[row][col] = true;
            }
        }

    }
    public void toggle(int fila, int columna)
	{
		int tam = lights.length;

		for (int df = -1; df < 2; df++)
		{
			for (int dc = -1; dc < 2; dc++)
			{
				int f = fila + df;
				int c = columna + dc;
				if (f >= 0 && f < tam && c >= 0 && c < tam)
				{
					lights[f][c] = !lights[f][c];
				}
			}
		}
		//jugadas++;
	}

}
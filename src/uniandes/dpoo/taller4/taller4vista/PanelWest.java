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
        this.tablero = new Tablero(tamanio);
        tablero.desordenar(3);
        addMouseListener(this);
        setPreferredSize(new Dimension(601, 501));
        setMinimumSize(new Dimension(601, 501));

    }

    @Override
    public void paintComponent(Graphics g) {
        int boxWidth = 600 / this.tamanio+1;
        int boxHeight = 500 / this.tamanio;

        int y = 0;
        for (int row = 0; row < this.tamanio; row++) {
            int x = 0;
            for (int col = 0; col < this.tamanio; col++) {
                if (tablero.darTablero()[row][col]==true) {
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

    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int boxWidth = panelWidth / tablero.darTablero()[0].length;
        int boxHeight = panelHeight / tablero.darTablero().length;

        int col = mouseX / boxWidth;
        int row = mouseY / boxHeight;

        this.tablero.jugar(col, row);
        repaint();
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    

}
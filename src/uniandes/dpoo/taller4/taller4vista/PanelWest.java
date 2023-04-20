package uniandes.dpoo.taller4.taller4vista;
import uniandes.dpoo.taller4.modelo.*;
import javax.swing.JPanel;
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
    private Tablero tablero;
    private int tamanio;
    

    public PanelWest(int tamanio) 
    {
        this.tamanio = tamanio;
        this.tablero = new Tablero(tamanio);
        tablero.desordenar(3);
        addMouseListener(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setPreferredSize(new Dimension(tamanio*100, tamanio*100));
        setMinimumSize(new Dimension(tamanio*100, tamanio*100));

    }

    @Override
    public void paintComponent(Graphics g) {
        int boxWidth = tamanio*90 / this.tamanio;
        int boxHeight = tamanio*90 / this.tamanio;

        int y = 0;
        for (int fila = 0; fila < this.tamanio; fila++) {
            int x = 0;
            for (int col = 0; col < this.tamanio; col++) {
                if (tablero.darTablero()[fila][col]==false) {
                    g.setColor(Color.YELLOW);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x, y, boxWidth, boxHeight);

                g.setColor(Color.WHITE);
                g.drawRect(x, y, boxWidth, boxHeight);
                x += boxWidth;
            }
            y += boxHeight;
        }
    }

    public void mousePressed(MouseEvent e) {
        //int mouseX = e.getX();
        //int mouseY = e.getY();

        int mouseX = e.getXOnScreen();
        int mouseY = e.getYOnScreen();

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        //int boxWidth = panelWidth / tablero.darTablero()[0].length;
        //int boxHeight = panelHeight / tablero.darTablero().length;

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

    public int jugadas ()
    {
        return this.tablero.darJugadas();
    } 
    

}
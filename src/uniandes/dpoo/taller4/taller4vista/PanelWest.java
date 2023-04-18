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


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class PanelWest extends JPanel implements MouseListener {
    private boolean[][] lights;
        
    

    public PanelWest(int tamanio) 
    {
        lights = new boolean[tamanio][tamanio+1];
        addMouseListener(this);
        setPreferredSize(new Dimension(601, 501));
        setMinimumSize(new Dimension(601, 501));
        //lights = new boolean[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
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
        int boxWidth = 600 / 6;
        int boxHeight = 500 / 5;

        int y = 0;
        for (int row = 0; row < 5; row++) {
            int x = 0;
            for (int col = 0; col < 6; col++) {
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
        repaint();
    }

    // called to "toggle" the selected row and column, as well as the four
    // adjacent lights
    public void toggle(int row, int col) {

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
}
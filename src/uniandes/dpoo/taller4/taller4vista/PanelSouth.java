package uniandes.dpoo.taller4.taller4vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PanelSouth extends JPanel {
    public PanelSouth (int jugadas, String nickname)
    {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.WHITE);

        int cantidadjuegos = jugadas;
        JLabel Jugadas = new JLabel("Jugadas:  ");
        JLabel cantidad = new JLabel(String.valueOf(cantidadjuegos));
        JLabel Jugador = new JLabel("Jugador: "); 
        JLabel nombreJugador = new JLabel(nickname);

        add(Box.createHorizontalGlue());
        add(Jugadas);
        add(cantidad);
        add(Box.createHorizontalGlue());
        add(Jugador);
        add(nombreJugador);
        add(Box.createHorizontalGlue());
    }
}
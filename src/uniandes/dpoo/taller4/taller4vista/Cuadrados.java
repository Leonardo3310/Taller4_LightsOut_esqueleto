package uniandes.dpoo.taller4.taller4vista;

import java.awt.Color;
import java.awt.*;
import javax.swing.JButton;

public class Cuadrados extends JButton{
    public Cuadrados() {
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.GRAY);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        g2d.dispose();
    }
}

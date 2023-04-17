package uniandes.dpoo.taller4.taller4vista;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Interfaz extends JFrame implements ActionListener {

    //private Container container;
    private JLabel jugadores = this.crearLabel("");
    private JLabel jugadas = this.crearLabel("");



    public Interfaz() {
        setTitle("Lights Out");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        
        PanelNorte norte = new PanelNorte();
        //JPanel norte = new JPanel();
        //norte.setBackground(Color.GREEN); //deberia ponerlo en otra clase
        PanelEast oriente = new PanelEast();

        add(norte, BorderLayout.NORTH);
        add(oriente, BorderLayout.EAST);
        setVisible(true);
    }

    public JLabel crearLabel(String texto){
        JLabel label = new JLabel(texto);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("Llenar")) {
            JTextField nombre = new JTextField();
            JTextField edad = new JTextField();
            JTextField email = new JTextField();

            final JComponent[] formulario = new JComponent[] {
                new JLabel("Nombre"),
                nombre,
                new JLabel("Edad"),
                edad,
                new JLabel("Email"),
                email
            };
            int resultado = JOptionPane.showConfirmDialog(this, formulario, "Llenar formulario", JOptionPane.OK_CANCEL_OPTION);
            if (resultado == JOptionPane.OK_OPTION && (nombre.getText().equals("") || edad.getText().equals("") || email.getText().equals(""))) {
                JOptionPane.showMessageDialog(this, new JLabel("Tienes que completar todos tus datos."), "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (resultado == JOptionPane.CANCEL_OPTION){}
            else {
                this.jugadas.setText(nombre.getText());
                this.jugadores.setText(edad.getText());
                
            }
        
    }

    }
}
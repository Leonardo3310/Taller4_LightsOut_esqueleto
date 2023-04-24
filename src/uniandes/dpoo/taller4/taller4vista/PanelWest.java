package uniandes.dpoo.taller4.taller4vista;
import uniandes.dpoo.taller4.modelo.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class PanelWest extends JPanel implements MouseListener {
    private Tablero tablero;
    private int tamanio;
    private Interfaz interfaz;

    public PanelWest(int tamanio, int dificultad, Interfaz interfaz) 
    {
        this.interfaz = interfaz;
        this.tamanio = tamanio;
        this.tablero = new Tablero(tamanio);
        tablero.desordenar(dificultad);
        addMouseListener(this);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //int screenWidth = screenSize.width;
        //int screenHeight = screenSize.height;
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

    public void nuevoPanel(int tamanio, int dificultad){
    	//cada panel nuevo
        this.tamanio = tamanio;
        this.removeAll();
        this.tablero = new Tablero(this.tamanio);
        tablero.desordenar(dificultad);
        int largo = tablero.darTablero().length; 
        GridLayout l = new GridLayout(largo,largo);
        setLayout(l);
        setPreferredSize(new Dimension(tamanio*100, tamanio*100));
        setMinimumSize(new Dimension(tamanio*100, tamanio*100));
        actualizarPanel();
    }

    public void mousePressed(MouseEvent e) {

        int mouseX = e.getXOnScreen();
        int mouseY = e.getYOnScreen();

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int boxWidth = panelWidth / tablero.darTablero()[0].length;
        int boxHeight = panelHeight / tablero.darTablero().length;

        int col = mouseX / boxWidth;
        int row = mouseY / boxHeight;

        this.tablero.jugar(col, row);
        repaint();
    }
    public void actualizarPanel(){
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
package manejo;

import javax.swing.JButton;
import javax.swing.JPanel;
import guia.tablero.Casilla;
import guia.tablero.Escalera;
import guia.tablero.Serpiente;

public class ControladorTablero {
//---

    private int ejeX = 20;
    private int ejeY = 20;
    private int largo = 60;
    private int ancho = 60;
    private Casilla[][] casillas;
    private JButton[][] botones;

    // Manejo tablero
    public ControladorTablero(int filas, int columnas, JPanel panel) {
        generarTablero(filas, columnas, panel);
    }

    // Metodo para generar tablero
    private void generarTablero(int filas, int columnas, JPanel panel) {
        this.casillas = new Casilla[filas][columnas];
        this.botones = new JButton[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                botones[i][j] = new JButton();
                generarCasillas(i, j);
                botones[i][j].setBounds(ejeX, ejeY, ancho, largo);
                casillas[i][j].setBounds(ejeX, ejeY, ancho, largo);
                casillas[i][j].getImage();                
                panel.add(casillas[i][j]);
                ejeX += 65;
            }
            ejeX = 20;
            ejeY += 65;
        }
    }

    //Metodo para la entrada de las casillas
    private void generarCasillas(int filas, int columnas) {
        int aleatorio = (int) (Math.random() * 10) + 1;
        if (aleatorio < 3) {
            casillas[filas][columnas] = new Escalera();
        } else if (aleatorio <= 10) {
            casillas[filas][columnas] = new Serpiente();
        }
    }

}
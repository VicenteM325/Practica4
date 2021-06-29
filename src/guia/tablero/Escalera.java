package guia.tablero;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Escalera extends Casilla {

    private ImageIcon image2;

    //Constructor de casilla __ Escalera   
    public Escalera() {        
    }

    //Imagen casilla __ Escalera
    @Override
    public void getImage() {
        image2 = new ImageIcon(getClass().getResource("/ventana/images/escalera.png"));
        this.setIcon(new ImageIcon(image2.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }

}
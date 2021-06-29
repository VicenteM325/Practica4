package guia.tablero;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Serpiente extends Casilla {

    private ImageIcon image1;

    //Constructor vacio
    public Serpiente() {        
    }
    
    //Agrega la imagen de serpiente en casilla    
    @Override
    public void getImage() {
        image1 = new ImageIcon(getClass().getResource("/ventana/images/serpiente.png"));
        this.setIcon(new ImageIcon(image1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }

}

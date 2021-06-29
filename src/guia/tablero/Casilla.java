package guia.tablero;

import javax.swing.JButton;

abstract public class Casilla extends JButton {
    
    //Constructor 
    public Casilla() {        
    }

    //Metodo obtiene imagenes y es abstracto
    public abstract void getImage();

}
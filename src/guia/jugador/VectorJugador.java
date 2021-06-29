package guia.jugador;

import javax.swing.JOptionPane;
import vista.GUI.RegistroJugador;

public class VectorJugador {

    private final int TAMANIO_JUGADORES = 6;
    private Jugador[] jugadores = new Jugador[TAMANIO_JUGADORES];
    private int nuevoJugador = 0;
    private RegistroJugador registroJugador;

    //Constructor VectorJugador
    public VectorJugador(RegistroJugador registroJugador) {
        this.registroJugador = registroJugador;
    }

    //Metodo __ Agregar nuevos jugadores
    public void asignarJugador(String nombre, String apellido) {
        if (nuevoJugador < TAMANIO_JUGADORES) {
            if (!registroJugador.getNombreTxt().getText().equals("") && !registroJugador.getApellidoTxt().getText().equals("")) {
                if (isIdentico(nombre)) {
                    this.jugadores[nuevoJugador++] = new Jugador(nombre, apellido);
                } else {
                    JOptionPane.showMessageDialog(registroJugador, "\tNombre y/o Apellido ya registrados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(registroJugador, "\tLlenar los campos correctamente", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(registroJugador, "\tMáximo de jugadores alcanzado", "Aviso", JOptionPane.ERROR_MESSAGE);
            registroJugador.dispose();
        }
    }

    //Metodo de verificacion si un dato se repite
    public boolean isIdentico(String nombre) {
        boolean repetido = true;
        for (int i = 0; i < nuevoJugador; i++) {
            if (jugadores[i].getNombre().equals(nombre)) {
                repetido = false;
                break;
            }
        }
        return repetido;
    }

    // Muestra los jugadores existentes
    public void infoJugadores() {
        for (int i = 0; i < nuevoJugador; i++) {
            JOptionPane.showMessageDialog(registroJugador, "[ " + i + " ] ID    -    " + jugadores[i].toString(), "Información Jugador", JOptionPane.INFORMATION_MESSAGE);
        }
        if (nuevoJugador == 0) {
            JOptionPane.showMessageDialog(registroJugador, "\tNo hay jugadores registrados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

}

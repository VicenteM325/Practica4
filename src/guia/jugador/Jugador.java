package guia.jugador;

public class Jugador {

    private String nombre;
    private String apellido;
    private int pJugadas; 
    private int pGanadas; 
    private int pPerdidas;

    //Constructor Jugador
    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pJugadas = 0; 
        this.pGanadas = 0;
        this.pPerdidas = 0;
    }

    //Inicio Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getpJugadas() {
        return pJugadas;
    }

    public void setpJugadas(int pJugadas) {
        this.pJugadas = pJugadas;
    }

    public int getpGanadas() {
        return pGanadas;
    }

    public void setpGanadas(int pGanadas) {
        this.pGanadas = pGanadas;
    }

    public int getpPerdidas() {
        return pPerdidas;
    }

    public void setpPerdidas(int pPerdidas) {
        this.pPerdidas = pPerdidas;
    }
    //fin getters y setters

    //Mostrar
    @Override
    public String toString() {
        return "\t" + nombre + " " + apellido + "";
    }

}
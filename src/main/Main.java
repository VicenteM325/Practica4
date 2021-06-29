package main;

import java.awt.EventQueue;
import ventana.form.*;

public class Main {

    public static void main(String[] args) {
        //Ejecutable
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

}
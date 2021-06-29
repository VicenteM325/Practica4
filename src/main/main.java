package main;

import java.awt.EventQueue;
import ventana.form.*;

public class Main {
//---

    public static void main(String[] args) {
        //--- Código Ejecutable
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

}
package ventana.form;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Menu extends JFrame {       

    private ImageIcon image, icon;

    //Constructor
    public Menu() {
        super("201930672");
        initComponents();
        colocarImagen();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Agrega imagenes
    public void colocarImagen() {
        image = new ImageIcon(getClass().getResource("/ventana/images/inicioimagen.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(this.rompeLbl.getWidth(), this.rompeLbl.getHeight(), Image.SCALE_SMOOTH));
        this.rompeLbl.setIcon(icon);
        this.panelP.add(rompeLbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelP = new javax.swing.JPanel();
        tituloLbl = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        juegoBtn = new javax.swing.JButton();
        reportesBtn = new javax.swing.JButton();
        rompeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelP.setBackground(new java.awt.Color(13, 15, 17));

        tituloLbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloLbl.setForeground(new java.awt.Color(204, 200, 150));
        tituloLbl.setText("¡ES HORA DE JUGAR!");

        registrarBtn.setText("INGRESAR JUGADORES");
        registrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBtnMouseClicked(evt);
            }
        });

        juegoBtn.setText("JUGAR");
        juegoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juegoBtnMouseClicked(evt);
            }
        });

        reportesBtn.setText("VER REPORTES");
        reportesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tituloLbl))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(130, 130, 165)
                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rompeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reportesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(juegoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloLbl)
                .addGap(18, 18, 18)
                .addComponent(registrarBtn)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(juegoBtn)
                        .addGap(34, 34, 34)
                        .addComponent(reportesBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(rompeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseClicked
        // Registra nuevo jugador            
        new RegistroJugador(this, true, true).setVisible(true);
    }//GEN-LAST:event_registrarBtnMouseClicked

    private void juegoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juegoBtnMouseClicked
        // Juego serpientes y escaleras 
        int[] tablero = new int[2];

        try {

            tablero[0] = Integer.parseInt(JOptionPane.showInputDialog(this, "\tFILAS", "Datos", JOptionPane.QUESTION_MESSAGE));
            tablero[1] = Integer.parseInt(JOptionPane.showInputDialog(this, "\tCOLUMNAS", "Datos", JOptionPane.QUESTION_MESSAGE));
            new Juego(this, true, true, tablero[0], tablero[1]).setVisible(true);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "\tError - Ingrese números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_juegoBtnMouseClicked

    private void reportesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesBtnMouseClicked
        // Evento - Crear, Visualizar Reportes
        JOptionPane.showMessageDialog(this, "\tReportes", "Reporte", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_reportesBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton juegoBtn;
    private javax.swing.JPanel panelP;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JButton reportesBtn;
    private javax.swing.JLabel rompeLbl;
    private javax.swing.JLabel tituloLbl;
    // End of variables declaration//GEN-END:variables
}
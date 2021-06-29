package ventana.form;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import guia.jugador.VectorJugador;

public class RegistroJugador extends JDialog {

    private Menu menu;
    private boolean inicio;
    private VectorJugador vectorJugador;
    private ImageIcon image, icon, image2, icon2;

    //Constructor
    public RegistroJugador(Menu parent, boolean modal, boolean inicio) {
        super(parent, modal);
        initComponents();
        colocarImagen();
        this.menu = parent;
        this.inicio = inicio;
        this.vectorJugador = new VectorJugador(this);
        setTitle("Registro");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    //Agrega imagenes
    public void colocarImagen() {
        image = new ImageIcon(getClass().getResource("/ventana/images/avatar.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(this.avatarLbl.getWidth(), this.avatarLbl.getHeight(), Image.SCALE_SMOOTH));
        this.avatarLbl.setIcon(icon);
        this.panelRJ.add(avatarLbl);

        image2 = new ImageIcon(getClass().getResource("/ventana/images/anotar.png"));
        icon2 = new ImageIcon(image2.getImage().getScaledInstance(this.verJLbl.getWidth(), this.verJLbl.getHeight(), Image.SCALE_SMOOTH));
        this.verJLbl.setIcon(icon2);
        this.panelRJ.add(verJLbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRJ = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        apellidoLbl = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        asignarBtn = new javax.swing.JButton();
        avatarLbl = new javax.swing.JLabel();
        verJLbl = new javax.swing.JLabel();

        panelRJ.setBackground(new java.awt.Color(180, 130, 110));

        nombreLbl.setText("Nombre :");

        apellidoLbl.setText("Apellido :");

        asignarBtn.setText("Asignar");
        asignarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asignarBtnMouseClicked(evt);
            }
        });

        verJLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verJLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRJLayout = new javax.swing.GroupLayout(panelRJ);
        panelRJ.setLayout(panelRJLayout);
        panelRJLayout.setHorizontalGroup(
            panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRJLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avatarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoLbl)
                    .addComponent(nombreLbl))
                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRJLayout.createSequentialGroup()
                        .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRJLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRJLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(asignarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRJLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        panelRJLayout.setVerticalGroup(
            panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRJLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRJLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(avatarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRJLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(asignarBtn)
                        .addGap(27, 27, 27)
                        .addComponent(verJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asignarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignarBtnMouseClicked
        // Asigna jugador
        String[] info = new String[2];
        info[0] = nombreTxt.getText();
        info[1] = apellidoTxt.getText();

        try {

            vectorJugador.asignarJugador(info[0], info[1]);
            limpiarCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "\tError Ingreso Jugador", "Aviso", JOptionPane.ERROR);
        }

    }//GEN-LAST:event_asignarBtnMouseClicked

    private void verJLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verJLblMouseClicked
        // Ver jugadores
        vectorJugador.infoJugadores();
    }//GEN-LAST:event_verJLblMouseClicked

    // Limpiar datos
    private void limpiarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLbl;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton asignarBtn;
    private javax.swing.JLabel avatarLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panelRJ;
    private javax.swing.JLabel verJLbl;
    // End of variables declaration//GEN-END:variables

    //Getters y Setters
    public JTextField getNombreTxt() {
        return nombreTxt;
    }

    public JTextField getApellidoTxt() {
        return apellidoTxt;
    }

    public void setApellidoTxt(JTextField apellidoTxt) {
        this.apellidoTxt = apellidoTxt;
    }

    public void setNombreTxt(JTextField nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public VectorJugador getVectorJugador() {
        return vectorJugador;
    }

}
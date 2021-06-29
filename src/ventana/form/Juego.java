package ventana.form;

import manejo.ManejoTablero;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Juego extends JDialog {
//---

    private Menu menu;
    private boolean inicio;
    private ManejoTablero controlTablero;
    private ImageIcon image, icon;

    //Constructor
    public Juego(Menu parent, boolean modal, boolean inicio, int filas, int columnas) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.inicio = inicio;
        colocarTablero(filas, columnas);
        colocarImagen();
        setTitle("Serpientes y Escaleras");
        setSize(700, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    //Agrega Tablero
    public void colocarTablero(int filas, int colummas) {
        this.controlTablero = new ManejoTablero(filas, colummas, panelJ);
    }

    //Agrega Imágenes
    public void colocarImagen() {
        image = new ImageIcon(getClass().getResource("/ventana/images/dados.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(this.dadoLbl.getWidth(), this.dadoLbl.getHeight(), Image.SCALE_SMOOTH));
        this.dadoLbl.setIcon(icon);
        this.panelJ.add(dadoLbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJ = new javax.swing.JPanel();
        dadoLbl = new javax.swing.JLabel();
        tiraDadoTBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tiraDadoTBtn.setText("Tirar Dado");
        tiraDadoTBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiraDadoTBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelJLayout = new javax.swing.GroupLayout(panelJ);
        panelJ.setLayout(panelJLayout);
        panelJLayout.setHorizontalGroup(
            panelJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJLayout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(panelJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJLayout.createSequentialGroup()
                        .addComponent(dadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJLayout.createSequentialGroup()
                        .addComponent(tiraDadoTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        panelJLayout.setVerticalGroup(
            panelJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJLayout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(dadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(tiraDadoTBtn)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiraDadoTBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiraDadoTBtnMouseClicked
        // Evento - Tirar Dado
    }//GEN-LAST:event_tiraDadoTBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dadoLbl;
    private javax.swing.JPanel panelJ;
    private javax.swing.JToggleButton tiraDadoTBtn;
    // End of variables declaration//GEN-END:variables
}
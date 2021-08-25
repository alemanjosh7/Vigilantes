/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import Modelo.Conexion;
import ControladorVigilante.VisitanteController;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author ALFARO
 */
public class FrmVisualizarVisitante extends javax.swing.JFrame {
    private Conexion enlace = new Conexion();
    private Connection conect = enlace.conectar();
    private VisitanteController VV = new VisitanteController();
    /**
     * Creates new form VisualizarVisitante
     */
    public FrmVisualizarVisitante() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.jTVisitante.setModel(VV.consultarDatosTabla());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainContainer = new javax.swing.JPanel();
        jPBusquedaContainer = new javax.swing.JPanel();
        jFTBusqueda = new javax.swing.JFormattedTextField();
        lblVisitante = new javax.swing.JLabel();
        lblImgBusqueda4 = new javax.swing.JLabel();
        jSPVistiante = new javax.swing.JScrollPane();
        jTVisitante = new javax.swing.JTable();
        jPSideBar = new javax.swing.JPanel();
        jPContainer = new javax.swing.JPanel();
        jPImageContainer = new javax.swing.JPanel();
        lblSistemaVigilantes = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPbtnSBContainer = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();
        jPToolStrip = new javax.swing.JPanel();
        btnTheme = new javax.swing.JButton();
        lblCargoUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblExitButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFTBusqueda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFTBusqueda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFTBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTBusquedaActionPerformed(evt);
            }
        });
        jFTBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTBusquedaKeyReleased(evt);
            }
        });

        lblVisitante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblVisitante.setText("Busqueda de Visitante:");

        lblImgBusqueda4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgBusqueda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgBuscar.png"))); // NOI18N
        lblImgBusqueda4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPBusquedaContainerLayout = new javax.swing.GroupLayout(jPBusquedaContainer);
        jPBusquedaContainer.setLayout(jPBusquedaContainerLayout);
        jPBusquedaContainerLayout.setHorizontalGroup(
            jPBusquedaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBusquedaContainerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblImgBusqueda4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBusquedaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVisitante)
                    .addComponent(jFTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        jPBusquedaContainerLayout.setVerticalGroup(
            jPBusquedaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBusquedaContainerLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPBusquedaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImgBusqueda4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPBusquedaContainerLayout.createSequentialGroup()
                        .addComponent(lblVisitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Apellido", "DUI", "NIT", "Mayor de Edad"
            }
        ));
        jSPVistiante.setViewportView(jTVisitante);

        javax.swing.GroupLayout jMainContainerLayout = new javax.swing.GroupLayout(jMainContainer);
        jMainContainer.setLayout(jMainContainerLayout);
        jMainContainerLayout.setHorizontalGroup(
            jMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainContainerLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPBusquedaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(jMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jMainContainerLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jSPVistiante, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        jMainContainerLayout.setVerticalGroup(
            jMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainContainerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPBusquedaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(jMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jMainContainerLayout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(jSPVistiante, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        getContentPane().add(jMainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jPSideBar.setBackground(new java.awt.Color(57, 62, 70));
        jPSideBar.setForeground(new java.awt.Color(57, 62, 70));
        jPSideBar.setPreferredSize(new java.awt.Dimension(290, 768));

        jPContainer.setBackground(new java.awt.Color(57, 62, 70));

        jPImageContainer.setBackground(new java.awt.Color(57, 62, 70));

        lblSistemaVigilantes.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSistemaVigilantes.setForeground(new java.awt.Color(255, 255, 255));
        lblSistemaVigilantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemaVigilantes.setText("Sistema Vigilantes");
        lblSistemaVigilantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPImageContainerLayout = new javax.swing.GroupLayout(jPImageContainer);
        jPImageContainer.setLayout(jPImageContainerLayout);
        jPImageContainerLayout.setHorizontalGroup(
            jPImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSistemaVigilantes, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
            .addGroup(jPImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPImageContainerLayout.setVerticalGroup(
            jPImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSistemaVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPbtnSBContainer.setBackground(new java.awt.Color(57, 62, 70));

        btnGoLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgCerrarSesionLight.png"))); // NOI18N
        btnGoLogIn.setContentAreaFilled(false);
        btnGoLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoLogInMouseClicked(evt);
            }
        });
        btnGoLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPbtnSBContainerLayout = new javax.swing.GroupLayout(jPbtnSBContainer);
        jPbtnSBContainer.setLayout(jPbtnSBContainerLayout);
        jPbtnSBContainerLayout.setHorizontalGroup(
            jPbtnSBContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbtnSBContainerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGoLogIn)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPbtnSBContainerLayout.setVerticalGroup(
            jPbtnSBContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbtnSBContainerLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(btnGoLogIn)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout jPContainerLayout = new javax.swing.GroupLayout(jPContainer);
        jPContainer.setLayout(jPContainerLayout);
        jPContainerLayout.setHorizontalGroup(
            jPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPContainerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPContainerLayout.setVerticalGroup(
            jPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPSideBarLayout = new javax.swing.GroupLayout(jPSideBar);
        jPSideBar.setLayout(jPSideBarLayout);
        jPSideBarLayout.setHorizontalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPSideBarLayout.setVerticalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        jPToolStrip.setBackground(new java.awt.Color(255, 211, 105));

        btnTheme.setAlignmentY(0.7F);
        btnTheme.setContentAreaFilled(false);

        lblCargoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargoUsuario.setText("Administrador");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo.setText("Cargo:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreUsuario.setText("Josué Alemán");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblExitButton.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblExitButton.setText("x");
        lblExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPToolStripLayout = new javax.swing.GroupLayout(jPToolStrip);
        jPToolStrip.setLayout(jPToolStripLayout);
        jPToolStripLayout.setHorizontalGroup(
            jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPToolStripLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblUsuario)
                .addGap(27, 27, 27)
                .addComponent(lblNombreUsuario)
                .addGap(60, 60, 60)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCargoUsuario)
                .addGap(219, 219, 219)
                .addComponent(btnTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(lblExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPToolStripLayout.setVerticalGroup(
            jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPToolStripLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPToolStripLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsuario)
                                .addComponent(lblNombreUsuario)
                                .addComponent(lblCargo)
                                .addComponent(lblCargoUsuario)))))
                .addContainerGap())
        );

        getContentPane().add(jPToolStrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblExitButtonMouseClicked

    private void btnGoLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoLogInMouseClicked
        FrmLogin login = new FrmLogin();
        login.show();
        dispose();
    }//GEN-LAST:event_btnGoLogInMouseClicked

    private void btnGoLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLogInActionPerformed
        FrmLogin login = new FrmLogin();
        login.show();
        dispose();
    }//GEN-LAST:event_btnGoLogInActionPerformed

    
    private void jFTBusquedaKeyTyped(java.awt.event.KeyEvent evt) {                                     
        //Solo permitir paso de numeros
        if(SoloNumero(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo numeros");
            }
        }                                  
    private void jFTBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTBusquedaActionPerformed
       
    }//GEN-LAST:event_jFTBusquedaActionPerformed

    private void jFTBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTBusquedaKeyReleased
        if (jFTBusqueda.getText().isEmpty()) {
            this.jTVisitante.setModel(VV.consultarDatosTabla());
        }
        else{
            VV.setIdVisitante(Integer.parseInt(jFTBusqueda.getText()));
           if (VV.consultarVisitante()) {
               this.jTVisitante.setModel(VV.DatosTablaTecleado());
           }           
        }
    }//GEN-LAST:event_jFTBusquedaKeyReleased

    public boolean SoloNumero(char numero){
        if(Character.isDigit(numero) || Character.isISOControl(numero)){
            return false;
        }
        else{
            return true;
        }
    }

    //Limpiar campos
    public void LimpiarCampos(){
        jFTBusqueda.setText("");

    }    
     
    private void CargarDatosTabla() {
            this.jTVisitante.setModel(VV.consultarDatosTabla());
    }
      
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVisualizarVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnTheme;
    private javax.swing.JFormattedTextField jFTBusqueda;
    private javax.swing.JPanel jMainContainer;
    private javax.swing.JPanel jPBusquedaContainer;
    private javax.swing.JPanel jPContainer;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JScrollPane jSPVistiante;
    private javax.swing.JTable jTVisitante;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImgBusqueda4;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVisitante;
    // End of variables declaration//GEN-END:variables

}

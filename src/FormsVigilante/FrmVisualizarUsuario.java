/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import ControladorVigilante.UsuarioController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author CRISTIAN
 */
public class FrmVisualizarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmVisualizarUsuario
     */
    public FrmVisualizarUsuario() {
        initComponents();
        mostrarDatos();
    }
    
    private void mostrarDatos(){
        
        UsuarioController obj = new UsuarioController();
        
        try {
            
            DefaultTableModel modelo = obj.generarTablaFiltrada();
            
            if(jFTBusqueda.getText().trim().length() != 0){
                obj.setBusquedaIDUsuario(Integer.parseInt(jFTBusqueda.getText().trim())  );
                modelo = obj.generarTablaFiltrada();
            }
            else{
                modelo = obj.generarTabla();
            }
            
            jTUsuario.setModel(modelo);
            modelo.fireTableDataChanged();
            jTUsuario.getTableHeader().setReorderingAllowed(false);
            TableCellRenderer rendererFromHeader = jTUsuario.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo recibir datos");
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPSideBar = new javax.swing.JPanel();
        jPContainer = new javax.swing.JPanel();
        jPImageContainer = new javax.swing.JPanel();
        lblSistemaVigilantes = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPbtnSBContainer = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();
        jPToolStrip26 = new javax.swing.JPanel();
        btnTheme26 = new javax.swing.JButton();
        lblCargoUsuario26 = new javax.swing.JLabel();
        lblCargo26 = new javax.swing.JLabel();
        lblNombreUsuario26 = new javax.swing.JLabel();
        lblUsuario26 = new javax.swing.JLabel();
        lblExitButton26 = new javax.swing.JLabel();
        jPBusquedaContainer = new javax.swing.JPanel();
        jFTBusqueda = new javax.swing.JFormattedTextField();
        lblVisitante = new javax.swing.JLabel();
        lblImgBusqueda4 = new javax.swing.JLabel();
        jPSSalida = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(47, 47, 47)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPContainerLayout.setVerticalGroup(
            jPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
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

        getContentPane().add(jPSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 770));

        jPToolStrip26.setBackground(new java.awt.Color(255, 211, 105));

        btnTheme26.setAlignmentY(0.7F);
        btnTheme26.setContentAreaFilled(false);

        lblCargoUsuario26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargoUsuario26.setText("Administrador");

        lblCargo26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo26.setText("Cargo:");

        lblNombreUsuario26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreUsuario26.setText("Josué Alemán");

        lblUsuario26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario26.setText("Usuario:");

        lblExitButton26.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblExitButton26.setText("x");
        lblExitButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitButton26lblExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPToolStrip26Layout = new javax.swing.GroupLayout(jPToolStrip26);
        jPToolStrip26.setLayout(jPToolStrip26Layout);
        jPToolStrip26Layout.setHorizontalGroup(
            jPToolStrip26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPToolStrip26Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblUsuario26)
                .addGap(27, 27, 27)
                .addComponent(lblNombreUsuario26)
                .addGap(60, 60, 60)
                .addComponent(lblCargo26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCargoUsuario26)
                .addGap(219, 219, 219)
                .addComponent(btnTheme26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(lblExitButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPToolStrip26Layout.setVerticalGroup(
            jPToolStrip26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPToolStrip26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPToolStrip26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExitButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPToolStrip26Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPToolStrip26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTheme26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPToolStrip26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsuario26)
                                .addComponent(lblNombreUsuario26)
                                .addComponent(lblCargo26)
                                .addComponent(lblCargoUsuario26)))))
                .addContainerGap())
        );

        getContentPane().add(jPToolStrip26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jFTBusqueda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFTBusqueda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFTBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTBusquedaKeyTyped(evt);
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

        getContentPane().add(jPBusquedaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estado del Ingreso", "Tipo de entrada", "Zona"
            }
        ));
        jPSSalida.setViewportView(jTUsuario);

        getContentPane().add(jPSSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblExitButton26lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButton26lblExitButtonMouseClicked
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblExitButton26lblExitButtonMouseClicked

    private void jFTBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTBusquedaKeyReleased
        mostrarDatos();
    }//GEN-LAST:event_jFTBusquedaKeyReleased

    private void jFTBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTBusquedaKeyTyped
        //Solo permitir paso de numeros

    }//GEN-LAST:event_jFTBusquedaKeyTyped

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
            java.util.logging.Logger.getLogger(FrmVisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVisualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnTheme26;
    private javax.swing.JFormattedTextField jFTBusqueda;
    private javax.swing.JPanel jPBusquedaContainer;
    private javax.swing.JPanel jPContainer;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JScrollPane jPSSalida;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip26;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JTable jTUsuario;
    private javax.swing.JLabel lblCargo26;
    private javax.swing.JLabel lblCargoUsuario26;
    private javax.swing.JLabel lblExitButton26;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImgBusqueda4;
    private javax.swing.JLabel lblNombreUsuario26;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblUsuario26;
    private javax.swing.JLabel lblVisitante;
    // End of variables declaration//GEN-END:variables
}

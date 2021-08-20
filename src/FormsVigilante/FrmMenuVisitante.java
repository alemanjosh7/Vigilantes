/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

/**
 *
 * @author CRISTIAN
 */
public class FrmMenuVisitante extends javax.swing.JFrame {

    /**
     * Creates new form MenuVisitante
     */
    public FrmMenuVisitante() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPToolStrip = new javax.swing.JPanel();
        changeThemeBtn = new javax.swing.JButton();
        lblButtonExit = new javax.swing.JLabel();
        btnVisualizarVisitas = new javax.swing.JButton();
        btnRegistrarVisitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPToolStrip.setBackground(new java.awt.Color(255, 211, 105));

        changeThemeBtn.setAlignmentY(0.7F);
        changeThemeBtn.setContentAreaFilled(false);
        changeThemeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeThemeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeThemeBtnActionPerformed(evt);
            }
        });

        lblButtonExit.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblButtonExit.setText("x");
        lblButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPToolStripLayout = new javax.swing.GroupLayout(jPToolStrip);
        jPToolStrip.setLayout(jPToolStripLayout);
        jPToolStripLayout.setHorizontalGroup(
            jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPToolStripLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(changeThemeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 627, Short.MAX_VALUE)
                .addComponent(lblButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPToolStripLayout.setVerticalGroup(
            jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPToolStripLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeThemeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnVisualizarVisitas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVisualizarVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgLupaDark.png"))); // NOI18N
        btnVisualizarVisitas.setText("Visualizar Visitas");
        btnVisualizarVisitas.setContentAreaFilled(false);
        btnVisualizarVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarVisitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVisualizarVisitas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVisualizarVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVisitasActionPerformed(evt);
            }
        });

        btnRegistrarVisitas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgEditar.png"))); // NOI18N
        btnRegistrarVisitas.setText("Registrar Visitas");
        btnRegistrarVisitas.setContentAreaFilled(false);
        btnRegistrarVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarVisitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarVisitas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVisitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPToolStrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(btnRegistrarVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addComponent(btnVisualizarVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPToolStrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 455, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegistrarVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVisualizarVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeThemeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeThemeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeThemeBtnActionPerformed

    private void lblButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonExitMouseClicked
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblButtonExitMouseClicked

    private void btnVisualizarVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVisitasActionPerformed
        FrmVisualizarVisitante VV = new FrmVisualizarVisitante();
        VV.show();
        dispose();
    }//GEN-LAST:event_btnVisualizarVisitasActionPerformed

    private void btnRegistrarVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVisitasActionPerformed
        FrmVisitante V = new FrmVisitante();
        V.show();
        dispose();
    }//GEN-LAST:event_btnRegistrarVisitasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarVisitas;
    private javax.swing.JButton btnVisualizarVisitas;
    private javax.swing.JButton changeThemeBtn;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JLabel lblButtonExit;
    // End of variables declaration//GEN-END:variables
}
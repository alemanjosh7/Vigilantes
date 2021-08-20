/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

/**
 *
 * @author josue
 */
public class FrmMenuVigilantes extends javax.swing.JFrame {

    /**
     * Creates new form MenuVigilantes
     */
    public FrmMenuVigilantes() {
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

        btnGestionarHorarios = new javax.swing.JButton();
        btnGestionarVigilantes = new javax.swing.JButton();
        jPToolStrip = new javax.swing.JPanel();
        changeThemeBtn = new javax.swing.JButton();
        lblButtonExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGestionarHorarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGestionarHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgEditar.png"))); // NOI18N
        btnGestionarHorarios.setText("Gestionar Horarios");
        btnGestionarHorarios.setContentAreaFilled(false);
        btnGestionarHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarHorarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarHorarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarHorariosActionPerformed(evt);
            }
        });

        btnGestionarVigilantes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGestionarVigilantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgEditar.png"))); // NOI18N
        btnGestionarVigilantes.setText("Gestionar vigilante");
        btnGestionarVigilantes.setContentAreaFilled(false);
        btnGestionarVigilantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarVigilantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarVigilantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarVigilantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarVigilantesActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnGestionarVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnGestionarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addComponent(jPToolStrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPToolStrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestionarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarHorariosActionPerformed
        FrmMenuHorarios MH = new FrmMenuHorarios();
        MH.show();
        dispose();
    }//GEN-LAST:event_btnGestionarHorariosActionPerformed

    private void btnGestionarVigilantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarVigilantesActionPerformed
        FrmMenuPersonal MP = new FrmMenuPersonal();
        MP.show();
        dispose();
    }//GEN-LAST:event_btnGestionarVigilantesActionPerformed

    private void changeThemeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeThemeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeThemeBtnActionPerformed

    private void lblButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonExitMouseClicked
        FrmMenuAdministrador menu = new FrmMenuAdministrador();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblButtonExitMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenuVigilantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVigilantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVigilantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuVigilantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuVigilantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionarHorarios;
    private javax.swing.JButton btnGestionarVigilantes;
    private javax.swing.JButton changeThemeBtn;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JLabel lblButtonExit;
    // End of variables declaration//GEN-END:variables
}
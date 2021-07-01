/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigilante;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int mousepX, mousepY;
    Color Light = new Color(254, 243, 243), Dark = new Color(57, 62, 70);
    
    private void SetBackgroundDark(){
        
        jPanelLogin.setBackground(Dark);
        jSliderMode.setBackground(Dark);
        
        
        Line1.setBackground(Light);
        Line2.setBackground(Light);
        jLabelWelcome.setForeground(Light);
        jLabelLostPassword.setForeground(Light);
        jLabel3.setForeground(Light);
        jLabel4.setForeground(Light);
        jButtonLogin.setBackground(Light);
        jButtonLogin.setForeground(Dark);
        
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/LogoDark.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jImgLogo.getWidth(), jImgLogo.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jImgLogo.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/Moon.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jImgMode.getWidth(), jImgMode.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jImgMode.setIcon(ImgIcon2);
        
    }
    
    public void SetBackgroundLight(){
        
        jPanelLogin.setBackground(Light);
        jSliderMode.setBackground(Light);
        
        Line1.setBackground(Dark);
        Line2.setBackground(Dark);
        jLabelWelcome.setForeground(Dark);
        jLabelLostPassword.setForeground(Dark);
        jLabel3.setForeground(Dark);
        jLabel4.setForeground(Dark);
        jButtonLogin.setBackground(Dark);
        jButtonLogin.setForeground(Light);

        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/LogoLight.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jImgLogo.getWidth(), jImgLogo.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jImgLogo.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/Sun.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jImgMode.getWidth(), jImgMode.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jImgMode.setIcon(ImgIcon2);
        initIcon();    
    }
    
    private void initIcon(){
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/RectangleLogo.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jIco.getWidth(), jIco.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jIco.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/Minus.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jBtnMinimize.getWidth(), jBtnMinimize.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jBtnMinimize.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/Close.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jBtnClose.getWidth(), jBtnClose.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jBtnClose.setIcon(ImgIcon2);
    }
    
    public Login() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/RectangleLogo.png")) );
        initComponents();
        SetBackgroundDark();
        initIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jTab = new javax.swing.JPanel();
        jBtnClose = new javax.swing.JLabel();
        jBtnMinimize = new javax.swing.JLabel();
        jIco = new javax.swing.JLabel();
        jImgLogo = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Line1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Line2 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jSliderMode = new javax.swing.JSlider();
        jLabelLostPassword = new javax.swing.JLabel();
        jImgMode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanelLogin.setBackground(new java.awt.Color(57, 62, 70));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelLogin.setForeground(new java.awt.Color(34, 40, 49));
        jPanelLogin.setToolTipText("Login");
        jPanelLogin.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanelLogin.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanelLogin.setName(""); // NOI18N
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 500));

        jTab.setBackground(new java.awt.Color(255, 211, 105));
        jTab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabMouseDragged(evt);
            }
        });
        jTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabMousePressed(evt);
            }
        });

        jBtnClose.setText("Cerrar");
        jBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnClose.setFocusable(false);
        jBtnClose.setPreferredSize(new java.awt.Dimension(232, 240));
        jBtnClose.setRequestFocusEnabled(false);
        jBtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseClicked(evt);
            }
        });

        jBtnMinimize.setText("Minimizar");
        jBtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnMinimize.setFocusable(false);
        jBtnMinimize.setPreferredSize(new java.awt.Dimension(232, 240));
        jBtnMinimize.setRequestFocusEnabled(false);
        jBtnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnMinimizeMouseClicked(evt);
            }
        });

        jIco.setText("Ico");
        jIco.setFocusable(false);
        jIco.setPreferredSize(new java.awt.Dimension(232, 240));
        jIco.setRequestFocusEnabled(false);
        jIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIcoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jTabLayout = new javax.swing.GroupLayout(jTab);
        jTab.setLayout(jTabLayout);
        jTabLayout.setHorizontalGroup(
            jTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jIco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTabLayout.setVerticalGroup(
            jTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jImgLogo.setText("Imagen");
        jImgLogo.setFocusable(false);
        jImgLogo.setPreferredSize(new java.awt.Dimension(232, 240));
        jImgLogo.setRequestFocusEnabled(false);

        jLabelWelcome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(243, 243, 243));
        jLabelWelcome.setText("Bienvenido");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 243, 243));
        jLabel3.setText("Usuario");

        Line1.setBackground(new java.awt.Color(243, 243, 243));
        Line1.setPreferredSize(new java.awt.Dimension(160, 2));

        jPanel3.setBackground(new java.awt.Color(255, 211, 105));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Line1Layout = new javax.swing.GroupLayout(Line1);
        Line1.setLayout(Line1Layout);
        Line1Layout.setHorizontalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Line1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Line1Layout.setVerticalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Line1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 243, 243));
        jLabel4.setText("Contraseña");

        Line2.setBackground(new java.awt.Color(243, 243, 243));
        Line2.setPreferredSize(new java.awt.Dimension(160, 2));

        javax.swing.GroupLayout Line2Layout = new javax.swing.GroupLayout(Line2);
        Line2.setLayout(Line2Layout);
        Line2Layout.setHorizontalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        Line2Layout.setVerticalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jButtonLogin.setBackground(new java.awt.Color(243, 243, 243));
        jButtonLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonLogin.setText("Acceder");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setFocusable(false);
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        jSliderMode.setBackground(new java.awt.Color(57, 62, 70));
        jSliderMode.setForeground(new java.awt.Color(255, 211, 105));
        jSliderMode.setValue(0);
        jSliderMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSliderMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderModeStateChanged(evt);
            }
        });

        jLabelLostPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLostPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLostPassword.setForeground(new java.awt.Color(243, 243, 243));
        jLabelLostPassword.setText("¿Contraseña olvidada?");
        jLabelLostPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLostPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLostPasswordMouseClicked(evt);
            }
        });

        jImgMode.setText("Imagen");
        jImgMode.setFocusable(false);
        jImgMode.setPreferredSize(new java.awt.Dimension(232, 240));
        jImgMode.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSliderMode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelLostPassword))
                            .addComponent(jLabel3)
                            .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelWelcome)
                        .addGap(103, 103, 103))))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addComponent(jTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelWelcome)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonLogin))
                    .addComponent(jImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelLostPassword)
                        .addGap(24, 24, 24)
                        .addComponent(jImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jSliderMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(187, 187, 187))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jTabMousePressed

    private void jTabMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMouseDragged
        int pX = evt.getXOnScreen(), pY = evt.getYOnScreen();
        this.setLocation(pX-mousepX, pY-mousepY);
    }//GEN-LAST:event_jTabMouseDragged

    private void jBtnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jBtnMinimizeMouseClicked

    private void jIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIcoMouseClicked
    
    }//GEN-LAST:event_jIcoMouseClicked

    private void jSliderModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderModeStateChanged
        int val = jSliderMode.getValue();

        if(val >= 50){
            SetBackgroundLight();
        }
        else{
            SetBackgroundDark();
        }
    }//GEN-LAST:event_jSliderModeStateChanged

    private void jBtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_jBtnCloseMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        Menu menu = new Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jLabelLostPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLostPasswordMouseClicked
        ContraseñaOlvidada contra = new ContraseñaOlvidada();
        contra.show();
        dispose();
    }//GEN-LAST:event_jLabelLostPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
    private javax.swing.JLabel jBtnClose;
    private javax.swing.JLabel jBtnMinimize;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jIco;
    private javax.swing.JLabel jImgLogo;
    private javax.swing.JLabel jImgMode;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLostPassword;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JSlider jSliderMode;
    private javax.swing.JPanel jTab;
    // End of variables declaration//GEN-END:variables
}

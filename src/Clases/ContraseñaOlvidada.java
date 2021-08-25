/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import FormsVigilante.FrmLogin;

import Modelo.Conexion;
import ControladorVigilante.RecuContraController;
import FormsVigilante.FrmLogin;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.mail.Session;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;

import javax.mail.Message.RecipientType;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ContraseñaOlvidada extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int mousepX, mousepY;
    Color Light = new Color(254, 243, 243), Dark = new Color(57, 62, 70);
    
    private void SetBackgroundDark(){
        /*
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
        */
        
    }
    
    public void SetBackgroundLight(){
        /*
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
        */
    }
    
    private void initIcon(){
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgRectangleLogo.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jIco.getWidth(), jIco.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jIco.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgMinus.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jBtnMinimize.getWidth(), jBtnMinimize.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jBtnMinimize.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgClose.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jBtnClose.getWidth(), jBtnClose.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jBtnClose.setIcon(ImgIcon2);
       
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgMoon.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(jImgMode.getWidth(), jImgMode.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        jImgMode.setIcon(ImgIcon2);
    }
    
    public ContraseñaOlvidada() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgRectangleLogo.png")) );
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
        jLabelWelcome = new javax.swing.JLabel();
        jSliderMode = new javax.swing.JSlider();
        jImgMode = new javax.swing.JLabel();
        jLabelWelcome1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
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

        jLabelWelcome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(243, 243, 243));
        jLabelWelcome.setText("Por favor ingrese su correo electrónico para iniciar un proceso de cambio de contraseña ");

        jSliderMode.setBackground(new java.awt.Color(57, 62, 70));
        jSliderMode.setForeground(new java.awt.Color(255, 211, 105));
        jSliderMode.setValue(0);
        jSliderMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSliderMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderModeStateChanged(evt);
            }
        });

        jImgMode.setText("Imagen");
        jImgMode.setFocusable(false);
        jImgMode.setPreferredSize(new java.awt.Dimension(232, 240));
        jImgMode.setRequestFocusEnabled(false);

        jLabelWelcome1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelWelcome1.setForeground(new java.awt.Color(243, 243, 243));
        jLabelWelcome1.setText("¿Olvidó su contraseña?");

        jTextField1.setBackground(new java.awt.Color(254, 243, 243));
        jTextField1.setForeground(new java.awt.Color(52, 67, 70));
        jTextField1.setText("");

        
        jButton1.setForeground(new java.awt.Color(57, 62, 70));
        jButton1.setText("Solicitar un cambio de contraseña");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        
        jLabel1.setForeground(new java.awt.Color(254, 243, 243));
        jLabel1.setText("Regresar al login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelWelcome1)
                            .addComponent(jLabelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jSliderMode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addComponent(jTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabelWelcome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelWelcome)
                .addGap(34, 34, 34)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jSliderMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
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

    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String correo = jTextField1.getText();
        RecuContraController j =  new RecuContraController();
        j.existenciaCuentaC(correo);
        String contra = j.getContrasena();
        if("".equals(correo) || "".equals(contra) || contra == null){
            JOptionPane.showMessageDialog(this, "Asegurese de introducir un correo electrónico válido");
        }
        else{
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            String correoRemitente = ""; //pongan un correo aqui
            String passwordRemitente = ""; //pongan una contra aqui
            String correoReceptor = jTextField1.getText();
            String asunto = "Mensaje enviado exitosamente: Recuperación de Contraseña";
            String mensaje = "Su contraseña es: " + j.getContrasena();
            MimeMessage mail = new MimeMessage(session);
            try {
                mail.setFrom(new InternetAddress(correoRemitente));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
    //            mail.addRecipient(Message RecipientType.TO, new InternetAddress(correoReceptor));
                mail.setSubject(asunto);
                mail.setText(mensaje);

                Transport transporte = session.getTransport("smtp");
                transporte.connect(correoRemitente, passwordRemitente);
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                transporte.close();
                JOptionPane.showMessageDialog(null, "Correo enviado");
    //            mail.addRecipient(Message RecipientType TO, new InternetAddress(correoReceptor)); 
            } catch (AddressException ex) {
                Logger.getLogger(ContraseñaOlvidada.class.getName()).log(Level.SEVERE, null, ex);
    //            JOptionPane.showMessageDialog(null, "Hubo un problema para enviar el correo, por favor verifique que el correo se haya escrito bien");
            } catch (MessagingException ex) {
                Logger.getLogger(ContraseñaOlvidada.class.getName()).log(Level.SEVERE, null, ex);
    //            JOptionPane.showMessageDialog(null, "Hubo un problema para enviar el correo, por favor verifique que el correo se haya escrito bien");
            }
            this.setState(this.ICONIFIED);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    
    private void jIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIcoMouseClicked
    
    }//GEN-LAST:event_jIcoMouseClicked

    private void jBtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_jBtnCloseMouseClicked

    private void jSliderModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderModeStateChanged
        int val = jSliderMode.getValue();

        if(val >= 50){
            SetBackgroundLight();
        }
        else{
            SetBackgroundDark();
        }
    }//GEN-LAST:event_jSliderModeStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        FrmLogin log = new FrmLogin();
        log.show();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(ContraseñaOlvidada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContraseñaOlvidada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContraseñaOlvidada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContraseñaOlvidada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ContraseñaOlvidada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBtnClose;
    private javax.swing.JLabel jBtnMinimize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jIco;
    private javax.swing.JLabel jImgMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JLabel jLabelWelcome1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JSlider jSliderMode;
    private javax.swing.JPanel jTab;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import Clases.ContraseñaOlvidada;
import Clases.Encoder;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ControladorVigilante.*;

/**
 *
 * @author Usuario
 */
public class FrmLogin extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    
    int mousepX,

    /**
     * Creates new form Login1
     */

    /**
     * Creates new form Login
     */
    mousepY;
    Color Light = new Color(254, 243, 243), Dark = new Color(57, 62, 70);
    
    private void SetBackgroundDark(){
        
        jPanelLogin.setBackground(Dark);
        jSliderMode.setBackground(Dark);
        
        
        Line1.setBackground(Light);
        Line2.setBackground(Light);
        lblBienvenido.setForeground(Light);
        lblContraseñaOlvidada.setForeground(Light);
//        lblUsuario.setForeground(Light);
//        lblContraseña.setForeground(Light);
        btnAcceder.setBackground(Light);
        btnAcceder.setForeground(Dark);
        
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgLogoDark.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblImagen.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgMoon.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblImgMode.getWidth(), lblImgMode.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblImgMode.setIcon(ImgIcon2);
        
    }
    
    public void SetBackgroundLight(){
        
        jPanelLogin.setBackground(Light);
        jSliderMode.setBackground(Light);
        
        Line1.setBackground(Dark);
        Line2.setBackground(Dark);
        lblBienvenido.setForeground(Dark);
        lblContraseñaOlvidada.setForeground(Dark);
//        lblUsuario.setForeground(Dark);
//        lblContraseña.setForeground(Dark);
        btnAcceder.setBackground(Dark);
        btnAcceder.setForeground(Light);

        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgLogoLight.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblImagen.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgSunDark.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblImgMode.getWidth(), lblImgMode.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblImgMode.setIcon(ImgIcon2);
        initIcon();    
    }
    
    private void initIcon(){
        
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgLogoVigilanteDark.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblIco.getWidth(), lblIco.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblIco.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgMinus.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblMinimizar.getWidth(), lblMinimizar.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblMinimizar.setIcon(ImgIcon2);
        
        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgClose.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblCerrar.setIcon(ImgIcon2);}
    
    public FrmLogin() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Vigilante_Imagenes/imgLogoVigilanteDark.png")) );
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
        jTBarraSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblIco = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        Line1 = new javax.swing.JPanel();
        jPAcceder = new javax.swing.JPanel();
        Line2 = new javax.swing.JPanel();
        btnAcceder = new javax.swing.JButton();
        jSliderMode = new javax.swing.JSlider();
        lblContraseñaOlvidada = new javax.swing.JLabel();
        lblImgMode = new javax.swing.JLabel();
        jTNombreUsuario = new javax.swing.JTextField();
        jPFContrasena = new javax.swing.JPasswordField();

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

        jTBarraSuperior.setBackground(new java.awt.Color(255, 211, 105));
        jTBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTBarraSuperiorMouseDragged(evt);
            }
        });
        jTBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTBarraSuperiorMousePressed(evt);
            }
        });

        lblCerrar.setText("Cerrar");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setFocusable(false);
        lblCerrar.setPreferredSize(new java.awt.Dimension(232, 240));
        lblCerrar.setRequestFocusEnabled(false);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimizar.setText("Minimizar");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setFocusable(false);
        lblMinimizar.setPreferredSize(new java.awt.Dimension(232, 240));
        lblMinimizar.setRequestFocusEnabled(false);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblIco.setText("Ico");
        lblIco.setFocusable(false);
        lblIco.setPreferredSize(new java.awt.Dimension(232, 240));
        lblIco.setRequestFocusEnabled(false);
        lblIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIcoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jTBarraSuperiorLayout = new javax.swing.GroupLayout(jTBarraSuperior);
        jTBarraSuperior.setLayout(jTBarraSuperiorLayout);
        jTBarraSuperiorLayout.setHorizontalGroup(
            jTBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTBarraSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblIco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTBarraSuperiorLayout.setVerticalGroup(
            jTBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblImagen.setText("Imagen");
        lblImagen.setFocusable(false);
        lblImagen.setPreferredSize(new java.awt.Dimension(232, 240));
        lblImagen.setRequestFocusEnabled(false);

        lblBienvenido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(243, 243, 243));
        lblBienvenido.setText("Bienvenido");

        Line1.setBackground(new java.awt.Color(243, 243, 243));
        Line1.setPreferredSize(new java.awt.Dimension(160, 2));

        jPAcceder.setBackground(new java.awt.Color(255, 211, 105));
        jPAcceder.setPreferredSize(new java.awt.Dimension(160, 2));

        javax.swing.GroupLayout jPAccederLayout = new javax.swing.GroupLayout(jPAcceder);
        jPAcceder.setLayout(jPAccederLayout);
        jPAccederLayout.setHorizontalGroup(
            jPAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPAccederLayout.setVerticalGroup(
            jPAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Line1Layout = new javax.swing.GroupLayout(Line1);
        Line1.setLayout(Line1Layout);
        Line1Layout.setHorizontalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Line1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Line1Layout.setVerticalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Line1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Line2.setBackground(new java.awt.Color(243, 243, 243));
        Line2.setPreferredSize(new java.awt.Dimension(160, 2));

        javax.swing.GroupLayout Line2Layout = new javax.swing.GroupLayout(Line2);
        Line2.setLayout(Line2Layout);
        Line2Layout.setHorizontalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Line2Layout.setVerticalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        btnAcceder.setBackground(new java.awt.Color(243, 243, 243));
        btnAcceder.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.setFocusable(false);
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccederMouseClicked(evt);
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

        lblContraseñaOlvidada.setBackground(new java.awt.Color(255, 255, 255));
        lblContraseñaOlvidada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblContraseñaOlvidada.setForeground(new java.awt.Color(243, 243, 243));
        lblContraseñaOlvidada.setText("¿Contraseña olvidada?");
        lblContraseñaOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContraseñaOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContraseñaOlvidadaMouseClicked(evt);
            }
        });

        lblImgMode.setText("Imagen");
        lblImgMode.setFocusable(false);
        lblImgMode.setPreferredSize(new java.awt.Dimension(232, 240));
        lblImgMode.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSliderMode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPFContrasena)
                            .addComponent(jTNombreUsuario)
                            .addComponent(Line2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContraseñaOlvidada)))
                            .addComponent(Line1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addComponent(jTBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addGap(29, 29, 29)
                        .addComponent(jTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAcceder))
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(lblContraseñaOlvidada)
                        .addGap(24, 24, 24)
                        .addComponent(lblImgMode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBarraSuperiorMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jTBarraSuperiorMousePressed

    private void jTBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBarraSuperiorMouseDragged
        int pX = evt.getXOnScreen(), pY = evt.getYOnScreen();
        this.setLocation(pX-mousepX, pY-mousepY);
    }//GEN-LAST:event_jTBarraSuperiorMouseDragged

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIcoMouseClicked
    
    }//GEN-LAST:event_lblIcoMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    static public int idUsuario = -1;
    static public int tipoUsuario = -1;
    static public int estadoUsuario = -1;
    static public String nombres;
    static public String apellidos;
    static public String cargo;
    static public String contra;
    
    private void btnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseClicked
        LoginController obj = new LoginController();
        String nombre = jTNombreUsuario.getText();
        obj.setNombre_usuario(nombre);
        Encoder mMain = new Encoder();
        String secretKey = "SomosProgramadores";
        contra = jPFContrasena.getText();
        String cadenaEncriptada = mMain.ecnode(secretKey, contra);
        obj.setContrasena(cadenaEncriptada);
        
        //enviando guardar a  SQLServer
        if(obj.existenciaUsuario(nombre, cadenaEncriptada) == 1){
            
            estadoUsuario = obj.getId_estado_usuario();
            idUsuario = obj.getId_usuario();
            tipoUsuario = obj.getId_tipo_usuario();
            
            if(estadoUsuario == 1 && tipoUsuario == 1){
                
                System.out.println(obj.consultarRolYDatos(idUsuario));
                nombres = obj.getNombres();
                
                apellidos = obj.getApellidos();
                cargo = obj.getNombreTipo();
                JOptionPane.showMessageDialog(this, "Bienvenido " + nombres + " " + apellidos);
                
                if("Vigilante".equals(cargo)){
                    FrmMenuPrincipal menu = new FrmMenuPrincipal();
                    menu.show();
                    dispose();
                }
                else{
                    FrmMenuAdministrador menu = new FrmMenuAdministrador();
                    menu.show();
                    dispose();
                }
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Los usuarios inactivos no se les permite entrar");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Su usuario no está registrado en el sistema");
        }
        
    }//GEN-LAST:event_btnAccederMouseClicked

    private void lblContraseñaOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContraseñaOlvidadaMouseClicked
        ContraseñaOlvidada contra = new ContraseñaOlvidada();
        contra.show();
        dispose();
    }//GEN-LAST:event_lblContraseñaOlvidadaMouseClicked

    private void jSliderModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderModeStateChanged
        int val = jSliderMode.getValue();

        if(val >= 50){
            SetBackgroundLight();
        }
        else{
            SetBackgroundDark();
        }
    }//GEN-LAST:event_jSliderModeStateChanged

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JPanel jPAcceder;
    private javax.swing.JPasswordField jPFContrasena;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JSlider jSliderMode;
    private javax.swing.JPanel jTBarraSuperior;
    private javax.swing.JTextField jTNombreUsuario;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblContraseñaOlvidada;
    private javax.swing.JLabel lblIco;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImgMode;
    private javax.swing.JLabel lblMinimizar;
    // End of variables declaration//GEN-END:variables
}

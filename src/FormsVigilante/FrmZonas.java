/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import Modelo.Conexion;
import ControladorVigilante.ZonasController;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class FrmZonas extends javax.swing.JFrame {
    private Conexion enlace = new Conexion();
    private Connection conect = enlace.conectar();
    private ZonasController ZC = new ZonasController();
    /**
     * Creates new form Zonas
     */
    public FrmZonas() {
        initComponents();
        CargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPColorSistemaVigilancia = new javax.swing.JPanel();
        jPRegistroZonas = new javax.swing.JPanel();
        jlblZonas = new javax.swing.JLabel();
        jlblIdZona = new javax.swing.JLabel();
        jPBotonesCRUD = new javax.swing.JPanel();
        btnConsultar3 = new javax.swing.JButton();
        btnLimpiar3 = new javax.swing.JButton();
        btnRegistrar3 = new javax.swing.JButton();
        btnModificar3 = new javax.swing.JButton();
        jlblNombreZona = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTZonas = new javax.swing.JTable();
        jFTidZona = new javax.swing.JTextField();
        jFTNombreZona = new javax.swing.JTextField();
        jPToolStrip = new javax.swing.JPanel();
        lblExitButton = new javax.swing.JLabel();
        lblCargoUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPSideBar = new javax.swing.JPanel();
        jPImageContainer = new javax.swing.JPanel();
        lblSistemaVigilantes = new javax.swing.JLabel();
        lblImgBusqueda = new javax.swing.JLabel();
        jPbtnSBContainer = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jPColorSistemaVigilancia.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPColorSistemaVigilancia.setLayout(null);

        jPRegistroZonas.setBackground(new java.awt.Color(255, 255, 255));
        jPRegistroZonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblZonas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlblZonas.setForeground(new java.awt.Color(255, 211, 105));
        jlblZonas.setText("Ingreso de Zona");

        jlblIdZona.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblIdZona.setText("Id de la zona:");

        jPBotonesCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPBotonesCRUD.setPreferredSize(new java.awt.Dimension(895, 60));

        btnConsultar3.setBackground(new java.awt.Color(255, 211, 105));
        btnConsultar3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar3.setText("Consultar");
        btnConsultar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnConsultar3.setContentAreaFilled(false);
        btnConsultar3.setFocusable(false);
        btnConsultar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar3ActionPerformed(evt);
            }
        });

        btnLimpiar3.setBackground(new java.awt.Color(255, 211, 105));
        btnLimpiar3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar3.setText("Limpiar");
        btnLimpiar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnLimpiar3.setContentAreaFilled(false);
        btnLimpiar3.setFocusable(false);
        btnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar3ActionPerformed(evt);
            }
        });

        btnRegistrar3.setBackground(new java.awt.Color(255, 211, 105));
        btnRegistrar3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar3.setText("Registrar");
        btnRegistrar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnRegistrar3.setContentAreaFilled(false);
        btnRegistrar3.setFocusable(false);
        btnRegistrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar3ActionPerformed(evt);
            }
        });

        btnModificar3.setBackground(new java.awt.Color(255, 211, 105));
        btnModificar3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar3.setText("Modificar");
        btnModificar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnModificar3.setContentAreaFilled(false);
        btnModificar3.setFocusable(false);
        btnModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotonesCRUDLayout = new javax.swing.GroupLayout(jPBotonesCRUD);
        jPBotonesCRUD.setLayout(jPBotonesCRUDLayout);
        jPBotonesCRUDLayout.setHorizontalGroup(
            jPBotonesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesCRUDLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnConsultar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPBotonesCRUDLayout.setVerticalGroup(
            jPBotonesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesCRUDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPBotonesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jlblNombreZona.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblNombreZona.setText("Nombre de la Zona");

        jTZonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificación", "Nombre Zona"
            }
        ));
        jScrollPane1.setViewportView(jTZonas);

        jFTidZona.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFTidZona.setPreferredSize(new java.awt.Dimension(6, 30));
        jFTidZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTidZonaKeyTyped(evt);
            }
        });

        jFTNombreZona.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFTNombreZona.setPreferredSize(new java.awt.Dimension(6, 30));
        jFTNombreZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTNombreZonaActionPerformed(evt);
            }
        });
        jFTNombreZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTNombreZonaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroZonasLayout = new javax.swing.GroupLayout(jPRegistroZonas);
        jPRegistroZonas.setLayout(jPRegistroZonasLayout);
        jPRegistroZonasLayout.setHorizontalGroup(
            jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jlblZonas))
                    .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblIdZona)
                            .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                                .addComponent(jFTidZona, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblNombreZona)
                                    .addComponent(jFTNombreZona, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 116, Short.MAX_VALUE))
            .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPBotonesCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPRegistroZonasLayout.setVerticalGroup(
            jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroZonasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlblZonas)
                .addGap(67, 67, 67)
                .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIdZona)
                    .addComponent(jlblNombreZona))
                .addGap(35, 35, 35)
                .addGroup(jPRegistroZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTidZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTNombreZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPBotonesCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPColorSistemaVigilancia.add(jPRegistroZonas);
        jPRegistroZonas.setBounds(20, 70, 1040, 680);

        jPToolStrip.setBackground(new java.awt.Color(255, 211, 105));
        jPToolStrip.setMinimumSize(new java.awt.Dimension(1082, 61));

        lblExitButton.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblExitButton.setText("x");
        lblExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseClicked(evt);
            }
        });

        lblCargoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargoUsuario.setText("Administrador");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo.setText("Cargo:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreUsuario.setText("Josué Alemán");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 560, Short.MAX_VALUE)
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
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPToolStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblCargo)
                            .addComponent(lblCargoUsuario))))
                .addContainerGap())
        );

        jPColorSistemaVigilancia.add(jPToolStrip);
        jPToolStrip.setBounds(0, 0, 1080, 61);

        getContentPane().add(jPColorSistemaVigilancia);
        jPColorSistemaVigilancia.setBounds(290, 0, 1080, 780);

        jPSideBar.setBackground(new java.awt.Color(57, 62, 70));
        jPSideBar.setPreferredSize(new java.awt.Dimension(287, 811));
        jPSideBar.setRequestFocusEnabled(false);

        jPImageContainer.setBackground(new java.awt.Color(57, 62, 70));

        lblSistemaVigilantes.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSistemaVigilantes.setForeground(new java.awt.Color(255, 255, 255));
        lblSistemaVigilantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemaVigilantes.setText("Sistema Vigilantes");
        lblSistemaVigilantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblImgBusqueda.setFocusable(false);
        lblImgBusqueda.setPreferredSize(new java.awt.Dimension(232, 240));
        lblImgBusqueda.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPImageContainerLayout = new javax.swing.GroupLayout(jPImageContainer);
        jPImageContainer.setLayout(jPImageContainerLayout);
        jPImageContainerLayout.setHorizontalGroup(
            jPImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSistemaVigilantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPImageContainerLayout.setVerticalGroup(
            jPImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSistemaVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblImgBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
                .addGap(20, 20, 20)
                .addComponent(btnGoLogIn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPbtnSBContainerLayout.setVerticalGroup(
            jPbtnSBContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbtnSBContainerLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(btnGoLogIn)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPSideBarLayout = new javax.swing.GroupLayout(jPSideBar);
        jPSideBar.setLayout(jPSideBarLayout);
        jPSideBarLayout.setHorizontalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPSideBarLayout.setVerticalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPSideBar);
        jPSideBar.setBounds(0, 0, 290, 811);

        pack();
        setLocationRelativeTo(null);
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

    //CRUD
    
    private void btnConsultar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar3ActionPerformed
        //Realizar Consulta
        ZC.setIdZona(Integer.parseInt(jFTidZona.getText()));
        if (ZC.consultarZonas()) {
            jFTidZona.getText();
            jFTNombreZona.getText();
        }
        else{
            JOptionPane.showMessageDialog(this, "Error al consultar");
        }
    }//GEN-LAST:event_btnConsultar3ActionPerformed

    private void btnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar3ActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btnLimpiar3ActionPerformed

    private void btnRegistrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar3ActionPerformed
        //Registrar contenido a la Tabla Zonas
        //Envamos los datos a la clase
        ZC.setNombreZona(jFTNombreZona.getText());
        //Enviando los datos a SQL
        if (ZC.guardarZona()) {
            JOptionPane.showMessageDialog(this,"Datos guardados exitosamente");
            CargarDatosTabla();
        }
        else{
            JOptionPane.showMessageDialog(this,"Datos no guardados");
        }
    }//GEN-LAST:event_btnRegistrar3ActionPerformed

    private void btnModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar3ActionPerformed
        //Modificar contenido a la Tabla Zonas
        //Enviamos los datos a la clase
        ZC.setNombreZona(jFTNombreZona.getText());
        ZC.setIdZona(Integer.parseInt(jFTidZona.getText()));
        //enviando a modificar en  SQLServer
        if(ZC.modificarZona()){
            JOptionPane.showMessageDialog(this, "Datos actualizados exitosamente");
            CargarDatosTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Error al actualizar");
        }
    }//GEN-LAST:event_btnModificar3ActionPerformed

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        FrmMenuAdministrador menu = new FrmMenuAdministrador();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblExitButtonMouseClicked

    private void jFTidZonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTidZonaKeyTyped
        //Solo permitir paso de números
        if(SoloNumero(evt.getKeyChar())){
           //no deja que se escriba un letras
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar números");
        }
    }//GEN-LAST:event_jFTidZonaKeyTyped

    private void jFTNombreZonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTNombreZonaKeyTyped
//        //Permitir que hayan numeros y letras
//        if(NumyLetras(evt.getKeyChar())){
//           //no deja que se escriba un numero
//            evt.consume();
//            JOptionPane.showMessageDialog(rootPane, "Ingresar letras o números");
//        }
    }//GEN-LAST:event_jFTNombreZonaKeyTyped

    private void jFTNombreZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTNombreZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTNombreZonaActionPerformed

    //Metodos 
    //Para validar que solo permitan pasar Numeros
    public boolean SoloNumero(char numero){
        if(Character.isDigit(numero) || Character.isISOControl(numero)){
            return false;
        }
        else{
            return true;
        }
    }
    
    //Permitir solo numeros y letras
    public boolean NumyLetras(char caracter){
        if (Character.isLetterOrDigit(caracter) || Character.isISOControl(caracter)|| Character.isSpaceChar(caracter)) {
            return false;
        }
        else{
            return true;
        }
    }
    
    //Limpiar campos
    public void LimpiarCampos(){
        jFTNombreZona.setText("");
        jFTidZona.setText("");
    }
    
    public void CargarDatosTabla(){
        this.jTZonas.setModel(ZC.consultarDatosTabla());
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
            java.util.logging.Logger.getLogger(FrmZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmZonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar3;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JButton btnModificar3;
    private javax.swing.JButton btnRegistrar3;
    private javax.swing.JTextField jFTNombreZona;
    private javax.swing.JTextField jFTidZona;
    private javax.swing.JPanel jPBotonesCRUD;
    private javax.swing.JPanel jPColorSistemaVigilancia;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPRegistroZonas;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTZonas;
    private javax.swing.JLabel jlblIdZona;
    private javax.swing.JLabel jlblNombreZona;
    private javax.swing.JLabel jlblZonas;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblImgBusqueda;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
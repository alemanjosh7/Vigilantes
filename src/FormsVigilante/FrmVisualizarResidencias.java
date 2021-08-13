/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import ControladorVigilante.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author josue
 */
public class FrmVisualizarResidencias extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarZonas
     */
    public FrmVisualizarResidencias() {
       this.setUndecorated(true);
        initComponents();
        scaleImage();
        this.setLocationRelativeTo(null);
        
    }
    
    public void scaleImage(){
   
        ImageIcon ImgIcon1, ImgIcon2;
        Image img1, img2;

        ImgIcon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/LogoDark.png")));
        img1 = ImgIcon1.getImage();
        img2 = img1.getScaledInstance(lblImgBusqueda.getWidth(), lblImgBusqueda.getHeight(), Image.SCALE_SMOOTH);
        ImgIcon2 = new ImageIcon(img2);
        lblImgBusqueda.setIcon(ImgIcon2);
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
        jPImageContainer = new javax.swing.JPanel();
        lblSistemaVigilantes = new javax.swing.JLabel();
        lblImgBusqueda = new javax.swing.JLabel();
        jPbtnSBContainer = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();
        jPToolStrip = new javax.swing.JPanel();
        lblExitButton = new javax.swing.JLabel();
        btnTheme = new javax.swing.JButton();
        lblCargoUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPContainer5 = new javax.swing.JPanel();
        jSPResidencias5 = new javax.swing.JScrollPane();
        jTResidencias5 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jlblTipoEntrada16 = new javax.swing.JLabel();
        jFIdResidencia = new javax.swing.JFormattedTextField();
        jFZona = new javax.swing.JFormattedTextField();
        jlblTipoEntrada17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jFPropietario = new javax.swing.JFormattedTextField();
        jlblTipoEntrada18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jFormattedTextField22 = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        jlblTipoEntrada19 = new javax.swing.JLabel();
        jPBotones2 = new javax.swing.JPanel();
        btnRegistrar2 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnModificar2 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

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
                .addContainerGap()
                .addComponent(btnGoLogIn)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPbtnSBContainerLayout.setVerticalGroup(
            jPbtnSBContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbtnSBContainerLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(btnGoLogIn)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout jPSideBarLayout = new javax.swing.GroupLayout(jPSideBar);
        jPSideBar.setLayout(jPSideBarLayout);
        jPSideBarLayout.setHorizontalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPSideBarLayout.setVerticalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPSideBar);
        jPSideBar.setBounds(0, 0, 287, 768);

        jPToolStrip.setBackground(new java.awt.Color(255, 211, 105));
        jPToolStrip.setMinimumSize(new java.awt.Dimension(1082, 61));
        jPToolStrip.setPreferredSize(new java.awt.Dimension(1082, 61));

        lblExitButton.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblExitButton.setText("x");
        lblExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitButtonMouseClicked(evt);
            }
        });

        btnTheme.setAlignmentY(0.7F);
        btnTheme.setContentAreaFilled(false);
        btnTheme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeActionPerformed(evt);
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
                .addGap(219, 219, 219)
                .addComponent(btnTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
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

        getContentPane().add(jPToolStrip);
        jPToolStrip.setBounds(287, 0, 1106, 61);

        jTResidencias5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Residencia", "Número de Casa", "Direccion", "Zona ", "Propietario"
            }
        ));
        jSPResidencias5.setViewportView(jTResidencias5);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel25.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblTipoEntrada16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTipoEntrada16.setText("Id de Residencia");

        jFIdResidencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFIdResidencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jFZona.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFZona.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFZonaActionPerformed(evt);
            }
        });

        jlblTipoEntrada17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTipoEntrada17.setText("Zona");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel26.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jFPropietario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFPropietario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFPropietarioActionPerformed(evt);
            }
        });

        jlblTipoEntrada18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTipoEntrada18.setText("Propietario");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel27.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jFormattedTextField22.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel28.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/vigilante/Imagenes/buscar.png"))); // NOI18N
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblTipoEntrada19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTipoEntrada19.setText("Número de Casa");

        jPBotones2.setBackground(new java.awt.Color(255, 255, 255));
        jPBotones2.setPreferredSize(new java.awt.Dimension(895, 60));

        btnRegistrar2.setBackground(new java.awt.Color(255, 211, 105));
        btnRegistrar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnRegistrar2.setContentAreaFilled(false);
        btnRegistrar2.setFocusable(false);
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        btnAgregar2.setBackground(new java.awt.Color(255, 211, 105));
        btnAgregar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAgregar2.setText("Agregar");
        btnAgregar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnAgregar2.setContentAreaFilled(false);
        btnAgregar2.setFocusable(false);

        btnModificar2.setBackground(new java.awt.Color(255, 211, 105));
        btnModificar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar2.setText("Modificar");
        btnModificar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnModificar2.setContentAreaFilled(false);
        btnModificar2.setFocusable(false);
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        btnLimpiar2.setBackground(new java.awt.Color(255, 211, 105));
        btnLimpiar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnLimpiar2.setContentAreaFilled(false);
        btnLimpiar2.setFocusable(false);
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotones2Layout = new javax.swing.GroupLayout(jPBotones2);
        jPBotones2.setLayout(jPBotones2Layout);
        jPBotones2Layout.setHorizontalGroup(
            jPBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotones2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPBotones2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(708, Short.MAX_VALUE)))
        );
        jPBotones2Layout.setVerticalGroup(
            jPBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotones2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotones2Layout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        javax.swing.GroupLayout jPContainer5Layout = new javax.swing.GroupLayout(jPContainer5);
        jPContainer5.setLayout(jPContainer5Layout);
        jPContainer5Layout.setHorizontalGroup(
            jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainer5Layout.createSequentialGroup()
                .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblTipoEntrada16)
                            .addComponent(jFIdResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPContainer5Layout.createSequentialGroup()
                                .addComponent(jlblTipoEntrada17)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContainer5Layout.createSequentialGroup()
                                .addComponent(jFZona, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblTipoEntrada18)
                            .addComponent(jFPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblTipoEntrada19)))
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSPResidencias5, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPContainer5Layout.setVerticalGroup(
            jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContainer5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addComponent(jlblTipoEntrada16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFIdResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addComponent(jlblTipoEntrada17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addComponent(jlblTipoEntrada18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPContainer5Layout.createSequentialGroup()
                        .addComponent(jlblTipoEntrada19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSPResidencias5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPContainer5);
        jPContainer5.setBounds(290, 60, 1110, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemeActionPerformed

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        FrmMenuAdministrador menu = new FrmMenuAdministrador();
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

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        VisualizarResidenciasController obj = new VisualizarResidenciasController();
        obj.setResidencia(jFIdResidencia.getText());
        obj.setNumeroRe(jFormattedTextField22.getText());
        obj.setZona(jFZona.getText());
        obj.setResidente(jFPropietario.getText());

        //enviando guardar a  SQLServer
        if(obj.guardarProyecto()){
            JOptionPane.showMessageDialog(this, "Datos guardados");
        }else{
            JOptionPane.showMessageDialog(this, "Datos no guardados");
        }
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
        VisualizarResidenciasController obj = new VisualizarResidenciasController();
        obj.setResidencia(jFIdResidencia.getText());
        obj.setNumeroRe(jFormattedTextField22.getText());
        obj.setZona(jFZona.getText());
        obj.setResidente(jFPropietario.getText());
    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
         VisualizarResidenciasController obj = new VisualizarResidenciasController();
        obj.setResidencia(jFIdResidencia.getText());
        obj.setNumeroRe(jFormattedTextField22.getText());
        obj.setZona(jFZona.getText());
        obj.setResidente(jFPropietario.getText());
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void jFZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFZonaActionPerformed

    private void jFPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFPropietarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVisualizarResidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarResidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarResidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarResidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmVisualizarResidencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton btnTheme;
    private javax.swing.JFormattedTextField jFIdResidencia;
    private javax.swing.JFormattedTextField jFPropietario;
    private javax.swing.JFormattedTextField jFZona;
    private javax.swing.JFormattedTextField jFormattedTextField22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPBotones1;
    private javax.swing.JPanel jPBotones2;
    private javax.swing.JPanel jPContainer5;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JScrollPane jSPResidencias5;
    private javax.swing.JTable jTResidencias5;
    private javax.swing.JLabel jlblTipoEntrada16;
    private javax.swing.JLabel jlblTipoEntrada17;
    private javax.swing.JLabel jlblTipoEntrada18;
    private javax.swing.JLabel jlblTipoEntrada19;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblImgBusqueda;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import javax.swing.JOptionPane;
import Modelo.Conexion;
import ControladorVigilante.UsuarioController;
import ControladorVigilante.ZonasController;
import Clases.Encoder;
import Modelo.ComboItems;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author CRISTIAN
 */
public class FrmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmUsuario
     */
    private Conexion enlace = new Conexion();
    private Connection conect = enlace.conectar();
    private UsuarioController UC = new UsuarioController();
    public FrmUsuario() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();
        FrmLogin log = new FrmLogin();
        lblCargoUsuario.setText(log.cargo);
        lblNombreUsuario.setText(log.nombres + " " + log.apellidos);
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
        lblExitButton = new javax.swing.JLabel();
        btnTheme = new javax.swing.JButton();
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
        jPGestionResidencia = new javax.swing.JPanel();
        lblEstadoResidencia = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblNumCasa = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jPBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblGestionResidencia = new javax.swing.JLabel();
        lblZona = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jSTablaDatos = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();
        lblEstadoResidencia1 = new javax.swing.JLabel();
        cmbVigilante = new javax.swing.JComboBox<>();
        lblImgBusqueda4 = new javax.swing.JLabel();
        jFDidUsuario = new javax.swing.JFormattedTextField();
        lblNumCasa1 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jFDNombreUsuario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        getContentPane().add(jPToolStrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 1080, -1));

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
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPGestionResidencia.setBackground(new java.awt.Color(255, 255, 255));
        jPGestionResidencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEstadoResidencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEstadoResidencia.setText("Tipo de Usuario:");

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDireccion.setText("Nombre Usuario:");

        lblNumCasa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNumCasa.setText("Contraseña:");

        cmbTipoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoUsuarioActionPerformed(evt);
            }
        });

        jPBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPBotones.setPreferredSize(new java.awt.Dimension(895, 60));

        btnRegistrar.setBackground(new java.awt.Color(255, 211, 105));
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setFocusable(false);

        btnAgregar.setBackground(new java.awt.Color(255, 211, 105));
        btnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusable(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 211, 105));
        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusable(false);

        btnLimpiar.setBackground(new java.awt.Color(255, 211, 105));
        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotonesLayout = new javax.swing.GroupLayout(jPBotones);
        jPBotones.setLayout(jPBotonesLayout);
        jPBotonesLayout.setHorizontalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPBotonesLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(708, Short.MAX_VALUE)))
        );
        jPBotonesLayout.setVerticalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        lblGestionResidencia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblGestionResidencia.setForeground(new java.awt.Color(255, 211, 105));
        lblGestionResidencia.setText("Gestión de Usuario");

        lblZona.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblZona.setText("Estado:");

        cmbEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        jTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Dirección", "N° de Casa", "Zona", "Estado de Vigilantes"
            }
        ));
        jSTablaDatos.setViewportView(jTUsuario);

        lblEstadoResidencia1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEstadoResidencia1.setText("Personal a Asignar:");

        cmbVigilante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVigilanteActionPerformed(evt);
            }
        });

        lblImgBusqueda4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgBusqueda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgBuscar.png"))); // NOI18N
        lblImgBusqueda4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jFDidUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFDidUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jFDidUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFDidUsuarioActionPerformed(evt);
            }
        });

        lblNumCasa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNumCasa1.setText("id Usuario:");

        javax.swing.GroupLayout jPGestionResidenciaLayout = new javax.swing.GroupLayout(jPGestionResidencia);
        jPGestionResidencia.setLayout(jPGestionResidenciaLayout);
        jPGestionResidenciaLayout.setHorizontalGroup(
            jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(lblGestionResidencia)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                                        .addComponent(lblZona)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                                        .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstadoResidencia))
                                .addGap(62, 62, 62)
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoResidencia1)
                                    .addComponent(cmbVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion)
                                    .addComponent(jFDNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumCasa)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(lblImgBusqueda4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                                        .addComponent(lblNumCasa1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFDidUsuario))))
                        .addGap(74, 74, 74)))
                .addGap(42, 42, 42))
        );
        jPGestionResidenciaLayout.setVerticalGroup(
            jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblGestionResidencia)
                .addGap(32, 32, 32)
                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(lblNumCasa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFDNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImgBusqueda4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addComponent(lblNumCasa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFDidUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPGestionResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addComponent(lblZona)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addComponent(lblEstadoResidencia1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGestionResidenciaLayout.createSequentialGroup()
                        .addComponent(lblEstadoResidencia)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPGestionResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1040, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        FrmMenuAdministrador menu = new FrmMenuAdministrador();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblExitButtonMouseClicked

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemeActionPerformed

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

    private void cmbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoUsuarioActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void cmbVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVigilanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVigilanteActionPerformed

    private void jFDidUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFDidUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFDidUsuarioActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        int indexEstado = cmbEstado.getSelectedIndex();
        int indexTipo = cmbTipoUsuario.getSelectedIndex();
        int indexPersonal = cmbVigilante.getSelectedIndex();
        if (jFDNombreUsuario.getText().isEmpty() || jPassword.getText().isEmpty() || jPassword.getText().isEmpty() || 
                indexEstado == 0 || indexTipo == 0 || indexPersonal == 0) {
            JOptionPane.showMessageDialog(this,"Campos vacios, verificar que los campos esten llenos");   
        } 
        else{
            //Registrar contenido a la Tabla Zonas
            //Envamos los datos a la clase
            Encoder mMain = new Encoder();
            String secretKey = "SomosProgramadores";
            String cadenaEncriptada = mMain.ecnode(secretKey, jPassword.getText());
            UC.setNombre_usuario(jFDNombreUsuario.getText());
            UC.setContrasena(cadenaEncriptada);
            UC.setId_estado_usuario(cmbEstado.getSelectedIndex());
            UC.setId_tipo_usuario(cmbTipoUsuario.getSelectedIndex());
            String id = "", cadena = cmbVigilante.getSelectedItem().toString();
            for(int i = 0; i < cadena.length(); i++){
                char x = cadena.charAt(i);
                if(Character.isDigit(x) == true){
                    id += x;
                }
                else break;
            }
            
            UC.setId_personal(Integer.parseInt(id));
            System.out.println(id);
            //Enviando los datos a SQL
            if (UC.guardarUsuario()) {
                JOptionPane.showMessageDialog(this,"Datos guardados exitosamente");
                CargarDatosTabla();
            }
            else{
                JOptionPane.showMessageDialog(this,"Datos no guardados");
            }
            LimpiarCampos();            
        }     
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void mostrarDatos(){
        
        UsuarioController obj = new UsuarioController();
        
        try {
                        
            //Combobox cmbEstado
            DefaultComboBoxModel cmbmodelo = obj.generarComboBoxEstadoUsuario();
            cmbEstado.setModel(cmbmodelo);
            
            //Combobox cmbTipoUsuario
            cmbmodelo = obj.generarComboBoxTipoUsuario();
            cmbTipoUsuario.setModel(cmbmodelo);
            
            //Combobox cmbPersonal
            cmbmodelo = obj.generarComboBoxPersonal();
            cmbVigilante.setModel(cmbmodelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo recibir datos");
        }
    }
    
   private void LimpiarCampos(){
       jFDNombreUsuario.setText("");
       jPassword.setText("");
       cmbEstado.setSelectedIndex(0);
       cmbTipoUsuario.setSelectedIndex(0);
       cmbVigilante.setSelectedIndex(0);
       jFDidUsuario.setText("");
   }
    
   public void CargarDatosTabla(){
//        this.jTUsuario.setModel(UC.consultarDatosTabla());
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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnTheme;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JComboBox<String> cmbVigilante;
    private javax.swing.JFormattedTextField jFDNombreUsuario;
    private javax.swing.JFormattedTextField jFDidUsuario;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPGestionResidencia;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JScrollPane jSTablaDatos;
    private javax.swing.JTable jTUsuario;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoResidencia;
    private javax.swing.JLabel lblEstadoResidencia1;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblGestionResidencia;
    private javax.swing.JLabel lblImgBusqueda;
    private javax.swing.JLabel lblImgBusqueda4;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNumCasa;
    private javax.swing.JLabel lblNumCasa1;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblZona;
    // End of variables declaration//GEN-END:variables
}

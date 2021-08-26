/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import Modelo.Conexion;
import ControladorVigilante.VisitanteController;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class FrmVisitante extends javax.swing.JFrame {
    private Conexion enlace = new Conexion();
    private Connection conect = enlace.conectar();
    VisitanteController VC = new VisitanteController();
    /**
     * Creates new form Visitante
     */
    public FrmVisitante() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);      
        CargarDatosTabla();
        rbtSI.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPColorSistemaVigilancia = new javax.swing.JPanel();
        jPSsitemaVigilancia = new javax.swing.JPanel();
        jPNombreSistema = new javax.swing.JPanel();
        lblNombreSistema = new javax.swing.JLabel();
        lblNegro = new javax.swing.JLabel();
        jPBotonSalida = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();
        jPToolStrip = new javax.swing.JPanel();
        lblExitButton = new javax.swing.JLabel();
        lblCargoUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPContainer = new javax.swing.JPanel();
        jPRegistroVigilantes = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        jSTablaDatos = new javax.swing.JScrollPane();
        jTVisitante = new javax.swing.JTable();
        jPBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        lblRegistroVisitantes = new javax.swing.JLabel();
        lblNIT = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDUI = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jFIdVisitante = new javax.swing.JFormattedTextField();
        jPBtnGroup = new javax.swing.JPanel();
        rbtSI = new javax.swing.JRadioButton();
        rbtNO = new javax.swing.JRadioButton();
        lblMayorEdad = new javax.swing.JLabel();
        jFNIT = new javax.swing.JTextField();
        jFDUI = new javax.swing.JTextField();
        jFNombre = new javax.swing.JTextField();
        jFApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPColorSistemaVigilancia.setBackground(new java.awt.Color(57, 62, 70));
        jPColorSistemaVigilancia.setForeground(new java.awt.Color(57, 62, 70));
        jPColorSistemaVigilancia.setPreferredSize(new java.awt.Dimension(290, 768));

        jPSsitemaVigilancia.setBackground(new java.awt.Color(57, 62, 70));

        jPNombreSistema.setBackground(new java.awt.Color(57, 62, 70));

        lblNombreSistema.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblNombreSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreSistema.setText("Sistema Vigilantes");
        lblNombreSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPNombreSistemaLayout = new javax.swing.GroupLayout(jPNombreSistema);
        jPNombreSistema.setLayout(jPNombreSistemaLayout);
        jPNombreSistemaLayout.setHorizontalGroup(
            jPNombreSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
            .addGroup(jPNombreSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPNombreSistemaLayout.setVerticalGroup(
            jPNombreSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNombreSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPBotonSalida.setBackground(new java.awt.Color(57, 62, 70));

        btnGoLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgCerrarSesionLight.png"))); // NOI18N
        btnGoLogIn.setContentAreaFilled(false);
        btnGoLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPBotonSalidaLayout = new javax.swing.GroupLayout(jPBotonSalida);
        jPBotonSalida.setLayout(jPBotonSalidaLayout);
        jPBotonSalidaLayout.setHorizontalGroup(
            jPBotonSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonSalidaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btnGoLogIn)
                .addGap(21, 21, 21))
        );
        jPBotonSalidaLayout.setVerticalGroup(
            jPBotonSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotonSalidaLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnGoLogIn)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPSsitemaVigilanciaLayout = new javax.swing.GroupLayout(jPSsitemaVigilancia);
        jPSsitemaVigilancia.setLayout(jPSsitemaVigilanciaLayout);
        jPSsitemaVigilanciaLayout.setHorizontalGroup(
            jPSsitemaVigilanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSsitemaVigilanciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPSsitemaVigilanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSsitemaVigilanciaLayout.createSequentialGroup()
                        .addComponent(jPNombreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSsitemaVigilanciaLayout.createSequentialGroup()
                        .addComponent(jPBotonSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPSsitemaVigilanciaLayout.setVerticalGroup(
            jPSsitemaVigilanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSsitemaVigilanciaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPNombreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jPBotonSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout jPColorSistemaVigilanciaLayout = new javax.swing.GroupLayout(jPColorSistemaVigilancia);
        jPColorSistemaVigilancia.setLayout(jPColorSistemaVigilanciaLayout);
        jPColorSistemaVigilanciaLayout.setHorizontalGroup(
            jPColorSistemaVigilanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorSistemaVigilanciaLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPSsitemaVigilancia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPColorSistemaVigilanciaLayout.setVerticalGroup(
            jPColorSistemaVigilanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorSistemaVigilanciaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPSsitemaVigilancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPColorSistemaVigilancia);
        jPColorSistemaVigilancia.setBounds(0, 0, 290, 770);

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

        getContentPane().add(jPToolStrip);
        jPToolStrip.setBounds(290, 0, 1080, 61);

        jPContainer.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPContainer.setLayout(null);

        jPRegistroVigilantes.setBackground(new java.awt.Color(255, 255, 255));
        jPRegistroVigilantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblApellido.setText("Apellido:");

        jTVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Apellido", "Estado del Ingreso", "DUI"
            }
        ));
        jSTablaDatos.setViewportView(jTVisitante);

        jPBotones.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(255, 211, 105));
        btnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAgregar.setText("Limpiar");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 211, 105));
        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(255, 211, 105));
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnConsulta.setBackground(new java.awt.Color(255, 211, 105));
        btnConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnConsulta.setContentAreaFilled(false);
        btnConsulta.setFocusable(false);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotonesLayout = new javax.swing.GroupLayout(jPBotones);
        jPBotones.setLayout(jPBotonesLayout);
        jPBotonesLayout.setHorizontalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPBotonesLayout.setVerticalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotonesLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        lblRegistroVisitantes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblRegistroVisitantes.setForeground(new java.awt.Color(255, 211, 105));
        lblRegistroVisitantes.setText("Registro Visitantes");

        lblNIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNIT.setText("NIT:");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblDUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDUI.setText("DUI:");

        lblId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblId.setText("Identificación");

        jFIdVisitante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFIdVisitante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jPBtnGroup.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(rbtSI);
        rbtSI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbtSI.setText("SI");
        rbtSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtSIMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbtNO);
        rbtNO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbtNO.setText("NO");
        rbtNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPBtnGroupLayout = new javax.swing.GroupLayout(jPBtnGroup);
        jPBtnGroup.setLayout(jPBtnGroupLayout);
        jPBtnGroupLayout.setHorizontalGroup(
            jPBtnGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBtnGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtSI)
                .addGap(26, 26, 26)
                .addComponent(rbtNO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBtnGroupLayout.setVerticalGroup(
            jPBtnGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBtnGroupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPBtnGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtSI)
                    .addComponent(rbtNO)))
        );

        lblMayorEdad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMayorEdad.setText("Mayor de Edad");

        jFNIT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jFDUI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jFNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jFApellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPRegistroVigilantesLayout = new javax.swing.GroupLayout(jPRegistroVigilantes);
        jPRegistroVigilantes.setLayout(jPRegistroVigilantesLayout);
        jPRegistroVigilantesLayout.setHorizontalGroup(
            jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                        .addComponent(jSTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre)
                            .addComponent(lblNIT)
                            .addComponent(jFNIT, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jFNombre))
                        .addGap(61, 61, 61)
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido)
                            .addComponent(lblDUI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(jFIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMayorEdad)
                            .addComponent(jPBtnGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
            .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(lblRegistroVisitantes)
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroVigilantesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPRegistroVigilantesLayout.setVerticalGroup(
            jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRegistroVisitantes)
                .addGap(19, 19, 19)
                .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMayorEdad)
                        .addGap(18, 18, 18)
                        .addComponent(jPBtnGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroVigilantesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNIT)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroVigilantesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDUI)
                                .addGap(6, 6, 6)))
                        .addGroup(jPRegistroVigilantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jSTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPContainer.add(jPRegistroVigilantes);
        jPRegistroVigilantes.setBounds(20, 30, 1040, 680);

        getContentPane().add(jPContainer);
        jPContainer.setBounds(290, 40, 1080, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtFalseNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFalseNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFalseNOActionPerformed

    private void lblExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitButtonMouseClicked
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.show();
        dispose();
    }//GEN-LAST:event_lblExitButtonMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Verificar que no se manden datos vacios o invalidos.
        if (jFNombre.getText().isEmpty() || jFApellido.getText().isEmpty() || jFDUI.getText().isEmpty() || jFNIT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Campos vacios, verificar que los campos esten llenos");  
        }
        else{
            // Registrar los datos a la Tabla registro Salida
            int MayorEdad = 0 ;
            if (rbtSI.isSelected()) {
                MayorEdad = 1;
            }                 
            else{
                MayorEdad = 0;
                jFDUI.setText("No posee");
                jFNIT.setText("No posee");
            }
            VC.setNombre(jFNombre.getText());
            VC.setEdad(MayorEdad);          
            VC.setApellido(jFApellido.getText());
            VC.setDUI(jFDUI.getText());
            VC.setNIT(jFNIT.getText());
           
            if (VC.guardarVisitante()) {
                JOptionPane.showMessageDialog(this,"Datos guardados exitosamente");
                CargarDatosTabla();
            }
            else{
                JOptionPane.showMessageDialog(this,"Datos no guardados");
            }
        }
         LimpiarCampos();
        CargarDatosTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         if (jFNombre.getText().isEmpty() || jFApellido.getText().isEmpty() || jFDUI.getText().isEmpty() || jFNIT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Campos vacios, verificar que los campos esten llenos");  
        }
        else{
            // Registrar los datos a la Tabla registro Salida
            int MayorEdad = 0 ;
            if (rbtSI.isSelected()) {
                MayorEdad = 1;
            }   
            else{
                MayorEdad = 0;
                jFDUI.setText("No posee");
                jFNIT.setText("No posee");
            }
            VC.setNombre(jFNombre.getText());
            VC.setEdad(MayorEdad);          
            VC.setApellido(jFApellido.getText());
            VC.setDUI(jFDUI.getText());
            VC.setNIT(jFNIT.getText());
           
            if (VC.modificarVisitante()) {
                JOptionPane.showMessageDialog(this,"Datos guardados exitosamente");
                CargarDatosTabla();
            }
            else{
                JOptionPane.showMessageDialog(this,"Datos no guardados");
            }
             LimpiarCampos();
        }
        CargarDatosTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void rbtSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtSIMouseClicked
        // Validar que  se introduzcan
        jFDUI.setEditable(true);
        jFNIT.setEditable(true);
    }//GEN-LAST:event_rbtSIMouseClicked

    private void rbtNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNOMouseClicked
        // Validar que no se introduzcan
        jFDUI.setEditable(false);
        jFNIT.setEditable(false);
    }//GEN-LAST:event_rbtNOMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Limpiar Campos
        LimpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if (jFIdVisitante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Campos vacios, verificar que los campos esten llenos");
        }
        else{
            //Consultar
            int mayorEdad = 0;
            //Realizar Consulta
            VC.setIdVisitante(Integer.parseInt(jFIdVisitante.getText()));
            if (VC.consultarVisitante()) {
                jFIdVisitante.setText(String.valueOf((VC.getIdVisitante())));                
                //Cargando la fecha
                jFNombre.setText(VC.getNombre());
                jFApellido.setText(VC.getApellido());
                jFDUI.setText(VC.getDUI());
                jFNIT.setText(VC.getNIT());
                mayorEdad = VC.getEdad();
                if (mayorEdad == 1) {
                    rbtSI.setSelected(true);
                    rbtNO.setSelected(false);
                }
                else{
                    rbtSI.setSelected(false);
                    rbtNO.setSelected(true);
                }

                jTVisitante.setModel(VC.filtrarDatosTabla());
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al consultar");
            }
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void CargarDatosTabla() {
        this.jTVisitante.setModel(VC.consultarDatosTabla());
    }
        
    private void LimpiarCampos(){
        jFNombre.setText("");;
        jFApellido.setText("");
        jFDUI.setText("");
        jFNIT.setText("");
        jFNombre.setText("");
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
            java.util.logging.Logger.getLogger(FrmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jFApellido;
    private javax.swing.JTextField jFDUI;
    private javax.swing.JFormattedTextField jFIdVisitante;
    private javax.swing.JTextField jFNIT;
    private javax.swing.JTextField jFNombre;
    private javax.swing.JPanel jPBotonSalida;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPBtnGroup;
    private javax.swing.JPanel jPColorSistemaVigilancia;
    private javax.swing.JPanel jPContainer;
    private javax.swing.JPanel jPNombreSistema;
    private javax.swing.JPanel jPRegistroVigilantes;
    private javax.swing.JPanel jPSsitemaVigilancia;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JScrollPane jSTablaDatos;
    private javax.swing.JTable jTVisitante;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMayorEdad;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel lblNegro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreSistema;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRegistroVisitantes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbtNO;
    private javax.swing.JRadioButton rbtSI;
    // End of variables declaration//GEN-END:variables

    
}

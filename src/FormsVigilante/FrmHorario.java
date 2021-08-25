/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import ControladorVigilante.HorarioController;
import Modelo.ComboItems;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author josue
 */
public class FrmHorario extends javax.swing.JFrame {

    /**
     * Creates new form Zonas
     */
    public FrmHorario() {
        initComponents();
        mostrarDatos();
    }
    
    private void mostrarDatos(){
        //LimpiarCampos();
        HorarioController obj = new HorarioController();
        try {
            
            DefaultTableModel modelo = obj.generarTabla();
            
            jTableHorarios.setModel(modelo);
            modelo.fireTableDataChanged();
            jTableHorarios.getTableHeader().setReorderingAllowed(false);
            TableCellRenderer rendererFromHeader = jTableHorarios.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            
            //Combobox cmbTipoPersonal
            DefaultComboBoxModel cmbmodelo = obj.generarComboBoxPorton();
            jCmbIDPorton.setModel(cmbmodelo);
            
            //Combobox cmbTipoPersonal
            cmbmodelo = obj.generarComboBoxPersonal();
            jCmbIDPersonal.setModel(cmbmodelo);
            
            
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

        jPIngresoHorario = new javax.swing.JPanel();
        jPContenedorHorario = new javax.swing.JPanel();
        jSTablaDatos = new javax.swing.JScrollPane();
        jTableHorarios = new javax.swing.JTable();
        jPBotones = new javax.swing.JPanel();
        BtnConsultar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        lblIngresoHorario = new javax.swing.JLabel();
        lblIdHorario = new javax.swing.JLabel();
        lblIDPorton = new javax.swing.JLabel();
        lblIDPersonal = new javax.swing.JLabel();
        jTxtIDTurno = new javax.swing.JTextField();
        jTxtHoraIngreso = new javax.swing.JTextField();
        lblHoraIngreso = new javax.swing.JLabel();
        jTxtHoraSalida = new javax.swing.JTextField();
        lblHoraSalida = new javax.swing.JLabel();
        jTxtFecha = new javax.swing.JTextField();
        lblIDPorton1 = new javax.swing.JLabel();
        jCmbIDPersonal = new javax.swing.JComboBox<>();
        jCmbIDPorton = new javax.swing.JComboBox<>();
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
        jPSideBar1 = new javax.swing.JPanel();
        jPImageContainer1 = new javax.swing.JPanel();
        lblSistemaVigilantes1 = new javax.swing.JLabel();
        lblImgBusqueda1 = new javax.swing.JLabel();
        jPbtnSBContainer1 = new javax.swing.JPanel();
        btnGoLogIn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPIngresoHorario.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPIngresoHorario.setLayout(null);

        jPContenedorHorario.setBackground(new java.awt.Color(255, 255, 255));
        jPContenedorHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPContenedorHorario.setLayout(null);

        jTableHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHorariosMouseClicked(evt);
            }
        });
        jSTablaDatos.setViewportView(jTableHorarios);

        jPContenedorHorario.add(jSTablaDatos);
        jSTablaDatos.setBounds(44, 258, 970, 300);

        jPBotones.setBackground(new java.awt.Color(255, 255, 255));

        BtnConsultar.setBackground(new java.awt.Color(255, 211, 105));
        BtnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        BtnConsultar.setContentAreaFilled(false);
        BtnConsultar.setFocusable(false);
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnAgregar.setBackground(new java.awt.Color(255, 211, 105));
        BtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.setFocusable(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnModificar.setBackground(new java.awt.Color(255, 211, 105));
        BtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setFocusable(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(255, 211, 105));
        BtnLimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        BtnLimpiar.setContentAreaFilled(false);
        BtnLimpiar.setFocusable(false);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotonesLayout = new javax.swing.GroupLayout(jPBotones);
        jPBotones.setLayout(jPBotonesLayout);
        jPBotonesLayout.setHorizontalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPBotonesLayout.setVerticalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotonesLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPContenedorHorario.add(jPBotones);
        jPBotones.setBounds(60, 530, 895, 101);

        lblIngresoHorario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblIngresoHorario.setForeground(new java.awt.Color(255, 211, 105));
        lblIngresoHorario.setText("Ingreso de Horario");
        jPContenedorHorario.add(lblIngresoHorario);
        lblIngresoHorario.setBounds(379, 24, 214, 29);

        lblIdHorario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIdHorario.setText("ID horario:");
        jPContenedorHorario.add(lblIdHorario);
        lblIdHorario.setBounds(90, 80, 100, 22);

        lblIDPorton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIDPorton.setText("ID porton:");
        jPContenedorHorario.add(lblIDPorton);
        lblIDPorton.setBounds(730, 80, 100, 22);

        lblIDPersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIDPersonal.setText("ID personal:");
        jPContenedorHorario.add(lblIDPersonal);
        lblIDPersonal.setBounds(400, 80, 120, 22);
        jPContenedorHorario.add(jTxtIDTurno);
        jTxtIDTurno.setBounds(90, 110, 200, 24);
        jPContenedorHorario.add(jTxtHoraIngreso);
        jTxtHoraIngreso.setBounds(90, 200, 200, 24);

        lblHoraIngreso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHoraIngreso.setText("Hora de Ingreso (hh:mm:ss):");
        jPContenedorHorario.add(lblHoraIngreso);
        lblHoraIngreso.setBounds(90, 170, 260, 22);
        jPContenedorHorario.add(jTxtHoraSalida);
        jTxtHoraSalida.setBounds(400, 200, 200, 24);

        lblHoraSalida.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHoraSalida.setText("Hora de salida (hh:mm:ss):");
        jPContenedorHorario.add(lblHoraSalida);
        lblHoraSalida.setBounds(400, 170, 250, 22);
        jPContenedorHorario.add(jTxtFecha);
        jTxtFecha.setBounds(730, 200, 200, 24);

        lblIDPorton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIDPorton1.setText("Fecha (mm-dd-aaaa):");
        jPContenedorHorario.add(lblIDPorton1);
        lblIDPorton1.setBounds(730, 170, 210, 22);

        jPContenedorHorario.add(jCmbIDPersonal);
        jCmbIDPersonal.setBounds(400, 110, 250, 30);

        jPContenedorHorario.add(jCmbIDPorton);
        jCmbIDPorton.setBounds(730, 110, 200, 30);

        jPIngresoHorario.add(jPContenedorHorario);
        jPContenedorHorario.setBounds(10, 100, 1040, 650);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
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

        jPIngresoHorario.add(jPToolStrip);
        jPToolStrip.setBounds(0, 0, 1080, 47);

        getContentPane().add(jPIngresoHorario);
        jPIngresoHorario.setBounds(290, 0, 1080, 768);

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
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(btnGoLogIn)
                .addGap(42, 42, 42))
        );

        jPSideBar1.setBackground(new java.awt.Color(57, 62, 70));
        jPSideBar1.setPreferredSize(new java.awt.Dimension(287, 811));
        jPSideBar1.setRequestFocusEnabled(false);

        jPImageContainer1.setBackground(new java.awt.Color(57, 62, 70));

        lblSistemaVigilantes1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSistemaVigilantes1.setForeground(new java.awt.Color(255, 255, 255));
        lblSistemaVigilantes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemaVigilantes1.setText("Sistema Vigilantes");
        lblSistemaVigilantes1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblImgBusqueda1.setFocusable(false);
        lblImgBusqueda1.setPreferredSize(new java.awt.Dimension(232, 240));
        lblImgBusqueda1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPImageContainer1Layout = new javax.swing.GroupLayout(jPImageContainer1);
        jPImageContainer1.setLayout(jPImageContainer1Layout);
        jPImageContainer1Layout.setHorizontalGroup(
            jPImageContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSistemaVigilantes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPImageContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPImageContainer1Layout.setVerticalGroup(
            jPImageContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPImageContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSistemaVigilantes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblImgBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPbtnSBContainer1.setBackground(new java.awt.Color(57, 62, 70));

        btnGoLogIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vigilante_Imagenes/imgCerrarSesionLight.png"))); // NOI18N
        btnGoLogIn1.setContentAreaFilled(false);
        btnGoLogIn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoLogIn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoLogIn1MouseClicked(evt);
            }
        });
        btnGoLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLogIn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPbtnSBContainer1Layout = new javax.swing.GroupLayout(jPbtnSBContainer1);
        jPbtnSBContainer1.setLayout(jPbtnSBContainer1Layout);
        jPbtnSBContainer1Layout.setHorizontalGroup(
            jPbtnSBContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbtnSBContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoLogIn1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPbtnSBContainer1Layout.setVerticalGroup(
            jPbtnSBContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbtnSBContainer1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(btnGoLogIn1)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPSideBar1Layout = new javax.swing.GroupLayout(jPSideBar1);
        jPSideBar1.setLayout(jPSideBar1Layout);
        jPSideBar1Layout.setHorizontalGroup(
            jPSideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBar1Layout.createSequentialGroup()
                .addGroup(jPSideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSideBar1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPImageContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPSideBar1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPbtnSBContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPSideBar1Layout.setVerticalGroup(
            jPSideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBar1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPImageContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPSideBarLayout = new javax.swing.GroupLayout(jPSideBar);
        jPSideBar.setLayout(jPSideBarLayout);
        jPSideBarLayout.setHorizontalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGroup(jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPSideBarLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPSideBarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPSideBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPSideBarLayout.setVerticalGroup(
            jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSideBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPbtnSBContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPSideBarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPSideBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPSideBar);
        jPSideBar.setBounds(0, 0, 290, 811);

        pack();
        setLocationRelativeTo(null);
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

    private void btnGoLogIn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoLogIn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoLogIn1MouseClicked

    private void btnGoLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLogIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoLogIn1ActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
                
        HorarioController obj = new HorarioController();
        obj.setHoraIngreso(jTxtHoraIngreso.getText());
        obj.setHoraSalida(jTxtHoraSalida.getText());
        obj.setFecha(jTxtFecha.getText());
        
        if(!jTxtIDTurno.getText().equals("")) obj.setIdTurno(Integer.parseInt(jTxtIDTurno.getText()));

        int index = 0;
        
        index = jCmbIDPersonal.getSelectedIndex();
        ComboBoxModel model = jCmbIDPersonal.getModel();
        ComboItems me = (ComboItems) model.getElementAt(index);
        obj.setIdPersonal(me.getKey());
        
        index = jCmbIDPorton.getSelectedIndex();
        model = jCmbIDPorton.getModel();
        me = (ComboItems) model.getElementAt(index);
        obj.setIdPorton(me.getKey());
        
        //inserta datos en la base, o mensaje de lo contrario
        if(obj.insertarHorario()){
            JOptionPane.showMessageDialog(this, "Datos guardados");
        }
        else{
            JOptionPane.showMessageDialog(this, "Datos no guardados");
        }
        
        mostrarDatos();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void jTableHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHorariosMouseClicked
        int index = jTableHorarios.getSelectedRow();
        TableModel model = jTableHorarios.getModel();
        
        jTxtIDTurno.setText( model.getValueAt(index, 0).toString() );
        // HoraIngreso[0] almacena la fecha, [1] la hora de ingreso
        String[] HoraIngreso = model.getValueAt(index, 5).toString().split(" ");
        jTxtHoraIngreso.setText(HoraIngreso[1]);
        
        // HoraSalida[0] almacena la fecha, [1] la hora de salida
        String[] HoraSalida = model.getValueAt(index, 6).toString().split(" ");
        jTxtHoraSalida.setText(HoraSalida[1]);

        jTxtFecha.setText( model.getValueAt(index, 7).toString() );
    }//GEN-LAST:event_jTableHorariosMouseClicked

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
               
        HorarioController obj = new HorarioController();
        obj.setHoraIngreso(jTxtHoraIngreso.getText());
        obj.setHoraSalida(jTxtHoraSalida.getText());
        obj.setFecha(jTxtFecha.getText());
        
        if(!jTxtIDTurno.getText().equals("")) obj.setIdTurno(Integer.parseInt(jTxtIDTurno.getText()));

        int index = 0;
        
        index = jCmbIDPersonal.getSelectedIndex();
        ComboBoxModel model = jCmbIDPersonal.getModel();
        ComboItems me = (ComboItems) model.getElementAt(index);
        obj.setIdPersonal(me.getKey());
        
        index = jCmbIDPorton.getSelectedIndex();
        model = jCmbIDPorton.getModel();
        me = (ComboItems) model.getElementAt(index);
        obj.setIdPorton(me.getKey());
        
        //inserta datos en la base, o mensaje de lo contrario
        if(obj.modificarHorario()){
            JOptionPane.showMessageDialog(this, "Datos guardados");
        }
        else{
            JOptionPane.showMessageDialog(this, "Datos no guardados");
        }
        
        mostrarDatos();
    }//GEN-LAST:event_BtnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnGoLogIn1;
    private javax.swing.JButton btnTheme;
    private javax.swing.JComboBox<String> jCmbIDPersonal;
    private javax.swing.JComboBox<String> jCmbIDPorton;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPContenedorHorario;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPImageContainer1;
    private javax.swing.JPanel jPIngresoHorario;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPSideBar1;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JPanel jPbtnSBContainer1;
    private javax.swing.JScrollPane jSTablaDatos;
    private javax.swing.JTable jTableHorarios;
    private javax.swing.JTextField jTxtFecha;
    private javax.swing.JTextField jTxtHoraIngreso;
    private javax.swing.JTextField jTxtHoraSalida;
    private javax.swing.JTextField jTxtIDTurno;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblHoraIngreso;
    private javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblIDPersonal;
    private javax.swing.JLabel lblIDPorton;
    private javax.swing.JLabel lblIDPorton1;
    private javax.swing.JLabel lblIdHorario;
    private javax.swing.JLabel lblImgBusqueda;
    private javax.swing.JLabel lblImgBusqueda1;
    private javax.swing.JLabel lblIngresoHorario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblSistemaVigilantes1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiarDatos() {
        jTxtFecha.setText("");
        jTxtHoraIngreso.setText("");
        jTxtHoraSalida.setText("");
        jTxtIDTurno.setText("");
 
        try{
            jCmbIDPersonal.setSelectedIndex(0);
        }
        catch(Exception e){
        }
        
        try{
            jCmbIDPorton.setSelectedIndex(0);
        }
        catch(Exception e){
        }

    }
}

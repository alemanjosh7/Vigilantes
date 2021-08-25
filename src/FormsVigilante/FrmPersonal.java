/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsVigilante;

import ControladorVigilante.PersonalController;
import Modelo.ComboItems;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author CRISTIAN
 */
public class FrmPersonal extends javax.swing.JFrame {

    /**
     * Creates new form Personal
     */
    public FrmPersonal() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
        
    }
    
    private void limpiarDatos(){
        jTxtNombre.setText("");
        jTxtApellido.setText("");
        jTxtCorreo.setText("");
        jTxtDUI.setText("");
        jTxtID.setText("");
        jTxtSalario.setText("");
        jTxtTelefono.setText("");
        
        try{
            cmbTipoPersonal.setSelectedIndex(0);
            cmbIdEstadoPersonal.setSelectedIndex(0);
        }
        catch(Exception e){
        }
        
    }
    
    private void mostrarDatos(){
        
        PersonalController obj = new PersonalController();
        
        try {
            
            //Tabla jTVigilantes
            DefaultTableModel modelo = obj.generarTabla();
                  
            jTVigilantes.setModel(modelo);
            modelo.fireTableDataChanged();
            jTVigilantes.getTableHeader().setReorderingAllowed(false);
            TableCellRenderer rendererFromHeader = jTVigilantes.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            
            //Combobox cmbTipoPersonal
            DefaultComboBoxModel cmbmodelo = obj.generarComboBoxCargo();
            cmbTipoPersonal.setModel(cmbmodelo);
            
            //Combobox cmbIdEstadoPersonal
            cmbmodelo = obj.generarComboBoxEstadoPersonal();
            cmbIdEstadoPersonal.setModel(cmbmodelo);
                        
            try{
                cmbTipoPersonal.setSelectedIndex(0);
                cmbIdEstadoPersonal.setSelectedIndex(0);
            }
            catch(Exception e){

            }
            
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

        lblGris = new javax.swing.JLabel();
        jPSideBar = new javax.swing.JPanel();
        jPImageContainer = new javax.swing.JPanel();
        lblSistemaVigilantes = new javax.swing.JLabel();
        lblImgBusqueda = new javax.swing.JLabel();
        jPbtnSBContainer = new javax.swing.JPanel();
        btnGoLogIn = new javax.swing.JButton();
        jPColorGestionLLamada = new javax.swing.JPanel();
        jPGestionVigilante = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        lblEstadoPersonal = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblSalarioMensual = new javax.swing.JLabel();
        cmbIdEstadoPersonal = new javax.swing.JComboBox<>();
        jPBotones = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblGestionVigilante = new javax.swing.JLabel();
        lblTipoPersonal = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDUI = new javax.swing.JLabel();
        jSTablaGestionVigilantes = new javax.swing.JScrollPane();
        jTVigilantes = new javax.swing.JTable();
        lbID = new javax.swing.JLabel();
        cmbTipoPersonal = new javax.swing.JComboBox<>();
        jTxtNombre = new javax.swing.JTextField();
        jTxtApellido = new javax.swing.JTextField();
        jTxtDUI = new javax.swing.JTextField();
        jTxtCorreo = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        lblCorreoElectronico1 = new javax.swing.JLabel();
        jTxtSalario = new javax.swing.JTextField();
        jPToolStrip = new javax.swing.JPanel();
        lblExitButton = new javax.swing.JLabel();
        btnTheme = new javax.swing.JButton();
        lblCargoUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);
        getContentPane().add(lblGris);
        lblGris.setBounds(295, 240, 0, 248);

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

        getContentPane().add(jPSideBar);
        jPSideBar.setBounds(0, 0, 287, 811);

        jPColorGestionLLamada.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPColorGestionLLamada.setLayout(null);

        jPGestionVigilante.setBackground(new java.awt.Color(255, 255, 255));
        jPGestionVigilante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPGestionVigilante.setLayout(null);

        lblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblApellido.setText("Apellidos:");
        jPGestionVigilante.add(lblApellido);
        lblApellido.setBounds(660, 80, 89, 22);

        lblEstadoPersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEstadoPersonal.setText("Estado del Personal: ");
        jPGestionVigilante.add(lblEstadoPersonal);
        lblEstadoPersonal.setBounds(360, 240, 186, 22);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTelefono.setText("Teléfono:");
        jPGestionVigilante.add(lblTelefono);
        lblTelefono.setBounds(360, 160, 84, 22);

        lblSalarioMensual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSalarioMensual.setText("Salario Mensual ($) :");
        jPGestionVigilante.add(lblSalarioMensual);
        lblSalarioMensual.setBounds(660, 240, 180, 22);

        cmbIdEstadoPersonal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbIdEstadoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdEstadoPersonalActionPerformed(evt);
            }
        });
        jPGestionVigilante.add(cmbIdEstadoPersonal);
        cmbIdEstadoPersonal.setBounds(360, 270, 250, 26);

        jPBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPBotones.setPreferredSize(new java.awt.Dimension(895, 60));

        btnConsultar.setBackground(new java.awt.Color(255, 211, 105));
        btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 3, true));
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setFocusable(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 211, 105));
        btnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
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
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        jPGestionVigilante.add(jPBotones);
        jPBotones.setBounds(71, 585, 895, 60);

        lblGestionVigilante.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblGestionVigilante.setForeground(new java.awt.Color(255, 211, 105));
        lblGestionVigilante.setText("Gestión de Vigilantes");
        jPGestionVigilante.add(lblGestionVigilante);
        lblGestionVigilante.setBounds(379, 24, 246, 29);

        lblTipoPersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipoPersonal.setText("Cargo de Personal:");
        jPGestionVigilante.add(lblTipoPersonal);
        lblTipoPersonal.setBounds(50, 160, 168, 22);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombres:");
        jPGestionVigilante.add(lblNombre);
        lblNombre.setBounds(360, 80, 100, 22);

        lblDUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDUI.setText("DUI:");
        jPGestionVigilante.add(lblDUI);
        lblDUI.setBounds(660, 160, 38, 22);

        jTVigilantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Cargo", "Telefono", "DUI", "Correo", "Estado", "Salario"
            }
        ));
        jTVigilantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVigilantesMouseClicked(evt);
            }
        });
        jSTablaGestionVigilantes.setViewportView(jTVigilantes);

        jPGestionVigilante.add(jSTablaGestionVigilantes);
        jSTablaGestionVigilantes.setBounds(44, 320, 970, 247);

        lbID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbID.setText("ID:");
        jPGestionVigilante.add(lbID);
        lbID.setBounds(50, 80, 25, 22);
        lbID.getAccessibleContext().setAccessibleName("ID");

        cmbTipoPersonal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbTipoPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPGestionVigilante.add(cmbTipoPersonal);
        cmbTipoPersonal.setBounds(50, 190, 250, 26);
        jPGestionVigilante.add(jTxtNombre);
        jTxtNombre.setBounds(360, 110, 250, 24);
        jPGestionVigilante.add(jTxtApellido);
        jTxtApellido.setBounds(660, 110, 250, 24);
        jPGestionVigilante.add(jTxtDUI);
        jTxtDUI.setBounds(660, 190, 250, 24);
        jPGestionVigilante.add(jTxtCorreo);
        jTxtCorreo.setBounds(50, 270, 250, 24);
        jPGestionVigilante.add(jTxtTelefono);
        jTxtTelefono.setBounds(360, 190, 250, 24);

        jTxtID.setEditable(false);
        jPGestionVigilante.add(jTxtID);
        jTxtID.setBounds(50, 110, 170, 24);

        lblCorreoElectronico1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCorreoElectronico1.setText("Correo Electronico:");
        jPGestionVigilante.add(lblCorreoElectronico1);
        lblCorreoElectronico1.setBounds(50, 240, 171, 22);
        jPGestionVigilante.add(jTxtSalario);
        jTxtSalario.setBounds(660, 270, 250, 24);

        jPColorGestionLLamada.add(jPGestionVigilante);
        jPGestionVigilante.setBounds(30, 20, 1040, 670);

        getContentPane().add(jPColorGestionLLamada);
        jPColorGestionLLamada.setBounds(280, 60, 1090, 710);

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

        getContentPane().add(jPToolStrip);
        jPToolStrip.setBounds(270, 0, 1100, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdEstadoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdEstadoPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdEstadoPersonalActionPerformed

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jTVigilantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVigilantesMouseClicked
        int index = jTVigilantes.getSelectedRow();
        TableModel model = jTVigilantes.getModel();
        
        jTxtID.setText( model.getValueAt(index, 0).toString() );
        jTxtNombre.setText( model.getValueAt(index, 1).toString() );
        jTxtApellido.setText( model.getValueAt(index, 2).toString() );
        jTxtTelefono.setText( model.getValueAt(index, 4).toString() );
        jTxtDUI.setText( model.getValueAt(index, 5).toString() );
        jTxtCorreo.setText( model.getValueAt(index, 6).toString() );
        jTxtSalario.setText( model.getValueAt(index, 8).toString() );
    }//GEN-LAST:event_jTVigilantesMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        PersonalController obj = new PersonalController();
        obj.setNombres(jTxtNombre.getText());
        obj.setApellidos(jTxtApellido.getText());
        obj.setCorreo(jTxtCorreo.getText());
        obj.setDui(jTxtDUI.getText());
        obj.setSalarioMensual( Float.parseFloat(jTxtSalario.getText()));
        obj.setTelefono(jTxtTelefono.getText());
        
        if(!jTxtID.getText().equals("")) obj.setIdPersonal(Integer.parseInt(jTxtID.getText()));

        int index = 0;
        
        index = cmbIdEstadoPersonal.getSelectedIndex();
        ComboBoxModel model = cmbIdEstadoPersonal.getModel();
        ComboItems me = (ComboItems) model.getElementAt(index);
        obj.setIdEstadoPersonal(me.getKey());
        
        index = cmbTipoPersonal.getSelectedIndex();
        model = cmbTipoPersonal.getModel();
        me = (ComboItems) model.getElementAt(index);
        obj.setIdTipoPersonal(me.getKey());
        
        //inserta datos en la base, o mensaje de lo contrario
        if(obj.insertarPersonal()){
            JOptionPane.showMessageDialog(this, "Datos guardados");
        }
        else{
            JOptionPane.showMessageDialog(this, "Datos no guardados");
        }
        
        mostrarDatos();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        PersonalController obj = new PersonalController();
        obj.setNombres(jTxtNombre.getText());
        obj.setApellidos(jTxtApellido.getText());
        obj.setCorreo(jTxtCorreo.getText());
        obj.setDui(jTxtDUI.getText());
        obj.setSalarioMensual( Float.parseFloat(jTxtSalario.getText()));
        obj.setTelefono(jTxtTelefono.getText());
        
        if(!jTxtID.getText().equals("")) obj.setIdPersonal(Integer.parseInt(jTxtID.getText()));

        int index = 0;
        
        index = cmbIdEstadoPersonal.getSelectedIndex();
        ComboBoxModel model = cmbIdEstadoPersonal.getModel();
        ComboItems me = (ComboItems) model.getElementAt(index);
        obj.setIdEstadoPersonal(me.getKey());
        
        index = cmbTipoPersonal.getSelectedIndex();
        model = cmbTipoPersonal.getModel();
        me = (ComboItems) model.getElementAt(index);
        obj.setIdTipoPersonal(me.getKey());
        
        //modifica datos en la base, o mensaje de lo contrario
        if(obj.modificarPersonal()){
            JOptionPane.showMessageDialog(this, "Datos modificados");
        }
        else{
            JOptionPane.showMessageDialog(this, "Datos no modificados");
        }
        
        mostrarDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGoLogIn;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnTheme;
    private javax.swing.JComboBox<String> cmbIdEstadoPersonal;
    private javax.swing.JComboBox<String> cmbTipoPersonal;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPColorGestionLLamada;
    private javax.swing.JPanel jPGestionVigilante;
    private javax.swing.JPanel jPImageContainer;
    private javax.swing.JPanel jPSideBar;
    private javax.swing.JPanel jPToolStrip;
    private javax.swing.JPanel jPbtnSBContainer;
    private javax.swing.JScrollPane jSTablaGestionVigilantes;
    private javax.swing.JTable jTVigilantes;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDUI;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtSalario;
    private javax.swing.JTextField jTxtTelefono;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblCorreoElectronico1;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblEstadoPersonal;
    private javax.swing.JLabel lblExitButton;
    private javax.swing.JLabel lblGestionVigilante;
    private javax.swing.JLabel lblGris;
    private javax.swing.JLabel lblImgBusqueda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSalarioMensual;
    private javax.swing.JLabel lblSistemaVigilantes;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoPersonal;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigilante;

/**
 *
 * @author CRISTIAN
 */
public class EntradaVisitante extends javax.swing.JFrame {

    /**
     * Creates new form EntradaVisitante
     */
    public EntradaVisitante() {
        
        this.setUndecorated(true);
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlblTipoEntrada = new javax.swing.JLabel();
        jlblIdResidencia = new javax.swing.JLabel();
        jlblMotivoEntrada = new javax.swing.JLabel();
        jlblEmergencia = new javax.swing.JLabel();
        jlblMotivoEntrada1 = new javax.swing.JLabel();
        jcmbTipoIS = new javax.swing.JComboBox<>();
        jcmbIdResidencia = new javax.swing.JComboBox<>();
        jrdbTrue = new javax.swing.JRadioButton();
        jrdbFalse = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jrdbTrueEntrada = new javax.swing.JRadioButton();
        jrdbFalseEntrada = new javax.swing.JRadioButton();
        jlblEntrada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jlblTipoEntrada1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Ingreso");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1367, 817));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setForeground(new java.awt.Color(57, 62, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 290, 770);

        jPanel1.setBackground(new java.awt.Color(255, 211, 105));
        jPanel1.setForeground(new java.awt.Color(255, 211, 105));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("x");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1060, 0, 20, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(266, 0, 1170, 39);

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblTipoEntrada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTipoEntrada.setText("Lugar donde ingreso el visitante: ");

        jlblIdResidencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblIdResidencia.setText("Residencia a visitar:");

        jlblMotivoEntrada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblMotivoEntrada.setText("Motivo de visita:");

        jlblEmergencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblEmergencia.setText("¿Entrada de Emergencia?");

        jlblMotivoEntrada1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblMotivoEntrada1.setText("Hora de la entrada:");

        jcmbTipoIS.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcmbTipoIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada Gate 12", "Entrada Peatonal Gate 12", "Entrada Gate 13", "Entrada Peatonal Gate 13" }));

        jcmbIdResidencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcmbIdResidencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa 10 E", "Casa 11 E", "Casa 12 E", "Casa 13 E" }));

        buttonGroup1.add(jrdbTrue);
        jrdbTrue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrdbTrue.setText("SI");

        buttonGroup1.add(jrdbFalse);
        jrdbFalse.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrdbFalse.setText("NO");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buttonGroup1.add(jrdbTrueEntrada);
        jrdbTrueEntrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrdbTrueEntrada.setText("SI");

        buttonGroup1.add(jrdbFalseEntrada);
        jrdbFalseEntrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrdbFalseEntrada.setText("NO");

        jlblEntrada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblEntrada.setText("¿Se le permitio la entrada?");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jbAgregar.setBackground(new java.awt.Color(255, 211, 105));
        jbAgregar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbAgregar.setText("Agregar");

        jbModificar.setBackground(new java.awt.Color(255, 211, 105));
        jbModificar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbModificar.setText("Modificar");

        jbLimpiarCampos.setBackground(new java.awt.Color(255, 211, 105));
        jbLimpiarCampos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbLimpiarCampos.setText("Limpiar Campos");

        jbCerrar.setBackground(new java.awt.Color(255, 211, 105));
        jbCerrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbCerrar.setText("Cerrar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbLimpiarCampos)
                .addGap(45, 45, 45)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jlblTipoEntrada1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlblTipoEntrada1.setForeground(new java.awt.Color(255, 211, 105));
        jlblTipoEntrada1.setText("Ingreso de Visitantes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblMotivoEntrada)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(268, 268, 268)
                                        .addComponent(jrdbTrueEntrada)
                                        .addGap(31, 31, 31)
                                        .addComponent(jrdbFalseEntrada))
                                    .addComponent(jlblMotivoEntrada1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlblEntrada)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jlblEmergencia)
                                            .addGap(42, 42, 42)
                                            .addComponent(jrdbTrue)
                                            .addGap(31, 31, 31)
                                            .addComponent(jrdbFalse)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTipoEntrada)
                                    .addComponent(jlblIdResidencia))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmbTipoIS, 0, 500, Short.MAX_VALUE)
                                    .addComponent(jcmbIdResidencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jlblTipoEntrada1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlblTipoEntrada1)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblTipoEntrada)
                            .addComponent(jcmbTipoIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jlblIdResidencia))
                    .addComponent(jcmbIdResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblMotivoEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblMotivoEntrada1)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblEntrada)
                            .addComponent(jrdbTrueEntrada)
                            .addComponent(jrdbFalseEntrada))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblEmergencia)
                            .addComponent(jrdbTrue)
                            .addComponent(jrdbFalse))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(30, 30, 1010, 680);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(290, 40, 1080, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EntradaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcmbIdResidencia;
    private javax.swing.JComboBox<String> jcmbTipoIS;
    private javax.swing.JLabel jlblEmergencia;
    private javax.swing.JLabel jlblEntrada;
    private javax.swing.JLabel jlblIdResidencia;
    private javax.swing.JLabel jlblMotivoEntrada;
    private javax.swing.JLabel jlblMotivoEntrada1;
    private javax.swing.JLabel jlblTipoEntrada;
    private javax.swing.JLabel jlblTipoEntrada1;
    private javax.swing.JRadioButton jrdbFalse;
    private javax.swing.JRadioButton jrdbFalseEntrada;
    private javax.swing.JRadioButton jrdbTrue;
    private javax.swing.JRadioButton jrdbTrueEntrada;
    // End of variables declaration//GEN-END:variables
}

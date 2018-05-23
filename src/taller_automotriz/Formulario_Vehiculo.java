package taller_automotriz;

import Entity.propietario;
import Entity.vehiculo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VehiculoModel;

public class Formulario_Vehiculo extends javax.swing.JFrame {

    VehiculoModel modeloafiliados = new VehiculoModel();

    String selec;
    vehiculo vaf = new vehiculo();
    private Long afiliados;

    propietario p = new propietario();
    private Long cedula;

    public Formulario_Vehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        txtcedula.setEditable(false);

    }

    public void borrardatos() {
        txtplaca.setText("");
        txtmodelo.setText("");
        txtreferencia.setText("");
        txtcedula.setText("");
        txtasegurdora.setText("");
        seleccion.clearSelection();

    }

    public void llenartabla() {

        DefaultTableModel tablavehiculo = new DefaultTableModel();
        tablavehiculo.addColumn("PLACA");
        tablavehiculo.addColumn("REFERENCIA");
        tablavehiculo.addColumn("MODELO");
        tablavehiculo.addColumn("CEDULA PROPIETARIO");
        tablavehiculo.addColumn("AFILIACION");
        tablavehiculo.addColumn("ASEGURADORA");
        List<vehiculo> vehicu = modeloafiliados.consultarVehiculo(cedula);
        for (vehiculo v : vehicu) {
            tablavehiculo.addRow(new String[]{v.getPlaca(),
                v.getReferencia(),
                v.getModelo(),
                v.getId_propietario() + "",
                v.getAfiliacion() + "",
                v.getAseguradora()
            });
        }
        tabla_vehiculo.setModel(tablavehiculo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtreferencia = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        Safiliados = new javax.swing.JRadioButton();
        Socacionales = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtafiliado = new javax.swing.JTextField();
        txtasegurdora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bguardar = new javax.swing.JButton();
        batras = new javax.swing.JButton();
        menuprincial = new javax.swing.JButton();
        registrarrevision = new javax.swing.JButton();
        bconsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_vehiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("REFERENCIA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        j.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j.setForeground(new java.awt.Color(153, 0, 0));
        j.setText("MODELO:");
        jPanel1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("CEDULA PROPIETARIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRO DE VEHICULOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        txtcedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, -1));

        txtmodelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, -1));

        txtreferencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtreferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, -1));

        txtplaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        jPanel1.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, -1));

        seleccion.add(Safiliados);
        Safiliados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Safiliados.setForeground(new java.awt.Color(102, 0, 0));
        Safiliados.setText("AFILIADOS ");
        Safiliados.setActionCommand("A");
        Safiliados.setFocusable(false);
        Safiliados.setOpaque(false);
        Safiliados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SafiliadosMouseClicked(evt);
            }
        });
        Safiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SafiliadosActionPerformed(evt);
            }
        });
        jPanel1.add(Safiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, 109, -1));

        seleccion.add(Socacionales);
        Socacionales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Socacionales.setForeground(new java.awt.Color(153, 0, 0));
        Socacionales.setText("OCACIONALES");
        Socacionales.setActionCommand("O");
        Socacionales.setFocusable(false);
        Socacionales.setOpaque(false);
        Socacionales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SocacionalesMouseClicked(evt);
            }
        });
        jPanel1.add(Socacionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 189, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("NUMERO AFILIADOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("ASEGURADORA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, -1, -1));

        txtafiliado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtafiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, -1));

        txtasegurdora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtasegurdora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("PLACA VEHICULO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        bguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bguardar.setText("REGISTRAR");
        bguardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        jPanel1.add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 270, 30));

        batras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batras.setText("ATRAS");
        batras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batrasActionPerformed(evt);
            }
        });
        jPanel1.add(batras, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 270, 30));

        menuprincial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuprincial.setText("MENU PRINCIPAL");
        menuprincial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuprincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuprincialActionPerformed(evt);
            }
        });
        jPanel1.add(menuprincial, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 270, 30));

        registrarrevision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarrevision.setText("REGISTRAR REVISION");
        registrarrevision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarrevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarrevisionActionPerformed(evt);
            }
        });
        jPanel1.add(registrarrevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 270, 30));

        bconsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bconsultar.setText("CONSULTAR VEHICULOS REGISTRADOS AL PROPIETARIO");
        bconsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconsultarActionPerformed(evt);
            }
        });
        jPanel1.add(bconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 420, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 830, 280));

        tabla_vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_vehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_vehiculo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 830, 222));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed

        if ("A".equals(selec)) {
            txtasegurdora.setText("");
            afiliados++;
            txtafiliado.setText(Long.toString(afiliados));
            vehiculo veh = new vehiculo(txtplaca.getText(),
                    txtmodelo.getText(),
                    txtreferencia.getText(),
                    Long.parseLong(txtcedula.getText()),
                    Long.parseLong(txtafiliado.getText()));

            if (modeloafiliados.vehiculoA(veh)) {
                JOptionPane.showMessageDialog(this, "VEHICULO REGSITRADO CON EXITO");
            } else {
                JOptionPane.showMessageDialog(this, "VEHICULO  NO REGISTRADO");
            }
        } else if ("O".equals(selec)) {

            vehiculo veh = new vehiculo(txtplaca.getText(),
                    txtmodelo.getText(),
                    txtreferencia.getText(),
                    Long.parseLong(txtcedula.getText()),
                    txtasegurdora.getText());
            if (modeloafiliados.vehiculosO(veh)) {
                JOptionPane.showMessageDialog(this, "VEHICULO OCACIONAL CON EXITO");
            } else {
                JOptionPane.showMessageDialog(this, "VEHICULO OCACIONAL NO AFILIADO");
            }

        }
        borrardatos();
        llenartabla();

    }//GEN-LAST:event_bguardarActionPerformed

    private void menuprincialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuprincialActionPerformed
        formularioPropietario fp = new formularioPropietario();
        fp.toFront();
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuprincialActionPerformed

    private void bconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconsultarActionPerformed
        llenartabla();
    }//GEN-LAST:event_bconsultarActionPerformed

    private void registrarrevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarrevisionActionPerformed

        formularioRevision frv = new formularioRevision();
        frv.toFront();
        frv.setVisible(true);
        formularioRevision.txtplaca.setText(txtplaca.getText());
        this.setVisible(false);
    }//GEN-LAST:event_registrarrevisionActionPerformed

    private void tabla_vehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_vehiculoMouseClicked
        int fila = tabla_vehiculo.getSelectedRow();
        if (fila >= 0) {
            txtplaca.setText(tabla_vehiculo.getValueAt(fila, 0).toString());
            txtreferencia.setText(tabla_vehiculo.getValueAt(fila, 1).toString());
            txtmodelo.setText(tabla_vehiculo.getValueAt(fila, 2).toString());
            txtcedula.setText(tabla_vehiculo.getValueAt(fila, 3).toString());

        }
    }//GEN-LAST:event_tabla_vehiculoMouseClicked

    private void SocacionalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocacionalesMouseClicked
        txtafiliado.setEnabled(false);
        txtasegurdora.setEnabled(true);
        selec = seleccion.getSelection().getActionCommand();
    }//GEN-LAST:event_SocacionalesMouseClicked

    private void SafiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SafiliadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SafiliadosActionPerformed

    private void SafiliadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SafiliadosMouseClicked
        txtasegurdora.setEnabled(false);
        txtafiliado.setEnabled(false);
        modeloafiliados.consultanafiliacion(vaf);
        afiliados = vaf.getAfiliacion();
        txtafiliado.setText(Long.toString(afiliados));
        selec = seleccion.getSelection().getActionCommand();
    }//GEN-LAST:event_SafiliadosMouseClicked

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        txtreferencia.requestFocus();
    }//GEN-LAST:event_txtplacaActionPerformed

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        txtmodelo.requestFocus();
    }//GEN-LAST:event_txtreferenciaActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        txtcedula.requestFocus();
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed

    }//GEN-LAST:event_txtcedulaActionPerformed

    private void batrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batrasActionPerformed
        formularioPropietario fp=new formularioPropietario();
        fp.toFront();
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_batrasActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Safiliados;
    private javax.swing.JRadioButton Socacionales;
    private javax.swing.JButton batras;
    private javax.swing.JButton bconsultar;
    private javax.swing.JButton bguardar;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuprincial;
    private javax.swing.JButton registrarrevision;
    private javax.swing.ButtonGroup seleccion;
    private javax.swing.JTable tabla_vehiculo;
    public static javax.swing.JTextField txtafiliado;
    private javax.swing.JTextField txtasegurdora;
    public static javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtreferencia;
    // End of variables declaration//GEN-END:variables
}

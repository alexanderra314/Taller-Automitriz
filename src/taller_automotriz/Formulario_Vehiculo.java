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
        // txtcedula.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_vehiculo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        j = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Safiliados = new javax.swing.JRadioButton();
        Socacionales = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtafiliado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtasegurdora = new javax.swing.JTextField();
        bguardar = new javax.swing.JButton();
        batras = new javax.swing.JButton();
        menuprincial = new javax.swing.JButton();
        registrarrevision = new javax.swing.JButton();
        bconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 830, 222));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga 3.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 280, 190));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("PLACA VEHICULO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtplaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        jPanel2.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 180, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("REFERENCIA:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtreferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });
        jPanel2.add(txtreferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, 20));

        j.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j.setForeground(new java.awt.Color(153, 0, 0));
        j.setText("MODELO:");
        jPanel2.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtmodelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });
        jPanel2.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 86, 180, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("CEDULA PROPIETARIO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        jPanel2.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 126, 130, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRO DE VEHICULOS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 320, 30));

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
        jPanel2.add(Safiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

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
        jPanel2.add(Socacionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("NUMERO AFILIADOS:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtafiliado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtafiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 206, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("ASEGURADORA:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtasegurdora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtasegurdora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 236, 130, 20));

        bguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bguardar.setText("REGISTRAR");
        bguardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        jPanel2.add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 190, 30));

        batras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batras.setText("ATRAS");
        batras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batrasActionPerformed(evt);
            }
        });
        jPanel2.add(batras, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 190, 30));

        menuprincial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuprincial.setText("MENU PRINCIPAL");
        menuprincial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuprincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuprincialActionPerformed(evt);
            }
        });
        jPanel2.add(menuprincial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 190, 30));

        registrarrevision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarrevision.setText("REGISTRAR REVISION");
        registrarrevision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarrevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarrevisionActionPerformed(evt);
            }
        });
        jPanel2.add(registrarrevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 161, 190, 30));

        bconsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bconsultar.setText("CONSULTAR VEHICULOS REGISTRADOS AL PROPIETARIO");
        bconsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconsultarActionPerformed(evt);
            }
        });
        jPanel2.add(bconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 430, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 280));

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
        llenartabla();
        borrardatos();


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
        if ("".equals(txtplaca.getText())) {
               JOptionPane.showMessageDialog(this,"PLACA DE VEHICULO NO SUMINTRADA");
        } else {
            formularioRevision frv = new formularioRevision();
            frv.toFront();
            frv.setVisible(true);
            formularioRevision.txtplaca.setText(txtplaca.getText());
            this.setVisible(false);
        }

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
        formularioPropietario fp = new formularioPropietario();
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
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

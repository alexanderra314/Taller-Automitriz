package taller_automotriz;

import Entity.propietario;
import Entity.vehiculo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.PropietarioModel;

public class formularioPropietario extends javax.swing.JFrame {

    PropietarioModel pom = new PropietarioModel();
    Long cedula;
    Long selectpro;
    private PropietarioModel modelo;
    private int id = -1;
    vehiculo vehic;
    propietario p;

    public formularioPropietario() {
        initComponents();
        setLocationRelativeTo(null);
        brnv.setEnabled(false);
        modelo = new PropietarioModel();

    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public static JTextField getTxtcedula() {
        return txtcedula;
    }

    public static void setTxtcedula(JTextField txtcedula) {
        formularioPropietario.txtcedula = txtcedula;
    }

    public void abrirregistrov() {
        Formulario_Vehiculo frv = new Formulario_Vehiculo();
        frv.toFront();
        frv.setVisible(true);

        this.dispose();
    }

    public void limpiarcampos() {
        txtcedula.setText("");
        txtnombre.setText("");
        txtcelular.setText("");
        Bregistar.setEnabled(true);
    }

    public void limpiardatossinid() {
        txtnombre.setText("");
        txtcelular.setText("");
        Bregistar.setEnabled(true);
    }

    private void llenartabla() {
        DefaultTableModel modelotabla = new DefaultTableModel();
        modelotabla.addColumn("IDENTIFICACION");
        modelotabla.addColumn("NOMBRE");
        modelotabla.addColumn("CELULAR");

        List<propietario> propietario = modelo.consultarPropietario();
        for (propietario pro : propietario) {
            modelotabla.addRow(new String[]{pro.getId_propietario() + "",
                pro.getNombre(),
                pro.getCelular() + ""});
        }

        tabla.setModel(modelotabla);
    }

    private void llenartablatodos() {
        DefaultTableModel modelotabla = new DefaultTableModel();
        modelotabla.addColumn("IDENTIFICACION");
        modelotabla.addColumn("NOMBRE");
        modelotabla.addColumn("CELULAR");

        List<propietario> propietario = modelo.consultartodosPropietario();
        for (propietario pro : propietario) {
            modelotabla.addRow(new String[]{pro.getId_propietario() + "",
                pro.getNombre(),
                pro.getCelular() + ""});
        }

        tabla.setModel(modelotabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bregistar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        brnv = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bregistar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Bregistar.setText("REGISTRAR PROPIETARIO");
        Bregistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregistarActionPerformed(evt);
            }
        });
        getContentPane().add(Bregistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TALLER AUTOMOTRIZ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("CELULAR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("CEDULA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 257, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 257, -1));

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 255, -1));

        Bbuscar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Bbuscar.setText("BUSCAR");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Bbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 90, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 570, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS DEL PROPIETARIO.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 229, 30));

        brnv.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        brnv.setText("DATOS DEL VEHICULO");
        brnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnvActionPerformed(evt);
            }
        });
        getContentPane().add(brnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 30));

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga 2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setText("MOSTRAR TODOS LOS PROPIETARIOS");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 270, 30));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 4, 300, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BregistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregistarActionPerformed

        propietario pro = new propietario(Long.parseLong(txtcedula.getText()),
                txtnombre.getText(),
                Long.parseLong(txtcelular.getText()));
        if (pom.registropropietraios(pro)) {
            JOptionPane.showMessageDialog(this, "PROPIETRAIO REGISTRADO CON EXITO");

        } else {
            JOptionPane.showMessageDialog(this, "PROPRIETARIO NO AFILIADO");
        }
        brnv.setEnabled(true);

    }//GEN-LAST:event_BregistarActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        txtnombre.requestFocus();

    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtcelular.requestFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed

    }//GEN-LAST:event_txtcelularActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed

        if (txtcedula.getText() == "") {
            JOptionPane.showMessageDialog(this, "NUMERO DE CEDULA NO SUMINTRADA");
        } else {
            cedula = Long.parseLong(txtcedula.getText());
            p = new propietario(cedula);
            selectpro = pom.busquedapropíetario(p);
            if (selectpro == 0) {
                JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO REGISTRE NUEVO PROPIETARIO");
                limpiardatossinid();
            } else if (selectpro == 1) {
                JOptionPane.showMessageDialog(this, "USUARIO  ENCONTRADO");
                llenartabla();
            }
        }


    }//GEN-LAST:event_BbuscarActionPerformed

    private void brnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnvActionPerformed

        abrirregistrov();
        cedula = Long.parseLong(txtcedula.getText());
        Formulario_Vehiculo.txtcedula.setText(cedula.toString());
    }//GEN-LAST:event_brnvActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            txtcedula.setText(tabla.getValueAt(fila, 0).toString());
            txtnombre.setText(tabla.getValueAt(fila, 1).toString());
            txtcelular.setText(tabla.getValueAt(fila, 2).toString());
            brnv.setEnabled(true);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenartablatodos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formularioPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioPropietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Bregistar;
    private javax.swing.JButton brnv;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    public static javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

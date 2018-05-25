package taller_automotriz;

import Entity.revision;
import Entity.vehiculo;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VehiculoModel;
import modelo.revisionModel;

public class formularioRevision extends javax.swing.JFrame {

    revisionModel rm = new revisionModel();
    private String fecha;
    private String estado;
    private final VehiculoModel vemo = new VehiculoModel();
    double revision;
    private double p;
    DefaultTableModel dtm = new DefaultTableModel();
    private double totalpagar;

    public formularioRevision() {
        initComponents();
        setLocationRelativeTo(null);
        txtplaca.setEditable(false);
        llenartabla();
    }

    public void guardarfecha() {
        String año = Integer.toString(Cfecha.getCalendar().get(Calendar.YEAR));
        String mes = Integer.toString(Cfecha.getCalendar().get(Calendar.MONTH));
        String dia = Integer.toString(Cfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String hora = Integer.toString(Cfecha.getCalendar().get(Calendar.HOUR));
        String minutos = Integer.toString(Cfecha.getCalendar().get(Calendar.MINUTE));
        String Segundo = Integer.toString(Cfecha.getCalendar().get(Calendar.SECOND));
        fecha = (año + "-" + mes + "-" + dia + " " + hora + ":" + minutos + ":" + Segundo);

    }

    public String estadorevision() {
        if (Cestado.getSelectedIndex() == 0) {
            estado = "CUMPLIDO";
        } else {
            estado = "PARCIAL";
        }
        return estado;
    }

    public double valorcandelar(VehiculoModel vh) {
        vehiculo nv = new vehiculo(txtplaca.getText());
        if (vemo.consultarsiesafiliacion(nv) == 0) {
            revision = 120;
        } else {
            revision = 100;
        }
        return revision;
    }

    public double porcentaje() {
        int por = Cestado.getSelectedIndex();
        if (por == 0) {
            p = 1;
            System.out.println(p);
        } else if (por == 1 && revision == 100) {
            p = 0.50;
            System.out.println(p);
        } else if (por == 1 && revision == 120) {
            p = 0.60;
            System.out.println(p);
        }
        return p;
    }
    public void llenartabla() {
        dtm.addColumn("CONSECUTIVO");
        dtm.addColumn("FECHA");
        dtm.addColumn("PLACA");
       

        List<revision> listarevsion = rm.mostrarrevisones();
        for (revision object : listarevsion) {
            dtm.addRow(new String[]{object.getId_revision() + "",
                object.getFecha().toString(),
                object.getDatos_vehiculos(),
                });
        }
        tablerevision.setModel(dtm);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cfecha = new com.toedter.calendar.JDateChooser();
        txtplaca = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        Cestado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablerevision = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FECHA:");

        jLabel2.setText("PLACA:");

        jLabel4.setText("DESCRIPCION:");

        jLabel5.setText("ESTADO REVISION:");

        Cfecha.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        Cestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUMPLIDO", "PARCIAL" }));

        jLabel6.setText("REVISIONES");

        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jButton1.setText("MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("MOSTRAR REVISIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Cestado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtplaca)
                                    .addComponent(txtdescripcion)))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Cfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tablerevision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablerevision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablerevisionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablerevision);

        jButton2.setText("MOSTRAR RESUMEN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("REPORTE REVISIONES ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        guardarfecha();
        estadorevision();
        java.sql.Timestamp ts = java.sql.Timestamp.valueOf(fecha);
        revision r = new revision(ts,
                txtplaca.getText(),
                txtdescripcion.getText(),
                estado);
        if (rm.registrorevision(r)) {
            JOptionPane.showMessageDialog(this, "REGISTRO DE REVISION EXITOSO");
        } else {
            JOptionPane.showMessageDialog(this, "REGISTRO DE REVISION NO EXITOSO");
        }
        llenartabla();

    }//GEN-LAST:event_registrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formularioPropietario fp = new formularioPropietario();
        fp.toFront();
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        valorcandelar(vemo);
        porcentaje();
        totalpagar = revision * p;
        resumen r = new resumen();
        r.toFront();
        r.setVisible(true);
        int fila = tablerevision.getSelectedRow();
        if (fila >= 0) {
            resumen.txtconsecutivo.setText(tablerevision.getValueAt(fila, 0).toString());
            resumen.txtfecha.setText(tablerevision.getValueAt(fila, 1).toString());
            resumen.txtplaca.setText(tablerevision.getValueAt(fila, 2).toString());
            resumen.txtdescripcion.setText(tablerevision.getValueAt(fila, 3).toString());
            resumen.txtestado.setText(tablerevision.getValueAt(fila, 4).toString());
            resumen.txtvalor.setText(String.valueOf(totalpagar));
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablerevisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablerevisionMouseClicked
        int fila = tablerevision.getSelectedRow();
        if (fila >= 0) {
            String fechain = tablerevision.getValueAt(fila, 1).toString();
            java.sql.Timestamp ts = java.sql.Timestamp.valueOf(fechain);
            Cfecha.setDate(ts);
            txtplaca.setText(tablerevision.getValueAt(fila, 2).toString());
            txtdescripcion.setText(tablerevision.getValueAt(fila, 3).toString());
            Cestado.setSelectedItem(tablerevision.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_tablerevisionMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lista_revisiones lista=new lista_revisiones();
        lista.toFront();
        lista.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(formularioRevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioRevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioRevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioRevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioRevision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cestado;
    private com.toedter.calendar.JDateChooser Cfecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tablerevision;
    private javax.swing.JTextField txtdescripcion;
    public static javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}

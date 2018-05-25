/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_automotriz;

import Entity.revision;
import Entity.vehiculo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.VehiculoModel;
import modelo.revisionModel;

public final class lista_revisiones extends javax.swing.JFrame {

    private final VehiculoModel vemo = new VehiculoModel();
    DefaultTableModel dtm = new DefaultTableModel();
    revisionModel rm = new revisionModel();
    double revisiones;
    private double estado;
    vehiculo nv = new vehiculo();
    private double pagar;
    TableRowSorter trs;
    private String fechaahora;
    private String flimiteout;
    String año, mes, dia, horas;

    public lista_revisiones() {
        initComponents();
        llenartabla(1);

//        fecha.getDateEditor().addPropertyChangeListener(
//    new PropertyChangeListener() {
//        @Override
//        public void propertyChange(PropertyChangeEvent e) {
//            if ("date".equals(e.getPropertyName())) {
//                // consultar y muestras en la tabla
//                llenartabla(2);
//                System.out.println("fechaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//            }
//        }
//    });
    }

    public void propertyChange(PropertyChangeEvent pce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String fechaInicio() {
        año = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
        mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH));
        dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));

        return fechaahora = (año + "-" + mes + "-" + dia);

    }
    
     public String fechaFin() {
        año = Integer.toString(fout.getCalendar().get(Calendar.YEAR));
        mes = Integer.toString(fout.getCalendar().get(Calendar.MONTH));
        dia = Integer.toString(fout.getCalendar().get(Calendar.DAY_OF_MONTH));

        return flimiteout = (año + "-" + mes + "-" + dia);

    }


      

    public void llenartabla(int tipo) {
        dtm = new DefaultTableModel();
        dtm.addColumn("CONSECUTIVO");
        dtm.addColumn("FECHA");
        dtm.addColumn("PLACA");
        dtm.addColumn("DESCRIPCION");
        dtm.addColumn("ESTADO");
        dtm.addColumn("VALOR A CANCELAR");

        List<revision> listarevsion = null;
        if(tipo == 1){
            listarevsion = rm.mostrarrevisones();
        }else{
            revisionModel rm=new revisionModel();
             listarevsion= rm.rangofecha(fechaInicio(), fechaFin());
        }
        
        for (revision object : listarevsion) {

            nv = new vehiculo(object.getDatos_vehiculos());

            if (vemo.consultarsiesafiliacion(nv) == 0) {
                revisiones = 120;
            } else {
                revisiones = 100;
            }

            if ("CUMPLIDO".equals(object.getEstado())) {
                estado = 1;
                pagar = revisiones;
            } else {
                if (revisiones == 100) {
                    pagar = 100 * 0.50;
                } else {
                    pagar = 120 * 0.60;
                }
                System.out.println("pagar " + pagar);
            }

            dtm.addRow(new String[]{object.getId_revision() + "",
                object.getFecha().toString(),
                object.getDatos_vehiculos(),
                object.getDescripcion(),
                object.getEstado(),
                pagar + ""
            });

        }
        tabla_revisiones.setModel(dtm);
    }

    public String getFechaahora() {
        return fechaahora;
    }

    public void setFechaahora(String fechaahora) {
        this.fechaahora = fechaahora;
    }

    public String getFlimiteout() {
        return flimiteout;
    }

    public void setFlimiteout(String flimiteout) {
        this.flimiteout = flimiteout;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_revisiones = new javax.swing.JTable();
        bsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fout = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_revisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_revisiones);

        bsalir.setText("SALIR");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FILTRO REVISIONES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTADO DE REVISIONES A VEHICULOS");

        jButton1.setText("ATRAS");

        jLabel3.setText("ENTRE");

        jButton2.setText("Filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3)
                        .addGap(112, 112, 112)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fout, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(bsalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bsalir)
                        .addComponent(jButton1))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bsalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenartabla(2);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(lista_revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_revisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsalir;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_revisiones;
    // End of variables declaration//GEN-END:variables
}

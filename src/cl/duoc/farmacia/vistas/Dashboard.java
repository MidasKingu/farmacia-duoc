package cl.duoc.farmacia.vistas;

import cl.duoc.farmacia.control.MedicamentoControl;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        Inicio vista = new Inicio();
        cambiarVista(vista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        vista_listado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_list = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        center_panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_agregar = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenuItem();
        menu_borrar = new javax.swing.JMenuItem();
        menu_listado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Laboratorio", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_list);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Medicamentos");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vista_listadoLayout = new javax.swing.GroupLayout(vista_listado);
        vista_listado.setLayout(vista_listadoLayout);
        vista_listadoLayout.setHorizontalGroup(
            vista_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vista_listadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(vista_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vista_listadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vista_listadoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar)
                        .addGap(60, 60, 60))))
        );
        vista_listadoLayout.setVerticalGroup(
            vista_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vista_listadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(vista_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_buscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DrJimmy");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        center_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout center_panelLayout = new javax.swing.GroupLayout(center_panel);
        center_panel.setLayout(center_panelLayout);
        center_panelLayout.setHorizontalGroup(
            center_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        center_panelLayout.setVerticalGroup(
            center_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(center_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        jMenu1.setText("File");

        menu_agregar.setText("Creación");
        menu_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_agregar);

        menu_editar.setText("Modificación");
        menu_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_editar);

        menu_borrar.setText("Eliminación");
        menu_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_borrarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_borrar);

        menu_listado.setText("Listado");
        menu_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_listadoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_listado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_borrarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menu_borrarActionPerformed

    private void menu_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_editarActionPerformed

    private void menu_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agregarActionPerformed
        AgregarMedicamento vista = new AgregarMedicamento();
        cambiarVista(vista);
    }//GEN-LAST:event_menu_agregarActionPerformed

    private void MostrarError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void cambiarVista(JPanel panel) {
        panel.setSize(600,480);
        panel.setLocation(0, 0);
        center_panel.removeAll();
        center_panel.add(panel, BorderLayout.CENTER);
        center_panel.revalidate();
        center_panel.repaint();
    }


    private void menu_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_listadoActionPerformed
        // TODO add your handling code here:
        Listado ls = new Listado();
        ls.setVisible(true);
    }//GEN-LAST:event_menu_listadoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JPanel center_panel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_agregar;
    private javax.swing.JMenuItem menu_borrar;
    private javax.swing.JMenuItem menu_editar;
    private javax.swing.JMenuItem menu_listado;
    private javax.swing.JTable table_list;
    private javax.swing.JPanel vista_listado;
    // End of variables declaration//GEN-END:variables
}

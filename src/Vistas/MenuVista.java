
package Vistas;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;


/**
 *
 * @author Grupo 3
 */
public class MenuVista extends javax.swing.JFrame {

  
    public MenuVista() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jDPMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuIIngre = new javax.swing.JMenuItem();
        jMenuIComida = new javax.swing.JMenuItem();
        jMenuDieta = new javax.swing.JMenuItem();
        jMenuDiario = new javax.swing.JMenuItem();
        jMReporte = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPMenuLayout = new javax.swing.GroupLayout(jDPMenu);
        jDPMenu.setLayout(jDPMenuLayout);
        jDPMenuLayout.setHorizontalGroup(
            jDPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jDPMenuLayout.setVerticalGroup(
            jDPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jMenu1.setText("PACIENTE");

        jMenuItem1.setText("CARGA PACIENTE");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("DIETA");

        jMenuIIngre.setText("INGREDIENTES");
        jMenuIIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIIngreActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuIIngre);

        jMenuIComida.setText("COMIDAS");
        jMenuIComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIComidaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuIComida);

        jMenuDieta.setText("TU DIETA");
        jMenuDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDietaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuDieta);

        jMenuDiario.setText("MENUS");
        jMenuDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiarioActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuDiario);

        jMenuBar1.add(jMenu4);

        jMReporte.setText("REPORTE");
        jMReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMReporteActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMReporte);

        jMSalir.setText("SALIR");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       PacienteVista cargaPaciente = new PacienteVista();
       cargaPaciente.setVisible(true);
       jDPMenu.add(cargaPaciente);
       jDPMenu.moveToFront(cargaPaciente);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuIIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIIngreActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       IngredienteVista cargaIngrediente = new IngredienteVista();
       cargaIngrediente.setVisible(true);
       jDPMenu.add(cargaIngrediente);
       jDPMenu.moveToFront(cargaIngrediente);
    }//GEN-LAST:event_jMenuIIngreActionPerformed

    private void jMenuDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiarioActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       MenusDVista menu  =new MenusDVista();
       menu.setVisible(true);
       jDPMenu.add(menu);
       jDPMenu.moveToFront(menu);
    }//GEN-LAST:event_jMenuDiarioActionPerformed

    private void jMenuIComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIComidaActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       ComidaVista comida  =new ComidaVista();
       comida.setVisible(true);
       jDPMenu.add(comida);
       jDPMenu.moveToFront(comida);
    }//GEN-LAST:event_jMenuIComidaActionPerformed

    private void jMenuDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDietaActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       DietaVista dieta  =new DietaVista();
       dieta.setVisible(true);
       jDPMenu.add(dieta);
       jDPMenu.moveToFront(dieta);
    }//GEN-LAST:event_jMenuDietaActionPerformed

    private void jMReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMReporteActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       ReporteVista repo  =new ReporteVista();
       repo.setVisible(true);
       jDPMenu.add(repo);
       jDPMenu.moveToFront(repo);
    }//GEN-LAST:event_jMReporteActionPerformed

                                    

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
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        FlatArcOrangeIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuVista().setVisible(true);
        });
        FlatArcOrangeIJTheme.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPMenu;
    private javax.swing.JMenu jMReporte;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDiario;
    private javax.swing.JMenuItem jMenuDieta;
    private javax.swing.JMenuItem jMenuIComida;
    private javax.swing.JMenuItem jMenuIIngre;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}

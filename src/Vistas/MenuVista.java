
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

        jDPMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemIngredientes = new javax.swing.JMenuItem();
        jMenus = new javax.swing.JMenuItem();
        jMReporte = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenu();

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

        jMenu2.setText("DIETA");

        jMenuItemIngredientes.setText("INGREDIENTES");
        jMenuItemIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngredientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemIngredientes);

        jMenus.setText("MENUS");
        jMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenusActionPerformed(evt);
            }
        });
        jMenu2.add(jMenus);

        jMenuBar1.add(jMenu2);

        jMReporte.setText("REPORTE");
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

    private void jMenuItemIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngredientesActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       IngredienteVista ingred  =new IngredienteVista();
       ingred.setVisible(true);
       jDPMenu.add(ingred);
       jDPMenu.moveToFront(ingred);
    }//GEN-LAST:event_jMenuItemIngredientesActionPerformed

    private void jMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenusActionPerformed
       jDPMenu.removeAll();
       jDPMenu.repaint();
       MenusDVista menu  =new MenusDVista();
       menu.setVisible(true);
       jDPMenu.add(menu);
       jDPMenu.moveToFront(menu);
    }//GEN-LAST:event_jMenusActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemIngredientes;
    private javax.swing.JMenuItem jMenus;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Ezequiel
 */
public class VistaGeneral extends javax.swing.JFrame {

    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMPacientes = new javax.swing.JMenu();
        jMGuardarPaciente = new javax.swing.JMenuItem();
        jMComidas = new javax.swing.JMenu();
        jMGuardarComida = new javax.swing.JMenuItem();
        jMMenus_diarios = new javax.swing.JMenu();
        jMDietas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutricionista");
        setPreferredSize(new java.awt.Dimension(500, 500));

        escritorio.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMPacientes.setText("Pacientes");

        jMGuardarPaciente.setText("Guardar/Modificar paciente");
        jMGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarPacienteActionPerformed(evt);
            }
        });
        jMPacientes.add(jMGuardarPaciente);

        jMenuBar1.add(jMPacientes);

        jMComidas.setText("Comidas");

        jMGuardarComida.setText("Guardar/Modificar comida");
        jMGuardarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarComidaActionPerformed(evt);
            }
        });
        jMComidas.add(jMGuardarComida);

        jMenuBar1.add(jMComidas);

        jMMenus_diarios.setText("Menus Diarios");
        jMenuBar1.add(jMMenus_diarios);

        jMDietas.setText("Dietas");
        jMenuBar1.add(jMDietas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarPacienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaPaciente vp = new VistaPaciente();
        escritorio.add(vp);
        escritorio.moveToFront(vp);
        vp.setVisible(true);
    }//GEN-LAST:event_jMGuardarPacienteActionPerformed

    private void jMGuardarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarComidaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaComida vc = new VistaComida();
        escritorio.add(vc);
        escritorio.moveToFront(vc);
        vc.setVisible(true);
    }//GEN-LAST:event_jMGuardarComidaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMComidas;
    private javax.swing.JMenu jMDietas;
    private javax.swing.JMenuItem jMGuardarComida;
    private javax.swing.JMenuItem jMGuardarPaciente;
    private javax.swing.JMenu jMMenus_diarios;
    private javax.swing.JMenu jMPacientes;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

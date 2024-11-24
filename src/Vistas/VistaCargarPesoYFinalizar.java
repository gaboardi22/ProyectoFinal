/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Dieta;
import Entidades.Paciente;
import Persistencia.DietaData;
import Persistencia.PacienteData;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel
 */
public class VistaCargarPesoYFinalizar extends javax.swing.JInternalFrame {

    PacienteData pd = new PacienteData();
    List<Paciente> listaPacientes = pd.listarPacientes();
    /**
     * Creates new form VistaCargarPesoYFinalizar
     */
    public VistaCargarPesoYFinalizar() {
        initComponents();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCBPacientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTFPeso_final = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLDieta = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Carga de peso");

        jLabel1.setText("Paciente:");

        jCBPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPacientesActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso final:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check-mark_10015028.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Dieta:");

        jLDieta.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFPeso_final, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLDieta))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPeso_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{   
            Paciente paciente = (Paciente) jCBPacientes.getSelectedItem();
            if (paciente == null) {
                throw new NullPointerException("Se debe seleccionar un paciente");
            }
            int idP = paciente.getId_paciente();
            DietaData d =  new DietaData();
            Dieta dieta = d.buscarDieta(paciente);
            float peso = Float.parseFloat(jTFPeso_final.getText());
            DietaData dd = new DietaData();
            dd.cargarPesoYFinalizar(dieta, peso);
            paciente.setPeso_actual(peso);
            pd.modificarPaciente(paciente);
        } catch (NumberFormatException e) {
           JOptionPane.showConfirmDialog(this, "El peso debe ser un numero valido");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPacientesActionPerformed
        try{
            Paciente paciente = (Paciente) jCBPacientes.getSelectedItem();
            if (paciente == null) {
                throw new NullPointerException("Se debe seleccionar un paciente");
            }
            int idP = paciente.getId_paciente();
            DietaData d =  new DietaData();
            Dieta dieta = d.buscarDieta(paciente);
            if (dieta == null) {
                throw new NullPointerException("No se encontró una dieta asociada al paciente seleccionado");
            }
            jLDieta.setText(dieta.getNombre());
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(this, "Ocurrió un error inesperado");
        }
    }//GEN-LAST:event_jCBPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Paciente> jCBPacientes;
    private javax.swing.JLabel jLDieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTFPeso_final;
    // End of variables declaration//GEN-END:variables
    
    private void cargarCombo() {
        for (Paciente paciente : listaPacientes) {
            jCBPacientes.addItem(paciente);
        }
    }

}

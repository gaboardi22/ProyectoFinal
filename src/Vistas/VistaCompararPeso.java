/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Paciente;
import Persistencia.DietaData;
import Persistencia.PacienteData;
import java.util.List;

/**
 *
 * @author Ezequiel
 */
public class VistaCompararPeso extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCompararPeso
     */
    PacienteData pd = new PacienteData();
    DietaData dd = new DietaData();
    List<Paciente> listaPacientes = pd.listarPacientes();

    public VistaCompararPeso() {
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
        jLPeso_actual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLPeso_inicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLPeso_buscado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLLe_falta = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Comparar el peso ");

        jLabel1.setText("Paciente:");

        jCBPacientes.setToolTipText("");
        jCBPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPacientesActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso actual:");

        jLPeso_actual.setText("...");

        jLabel4.setText("Peso inicio de la dieta:");

        jLPeso_inicio.setText("...");

        jLabel6.setText("Peso buscado: ");

        jLPeso_buscado.setText("...");

        jLabel8.setText("Le falta:");

        jLLe_falta.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLLe_falta))
                    .addComponent(jLabel1)
                    .addComponent(jCBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLPeso_actual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLPeso_inicio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLPeso_buscado)))
                .addContainerGap(120, Short.MAX_VALUE))
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
                    .addComponent(jLabel2)
                    .addComponent(jLPeso_actual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLPeso_inicio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLPeso_buscado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLLe_falta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPacientesActionPerformed
        Paciente pacienteSeleccionado = (Paciente) jCBPacientes.getSelectedItem();
        float pesoActual = pacienteSeleccionado.getPeso_actual();
        float pesoBuscado = pacienteSeleccionado.getPeso_buscado();
        float pesoInicio = dd.buscarDieta(pacienteSeleccionado).getPeso_inicial();
        float diferenciaPeso = pesoActual - pesoBuscado;
        jLPeso_actual.setText(String.valueOf(pesoActual));
        jLPeso_buscado.setText(String.valueOf(pesoBuscado));
        jLPeso_inicio.setText(String.valueOf(pesoInicio));
        jLLe_falta.setText(String.valueOf(diferenciaPeso));
    }//GEN-LAST:event_jCBPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> jCBPacientes;
    private javax.swing.JLabel jLLe_falta;
    private javax.swing.JLabel jLPeso_actual;
    private javax.swing.JLabel jLPeso_buscado;
    private javax.swing.JLabel jLPeso_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo() {
        for (Paciente paciente : listaPacientes) {
            jCBPacientes.addItem(paciente);
        }
    }
}

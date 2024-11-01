/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Paciente;
import Persistencia.PacienteData;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel
 */
public class VistaPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaPaciente
     */
    Paciente pacienteActual = null;
    PacienteData pd = new PacienteData();

    public VistaPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFAltura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFPeso_actual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFPeso_buscado = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Paciente");
        setPreferredSize(new java.awt.Dimension(300, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 300));

        jLID.setText("ID: --");

        jLabel1.setText("Nombre:");

        jTFNombre.setEnabled(false);

        jLabel2.setText("Edad:");

        jTFEdad.setEnabled(false);

        jLabel3.setText("Altura:");

        jTFAltura.setEnabled(false);

        jLabel4.setText("Peso actual:");

        jTFPeso_actual.setEnabled(false);
        jTFPeso_actual.setMinimumSize(new java.awt.Dimension(60, 22));

        jLabel5.setText("Peso buscado:");

        jTFPeso_buscado.setEnabled(false);

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFPeso_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTFPeso_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBuscar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLID)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLID)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPeso_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPeso_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String nombre = jTFNombre.getText();
            Integer edad = Integer.valueOf(jTFEdad.getText());
            Float altura = Float.valueOf(jTFAltura.getText());
            Float peso_actual = Float.valueOf(jTFPeso_actual.getText());
            Float peso_buscado = Float.valueOf((jTFPeso_buscado.getText()));
            if (pacienteActual != null) {
                pacienteActual.setNombre(nombre);
                pacienteActual.setEdad(edad);
                pacienteActual.setAltura(altura);
                pacienteActual.setPeso_actual(peso_actual);
                pacienteActual.setPeso_buscado(peso_buscado);
                pd.modificarPaciente(pacienteActual);
            }else{
                pacienteActual = new Paciente();
                pacienteActual.setNombre(nombre);
                pacienteActual.setEdad(edad);
                pacienteActual.setAltura(altura);
                pacienteActual.setPeso_actual(peso_actual);
                pacienteActual.setPeso_buscado(peso_buscado);
                pd.guardarPaciente(pacienteActual);
            }
            jLID.setText("ID: "+pacienteActual.getId_paciente());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los tipos de datos, revise");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        pacienteActual = null;
        activarCampos();
        limpiarCampos();
        jBGuardar.setEnabled(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String entrada = JOptionPane.showInputDialog(this, "Ingrese el nombre completo del paciente");
    pacienteActual = pd.buscarPaciente(entrada);
    
    if (pacienteActual != null) {
        jLID.setText("ID: " + pacienteActual.getId_paciente());
        jTFNombre.setText(pacienteActual.getNombre());
        jTFEdad.setText(String.valueOf(pacienteActual.getEdad()));
        jTFAltura.setText(String.valueOf(pacienteActual.getAltura()));
        jTFPeso_actual.setText(String.valueOf(pacienteActual.getPeso_actual()));
        jTFPeso_buscado.setText(String.valueOf(pacienteActual.getPeso_buscado()));
        activarCampos();
        jBGuardar.setEnabled(true);
    } else {
        JOptionPane.showMessageDialog(this, "Paciente no encontrado");
    }
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFAltura;
    private javax.swing.JTextField jTFEdad;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPeso_actual;
    private javax.swing.JTextField jTFPeso_buscado;
    // End of variables declaration//GEN-END:variables
    private void activarCampos() {
        jTFNombre.setEnabled(true);
        jTFEdad.setEnabled(true);
        jTFAltura.setEnabled(true);
        jTFPeso_actual.setEnabled(true);
        jTFPeso_buscado.setEnabled(true);
    }

    private void limpiarCampos() {
        jLID.setText("ID: --");
        jTFNombre.setText("");
        jTFEdad.setText("");
        jTFAltura.setText("");
        jTFPeso_actual.setText("");
        jTFPeso_buscado.setText("");
    }
}

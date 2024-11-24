/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Dieta;
import Entidades.Paciente;
import Persistencia.DietaData;
import Persistencia.PacienteData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel
 */
public class VistaDieta extends javax.swing.JInternalFrame {

    PacienteData pd = new PacienteData();
    List<Paciente> listaPacientes = pd.listarPacientes();
    private Dieta dieta = null;
    private DietaData dietaData = new DietaData();
    Paciente p = new Paciente();
    /**
     * Creates new form VistaDieta
     */
    public VistaDieta() {
        initComponents();
        cargarCombo();
        inicializarComboBoxListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JDCFecha_inicio = new com.toedter.calendar.JDateChooser();
        jDCFecha_fin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBPacientes = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Carga de Dieta");
        setMinimumSize(new java.awt.Dimension(100, 36));
        setPreferredSize(new java.awt.Dimension(366, 287));

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favorite.png"))); // NOI18N
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-results.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document.png"))); // NOI18N
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de la dieta:");

        jTFNombre.setEnabled(false);

        jLabel2.setText("Fecha inicio:");

        JDCFecha_inicio.setEnabled(false);

        jDCFecha_fin.setEnabled(false);

        jLabel3.setText("Fecha fin:");

        jLabel4.setText("Paciente:");

        jCBPacientes.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jCBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCFecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JDCFecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(JDCFecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jDCFecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbBuscar)
                    .addComponent(jBGuardar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try{ 
            String nombre = jTFNombre.getText().trim();
            Date fechaIn = JDCFecha_inicio.getDate();
            LocalDate lD = fechaIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date fechaFin = jDCFecha_fin.getDate();
            LocalDate lD2 = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Paciente paciente = (Paciente) jCBPacientes.getSelectedItem();
            if(dieta == null){
                dieta = new Dieta(nombre, lD ,lD2, paciente,0);
                dietaData.guardarDieta(dieta);
            }
        } catch (NullPointerException e) {
            JOptionPane.showConfirmDialog(this, "Se debe rellenar todos los campos");
        } catch (DateTimeException e) {
            JOptionPane.showConfirmDialog(this, "Error! Verifique que sean válidas");
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Las calorias deben ser numeros enteros");
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(this, "Ocurrió un error inesperado");
        } 
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void inicializarComboBoxListener() {
    jCBPacientes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object selectedItem = jCBPacientes.getSelectedItem();

            if (selectedItem instanceof Paciente) {
               p = (Paciente) selectedItem;
            } else {
                System.out.println("Ningún paciente ha sido seleccionado");
               p = null;
            }
        }
    });
}
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            jCBPacientes.setEnabled(true);
            if (jCBPacientes.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un paciente del combo box antes de buscar");
                return;
            }

            Paciente p = (Paciente) jCBPacientes.getSelectedItem();
            if (p == null) {
                JOptionPane.showMessageDialog(this, "Error! Seleccione un paciente válido.");
                return;
            }

            dieta = dietaData.buscarDieta(p);
            if (dieta != null) {
               jTFNombre.setText(dieta.getNombre());
               JDCFecha_inicio.setDate(java.util.Date.from(dieta.getFecha_inicio().atStartOfDay(java.time.ZoneId.systemDefault()).toInstant()));
               jDCFecha_fin.setDate(java.util.Date.from(dieta.getFecha_fin().atStartOfDay(java.time.ZoneId.systemDefault()).toInstant()));
            } else {
               JOptionPane.showMessageDialog(this, "No se encontró una dieta para el paciente seleccionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       dieta = null;
       JDCFecha_inicio.setEnabled(true);
       JDCFecha_inicio.setDate(new Date());
       jDCFecha_fin.setEnabled(true);
       jDCFecha_fin.setDate(new Date());
       jTFNombre.setEnabled(true);
       jTFNombre.setText("");
       jCBPacientes.setEnabled(true);
       jCBPacientes.setSelectedItem(0);
       jBGuardar.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDCFecha_inicio;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<Paciente> jCBPacientes;
    private com.toedter.calendar.JDateChooser jDCFecha_fin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbNuevo;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jCBPacientes.addItem(null);
        for (Paciente paciente : listaPacientes) {
            jCBPacientes.addItem(paciente);
        }
    }
}

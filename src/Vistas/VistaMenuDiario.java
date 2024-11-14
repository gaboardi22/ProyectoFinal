/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Dieta;
import Entidades.MenuDiario;
import Entidades.RenglonMenu;
import Persistencia.DietaData;
import Persistencia.MenuDiarioData;
import Persistencia.RenglonMenuData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ezequiel
 */
public class VistaMenuDiario extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaMenuDiario
     */
    MenuDiarioData mdd = new MenuDiarioData();
    MenuDiario menuActual = null;
    DietaData d = new DietaData();
    List<Dieta> listaDieta = d.listarDietas();
    DefaultTableModel modelo = new DefaultTableModel();
    RenglonMenuData rmd = new RenglonMenuData();

    public VistaMenuDiario() {
        initComponents();
        cargarCombo();
        cargarTabla();
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
        jLDia = new javax.swing.JLabel();
        jTFDia = new javax.swing.JTextField();
        jLCalorias = new javax.swing.JLabel();
        jTFCalorias = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLCalorias1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);

        jLID.setText("ID: --");

        jLDia.setText("Dia:");

        jTFDia.setEnabled(false);

        jLCalorias.setText("Calorias:");

        jTFCalorias.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Renglones asignados :");

        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLCalorias1.setText("Dieta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCalorias)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLID)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLDia)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCalorias1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLID)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDia)
                            .addComponent(jTFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCalorias)
                            .addComponent(jTFCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCalorias1)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        activarCampos();
        limpiarCampos();
        cargarCombo();
        menuActual = null;

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            Integer dia = Integer.parseInt(jTFDia.getText());
            Integer calorias = Integer.parseInt(jTFCalorias.getText());
            Dieta dieta = (Dieta) jComboBox.getSelectedItem();
            if (menuActual != null) {
                menuActual.setCalorias(calorias);
                menuActual.setDia(dia);
                menuActual.setDieta(dieta);
                mdd.modificarMenuDiario(menuActual);
            } else {
                menuActual.setCalorias(calorias);
                menuActual.setDia(dia);
                menuActual.setDieta(dieta);
                mdd.guardarMenuDiario(menuActual);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los tipos de datos, ingrese un numero");
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String entrada = JOptionPane.showInputDialog(this, "Ingrese el ID del menú diario");

        if (entrada != null && !entrada.isEmpty()) {
            try {
                Integer id = Integer.parseInt(entrada);
                menuActual = mdd.buscarMenuPorID(id);

                if (menuActual != null) {
                    jLID.setText("ID: " + menuActual.getId_menu_diario());
                    jTFDia.setText(String.valueOf(menuActual.getDia()));
                    jTFCalorias.setText(String.valueOf(menuActual.getCalorias()));
                    for (int i = 0; i < jComboBox.getItemCount(); i++) {
                        Dieta dieta = (Dieta) jComboBox.getItemAt(i);
                        if (dieta.getId_dieta() == menuActual.getDieta().getId_dieta()) {
                            jComboBox.setSelectedIndex(i);
                            break;
                        }
                    }
                    modelo.setRowCount(0);
                    List<RenglonMenu> listaRenglon = rmd.listarRenglonMenu(id);

                    for (RenglonMenu renglon : listaRenglon) {
                        Object[] fila = {
                            renglon.getId_renglon(),
                            renglon.getComida(),
                            renglon.getCantidad_gramos(),
                            renglon.getSubtotal_calorias()
                        };
                        modelo.addRow(fila);
                    }
                    jTable1.updateUI();
                } else {
                    JOptionPane.showMessageDialog(this, "Menú diario no encontrado");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<Dieta> jComboBox;
    private javax.swing.JLabel jLCalorias;
    private javax.swing.JLabel jLCalorias1;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCalorias;
    private javax.swing.JTextField jTFDia;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private void activarCampos() {
        jTFDia.setEnabled(true);
        jTFCalorias.setEnabled(true);
        jBGuardar.setEnabled(true);
    }

    private void limpiarCampos() {
        modelo.setRowCount(0);
        jTFCalorias.setText("");
        jTFDia.setText("");
        jLID.setText("ID: --");
    }

    private void cargarCombo() {
        for (Dieta diet : listaDieta) {
            jComboBox.addItem(diet);
        }
    }

    private void cargarTabla() {
        String[] columnas = {"ID", "Comida", "Cantidad en gramos", "SubCalorias"};
        modelo.setColumnIdentifiers(columnas);
        jTable1.setModel(modelo);
    }
}

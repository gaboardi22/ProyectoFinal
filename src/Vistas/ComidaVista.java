
package Vistas;

import Entidades.Comida;
import Entidades.TipoComida;
import EntidadesData.ComidaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 3
 */
public class ComidaVista extends javax.swing.JInternalFrame {
    
        private Comida comida = null;
        private ComidaData comidaData = new ComidaData();
        private DefaultTableModel modelo;
        private ArrayList<Comida> listaComidas;
        private ArrayList<TipoComida> listaTipoComidas;
   
    /**
     * Creates new form ComidaVista
     */
    public ComidaVista() {
        initComponents();
        modelo  = new DefaultTableModel();
        armarCabecera();
        cargarTabla();
        listaComidas = (ArrayList<Comida>) comidaData.listarComidas();
        cargarTiposComidas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTCaloria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNombre2 = new javax.swing.JTextField();
        jCBTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jRadioBEstado = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComida = new javax.swing.JTable();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTADetalle = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE COMIDAS");

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("DETALLES");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CALORIAS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("TIPO COMIDA");

        jCBTipo.setToolTipText("");
        jCBTipo.setAutoscrolls(true);
        jCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ESTADO");

        jRadioBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBEstadoActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.setPreferredSize(new java.awt.Dimension(80, 23));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTableComida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableComida);

        jBEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.setPreferredSize(new java.awt.Dimension(80, 23));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.setPreferredSize(new java.awt.Dimension(80, 23));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.setPreferredSize(new java.awt.Dimension(80, 23));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBNuevo.setText("NUEVO");
        jBNuevo.setPreferredSize(new java.awt.Dimension(80, 23));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTADetalle.setColumns(20);
        jTADetalle.setRows(5);
        jTADetalle.setEnabled(false);
        jScrollPane2.setViewportView(jTADetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(102, 102, 102)
                                        .addComponent(jTCaloria))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jRadioBEstado)
                                            .addComponent(jTNombre2)
                                            .addComponent(jCBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel6)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCaloria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioBEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jLabel6)
                    .addContainerGap(537, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String nombre = jTNombre2.getText();
        comida = comidaData.buscarComidaPorNombre(nombre);
        if (comida != null) {
            jTCaloria.setText(String.valueOf(comida.getCaloriasPorcion()));
        } else {
            JOptionPane.showMessageDialog(this, "Comida no encontrada");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if(comida != null){
            comidaData.eliminarComida(comida.getIdComida());
            comida = null;
            jTCaloria.setText("");
            jTADetalle.setText("");
            cargarTabla();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String nombre = jTNombre2.getText().trim();
        int calorias = Integer.parseInt(jTCaloria.getText());
        String detalle = jTADetalle.getText().trim();
        Boolean estado = jRadioBEstado.isSelected();
        if(comida == null){
           comida = new Comida();
           comidaData.guardarComida(comida);
        }else{
            comida.setNombre(nombre);
            comida.setCaloriasPorcion(calorias);
            comidaData.modificarComida(comida);
            cargarTabla();

        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTNombre2.setText("");
        jTCaloria.setText("");
        jTADetalle.setText("");
        jRadioBEstado.setSelected(false);
        jTADetalle.setText("");
        comida = null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jRadioBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBEstadoActionPerformed
       
    }//GEN-LAST:event_jRadioBEstadoActionPerformed

    private void jCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoActionPerformed

        TipoComida tipoComidaSeleccionada = (TipoComida) jCBTipo.getSelectedItem();
        if (tipoComidaSeleccionada != null) {
            ArrayList<Comida> listaComidas = (ArrayList<Comida>) comidaData.listarComidas();
            borrarFilasTabla();
            for (Comida comida : listaComidas) {
                if (comida.getTipoComida() == tipoComidaSeleccionada) {

                    modelo.addRow(new Object[]{
                        comida.getNombre(),
                        comida.getTipoComida(),
                        comida.getCaloriasPorcion(),
                        comida.getEstado(),
                        comida.getDetalle()
                    });
                }
            }
        }
    }//GEN-LAST:event_jCBTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<TipoComida> jCBTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTADetalle;
    private javax.swing.JTextField jTCaloria;
    private javax.swing.JTextField jTNombre2;
    private javax.swing.JTable jTableComida;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
       ArrayList<Object> filaCabecera = new ArrayList<>();
       filaCabecera.add("Nombre");
       filaCabecera.add("Tipo de comida");
       filaCabecera.add("Calorias");
       filaCabecera.add("Estado");
       filaCabecera.add("Detalles");
       filaCabecera.forEach(elem -> modelo.addColumn(elem));
       jTableComida.setModel(modelo);
  }
    public void cargarTabla() {
        ArrayList<Comida> comidas;
        comidas = (ArrayList<Comida>) comidaData.listarComidas();
        modelo.setRowCount(0);
        for (Comida ing : comidas) {
            modelo.addRow(new Object[]{ing.getNombre(),
                                       ing.getTipoComida(),
                                       ing.getCaloriasPorcion(),
                                       ing.getEstado(),
                                       ing.getDetalle()});
        }
    }
    private void borrarFilasTabla(){
        int  indice = modelo.getRowCount() -1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void cargarTiposComidas(){
        for (TipoComida tipo : TipoComida.values()) {
        jCBTipo.addItem(tipo);
    }
}
}

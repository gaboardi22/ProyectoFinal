/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.RenglonMenu;
import org.mariadb.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel
 */

public class RenglonMenuData {

    private Connection con = null;

    public RenglonMenuData() {
        con = Conexion.getConexion();
    }

    public void agregarRenglonMenu(RenglonMenu renglon) {
        String sql = "INSERT INTO renglones_menu(id_menu_diario, id_comida, cantidad_gramos, subtotal_calorias) "
                + "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, renglon.getMenu_diario().getId_menu_diario());
            ps.setInt(2, renglon.getComida().getId_comida());
            ps.setInt(3, renglon.getCantidad_gramos());
            ps.setInt(4, renglon.getSubtotal_calorias());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Renglon guardado correctamente");
                renglon.setId_renglon(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }

    }
}

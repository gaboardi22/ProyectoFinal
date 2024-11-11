/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.MenuDiario;
import org.mariadb.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel
 */
public class MenuDiarioData {

    private Connection con = null;

    public MenuDiarioData() {
        con = Conexion.getConexion();
    }

    public void guardarMenuDiario(MenuDiario menu) {
        String sql = "INSERT INTO menus_diarios (dia, calorias_totales, id_dieta) "
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getDia());
            ps.setInt(2, menu.getCalorias());
            ps.setInt(3, menu.getDieta().getId_dieta());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Menu diario guardado");
                menu.setId_menu_diario(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }

    }

    public void modificarMenuDiario(MenuDiario menu) {
        String sql = "UPDATE menus_diarios SET dia = ?, calorias_totales = ?, id_dieta = ? "
                + "WHERE id_menu_diario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menu.getDia());
            ps.setInt(2, menu.getCalorias());
            ps.setInt(3, menu.getDieta().getId_dieta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menu diario modificado");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }

    }
}

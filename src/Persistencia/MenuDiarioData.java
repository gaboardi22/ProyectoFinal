/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.MenuDiario;
import org.mariadb.jdbc.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        if (contarMenusDiarios(menu.getDieta().getId_dieta()) < 7) {
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
        } else {
            JOptionPane.showMessageDialog(null, "Límite de menús diarios alcanzado (7)");
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

    public List<MenuDiario> listarMenusDiarios() {
        ArrayList<MenuDiario> lista = new ArrayList<>();
        DietaData dd = new DietaData();
        String sql = "SELECT * FROM menus_diarios WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setId_menu_diario(rs.getInt("id_menu_diario"));
                menu.setDia(rs.getInt("dia"));
                menu.setCalorias(rs.getInt("calorias_totales"));
                menu.setDieta(dd.buscarDietaPorID(rs.getInt("id_dieta")));
                lista.add(menu);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }

        return lista;
    }

    public MenuDiario buscarMenuPorID(int id) {
        MenuDiario menu = null;
        DietaData dd = new DietaData();
        String sql = "SELECT * FROM menus_diarios WHERE id_menu_diario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                menu = new MenuDiario();
                menu.setId_menu_diario(rs.getInt("id_menu_diario"));
                menu.setDia(rs.getInt("dia"));
                menu.setDieta(dd.buscarDietaPorID(rs.getInt("id_dieta")));
                menu.setCalorias(rs.getInt("calorias_totales"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }
        return menu;
    }

    public int contarMenusDiarios(int idDieta) {
        String sql = "SELECT COUNT(*) FROM menus_diarios WHERE id_dieta = ?";
        int num = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                num = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }
        return num;
    }

    public List<MenuDiario> listarMenusDiariosPorDieta(int id) {
        ArrayList<MenuDiario> lista = new ArrayList<>();
        DietaData dd = new DietaData();
        String sql = "SELECT * FROM menus_diarios WHERE id_dieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setId_menu_diario(rs.getInt("id_menu_diario"));
                menu.setDia(rs.getInt("dia"));
                menu.setCalorias(rs.getInt("calorias_totales"));
                menu.setDieta(dd.buscarDietaPorID(rs.getInt("id_dieta")));
                lista.add(menu);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'menu_diario'");
        }

        return lista;
    }
}

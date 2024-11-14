/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.RenglonMenu;
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
public class RenglonMenuData {

    private Connection con = null;

    public RenglonMenuData() {
        con = Conexion.getConexion();
    }

    public void guardarRenglonMenu(RenglonMenu renglon) {
        if (contarRenglonesMenu(renglon.getMenu_diario().getId_menu_diario()) < 5) {
            if (!existeComida(renglon.getMenu_diario().getId_menu_diario(), renglon.getComida().getTipo())) {
                String sql = "INSERT INTO renglones_menu(id_menu_diario, id_comida, cantidad_gramos, subtotal_calorias) VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setInt(1, renglon.getMenu_diario().getId_menu_diario());
                    ps.setInt(2, renglon.getComida().getId_comida());
                    ps.setInt(3, renglon.getCantidad_gramos());
                    ps.setInt(4, renglon.getSubtotal_calorias());
                    ps.executeUpdate();
                    try (ResultSet rs = ps.getGeneratedKeys()) {
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "Renglón guardado");
                            renglon.setId_renglon(rs.getInt(1));
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de comida ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Límite de renglones alcanzado (5)");
        }
    }

    public void modificarRenglonMenu(RenglonMenu renglon) {
        String sql = "UPDATE renglones_menu SET id_menu_diario = ?,id_comida = ?, cantidad_gramos = ?, subtotal_calorias = ? "
                + "WHERE id_renglon = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, renglon.getMenu_diario().getId_menu_diario());
            ps.setInt(2, renglon.getComida().getId_comida());
            ps.setInt(3, renglon.getCantidad_gramos());
            ps.setInt(4, renglon.getSubtotal_calorias());
            ps.setInt(5, renglon.getId_renglon());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Renglon modificado");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }

    }

    public RenglonMenu buscarRenglonPorID(int id) {
        RenglonMenu renglon = null;
        MenuDiarioData mdd = new MenuDiarioData();
        ComidaData cd = new ComidaData();
        String sql = "SELECT * FROM renglones_menu WHERE id_renglon = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                renglon = new RenglonMenu();
                renglon.setId_renglon(rs.getInt("id_renglon"));
                renglon.setMenu_diario(mdd.buscarMenuPorID(id));
                renglon.setComida(cd.buscarComidaPorID(rs.getInt("id_comida")));
                renglon.setCantidad_gramos(rs.getInt("cantidad_gramos"));
                renglon.setSubtotal_calorias(rs.getInt("subtotal_calorias"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }
        return renglon;
    }

    public List<RenglonMenu> listarRenglonMenu(int id) {
        ArrayList<RenglonMenu> lista = new ArrayList();
        ComidaData cd = new ComidaData();
        MenuDiarioData mdd = new MenuDiarioData();
        String sql = "SELECT * FROM renglones_menu WHERE id_menu_diario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RenglonMenu renglon = new RenglonMenu();
                renglon.setId_renglon(rs.getInt("id_renglon"));
                renglon.setMenu_diario(mdd.buscarMenuPorID(rs.getInt("id_menu_diario")));
                renglon.setComida(cd.buscarComidaPorID(rs.getInt("id_comida")));
                renglon.setCantidad_gramos(rs.getInt("cantidad_gramos"));
                renglon.setSubtotal_calorias(rs.getInt("subtotal_calorias"));

                lista.add(renglon);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }
        return lista;
    }

    public int contarRenglonesMenu(int idMenuDiario) {
        String sql = "SELECT COUNT(*) FROM renglones_menu WHERE id_menu_diario = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMenuDiario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }
        return 0;
    }

    public boolean existeComida(int idMenuDiario, String tipoComida) {
        String sql = "SELECT COUNT(*) FROM renglones_menu rm JOIN comidas c ON rm.id_comida = c.id_comida WHERE rm.id_menu_diario = ? AND c.tipo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMenuDiario);
            ps.setString(2, tipoComida);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'renglones_menu'");
        }
        return false;
    }
}

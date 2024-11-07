/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Comida;
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
public class ComidaData {

    private Connection con = null;

    public ComidaData() {
        con = Conexion.getConexion();
    }

    public void guardarComida(Comida comida) {
        String sql = "INSERT INTO comidas (nombre, calorias_por_100g, tipo, detalle) "
                + "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setInt(2, comida.getCalorias_por_100g());
            ps.setString(3, comida.getTipo());
            ps.setString(4, comida.getDetalle());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comida.setId_comida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'comidas'");
        }
    }

    public void modificarComida(Comida comida) {
        String sql = "UPDATE comidas SET nombre = ?, calorias_por_100g = ?, tipo = ?, detalle = ? "
                + "WHERE id_comida = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setInt(2, comida.getCalorias_por_100g());
            ps.setString(3, comida.getTipo());
            ps.setString(4, comida.getDetalle());
            ps.setInt(5, comida.getId_comida());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comida modificada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'comidas'");
        }
    }

    public Comida buscarComidaPorNombre(String nombre) {
        Comida comida = null;
        String sql = "SELECT * FROM comidas "
                + "WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setCalorias_por_100g(rs.getInt("calorias_por_100g"));
                comida.setTipo(rs.getString("tipo"));
                comida.setDetalle(rs.getString("detalle"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comida;
    }

    public List<Comida> filtrarPorIngrediente(String ingrediente) {
        String sql = "SELECT * FROM comidas WHERE detalle LIKE ?";
        List<Comida> comidas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + ingrediente + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setCalorias_por_100g(rs.getInt("calorias_por_100g"));
                comida.setTipo(rs.getString("tipo"));
                comida.setDetalle(rs.getString("detalle"));
                comidas.add(comida);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'comidas'");
        }
        return comidas;
    }

    public List<Comida> filtraPorCalorias100(int calorias) {
        String sql = "SELECT * FROM comidas WHERE calorias_por_100g = ?";
        List<Comida> comidas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, calorias);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setCalorias_por_100g(rs.getInt("calorias_por_100g"));
                comida.setTipo(rs.getString("tipo"));
                comida.setDetalle(rs.getString("detalle"));
                comidas.add(comida);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'comidas'");
        }
        return comidas;
    }
}

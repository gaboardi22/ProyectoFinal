/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import org.mariadb.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entidades.Dieta;

/**
 *
 * @author Ezequiel
 */
public class DietaData {

    private Connection con = null;

    public DietaData() {
        con = Conexion.getConexion();
    }

    public void guardarDieta(Dieta dieta) {
        String sql = "INSERT INTO dietas (nombre, fecha_inicio, fecha_fin, id_paciente, peso_inicial, peso_final, calorias_totales) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFecha_inicio()));
            ps.setDate(3, Date.valueOf(dieta.getFecha_fin()));
            ps.setInt(4, dieta.getPaciente().getId_paciente());
            ps.setFloat(5, dieta.getPeso_inicial());
            ps.setFloat(6, dieta.getPeso_final());
            ps.setInt(7, dieta.getCalorias_totales());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Dieta guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
    }

    public void modificarDieta(Dieta dieta) {
        String sql = "UPDATE dietas SET nombre = ?, fecha_inicio = ?, fecha_fin = ?, id_paciente = ?, peso_inicial = ?, peso_final = ?, calorias_totales = ? "
                + "WHERE id_dieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFecha_inicio()));
            ps.setDate(3, Date.valueOf(dieta.getFecha_fin()));
            ps.setInt(4, dieta.getPaciente().getId_paciente());
            ps.setFloat(5, dieta.getPeso_inicial());
            ps.setFloat(6, dieta.getPeso_final());
            ps.setInt(7, dieta.getCalorias_totales());
            ps.setInt(8, dieta.getId_dieta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dieta modificada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
    }

    public void cargarPesoYFinalizar(Dieta dieta, float peso) {
        String slq = "UPDATE INTO dietas SET peso_final = ? "
                + "WHERE id_dieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(slq);
            ps.setFloat(1, peso);
            ps.setInt(2, dieta.getId_dieta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dieta modificada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
    }

    public void imprimirDietaCompleta() {

    }

    public int calcularDiferDePeso() {
        int peso = 0;
        return peso;
    }
}

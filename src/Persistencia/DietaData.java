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
import Entidades.Paciente;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO dietas (nombre, fecha_inicio, fecha_fin, id_paciente, peso_inicial, peso_final, calorias_totales,estado) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, true)";
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
        String slq = "UPDATE INTO dietas SET peso_final = ?, estado = false "
                + "WHERE id_dieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(slq);
            ps.setFloat(1, peso);
            ps.setInt(2, dieta.getId_dieta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dieta finalizada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
    }

    public Dieta buscarDieta(Paciente paciente) {
        Dieta dieta = null;
        String sql = "SELECT * FROM dietas WHERE id_paciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getId_paciente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                dieta.setFecha_fin(rs.getDate("fecha_fin").toLocalDate());
                dieta.setPaciente(paciente);
                dieta.setPeso_inicial(rs.getFloat("peso_inicial"));
                dieta.setPeso_final(rs.getFloat("peso_final"));
                dieta.setCalorias_totales(rs.getInt("calorias_totales"));
//                dieta.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
        return dieta;
    }

    public List<Dieta> listarDietas() {
        ArrayList<Dieta> lista = new ArrayList<>();
        PacienteData pd = new PacienteData();
        String sql = "SELECT * FROM dietas WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                dieta.setFecha_fin(rs.getDate("fecha_fin").toLocalDate());
                dieta.setPaciente(pd.buscarPacientePorID(rs.getInt("id_paciente")));
                dieta.setPeso_inicial(rs.getFloat("peso_inicial"));
                dieta.setPeso_final(rs.getFloat("peso_final"));
                dieta.setCalorias_totales(rs.getInt("calorias_totales"));
                lista.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
        return lista;
    }

    public Dieta buscarDietaPorID(int id) {
        Dieta dieta = null;
        PacienteData pd = new PacienteData();
        String sql = "SELECT * FROM dietas WHERE id_paciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                Date fechaFin = rs.getDate("fecha_fin");
                if (fechaFin != null) {
                    dieta.setFecha_fin(fechaFin.toLocalDate());
                } else {
                    dieta.setFecha_fin(null);
                }
                dieta.setPaciente(pd.buscarPacientePorID(rs.getInt("id_paciente")));
                dieta.setPeso_inicial(rs.getFloat("peso_inicial"));
                dieta.setPeso_final(rs.getFloat("peso_final"));
                dieta.setCalorias_totales(rs.getInt("calorias_totales"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'dietas'");
        }
        return dieta;
    }
}

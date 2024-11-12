/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Paciente;
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
public class PacienteData {

    private Connection con = null;

    public PacienteData() {
        con = Conexion.getConexion();
    }

    public void guardarPaciente(Paciente paciente) {
        String sql = "INSERT INTO pacientes (nombre, edad, altura, peso_actual, peso_buscado, estado) "
                + "VALUES (?, ?, ? ,? ,?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setFloat(3, paciente.getAltura());
            ps.setFloat(4, paciente.getPeso_actual());
            ps.setFloat(5, paciente.getPeso_buscado());
            ps.setBoolean(6, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setId_paciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE pacientes SET nombre = ?, edad = ?, altura = ?, peso_actual= ?, peso_buscado = ? "
                + "WHERE id_paciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setFloat(3, paciente.getAltura());
            ps.setFloat(4, paciente.getPeso_actual());
            ps.setFloat(5, paciente.getPeso_buscado());
            ps.setInt(6, paciente.getId_paciente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente modificado");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }
    }

    public Paciente buscarPaciente(String nombre) {
        Paciente paciente = null;
        String sql = "SELECT * FROM pacientes "
                + "WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getFloat("altura"));
                paciente.setPeso_actual(rs.getFloat("peso_actual"));
                paciente.setPeso_buscado(rs.getFloat("peso_buscado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }
        return paciente;
    }

    public void bajaLogicaPaciente(Paciente paciente) {
        String sql = "UPDATE INTO pacientes SET estado = false "
                + "WHERE id_paciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getId_paciente());
            JOptionPane.showMessageDialog(null, "Paciente dado de baja");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }
    }

    public void altaLogicaPaciente(Paciente paciente) {
        String sql = "UPDATE INTO pacientes SET estado = true "
                + "WHERE id_paciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getId_paciente());
            JOptionPane.showMessageDialog(null, "Paciente dado de alta");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }
    }

    public List<Paciente> listarLosQueLLegaron() {
        ArrayList<Paciente> lista = new ArrayList<>();
        String sql = "SELECT p.* "
                + "FROM pacientes p "
                + "JOIN dieta d ON p.id_paciente = d.id_paciente "
                + "WHERE p.peso_actual < p.peso_buscado AND d.estado = FALSE";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getFloat("altura"));
                paciente.setPeso_actual(rs.getFloat("peso_actual"));
                paciente.setPeso_buscado(rs.getFloat("peso_buscado"));
                lista.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pacientes'");
        }

        return lista;
    }
}

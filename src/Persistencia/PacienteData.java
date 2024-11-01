/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Paciente;
import org.mariadb.jdbc.Connection;
import java.sql.*;
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
        String sql = "INSERT INTO pacientes (nombre, edad, altura, peso_actual, peso_buscado) "
                + "VALUES (?, ?, ? ,? ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setFloat(3, paciente.getAltura());
            ps.setFloat(4, paciente.getPeso_actual());
            ps.setFloat(5, paciente.getPeso_buscado());
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
}

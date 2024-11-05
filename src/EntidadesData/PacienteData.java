
package EntidadesData;

import Entidades.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Grupo 3
 */
public class PacienteData {
    
    private Connection conn  = null;

    public PacienteData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarPaciente(Paciente paciente){
      
            String sql = "INSERT INTO paciente (dni, nombre, edad, altura, peso_actual, peso_esperado, estado)"
                       + " VALUES (?, ?, ?, ?, ?, ?, ?)";
              try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setInt(3, paciente.getEdad());
            ps.setDouble(4, paciente.getAltura());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setDouble(6, paciente.getPesoEsperado());
            ps.setBoolean(7, paciente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "paciente guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }
    }
    
    public void modificarPaciente(Paciente paciente){
        String sql = "UPDATE paciente SET dni = ?, nombre = ?, edad = ?, altura = ?, peso_actual = ?, peso_esperado  = ?, estado = ?"
                + " WHERE id_paciente = ? ";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setInt(3, paciente.getEdad());
            ps.setDouble(4, paciente.getAltura());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setDouble(6, paciente.getPesoEsperado());
            ps.setBoolean(7, paciente.isEstado());
            ps.setInt(8, paciente.getIdPaciente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "paciente modificado con exito");
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }  
    }
    
    public  Paciente buscarPacientePorNombre(String nombre){
        Paciente paciente = null;
        String sql= "SELECT id_paciente, dni, nombre, edad, altura, peso_actual, peso_esperado, estado FROM paciente WHERE nombre = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs  = ps.executeQuery();
            if(rs.next()){
               paciente  = new Paciente();
               paciente.setIdPaciente(rs.getInt("id_paciente"));
               paciente.setDni(rs.getInt("dni"));
               paciente.setNombre(nombre);
               paciente.setEdad(rs.getInt("edad"));
               paciente.setAltura(rs.getDouble("altura"));
               paciente.setPesoActual(rs.getDouble("peso_actual"));
               paciente.setPesoEsperado(rs.getDouble("peso_esperado"));
               paciente.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }
        return paciente;
    }
    
    public void eliminarPaciente(int id){
        Paciente paciente = new Paciente();
        id  = paciente.getIdPaciente();
        String sql = " UPDATE paciente SET estado = 0 WHERE id_paciente = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
             if(exito == 1){
               JOptionPane.showMessageDialog(null, "paciente eliminado con exito");
           }
             ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }  
    }
    public List<Paciente>listarPacientes(){
        String sql= "SELECT dni, nombre, edad, altura, peso_actual, peso_esperado FROM paciente WHERE estado = 1";
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("peso_actual"));
                paciente.setPesoEsperado(rs.getDouble("peso_esperado"));
                paciente.setEstado(true);
                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }
        return pacientes;   
    } 
    
    public List<Paciente>listarPacientesQueLlegaron(){
        String sql= "SELECT * FROM paciente WHERE peso_actual = peso_esperado";
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("peso_actual"));
                paciente.setPesoEsperado(rs.getDouble("peso_esperado"));
                paciente.setEstado(true);
                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla paciente");
        }
        return pacientes;   
    } 
}

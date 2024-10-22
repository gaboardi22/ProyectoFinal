
package EntidadesData;

import Entidades.Paciente;
import java.sql.*;
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
    
    public void guardarPaciente( Paciente paciente){
      
            String sql = "INSERT INTO paciente (nombre, edad, altura, peso_actual, peso_esperado) VALUES (?, ?, ?, ?, ?)";
              try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoEsperado());
             ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "paciente guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla nutricionista");
        }
    }
    
    public void modificarPaciente(Paciente paciente){
        String sql = "UPDATE paciente SET nombre = ?, edad = ?, altura = ?, peso_actual = ?, peso_esperado  = ? WHERE id_paciente = ? ";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoEsperado());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla nutricionista");
        }
    }
    
}

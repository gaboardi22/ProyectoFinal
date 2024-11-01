
package EntidadesData;

import Entidades.Dieta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author Grupo 3
 */
public class DietaData {
    private Connection conn  = null;

    public DietaData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarDieta(Dieta dieta){
        String sql  = " INSERT INTO dieta( nombre, fecha_inicio, fecha_fin, estado, id_paciente)"
                    + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombreDieta());
             ps.setDate(2, java.sql.Date.valueOf(dieta.getFechaFin()));
             ps.setDate(3, java.sql.Date.valueOf(dieta.getFechaIncio()));
             
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
    }
}

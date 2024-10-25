
package EntidadesData;

import Entidades.Ingrediente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author Grupo 3
 */
public class IngredienteData {
    
    private Connection conn  = null;

    public IngredienteData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarIngrediente(Ingrediente ingrediente) {
        String sql = "INSERT INTO ingrediente (nombre, calorias) VALUES (?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ingrediente.getNombre());
            ps.setInt(2, ingrediente.getCalorias());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                    JOptionPane.showMessageDialog(null, "ingrediente guardado");
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingrediente");
        }
    }
}


package EntidadesData;

import Entidades.Menu;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Grupo 3
 */
public class menuData {
    private Connection conn  = null;

    public menuData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarMenu(Menu menu){
        String sql = "INSERT INTO menu(dia_numero, estado, id_renglonMenu) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla menu");
        }
         
    }
    
}

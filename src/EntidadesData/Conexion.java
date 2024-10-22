
package EntidadesData;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;


/**
 *
 * @author Grupo 3
 */
public class Conexion {
    private static final String URL  = "jdbc:mariadb://localhost:3306/";
    private static final String DB  = "nutricionista";
    private static final String USUARIO  = "root";
    private static final String PASSWORD  = "";
    private static Connection connection;

    public Conexion() {
    }
    
      public static Connection getConexion(){
        if(connection == null || connection.isClosed()){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al conectarse a la base de datos");
            }
        }
          return connection;
    }
}

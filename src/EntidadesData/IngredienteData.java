
package EntidadesData;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author Grupo 3
 */
public class IngredienteData {
    
    private Connection conn  =null;

    public IngredienteData() {
        conn = Conexion.getConexion();
    }
    
    
}

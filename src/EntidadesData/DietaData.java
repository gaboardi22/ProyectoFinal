
package EntidadesData;

import Entidades.Comida;
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
    
    public void guardarDieta(Comida comida){
        
    }
}


package EntidadesData;

import Entidades.Comida;
import java.sql.*;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author Ezequiel
 */
public class ComidaData {

    private Connection conn = null;

    public ComidaData() {
        conn = Conexion.getConexion();
    }

    public void guardarComida(Comida comida) {
        String sql = "INSERT INTO comida(nombre, tipo_comida, calorias_x_100g, detalle, baja) VALUES "
                + "(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipoComida());
            ps.setInt(3, comida.getCaloriasPorcion());
            ps.setString(4, comida.getDetalle());
            ps.setBoolean(5, comida.getBaja());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "comida guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
    }
        public void modificarComida(Comida comida){
        String sql = "UPDATE comida SET nombre = ?, tipo_comida = ?, calorias_x_100g = ?, detalle = ?, baja  = ? WHERE id_comida = ? ";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipoComida());
            ps.setInt(3, comida.getCaloriasPorcion());
            ps.setString(4, comida.getDetalle());
            ps.setBoolean(5, comida.getBaja());
            ps.setInt(6, comida.getIdComida());
            int exito = ps.executeUpdate();
            if(exito == 1){
               JOptionPane.showMessageDialog(null, "comida modificada con exito");
           }
           ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }  
    }
}

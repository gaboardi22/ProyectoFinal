
package EntidadesData;

import Entidades.Ingrediente;
import Entidades.IngredienteComida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author grupo 3
 */
public class IngredienteComidaData {
    private Connection conn  = null;

    public IngredienteComidaData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarIngredienteComida(IngredienteComida ingredienteComida){
        String sql  ="INSERT INTO ingredientecomida ( id_comida, id_ingrediente) "
                    + "VALUES (?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for(Ingrediente ing : ingredienteComida.getListaIngredientes()){
                ps.setInt(1, ingredienteComida.getComida().getIdComida());
                ps.setInt(2, ing.getId_ingrediente());
                ps.executeUpdate();
            }
           ps.close();
           JOptionPane.showMessageDialog(null, "Ingredientes añadidos a la comida correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingredienteComida");
        }
    }
    
    public void elimianrIngredienteComida(int idComida, int idIngrediente){
        String sql = "DELETE from ingredienteComida WHERE id_comida = ? AND  id_ingrediente = ?  ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idComida);
            ps.setInt(2, idIngrediente);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "ingrediente eliminado de la comida  con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingredienteComida");
        }
    }
    
    public List<Ingrediente> listarIngredientesPorComida(int idComida){
         List<Ingrediente> ingredientes = new ArrayList<>();
         String sql = "SELECT i.id_ingrediente, i.nombre, i.calorias FROM ingrediente i "
                   + "JOIN ingredientecomida ic ON i.id_ingrediente = ic.id_ingrediente "
                   + "WHERE ic.id_comida = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
          while (rs.next()) {
                Ingrediente ingrediente = new Ingrediente();
               
                ingrediente.setId_ingrediente(rs.getInt("id_ingrediente"));
                ingrediente.setNombre(rs.getString("nombre"));
                ingrediente.setCalorias(rs.getInt("calorias"));
                
                ingredientes.add(ingrediente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingredienteComida");
        }
         return ingredientes;
    }
}

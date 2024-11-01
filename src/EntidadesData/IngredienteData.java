
package EntidadesData;

import Entidades.Ingrediente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    
    public void modificarIngrediente(Ingrediente ingrediente){
        String sql  = "UPDATE ingrediente SET  nombre = ?, calorias = ? WHERE id_ingrediente = ? ";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ingrediente.getNombre());
            ps.setInt(2, ingrediente.getCalorias());
            ps.setInt(3, ingrediente.getId_ingrediente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "ingrediente modificado con exito");
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingrediente");
        }
    }
    
    public Ingrediente buscarIngredientePorNombre(String nombre){
        Ingrediente ingrediente  = null;
        String sql  = "SELECT id_ingrediente, nombre, calorias FROM ingrediente WHERE nombre  = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, nombre);
            ResultSet rs  = ps.executeQuery();
            if(rs.next()){
                ingrediente = new Ingrediente();
                ingrediente.setId_ingrediente(rs.getInt("id_ingrediente"));
                ingrediente.setNombre(nombre);
                ingrediente.setCalorias(rs.getInt("calorias"));
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingrediente");
        } 
        return ingrediente;
    }
    
    public void eliminarIngrediente(int id){
        String sql = "DELETE FROM ingrediente WHERE id_ingrediente = ?";
          try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
             if(exito == 1){
               JOptionPane.showMessageDialog(null, "ingrediente eliminado con exito");
           }
             ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingrediente");
        }  
    }

    public List<Ingrediente> listarIngredientes() {
        String sql = "SELECT id_ingrediente, nombre, calorias FROM ingrediente;";
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);;
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
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingrediente");
        }
        return ingredientes;
    }
}

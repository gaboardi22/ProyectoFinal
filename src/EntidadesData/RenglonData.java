
package EntidadesData;

import Entidades.Renglon;
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
 * @author Grupo 3
 */
public class RenglonData {
       private Connection conn  = null;

    public RenglonData() {
        conn = Conexion.getConexion();
    }
    
    public void guardarRenglon(Renglon renglon) {
        String sql = "INSERT INTO renglonmenu(cantidad_gramos, subtotalCalorias, id_comida)"
                   + " VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, renglon.getCantidadGramos());
            ps.setInt(2, renglon.getSubTotalCalorias());
            ps.setInt(3, renglon.getComida().getIdComida());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "renglon guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla rengloncomida");
        }
    }
    
    public void eliminarRenglon(int id){
        String sql = "DELETE FROM `renglonmenu` WHERE id_rengloncomida = ?";
            try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
             if(exito == 1){
               JOptionPane.showMessageDialog(null, "renglon eliminado con exito");
           }
             ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingredientecomida");
        }
    }
       
      public List<Renglon> listarRenglones(){
          ArrayList<Renglon> renglones = new ArrayList<>();
          String sql = "SELECT id_renglon, cantidad_gramos, subtotalCalorias, id_comida FROM renglonmenu";
           try {
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.executeQuery();
                ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Renglon renglon = new Renglon();
                renglon.setIdRenglon(rs.getInt("id_renglon")); 
                renglon.setCantidadGramos(rs.getInt("cantidad_gramos"));
                renglon.setSubTotalCalorias(rs.getInt("subtotalCalorias"));
                renglones.add(renglon);
            }
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "error al acceder a la tabla ingredientecomida");
           }
          return renglones;
      } 
}

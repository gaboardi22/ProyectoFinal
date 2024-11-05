
package EntidadesData;

import Entidades.Comida;
import Entidades.TipoComida;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String sql = " INSERT INTO comida(nombre, tipoComida, calorias_x_100g, detalle, estado)"
                   + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipoComida().name());
            ps.setInt(3, comida.getCaloriasPorcion());
            ps.setString(4, comida.getDetalle());
            ps.setBoolean(5, comida.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "comida guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
    }
    
    public void modificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre = ?, tipoComida = ?, calorias_x_100g = ?, detalle = ?, estado = ? WHERE id_comida = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipoComida().name());
            ps.setInt(3, comida.getCaloriasPorcion());
            ps.setString(4, comida.getDetalle());
            ps.setBoolean(5, comida.getEstado());
            ps.setInt(6, comida.getIdComida());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "comida modificada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
    }

    public Comida buscarComidaPorNombre(String nombre) {
        Comida comida = null;
        String sql = "SELECT id_comida, nombre, tipoComida, calorias_x_100g, detalle, estado FROM comida WHERE nombre  = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                comida  = new Comida();
                comida.setIdComida(rs.getInt("id_comida"));
                comida.setNombre(nombre);
                 comida.setTipoComida(TipoComida.valueOf(rs.getString("tipoComida").toUpperCase()));
                comida.setCaloriasPorcion(rs.getInt("calorias_x_100g"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
        return comida;
    }
    
    public void eliminarComida(int id){
        String sql = "UPDATE comida SET estado = 0 WHERE id_comida = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
             if(exito == 1){
               JOptionPane.showMessageDialog(null, "comida eliminada con exito");
           }
             ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }  
    }
    
    public List<Comida> listarComidas(){
        String sql = "SELECT nombre, tipoComida, calorias_x_100g, detalle, estado FROM comida WHERE estado = 1";
        ArrayList<Comida> comidas = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Comida comida = new Comida();
                comida.setNombre(rs.getString("nombre"));
                 comida.setTipoComida(TipoComida.valueOf(rs.getString("tipoComida").toUpperCase()));
                comida.setCaloriasPorcion(rs.getInt("calorias_x_100g"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setEstado(rs.getBoolean("estado"));
                comidas.add(comida);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla comida");
        }
        return comidas;
    }
    
    public List<Comida> listarComidaXPorcion(int porcion){
        ArrayList<Comida>comidas = new ArrayList<>();
    String sql = "SELECT * FROM comida WHERE calorias_x_100g = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, porcion);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Comida comida = new Comida();
                comida.setNombre(rs.getString("nombre"));
                 comida.setTipoComida(TipoComida.valueOf(rs.getString("tipoComida").toUpperCase()));
                comida.setCaloriasPorcion(rs.getInt("calorias_x_100g"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setEstado(rs.getBoolean("estado"));
                comidas.add(comida);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comidas;
    }
}

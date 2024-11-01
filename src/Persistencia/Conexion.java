/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author Ezequiel
 */
public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/nutricionista";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    public Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al conectarse a la base de datos");
            }
        }
        return connection;
    }
}

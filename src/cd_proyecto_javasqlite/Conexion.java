package cd_proyecto_javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    static Connection con = null;
    static Statement s = null;
    static ResultSet rs = null;

    public static Connection conectar() {
        boolean conectado = false;
        try {
            //Cargar Driver
            Class.forName("org.sqlite.JDBC");
            //Conectar a la base de datos SQLite
            con = DriverManager.getConnection("jdbc:sqlite:alumnos.db");
            //Confirmamos conexion
            System.out.println("Conexión establecida con el servidor.");
            conectado = true;
            System.out.println(conectado);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR DE CONEXION ---> " + ex);
            System.out.println(conectado);
        }
        return con;
    }
}

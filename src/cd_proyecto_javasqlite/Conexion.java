package cd_proyecto_javasqlite;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aperezcesar
 */
public class Conexion {

    static Connection con = null;
    static Statement s = null;
    static ResultSet rs = null;

    /**
     * Método conectar, mediante el cual establecemos la conexión que servirá de
     * enlace entre la base de datos y nuestro programa. Si la conexión ha sido
     * un éxito, saltará un mensaje conforme se ha establecido la conexión y un
     * "true", de lo contrario, saltará la excepción con un mensaje de error y
     * un "false"
     *
     * @return con
     */
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

    /**
     * Método para crear una nueva base de datos, introduciendo el nombre de esta
     * 
     * @param nombreBD
     */
    public static void crearNuevaBD(String nombreBD) {
        String url = "jdbc:sqlite:" + nombreBD;
        
        try (Connection con = DriverManager.getConnection(url)) {
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("El nombre del driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva base de datos.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Método estático "crearNuevaTabla": establece un enlace con nuestra base
     * de datos y ejecuta la secuencia sql que le indiquemos para que cree una
     * tabla nueva con sus respectivos parámetros. Si surge un error durante la
     * conexión saltará una excepción con el mensaje de error.
     *
     */
    public static void crearNuevaTabla() {
        String url = "jdbc:sqlite:alumnos.db";

        String sql = "CREATE TABLE paises (\n"
                + " id_pais integer PRIMARY KEY, \n"
                + " nombre_pais text \n"
                + ");";

        String sql2 = "DROP TABLE IF EXISTS paises";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql2);
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

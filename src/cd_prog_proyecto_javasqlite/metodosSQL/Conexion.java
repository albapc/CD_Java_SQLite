package cd_prog_proyecto_javasqlite.metodosSQL;

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
     * Constructor por defecto
     */
    public Conexion() {

    }

    /**
     * Constructor para crear una nueva base de datos, introduciendo el nombre
     * de esta
     *
     * @param nombreBD nombre de la base de datos a crear
     */
    public Conexion(String nombreBD) {
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
     * Método desconectar, mediante el cual el usuario puede desconectarse de la
     * base de datos cada vez que se utilice. Devuelve un mensaje de
     * confirmación y "false" si la desconexión ha sido un éxito. Podría
     * incorporarse el cuerpo del método a cada consulta que se haga pero con
     * esta práctica se ahorra la repetición del código.
     */
    public static void desconectar() {
        boolean conectado;

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("ERROR ---> " + ex);
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (SQLException ex) {
                System.out.println("ERROR ---> " + ex);
            }
        }
        if (con != null) {
            try {
                con.close();
                conectado = false;
                System.out.println("Desconexión del servidor.");
                System.out.println(conectado);
            } catch (SQLException ex) {
                System.out.println("ERROR ---> " + ex);
            }
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

        String sql = "DROP TABLE IF EXISTS paises";

        String sql2 = "CREATE TABLE paises (\n"
                + " id_pais integer PRIMARY KEY, \n"
                + " nombre_pais text \n"
                + ");";

        String sql3 = "DROP TABLE IF EXISTS alumnos";

        String sql4 = "CREATE TABLE alumnos (\n"
                + " referencia integer PRIMARY KEY, \n"
                + " nombre text, \n"
                + " nota integer, \n"
                + " id_pais integer NOT NULL, \n"
                + " FOREIGN KEY (id_pais) \n"
                + " REFERENCES paises(id_pais) \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            stmt.execute(sql2);
            stmt.execute(sql3);
            stmt.execute(sql4);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

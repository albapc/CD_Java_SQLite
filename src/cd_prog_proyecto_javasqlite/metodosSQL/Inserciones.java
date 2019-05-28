package cd_prog_proyecto_javasqlite.metodosSQL;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author Alba
 */
public class Inserciones {

    /**
     * Método "insert": Como su nombre indica, el usuario puede insertar una
     * nueva fila en la tabla que se indique en la declaración SQL con sus
     * parámetros. En el caso de que la primary key (es decir, la referencia) ya
     * exista en la base de datos, saltará una excepción.
     *
     * @param referencia referencia del alumno
     * @param nombre nombre del alumno
     * @param nota nota del alumno
     * @param id_pais id del pais del alumno
     * @return filas numero de filas
     */
    public int insert(int referencia, String nombre, int nota, int id_pais) {
        int filas = 0;
        try {
            if(Conexion.con != null) {
                Conexion.con = Conexion.conectar();
            }
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            filas = Conexion.s.executeUpdate("INSERT INTO alumnos values (" + referencia + ",'" + nombre + "'," + nota + "," + id_pais + ")");
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("ERROR CLAVE REPETIDA ---> " + ex);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            Conexion.desconectar();
            
        }
        return filas;
    }
}


package cd_prog_proyecto_javasqlite.metodosSQL;

import java.sql.SQLException;

/**
 *
 * @author Alba
 */
public class Borrados {

    /**
     * Método "delete", en este caso el usuario únicamente tiene que introducir
     * la referencia del alumno que desee eliminar, esa referencia se almacena
     * en la variable "referencia", la cual se acopla a la declaración SQL que
     * se puede ver en el método.
     *
     * @param referencia referencia del alumno
     */
    public void delete(int referencia) {
        try {
            //Conectar con la base de datos
            Conexion.conectar();
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.s.executeUpdate("delete from alumnos where referencia=" + referencia);

        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            //Desconectar de la base de datos
            Conexion.desconectar();
        }
    }
}

package cd_prog_proyecto_javasqlite.metodosSQL;

import java.sql.SQLException;

/**
 *
 * @author Alba
 */
public class Actualizaciones {

    /**
     * En este método el usuario puede actualizar todas las filas de la tabla
     * que desee introduciendo la referencia del alumno y a continuación los
     * nuevos datos actualizados. En caso de error saltaría una excepción con el
     * mensaje de error. El método devuelve el número de filas que se actualizaron.
     *
     * @param nombre nombre del alumno
     * @param nota nota del alumno
     * @param referencia referencia del alumno
     * @param id_pais id del pais del alumno
     * @return filas numero de filas
     */
    public int updateAll(String nombre, int nota, int referencia, int id_pais) {
        int filas = 0;
        try {
            //Conectar con la base de datos
            if(Conexion.con != null) {
                Conexion.con = Conexion.conectar();
            }
//            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            filas = Conexion.s.executeUpdate("update alumnos set nombre='" + nombre + "',nota=" + nota
                    + ",id_pais=" + id_pais + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            //Desconectar de la base de datos
            Conexion.desconectar();
        }
        return filas;
    }

    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación el nuevo
     * nombre. En caso de error saltaría una excepción con el mensaje de error.
     * El método devuelve el número de filas que se actualizaron.
     *
     * @param nombre nombre del alumno
     * @param referencia referencia del alumno
     * @return filas número de filas
     */
    public int updateNombre(String nombre, int referencia) {
        int filas = 0;
        try {
            //Conectar con la base de datos
            if(Conexion.con != null) {
                Conexion.con = Conexion.conectar();
            }
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            filas = Conexion.s.executeUpdate("update alumnos set nombre='" + nombre + "' where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            //Desconectar de la base de datos
            Conexion.desconectar();
        }
        return filas;
    }

    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación la nueva
     * nota. En caso de error saltaría una excepción con el mensaje de error.
     * El método devuelve el número de filas que se actualizaron.
     *
     * @param nota nota del alumno
     * @param referencia referencia del alumno
     * @return filas número de filas
     */
    public int updateNota(int nota, int referencia) {
        int filas = 0;
        try {
            //Conectar con la base de datos
            if(Conexion.con != null) {
                Conexion.con = Conexion.conectar();
            }
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            filas = Conexion.s.executeUpdate("update alumnos set nota=" + nota + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            //Desconectar de la base de datos
            Conexion.desconectar();
        }
        return filas;
    }

    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación la nueva id
     * del pais. En caso de error saltaría una excepción con el mensaje de
     * error. El método devuelve el número de filas que se actualizaron.
     *
     * @param id_pais id del pais del alumno
     * @param referencia referencia del alumno
     * @return filas número de filas
     */
    public int updateId_Pais(int id_pais, int referencia) {
        int filas = 0;
        try {
            //Conectar con la base de datos
            if(Conexion.con != null) {
                Conexion.con = Conexion.conectar();
            }
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
           filas = Conexion.s.executeUpdate("update alumnos set id_pais=" + id_pais + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            //Desconectar de la base de datos
            Conexion.desconectar();
        }
        return filas;
    }
}


package cd_prog_proyecto_javasqlite.metodosSQL;

import java.sql.SQLException;

/**
 *
 * @author Alba
 */
public class Actualizaciones {
    
    /**
     * En este método el usuario puede actualizar todas las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación los nuevos
     * datos actualizados. En caso de error saltaría una excepción con el
     * mensaje de error.
     *
     * @param nombre: nombre del alumno
     * @param nota: nota del alumno
     * @param referencia: referencia del alumno
     * @param id_pais: id del pais del alumno
     */
    public void updateAll(String nombre, int nota, int referencia, int id_pais) {
        try {
//            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            Conexion.s.executeUpdate("update alumnos set nombre='" + nombre + "',nota=" + nota
                    + ",id_pais=" + id_pais + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }

    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación el nuevo
     * nombre. En caso de error saltaría una excepción con el mensaje de error.
     * 
     * @param nombre: nombre del alumno
     * @param referencia: referencia del alumno
     */
    public void updateNombre(String nombre, int referencia) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            Conexion.s.executeUpdate("update alumnos set nombre='" + nombre + "' where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }
    
    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación la nueva
     * nota. En caso de error saltaría una excepción con el mensaje de error.
     * 
     * @param nota: nota del alumno
     * @param referencia: referencia del alumno
     */
    public void updateNota(int nota, int referencia) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            Conexion.s.executeUpdate("update alumnos set nota=" + nota + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }
    
    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación la nueva
     * id del pais. En caso de error saltaría una excepción con el mensaje de error.
     * 
     * @param id_pais: id del pais del alumno
     * @param referencia: referencia del alumno
     */
    public void updateId_Pais(int id_pais, int referencia) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
//            //Ejecutar consulta
            Conexion.s.executeUpdate("update alumnos set id_pais='" + id_pais + " where referencia=" + referencia);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }
}

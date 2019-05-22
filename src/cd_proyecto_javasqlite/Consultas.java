package cd_proyecto_javasqlite;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

/**
 *
 * @author aperezcesar
 */
public class Consultas {

    /**
     * Método "select", que realiza una consulta de toda la tabla y almacena los
     * resultados en un ArrayList de tipo "Alumno". Este método devuelve dicho
     * array. De ocurrir algún error saltaría una excepción con un mensaje de
     * error.
     *
     * @return aux
     */
    public ArrayList select() {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos");
            while (Conexion.rs.next()) {
                aux.add(new Alumno(
                        Integer.parseInt(Conexion.rs.getString("referencia")),
                        Conexion.rs.getString("nombre"),
                        Integer.parseInt(Conexion.rs.getString("nota")),
                        Integer.parseInt(Conexion.rs.getString("id_pais"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
        return aux;
    }

    /**
     * Método "selectParameters", en este caso introducimos una referencia para
     * que el sistema busque dicho dato en toda la tabla y si encuentra la
     * referencia, que muestre la fila correspondiente con sus datos.
     *
     * @param referencia
     * @return aux
     */
    public ArrayList selectParameters(int referencia) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos where referencia=" + referencia);
            while (Conexion.rs.next()) { //mientras siga habiendo resultados...
                aux.add(new Alumno(
                        Integer.parseInt(Conexion.rs.getString("referencia")),
                        Conexion.rs.getString("nombre"),
                        Integer.parseInt(Conexion.rs.getString("nota")),
                        Integer.parseInt(Conexion.rs.getString("id_pais"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
        return aux;
    }

    /**
     * Método "insert": Como su nombre indica, el usuario puede insertar una
     * nueva fila en la tabla que se indique en la declaración SQL con sus
     * parámetros. En el caso de que la primary key (es decir, la referencia) ya
     * exista en la base de datos, saltará una excepción e instará al usuario a
     * introducir los parámetros de nuevo
     *
     * @param referencia
     * @param nombre
     * @param nota
     * @param id_pais
     */
    public void insert(int referencia, String nombre, int nota, int id_pais) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.s.executeUpdate("INSERT INTO alumnos values (" + referencia + ",'" + nombre + "'," + nota + "," + id_pais + ")");
            //Confirmacion
//            System.out.println("Inserción realizada");
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("ERROR CLAVE REPETIDA ---> " + ex);
            //En caso de que repitamos la primary key volvera a lanzar el metodo
            insert(Metodos.pedirReferencia(), Metodos.pedirNombre(), Metodos.pedirNota(), Metodos.pedirIdPais());
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }

    /**
     * Método "delete", en este caso el usuario únicamente tiene que introducir
     * la referencia del alumno que desee eliminar, esa referencia se almacena
     * en la variable "referencia", la cual se acopla a la declaración SQL que
     * se puede ver en el método.
     *
     * @param referencia
     */
    public void delete(int referencia) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.s.executeUpdate("delete from alumnos where referencia=" + referencia);

        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }

    /**
     * En este método el usuario puede actualizar las filas de la tabla que
     * desee introduciendo la referencia del alumno y a continuación los nuevos
     * datos actualizados. En caso de error saltaría una excepción con el
     * mensaje de error.
     *
     * @param nombre
     * @param nota
     * @param referencia
     * @param id_pais
     */
    public void update(String nombre, int nota, int referencia, int id_pais) {
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
}

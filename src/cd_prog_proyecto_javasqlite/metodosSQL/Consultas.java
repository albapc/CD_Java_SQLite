package cd_prog_proyecto_javasqlite.metodosSQL;

import cd_prog_proyecto_javasqlite.objectosTablas.Alumno;
import cd_prog_proyecto_javasqlite.objectosTablas.Pais;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aperezcesar
 */
public class Consultas {

    /**
     * Método "selectAlumnos", que realiza una consulta de toda la tabla de
     * alumnos y almacena los resultados en un ArrayList de tipo "Alumno". Este
     * método devuelve dicho array. De ocurrir algún error saltaría una
     * excepción con un mensaje de error.
     *
     * @return aux
     */
    public ArrayList selectAlumnos() {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            Conexion.conectar();
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
        } finally {
            Conexion.desconectar();
        }
        return aux;
    }

    /**
     * Método "selectPaises", que realiza una consulta de toda la tabla de
     * paises y almacena los resultados en un ArrayList de tipo "Pais". Este
     * método devuelve dicho array. De ocurrir algún error saltaría una
     * excepción con un mensaje de error.
     *
     * @return pa
     */
    public ArrayList selectPaises() {
        ArrayList<Pais> pa = new ArrayList();
        try {
            Conexion.conectar();
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from paises");
            while (Conexion.rs.next()) {
                pa.add(new Pais(
                        Integer.parseInt(Conexion.rs.getString("id_pais")),
                        Conexion.rs.getString("nombre_pais")));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            Conexion.desconectar();
        }
        return pa;
    }

    /**
     * Método "selectReferencia", en este caso introducimos una referencia para
     * que el sistema busque dicho dato en toda la tabla y si encuentra la
     * referencia, que muestre la fila correspondiente con sus datos.
     *
     * @param referencia referencia del alumno
     * @return aux
     */
    public ArrayList selectReferencia(int referencia) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            Conexion.conectar();
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
        } finally {
            Conexion.desconectar();
        }
        return aux;
    }

    /**
     * Método "selectNombre", en este caso introducimos el nombre de un alumno
     * para que el sistema busque dicho dato en toda la tabla y si encuentra el
     * nombre, que muestre la fila correspondiente con sus datos.
     *
     * @param nombre nombre del alumno
     * @return aux
     */
    public ArrayList selectNombre(String nombre) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            Conexion.conectar();
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos where nombre='" + nombre + "'");
            while (Conexion.rs.next()) { //mientras siga habiendo resultados...
                aux.add(new Alumno(
                        Integer.parseInt(Conexion.rs.getString("referencia")),
                        Conexion.rs.getString("nombre"),
                        Integer.parseInt(Conexion.rs.getString("nota")),
                        Integer.parseInt(Conexion.rs.getString("id_pais"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            Conexion.desconectar();
        }
        return aux;
    }

    /**
     * Método "selectNota", en este caso introducimos una nota para que el
     * sistema busque dicho dato en toda la tabla y si encuentra la nota, que
     * muestre la fila correspondiente con sus datos.
     *
     * @param nota nota del alumno
     * @return aux
     */
    public ArrayList selectNota(int nota) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            Conexion.con = Conexion.conectar();
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos where nota=" + nota);
            while (Conexion.rs.next()) { //mientras siga habiendo resultados...
                aux.add(new Alumno(
                        Integer.parseInt(Conexion.rs.getString("referencia")),
                        Conexion.rs.getString("nombre"),
                        Integer.parseInt(Conexion.rs.getString("nota")),
                        Integer.parseInt(Conexion.rs.getString("id_pais"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            Conexion.desconectar();
        }
        return aux;
    }

    /**
     * Método "selectId_Pais", en este caso introducimos una id de pais para que
     * el sistema busque dicho dato en toda la tabla y si encuentra la id, que
     * muestre la fila correspondiente con sus datos.
     *
     * @param id_pais id del pais del alumno
     * @return aux
     */
    public ArrayList selectId_pais(int id_pais) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            Conexion.con = Conexion.conectar();
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos where id_pais=" + id_pais);
            while (Conexion.rs.next()) { //mientras siga habiendo resultados...
                aux.add(new Alumno(
                        Integer.parseInt(Conexion.rs.getString("referencia")),
                        Conexion.rs.getString("nombre"),
                        Integer.parseInt(Conexion.rs.getString("nota")),
                        Integer.parseInt(Conexion.rs.getString("id_pais"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        } finally {
            Conexion.desconectar();
        }
        return aux;
    }
}

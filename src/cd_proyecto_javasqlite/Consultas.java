package cd_proyecto_javasqlite;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class Consultas {

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

    public ArrayList selectParameters(int referencia) {
        ArrayList<Alumno> aux = new ArrayList();
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos where referencia=" + referencia);
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

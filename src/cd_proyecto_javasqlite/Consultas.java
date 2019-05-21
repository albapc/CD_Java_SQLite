package cd_proyecto_javasqlite;

import java.sql.SQLException;
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
}

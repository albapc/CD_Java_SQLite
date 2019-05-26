package cd_prog_proyecto_javasqlite.metodosSQL;

import java.sql.SQLException;

/**
 *
 * @author aperezcesar
 */
public class Metodos {

    /**
     * Método de validación para los nombres de los alumnos. Si el usuario no
     * introduce nada, salta un mensaje de error y el boolean pasa a ser false.
     * Si en cambio introduce en alguna parte del String un número o un tipo de
     * dato no válido, salta otro mensaje de error y el boolean sigue siendo
     * false. Solo si se cumplen las condiciones pasa a ser válido (true)
     *
     * @param str String a validar
     * @return boolean
     */
    public static boolean validarNombre(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) { //recorre todos los caracteres para asegurarse de que solo hay letras
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                    && (!(ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método de validación para las ID de los países de los alumnos. Hace un
     * select de todas las filas que contengan la ID que introdujo el usuario y
     * se almacena en un contador. Si no existe esa ID (el contador es igual a
     * 0), salta un mensaje de error.
     *
     * @param id_pais id a validar
     * @return boolean
     */
    public static boolean validarPais(int id_pais) {
        int cont = 0;
        try {
            Conexion.s = Conexion.con.createStatement();
            Conexion.rs = Conexion.s.executeQuery("select count(*) from paises where id_pais=" + id_pais);
            if (Conexion.rs.next()) {
                cont = Conexion.rs.getInt(1);
            }

            if (cont == 0) {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    /**
     * Método de validación para las notas de los alumnos. Si el usuario
     * introduce una nota que sea menor que 0 y mayor que 10, que salte una
     * excepción.
     *
     * @param nota nota del alumno
     * @return boolean
     */
    public static boolean validarNota(int nota) {
        return (nota <= 10 && nota >= 1);
    }

    /**
     * Método que cuenta el número de filas que coinciden con la referencia
     * introducida por teclado para saber si ya existe esa referencia en la base
     * de datos o no. Devuelve la variable contador con el número de
     * coincidencias.
     *
     * @param referencia referencia del alumno
     * @return cont
     */
    public static int buscarCoincidencias(int referencia) {
        //Variable para almacenar nº de coincidencias
        int cont = 0;
        try {
            Conexion.s = Conexion.con.createStatement();
            Conexion.rs = Conexion.s.executeQuery("select count(*) from alumnos where referencia=" + referencia);
            if (Conexion.rs.next()) {
                cont = Conexion.rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cont;
    }
}

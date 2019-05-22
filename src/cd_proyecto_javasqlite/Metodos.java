package cd_proyecto_javasqlite;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aperezcesar
 */
public class Metodos {

    /**
     * Se pide al usuario que escriba el nombre del alumno que desea
     * introducir/modificar. Este input está rodeado por un bucle while en el
     * que mientras no se cumplan los requisitos del método "validarNombre",
     * volverá a pedir que se introduzcan los datos, hasta que estos sean
     * válidos.
     *
     * @return nombre
     */
    public static String pedirNombre() {
        String nombre = null;

        do {
            nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno:");
        } while (!validarNombre(nombre));

        return nombre;
    }

    /**
     * Se pide al usuario que escriba la nota del alumno que desea
     * introducir/modificar. Si lo que introduce no es un número salta una
     * excepción y vuelve a pedir que se introduzca la nota: el bucle se repite
     * hasta que el dato introducido sea válido, situación que sea da cuando el
     * boolean pasa a ser true.
     *
     * @return nota
     */
    public static int pedirNota() {
        int nota = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno:"));
                correcto = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca solo numeros.");
            }
        }
        return nota;
    }

    /**
     * En este método, se permiten únicamente valores numéricos enteros. Si se
     * introduce un tipo de dato distinto, salta una excepción avisando de que
     * solo se pueden introducir números. Tras esto, el bucle while reinicia el
     * proceso hasta que se introduzca un tipo de dato válido, con lo que el
     * boolean pasaría a true, que es la condición para finalizar el bucle.
     *
     * @return referencia
     */
    public static int pedirReferencia() {
        int referencia = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                referencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la referencia del alumno:"));
                correcto = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca solo numeros.");
            }
        }

        return referencia;
    }

    /**
     * En este método se permiten únicamente valores numéricos, si el dato
     * introducido no es un número salta una excepción con un mensaje de error.
     * A mayores se incorporó un bucle do-while en el que mientras no se cumplan
     * las condiciones que se especifican en el método "validarPais" se
     * reiniciará hasta que se introduzca un dato válido.
     *
     * @return id_pais
     */
    public static int pedirIdPais() {
        int id_pais = 0;

        do {
            try {
                id_pais = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del país del alumno:"));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca solo numeros.");
            }

        } while (!validarPais(id_pais));

        return id_pais;
    }

    /**
     * Método de validación para los nombres de los alumnos. Si el usuario no
     * introduce nada, salta un mensaje de error y el boolean pasa a ser false.
     * Si en cambio introduce en alguna parte del String un número o un tipo de
     * dato no válido, salta otro mensaje de error y el boolean sigue siendo
     * false. Solo si se cumplen las condiciones pasa a ser válido (true)
     *
     * @param str
     * @return boolean
     */
    public static boolean validarNombre(String str) {
        if (str == null || str.equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Introduzca un nombre.");
            return false;
        }
        for (int i = 0; i < str.length(); i++) { //recorre todos los caracteres para asegurarse de que solo hay letras
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                    && (!(ch >= 'a' && ch <= 'z'))) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca solo letras.");
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
     * @param id_pais
     * @return boolean
     */
    public static boolean validarPais(int id_pais) {
        int cont = 0;
        try {
            Conexion.s = Conexion.con.createStatement();
            Conexion.rs = Conexion.s.executeQuery("select count(*) from alumnos where id_pais=" + id_pais);
            if (Conexion.rs.next()) {
                cont = Conexion.rs.getInt(1);
            }

            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca una ID válida.");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
}

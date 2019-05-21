package cd_proyecto_javasqlite;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Metodos {

    public static String pedirNombre() {
        String nombre = null;

        do {
            nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno:");
        } while (!validarNombre(nombre));

        return nombre;
    }

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

    public static boolean validarNombre(String str) {
        if (str == null || str.equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Introduzca un nombre.");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                    && (!(ch >= 'a' && ch <= 'z'))) {
                JOptionPane.showMessageDialog(null, "ERROR: Introduzca solo letras.");
                return false;
            }
        }
        return true;
    }

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

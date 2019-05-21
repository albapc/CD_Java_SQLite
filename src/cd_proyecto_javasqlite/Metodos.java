package cd_proyecto_javasqlite;

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
            id_pais = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del país del alumno:"));
        } while (!validarPais(id_pais));

        return id_pais;
    }
    
    
}

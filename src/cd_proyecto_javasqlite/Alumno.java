package cd_proyecto_javasqlite;

/**
 *
 * @author aperezcesar
 */
public class Alumno {

    private int referencia;
    private String nombre;
    private int nota;
    private int id_pais;

    /**
     * Constructor por defecto
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros
     *
     * @param referencia
     * @param nombre
     * @param nota
     * @param id_pais
     */
    public Alumno(int referencia, String nombre, int nota, int id_pais) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.nota = nota;
        this.id_pais = id_pais;
    }

    /**
     * Getter de referencia
     *
     * @return referencia
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     * Setter de referencia
     *
     * @param referencia
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    /**
     * Getter de nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de nota
     *
     * @return nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Setter de nota
     *
     * @param nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Getter de id_pais
     *
     * @return id_pais
     */
    public int getId_pais() {
        return id_pais;
    }

    /**
     * Setter de id_pais
     *
     * @param id_pais
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    @Override
    public String toString() {
        return "Alumno{" + "referencia=" + referencia + ", nombre=" + nombre + ", nota=" + nota + ", id_pais=" + id_pais + '}';
    }
}

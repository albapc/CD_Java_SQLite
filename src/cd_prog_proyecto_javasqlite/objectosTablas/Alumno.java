package cd_prog_proyecto_javasqlite.objectosTablas;

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
     * @param referencia referencia del alumno
     * @param nombre nombre del alumno
     * @param nota nota del alumno
     * @param id_pais id del pais del alumno
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
     * @param referencia referencia del alumno
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
     * @param nombre nombre del laumno
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
     * @param nota nota del alumno
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
     * @param id_pais id del pais del alumno
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

}

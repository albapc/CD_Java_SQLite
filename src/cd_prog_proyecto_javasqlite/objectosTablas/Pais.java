package cd_prog_proyecto_javasqlite.objectosTablas;

/**
 *
 * @author aperezcesar
 */
public class Pais {

    private int id_pais;
    private String nombre_pais;

    /**
     * Constructor por defecto
     */
    public Pais() {
    }

    /**
     * Constructor con parámetros
     *
     * @param id_pais id del pais
     * @param nombre_pais nombre del pais
     */
    public Pais(int id_pais, String nombre_pais) {
        this.id_pais = id_pais;
        this.nombre_pais = nombre_pais;

    }

    /**
     * Getter de nombre_pais
     *
     * @return nombre_pais
     */
    public String getNombre_pais() {
        return nombre_pais;
    }

    /**
     * Setter de nombre_pais
     *
     * @param nombre_pais nombre del pais
     */
    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
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
     * @param id_pais id del pais
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
}

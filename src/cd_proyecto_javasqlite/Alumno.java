package cd_proyecto_javasqlite;

public class Alumno {

    private int referencia;
    private String nombre;
    private int nota;
    private int id_pais;

    public Alumno() {
    }

    public Alumno(int referencia, String nombre, int nota, int id_pais) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.nota = nota;
        this.id_pais = id_pais;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setCod(int cod) {
        this.referencia = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    @Override
    public String toString() {
        return "Alumno{" + "referencia=" + referencia + ", nombre=" + nombre + ", nota=" + nota + ", id_pais=" + id_pais + '}';
    }
}

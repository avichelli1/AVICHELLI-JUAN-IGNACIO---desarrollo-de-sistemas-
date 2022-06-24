public class Base {
    private String nombre;
    private int numeroDeAmbulancias;
    private float tiempoMedioAsistencia;

    public Base(String nombre, int numeroDeAmbulancias, float tiempoMedioAsistencia) {
        this.nombre = nombre;
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeAmbulancias() {
        return numeroDeAmbulancias;
    }

    public void setNumeroDeAmbulancias(int numeroDeAmbulancias) {
        this.numeroDeAmbulancias = numeroDeAmbulancias;
    }

    public float getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public void setTiempoMedioAsistencia(float tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }
}

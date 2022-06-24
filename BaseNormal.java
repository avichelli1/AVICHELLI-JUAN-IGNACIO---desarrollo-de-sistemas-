public class BaseNormal extends Base{
    public int ambulancias;
    public float tiempoAsistencia;

    public BaseNormal(String nombre, int ambulancias, float tiempoAsistencia) {
        super(nombre);
        this.ambulancias = ambulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public int getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(int ambulancias) {
        this.ambulancias = ambulancias;
    }

    public float getTiempoAsistencia() {
        return tiempoAsistencia;
    }

    public void setTiempoAsistencia(float tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
    }


}

public class Impresion {
    private int hojasRequeridad;
    private int tintaRequeridas;

    public Impresion(int hojasRequeridad, int tintaRequeridas) {
        this.hojasRequeridad = hojasRequeridad;
        this.tintaRequeridas = tintaRequeridas;
    }

    public int getHojasRequeridad() {
        return hojasRequeridad;
    }

    public void setHojasRequeridad(int hojasRequeridad) {
        this.hojasRequeridad = hojasRequeridad;
    }

    public int getTintaRequeridas() {
        return tintaRequeridas;
    }

    public void setTintaRequeridas(int tintaRequeridas) {
        this.tintaRequeridas = tintaRequeridas;
    }
}

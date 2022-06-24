public class Paquete {
    private float peso;
    private boolean largaDistancia;

    public Paquete(float peso, boolean largaDistancia) {
        this.peso = peso;
        this.largaDistancia = largaDistancia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isLargaDistancia() {
        return largaDistancia;
    }

    public void setLargaDistancia(boolean largaDistancia) {
        this.largaDistancia = largaDistancia;
    }
}

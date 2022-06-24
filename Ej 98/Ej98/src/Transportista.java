public class Transportista {
    private String nombre;
    private Calculo calculo;

    public Transportista(String nombre, Calculo calculo) {
        this.nombre = nombre;
        this.calculo = calculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calculo getCalculo() {
        return calculo;
    }

    public void setCalculo(Calculo calculo) {
        this.calculo = calculo;
    }
}

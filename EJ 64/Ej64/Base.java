public class Base {
    private String nombre;

    public Base(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calcularAmbulancias(BaseNormal base){
        int cantAmbulancias = base.getAmbulancias();
        return cantAmbulancias;
    }

    public float calcularTiempos(BaseNormal base){
        float tiempoPromedio = base.getTiempoAsistencia();
        return tiempoPromedio;
    }
}

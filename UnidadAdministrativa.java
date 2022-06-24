import java.util.ArrayList;

public class UnidadAdministrativa extends Base{
    public ArrayList<BaseNormal> bases;

    public UnidadAdministrativa(String nombre, ArrayList<BaseNormal> bases) {
        super(nombre);
        this.bases = bases;
    }

    public ArrayList<BaseNormal> getBases() {
        return bases;
    }

    public void setBases(ArrayList<BaseNormal> bases) {
        this.bases = bases;
    }

    public int calcularCantAmbulancias(){
        int ambulanciasTotales = 0;

        for (BaseNormal base : bases) {
            ambulanciasTotales = ambulanciasTotales + calcularAmbulancias(base);
        }

        return ambulanciasTotales;
    }

    public float calcularTiempoPromedio(){
        float tiempoPromedio = 0;

        for (BaseNormal base : bases) {
            tiempoPromedio = tiempoPromedio + calcularTiempos(base);
        }

        tiempoPromedio = tiempoPromedio / bases.size();

        return tiempoPromedio;
    }
}

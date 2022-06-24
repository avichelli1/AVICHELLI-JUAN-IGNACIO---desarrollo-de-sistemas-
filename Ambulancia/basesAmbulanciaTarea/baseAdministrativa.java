import java.util.ArrayList;

public class baseAdministrativa extends Base{
    private ArrayList<Base> basesQueAdministra;
    public baseAdministrativa(String nombre, int numeroDeAmbulancias, float tiempoMedioAsistencia) {
        super(nombre, numeroDeAmbulancias, tiempoMedioAsistencia);
    }



    public void addBase(Base base) {
        this.basesQueAdministra.add(base);
    }
    public void calcularNumeroDeAmbulanicas(){
        int numeroDeAmbulancias = 0;
        for(Base base : this.basesQueAdministra){
            numeroDeAmbulancias += base.getNumeroDeAmbulancias();
        }
        super.setNumeroDeAmbulancias(numeroDeAmbulancias);
    }
    public void calcularTiempoMedioAsistencia(){
        float tiempoMedioAsistencia = 0;
        int cantBases = 0;
        for(Base base : this.basesQueAdministra){
            cantBases++;
            tiempoMedioAsistencia+= base.getTiempoMedioAsistencia();
        }
        float tiempoFinal = tiempoMedioAsistencia/cantBases;
        super.setTiempoMedioAsistencia(tiempoFinal);
    }


}

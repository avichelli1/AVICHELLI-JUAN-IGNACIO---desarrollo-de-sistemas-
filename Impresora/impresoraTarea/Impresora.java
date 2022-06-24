import java.util.ArrayList;

public class Impresora {

    private static Impresora impresora;
    private String nombre;
    private ArrayList<Dispositivo> dispositivoArrayList;
    private ArrayList<Impresion> colaImpresion;
    private int hojas;
    private int tinta;

    public Impresora(String nombre, int hojas, int tinta) {
        this.nombre = nombre;
        this.hojas = hojas;
        this.tinta = tinta;
    }

    public static Impresora GetInstance(){
        if(impresora==null){
            impresora = new Impresora();
        }
        return impresora;
    }


    public void agregarImpresion(Impresion impresion){
        this.colaImpresion.add(impresion);
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        this.dispositivoArrayList.add(dispositivo);
    }
    public Impresion setearColaDePrioridad(){
        Impresion impresionAImprimirPrimero = null;
        //recorre array y setea cual imprimira
        return impresionAImprimirPrimero;
    }
    public void imprimir(){
        setearColaDePrioridad();
        //imprimir()
    }
}

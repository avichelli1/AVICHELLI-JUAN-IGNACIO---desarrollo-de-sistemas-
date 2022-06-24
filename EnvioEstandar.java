public class EnvioEstandar extends Calculo{
    public float calcularPrecio(Paquete paquete){
        float precio = 0;

        if(paquete.isLargaDistancia()){
            precio = paquete.getPeso() * 200;
        }
        else {
            precio = paquete.getPeso() * 100;
        }

        return precio;
    }
}

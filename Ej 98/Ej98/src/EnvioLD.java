public class EnvioLD extends Calculo{
    public float calcularPrecio(Paquete paquete){
        float precio = 0;

        if(paquete.isLargaDistancia()){
            precio = 1000;
        }
        else {
            precio = 400;
        }

        return precio;
    }
}

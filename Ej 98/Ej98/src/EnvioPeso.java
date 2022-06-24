public class EnvioPeso extends Calculo {
    public float calcularPrecio(Paquete paquete){
        float precio = paquete.getPeso() * 100;
        return precio;
    }
}

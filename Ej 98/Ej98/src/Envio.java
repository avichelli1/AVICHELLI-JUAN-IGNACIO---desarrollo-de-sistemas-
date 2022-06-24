public class Envio {
    private Calculo estrategia;
    private Transportista transportista;
    private Paquete paquete;

    public Envio(Transportista transportista, Paquete paquete) {
        this.estrategia = transportista.getCalculo();
        this.transportista = transportista;
        this.paquete = paquete;
    }

    public Calculo getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Calculo estrategia) {
        this.estrategia = estrategia;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public float calcularEnvio(){
        float precio = estrategia.calcularPrecio(paquete);
        return precio;
    }
}

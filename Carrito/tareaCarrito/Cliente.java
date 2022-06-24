import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccionEnvio;
    private String direccionCobro;
    private String email;
    private boolean esPreferencial;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Carrito> carritos;

    public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email, boolean esPreferencial) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.email = email;
        this.esPreferencial = esPreferencial;
        this.tarjetas = new ArrayList();
        this.carritos = new ArrayList();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return this.direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionCobro() {
        return this.direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsPreferencial() {
        return this.esPreferencial;
    }

    public void setEsPreferencial(boolean esPreferencial) {
        this.esPreferencial = esPreferencial;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return this.tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Carrito> getCarritos() {
        return this.carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }
}

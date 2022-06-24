import java.util.HashMap;

public class Carrito {
    private Cliente cliente;
    private HashMap<Producto, Integer> productos;


    public Carrito(HashMap<Producto, Integer> productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
    }

    public HashMap<Producto, Integer> getProductos() {
        return this.productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

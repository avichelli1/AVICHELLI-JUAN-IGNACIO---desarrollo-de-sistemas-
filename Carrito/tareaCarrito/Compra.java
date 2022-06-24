import java.util.HashMap;
import java.util.Iterator;

public class Compra {

    private HashMap<Producto, Integer> productos = new HashMap();
    private Cliente cliente;
    private Tarjeta tarjeta;
    private String direccion;
    private float precioTotal;

    public Compra(Cliente cliente, Tarjeta tarjeta, String direccion, float precioTotal) {
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.precioTotal = precioTotal;
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

    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean crearCompra(Carrito carrito, Tarjeta tarjeta) {
        new HashMap();
        HashMap<Producto, Integer> productos = carrito.getProductos();
        this.productos = productos;
        float precioTotal = 0.0F;
        float precioProducto = 0.0F;

        int cantidadDeProductos = 0;
        for(Iterator var7 = productos.keySet().iterator(); ((Iterator<?>) var7).hasNext(); precioTotal += precioProducto * (float)cantidadDeProductos) {
            Producto producto = (Producto)var7.next();
            precioProducto = producto.getPrecioUnitario();
            cantidadDeProductos = (Integer)productos.get(producto);
        }

        if (this.cliente.isEsPreferencial()) {
            precioTotal -= precioTotal * 0.1F;
        }

        this.setPrecioTotal(precioTotal);
        System.out.println("Precio: " + precioTotal);
        if (tarjeta.isVerificada()) {
            this.setTarjeta(tarjeta);
            return true;
        } else {
            return false;
        }
    }
}

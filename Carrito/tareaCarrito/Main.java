import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Crear Compra,2- Salir");

        int input = scanner.nextInt();
        Producto producto = new Producto("anteojos", 20, "ropa", 900, "carlos");
        Producto producto2 = new Producto("lavarropa", 30000, "electrodomestico", 20, "carlos");
        HashMap<Producto, Integer> productos = new HashMap();
        productos.put(producto, 3);
        productos.put(producto2, 8);
        Cliente cliente = new Cliente("NAcho", "Gabilan 4000", "Nueva York 3047", "nacho@gmail.com", true);
        Tarjeta tarjeta = new Tarjeta(457634343, "2/27", true);
        Carrito carrito = new Carrito(productos, cliente);
        if (input == 1) {
            Compra compra = new Compra(cliente, (Tarjeta)null, "constituyentes", 0.0F);
            compra.crearCompra(carrito, tarjeta);
        }

    }
}

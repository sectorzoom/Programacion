package tema5.Ejercicio1;
        import java.util.HashSet;
        import java.util.Set;
public class ListaCompra {
    private final Set<String> productos;

    public ListaCompra() {
        productos = new HashSet<>();
    }

    public void agregarProducto(String producto) {
        if (productos.contains(producto)) {
            System.out.println("El producto ya existe en la lista.");
        } else {
            productos.add(producto);
            System.out.println("Producto añadido correctamente.");
        }
    }

    public void imprimirLista() {
        if (productos.isEmpty()) {
            System.out.println("La lista de compra está vacía.");
        } else {
            System.out.println("Lista de compra:");
            for (String producto : productos) {
                System.out.println("- " + producto);
            }
        }
    }
}

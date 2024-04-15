package tema5.Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra {
    private final Set<String> listaCompra;
    private final Set<String> carroCompra;

    public ListaCompra() {
        listaCompra = new HashSet<>();
        carroCompra = new HashSet<>();
    }

    public void agregarProductoLista(String producto) {
        if (listaCompra.contains(producto)) {
            System.out.println("El producto ya está en la lista de compra.");
        } else {
            listaCompra.add(producto);
            System.out.println("Producto añadido a la lista de compra.");
        }
    }

    public void agregarProductoCarro(String producto) {
        if (carroCompra.contains(producto)) {
            System.out.println("El producto ya está en el carro de la compra.");
        } else {
            carroCompra.add(producto);
            System.out.println("Producto añadido al carro de la compra.");
        }
    }

    public void mostrarCarroCompra() {
        if (carroCompra.isEmpty()) {
            System.out.println("El carro de la compra está vacío.");
        } else {
            System.out.println("Productos en el carro de la compra:");
            for (String producto : carroCompra) {
                System.out.println("- " + producto);
            }
        }
    }

    public void mostrarProductosPendientes() {
        Set<String> pendientes = new HashSet<>(listaCompra);
        pendientes.removeAll(carroCompra);
        if (pendientes.isEmpty()) {
            System.out.println("No hay productos pendientes de añadir a la lista.");
        } else {
            System.out.println("Productos pendientes de añadir a la lista:");
            for (String producto : pendientes) {
                System.out.println("- " + producto);
            }
        }
    }

    public void mostrarProductosComprados() {
        if (carroCompra.isEmpty()) {
            System.out.println("No has comprado ningún producto.");
        } else {
            System.out.println("Productos comprados:");
            for (String producto : carroCompra) {
                System.out.println("- " + producto);
            }
        }
    }
}

package Colecciones1.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCompra lista = new ListaCompra();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de lista de compra.");

        while (true) {
            System.out.print("Introduce un producto (o 'salir' para terminar): ");
            String producto = scanner.nextLine().trim().toUpperCase();

            if (producto.equalsIgnoreCase("salir")) {
                break;
            }

            lista.agregarProducto(producto);
        }

        System.out.println("Lista final de compra:");
        lista.imprimirLista();

        scanner.close();
    }
}

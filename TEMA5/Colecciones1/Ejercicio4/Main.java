package Colecciones1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCompra lista = new ListaCompra();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de lista y carro de compra.");

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Añadir producto a la lista de compra");
            System.out.println("2. Añadir producto al carro de la compra");
            System.out.println("3. Mostrar productos en el carro de la compra");
            System.out.println("4. Mostrar productos pendientes de añadir de la lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el producto a añadir a la lista de compra: ");
                    String productoLista = scanner.nextLine();
                    lista.agregarProductoLista(productoLista);
                    break;
                case 2:
                    System.out.print("Introduce el producto a añadir al carro de la compra: ");
                    String productoCarro = scanner.nextLine();
                    lista.agregarProductoCarro(productoCarro);
                    break;
                case 3:
                    lista.mostrarCarroCompra();
                    break;
                case 4:
                    lista.mostrarProductosPendientesLista();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}

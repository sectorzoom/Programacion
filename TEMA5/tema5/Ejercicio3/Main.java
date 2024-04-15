package tema5.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionColas gestion = new GestionColas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de gestión de colas en un banco.");

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Añadir a alguien a la cola");
            System.out.println("2. Quitar al primero de la cola");
            System.out.println("3. Quitar a alguien de la cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce la edad del usuario: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce el DNI del usuario: ");
                    String dni = scanner.nextLine();
                    Usuario nuevoUsuario = new Usuario(nombre, edad, dni);
                    gestion.agregarACola(nuevoUsuario);
                    break;
                case 2:
                    gestion.quitarPrimeroDeCola();
                    break;
                case 3:
                    System.out.print("Introduce el DNI de la persona a quitar de la cola: ");
                    String dniQuitar = scanner.nextLine();
                    gestion.quitarDeCola(dniQuitar);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}

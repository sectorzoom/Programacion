package tema5.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionUsuarios gestion = new GestionUsuarios();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de gestión de usuarios de gimnasio.");

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Alta de usuario");
            System.out.println("2. Baja de usuario");
            System.out.println("3. Mostrar datos de usuario");
            System.out.println("4. Modificar usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el DNI del usuario: ");
                    String dniAlta = scanner.nextLine();
                    System.out.print("Introduce el nombre del usuario: ");
                    String nombreAlta = scanner.nextLine();
                    System.out.print("Introduce la edad del usuario: ");
                    int edadAlta = scanner.nextInt();
                    scanner.nextLine();
                    gestion.altaUsuario(dniAlta, nombreAlta, edadAlta);
                    break;
                case 2:
                    System.out.print("Introduce el DNI del usuario a dar de baja: ");
                    String dniBaja = scanner.nextLine();
                    gestion.bajaUsuario(dniBaja);
                    break;
                case 3:
                    System.out.print("Introduce el DNI del usuario a mostrar: ");
                    String dniMostrar = scanner.nextLine();
                    gestion.mostrarUsuario(dniMostrar);
                    break;
                case 4:
                    System.out.print("Introduce el DNI del usuario a modificar: ");
                    String dniModificar = scanner.nextLine();
                    System.out.print("Introduce el nuevo nombre del usuario: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Introduce la nueva edad del usuario: ");
                    int nuevaEdad = scanner.nextInt();
                    scanner.nextLine();
                    gestion.modificarUsuario(dniModificar, nuevoNombre, nuevaEdad);
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

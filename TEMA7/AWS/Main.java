package AWS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String URL_CONEXION = "jdbc:postgresql://david.c9avrrmzhkv1.us-east-1.rds.amazonaws.com:5432/f12006";
    private static final String USUARIO = "postgres";
    private static final String PASSWORD = "Qwertyuiop";

    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(URL_CONEXION, USUARIO, PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        createPilot(conexion, scanner);
                        break;
                    case 2:
                        readPilot(conexion, scanner);
                        break;
                    case 3:
                        readPilots(conexion);
                        break;
                    case 4:
                        updatePilot(conexion, scanner);
                        break;
                    case 5:
                        deletePilot(conexion, scanner);
                        break;
                    case 6:
                        PilotsCRUD.showPilotClassification(conexion);
                        break;
                    case 7:
                        PilotsCRUD.showBuildersClassification(conexion);
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Crear Piloto");
        System.out.println("2. Leer Piloto por ID");
        System.out.println("3. Leer todos los Pilotos");
        System.out.println("4. Actualizar Piloto");
        System.out.println("5. Eliminar Piloto");
        System.out.println("6. Mostrar Clasificación de Pilotos");
        System.out.println("7. Mostrar Clasificación de Equipos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void createPilot(Connection conexion, Scanner scanner) {
        System.out.print("Ingrese el código del piloto: ");
        String code = scanner.nextLine();
        System.out.print("Ingrese el nombre del piloto: ");
        String forename = scanner.nextLine();
        System.out.print("Ingrese el apellido del piloto: ");
        String surname = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.print("Ingrese la nacionalidad del piloto: ");
        String nationality = scanner.nextLine();

        Piloto nuevoPiloto = new Piloto(0, code, forename, surname, Date.valueOf(dob), nationality);
        try {
            PilotsCRUD.createPilot(conexion, nuevoPiloto);
            System.out.println("Piloto creado exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear el piloto: " + e.getMessage());
        }
    }

    private static void readPilot(Connection conexion, Scanner scanner) {
        System.out.print("Ingrese el ID del piloto: ");
        int driverId = scanner.nextInt();

        try {
            Piloto piloto = PilotsCRUD.readPilot(conexion, driverId);
            if (piloto != null) {
                System.out.println("Piloto leído: " + piloto);
            } else {
                System.out.println("Piloto no encontrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al leer el piloto: " + e.getMessage());
        }
    }

    private static void readPilots(Connection conexion) {
        try {
            List<Piloto> pilotos = PilotsCRUD.readPilots(conexion);
            System.out.println("Todos los pilotos:");
            for (Piloto piloto : pilotos) {
                System.out.println(piloto);
            }
        } catch (SQLException e) {
            System.err.println("Error al leer los pilotos: " + e.getMessage());
        }
    }

    private static void updatePilot(Connection conexion, Scanner scanner) {
        System.out.print("Ingrese el ID del piloto a actualizar: ");
        int driverId = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nuevo código del piloto: ");
        String code = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del piloto: ");
        String forename = scanner.nextLine();
        System.out.print("Ingrese el nuevo apellido del piloto: ");
        String surname = scanner.nextLine();
        System.out.print("Ingrese la nueva fecha de nacimiento (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.print("Ingrese la nueva nacionalidad del piloto: ");
        String nationality = scanner.nextLine();

        Piloto pilotoActualizado = new Piloto(driverId, code, forename, surname, Date.valueOf(dob), nationality);
        try {
            PilotsCRUD.updatePilot(conexion, pilotoActualizado);
            System.out.println("Piloto actualizado exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar el piloto: " + e.getMessage());
        }
    }

    private static void deletePilot(Connection conexion, Scanner scanner) {
        System.out.print("Ingrese el ID del piloto a eliminar: ");
        int driverId = scanner.nextInt();

        try {
            Piloto piloto = PilotsCRUD.readPilot(conexion, driverId);
            if (piloto != null) {
                PilotsCRUD.deletePilot(conexion, piloto);
                System.out.println("Piloto eliminado exitosamente.");
            } else {
                System.out.println("Piloto no encontrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el piloto: " + e.getMessage());
        }
    }
}

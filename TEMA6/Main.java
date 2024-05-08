import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FunkoStore store = new FunkoStore("C:/Users/david/OneDrive/Desktop/Programacion/Programacion/funkos.csv");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos los funkos");
            System.out.println("4. Mostrar el funko más caro");
            System.out.println("5. Mostrar la media de precio de los funkos");
            System.out.println("6. Mostrar los funkos agrupados por modelos");
            System.out.println("7. Mostrar los funkos de un año específico");
            System.out.println("8. Salir");

            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Introduce el nombre del funko: ");
                    String nombre = scanner.next();
                    scanner.nextLine();
                    System.out.print("Introduce el modelo del funko: ");
                    String modelo = scanner.next();
                    scanner.nextLine();
                    System.out.print("Introduce la fecha de lanzamiento del funko yyyy-MM-dd: ");
                    String fechaString = scanner.nextLine();
                    Date fechaLanzamiento;
                    try {
                        fechaLanzamiento = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha incorrecto. Utiliza el formato yyyy-MM-dd.");
                        break;
                    }
                    System.out.print("Introduce el precio del funko: ");
                    double precio = scanner.nextDouble();
                    store.addFunko(nombre, modelo, fechaLanzamiento, precio);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del funko que deseas borrar: ");
                    String deleteName = scanner.nextLine();
                    store.deleteFunko(deleteName);
                    break;
                case 3:
                    store.showAllFunkos();
                    break;
                case 4:
                    store.showMostExpensiveFunko();
                    break;
                case 5:
                    store.showAveragePrice();
                    break;
                case 6:
                    store.showFunkosByModel();
                    break;
                case 7:
                    System.out.print("Introduce el año del que quieres ver los funkos: ");
                    int year = scanner.nextInt();
                    store.showFunkosFromYear(year);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }
}


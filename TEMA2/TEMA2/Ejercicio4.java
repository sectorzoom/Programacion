package TEMA2;
import java.util.Scanner;
public class Ejercicio4 {
    public static double euro2dollar(double euros) {
        return euros * 1.18;
    }
    public static double dollar2euro(double dollars) {
        return dollars / 1.18;
    }
    public static void showMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1. Convertir de Euros a Dólares");
            System.out.println("2. Convertir de Dólares a Euros");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción (1/2/3): ");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.print("Introduce la cantidad en euros: ");
                double euros = in.nextDouble();
                double dollars = (int) euro2dollar(euros);
                System.out.println(euros + " euros son " + dollars + " dólares");
            } else if (choice == 2) {
                System.out.print("Introduce la cantidad en dólares: ");
                double dollars = in.nextDouble();
                double euros = (int) dollar2euro(dollars);
                System.out.println(dollars + " dólares son " + euros + " euros");
            } else if (choice == 3) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, selecciona 1, 2 o 3.");
            }
        }
    }
    public static void main(String[] args) {
        showMenu();
    }
}

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba su cantidad en dólares: ");
        double conversion_dolares_euro=0.95;
        double dolares = in.nextDouble();
        double euros = dolares*conversion_dolares_euro;
        System.out.println("Tus " + dolares + " equivalen a " + (euros) + " euros.");

    }
}
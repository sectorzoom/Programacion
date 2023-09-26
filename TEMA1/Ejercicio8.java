import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba su cantidad en euros: ");
        double conversion_euro_dolares=1.06;
        double euros = in.nextDouble();
        double dolares = euros*conversion_euro_dolares;
        System.out.println("Tus " + euros + " equivalen a " + (dolares) + " dólares.");

    }
}

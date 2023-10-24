package TEMA2;
import java.util.Scanner;
public class Ejercicio7 {

    public static boolean prime_number (int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
        while (number !=0) {
            System.out.println("Escriba su supuesto número primo (Pon 0 para cerrar): ");
            number = in.nextInt();
            if (prime_number(number)) {
                System.out.println("Es primo.");
            } else if (number != 0) {
                System.out.println("No es primo.");
            }
        }
        System.out.println("¡Adiós!");
    }
}

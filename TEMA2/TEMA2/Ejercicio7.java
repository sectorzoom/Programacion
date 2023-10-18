package TEMA2;
import java.util.Scanner;
public class Ejercicio7 {

    public static boolean prime_number (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
        while (number !=0) {
            System.out.println("Escriba su supuesto número primo: ");
            number = in.nextInt();
            if (prime_number(number)) {
                System.out.println("Es primo.");
            } else {
                System.out.println("No es primo.");
            }
        }
    }
}

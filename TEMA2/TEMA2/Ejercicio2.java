package TEMA2;
import java.util.Scanner;
public class Ejercicio2 {
    public static boolean isAdult(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la edad a comprobar: ");
        int age;
        age = in.nextInt();
        if (isAdult(age)) {
            System.out.println("Es mayor de edad.");
        } else if (age < 0) {
            System.out.println("Edad incorrecta.");
        } else {
            System.out.println("No es mayor de edad.");
        }

    }
}
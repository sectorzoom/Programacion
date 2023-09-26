import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba su primer número: ");
        int a = in.nextInt();
        System.out.println("Escriba su segundo número: ");
        int b = in.nextInt();
        System.out.println("Escriba su tercer número: ");
        int c = in.nextInt();
        if ((a>b) && (a>c)) {
            System.out.println("El primer número es el mayor de los 3");
        }
        if ((b>a) && (b>c)) {
            System.out.println("El segundo número es el mayor de los 3");
        }
        if ((c>a) && (c>b)) {
            System.out.println("El tercer número es el mayor de los 3");
        }
        if ((a==b) && (c==b)) {
            System.out.println("Los tres números son iguales");
        }

    }
}

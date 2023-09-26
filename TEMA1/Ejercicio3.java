import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] largs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la base del triángulo: ");
        int base = in.nextInt();
        System.out.println("Escriba la altura del triángulo: ");
        int altura = in.nextInt();
        System.out.println("El área del triángulo es: " + ((base * altura)/2));
    }
}
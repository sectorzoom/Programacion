import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el número: ");
        double a = in.nextDouble();
        if (a>=0) {
            System.out.println("La raíz cuadrada es: " + Math.sqrt(a));
        }
        else {
            System.out.println("Error");
        }
    }
}

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el primer número:");
        double a = in.nextDouble();
        System.out.println("Escriba el segundo número");
        double b = in.nextDouble();
        System.out.println("Escriba el tercer número");
        double c = in.nextDouble();
        if ((a<=b) && (b<=c)){
            System.out.println("Los números están ordenados de menor a mayor");
        } else {
            System.out.println("Los números no éstan ordenados de menor a mayor");
        }
    }
}

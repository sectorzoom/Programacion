import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        int a = in.nextInt();
        System.out.println("Escriba el segundo número: ");
        int b = in.nextInt();
        if (b > a) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

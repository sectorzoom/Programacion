import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el número: ");
        int a = in.nextInt();
        int b = a;
        int conteo = 0;
        do {
            b = b/10;
            conteo++;
        } while (b>0);
        System.out.println(a + " tiene " + conteo + " cifras.");
    }
}

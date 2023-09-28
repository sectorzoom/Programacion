import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el número del que desea obtener el factorial: ");
        int numero = in.nextInt();
        int factorial = 0;
            if (numero > 0) {
                factorial = 1;
                for (int i = 1; i <=numero; i++) {
                    factorial *= i;
                    }
            }
        System.out.println("El factorial de " + numero + " es " + factorial + ".");
    }
}

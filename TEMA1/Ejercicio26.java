import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba su supuesto numero primo: ");
        int numero = in.nextInt();
        boolean esprimo = true;
        if (numero <= 1) {
            esprimo = false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esprimo = false;
                break;
            }
        }
        if (esprimo) {
            System.out.println("El número es primo.");
        }else {
            System.out.println("El número no es primo.");
        }
    }
}
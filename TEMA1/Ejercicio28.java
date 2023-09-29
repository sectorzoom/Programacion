import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        System.out.println("Escriba su número");
        int numero = in.nextInt();
        int contador = 0;
        while ((contador < 4) || (numero == randomInt)) {
            if (numero != randomInt) {
                System.out.println("Lástima, no es ese número...");
                System.out.println("Pruebe otra vez: ");
            }
            if (numero == randomInt) {
                System.out.println("¡Has acertado el número!");
                break;
            }
            numero = in.nextInt();
            contador++;
            if (contador == 4) {
                System.out.println("Lástima, el número era el " + randomInt);
            }
        }
    }
}

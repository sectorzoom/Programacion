import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Vamos a jugar a adivinar el número. ");
        System.out.println("Dime, ¿qué número crees que estoy pensando?");
        int numero = in.nextInt();
        int intentos = 1;
        while (numero != randomInt) {
            if (numero < randomInt) {
                System.out.println("Mi número es superior, prueba de nuevo");
            } else {
                System.out.println("Mi número es inferior, prueba de nuevo");
            }
            numero = in.nextInt();
            intentos++;
            if (numero == randomInt) {
                System.out.println("¡Has acertado!, has necesitado " + intentos + " para adivinarlo.");
            }
        }
    }
}

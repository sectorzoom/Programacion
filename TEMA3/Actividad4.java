import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vamos a simular la cobertura que habrá según la potencia y lugar de colocación del router.\n" +
                "Primero, introduzca en qué habitación estará el router\n(Elija del 1 al 20)");
        int[] hotelsRoom = new int[20];
        int selectionRoom = in.nextInt();
        System.out.println("Ahora, introduzca la potencia del router\n(Elija una potencia de señal de 1 a 6.");
        int routerPower = in.nextInt();
        System.out.println("La simulación de la cobertura es la siguiente");
        for (int i = 0; i < hotelsRoom.length; i++) {
            if (i == selectionRoom) {
                hotelsRoom[i] = routerPower - i;
            }
        }
        System.out.println(Arrays.toString(hotelsRoom));

    }
}

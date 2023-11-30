package Actividades_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                Vamos a simular la cobertura que habrá según la potencia y lugar de colocación del router.
                Primero, introduzca en qué habitación estará el router
                (Elija del 1 al 20)""");
        int[] hotelsRoom = new int[20];
        int selectionRoom = 0;
        while (selectionRoom < 1){
            selectionRoom = in.nextInt();
            if (selectionRoom < 1){
                System.out.println("Por favor, introduzca un valor entre 1 y 20");
            }
        }
        System.out.println("Ahora, introduzca la potencia del router\n(Elija una potencia de señal de 1 a 6).");
        int routerPower = 0;
        while (routerPower < 1){
            routerPower = in.nextInt();
            if (routerPower < 1){
                System.out.println("Por favor, introduzca un valor entre 1 y 6");
            }
        }
        System.out.println("La simulación de la cobertura es la siguiente");
        int room = selectionRoom-1;
        for (int i = routerPower; i != 0; room--){
            if (room >= 0) {
                hotelsRoom[room] = i;
            } else {
                break;
            }
            i--;
        }
        room = selectionRoom-1;
        for (int i = routerPower; room != 20; room++){
            hotelsRoom[room] = i;
            i--;
            if (i < 0) {
                hotelsRoom[room] = 0;
            }
        }
        System.out.println(Arrays.toString(hotelsRoom));
    }
}

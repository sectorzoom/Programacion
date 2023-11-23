import java.util.Random;
import java.util.Scanner;

public class Actividad3 {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("""
                Bienvenido al juego de la mosca
                Explicación: hay una mosca posada sobre uno de los azulejos y debes acabar con ella. Para ello, debes introducir por consola dónde crees que estará la mosca.
                Cuidado! La mosca notará tu presencia cuando des cerca de ella y se moverá.

                Dime, dónde crees que estará la mosca?""");
        game();
    }
    public static void game () {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int fly = flyFly(array);
        boolean winner = false;
        int round = 1;
        while (!winner) {
            System.out.println("Ronda " + round + ": ");
            round++;
            int selection = in.nextInt();
            fly = whereIsFly(selection, array, fly);
            if (fly == selection) {
                winner = true;
            }
        }
    }
    public static int flyFly(int[]array) {
        return array[random.nextInt(14)];
    }
    public static int whereIsFly(int selection, int[]array, int fly) {
        if (selection == (fly-1) || selection == (fly+1)) {
            System.out.println("Casi pero no!");
            fly = flyFly(array);
        } else if (selection != fly) {
            System.out.println("Estuviste muy lejos!");
        } else {
            System.out.println("Has cazado a la mosca!");
        }
        return fly;
    }
}

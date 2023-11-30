import java.util.Arrays;
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
        boolean[] board = new boolean[15];
        Arrays.fill(board,false);
        int flyPosition = random.nextInt(14);
        board[flyPosition] = true;
        System.out.println(Arrays.toString(board));
        int round = 1;
        boolean winner = true;
        while (winner) {
            System.out.println("Ronda " + round + ": ");
            round++;
            int selection = in.nextInt()-1;
            if (selection == (flyPosition - 1)) {
                System.out.println("Casi pero no!");
                board[flyPosition] = false;
                flyPosition = random.nextInt(14);
                board[flyPosition] = true;
                System.out.println(Arrays.toString(board));
            } else if (board[selection] == board[flyPosition]) {
                System.out.println("Has cazado a la mosca");
                winner = false;
            } else {
                System.out.println("Estuviste muy lejos!");
            }
        }

    }
}

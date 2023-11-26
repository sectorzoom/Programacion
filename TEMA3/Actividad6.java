import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Actividad6 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int bomb = -1;
        int[] invisibleBoard = new int[20];
        Arrays.fill(invisibleBoard, 0);
        boolean[] visibleBoard = new boolean[20];
        Arrays.fill(visibleBoard, false);
        int bombsSet = 0;
        while (bombsSet < 6) {
            int position = random.nextInt(20);
            if (invisibleBoard[position] != bomb) {
                invisibleBoard[position] = bomb;
                bombsSet++;
            }
        }
        for (int i = 0; i < 20; i++) {
            if (invisibleBoard[i] != bomb) {
                int positionWithBombsAround = 0;
                if (i > 0 && invisibleBoard[i - 1] == bomb) {
                    positionWithBombsAround++;
                }
                if (i < 20 - 1 && invisibleBoard[i + 1] == bomb) {
                    positionWithBombsAround++;
                }
                invisibleBoard[i] = positionWithBombsAround;
            }
        }
        System.out.println(Arrays.toString(invisibleBoard));
        int undiscoveredPositions = 14;
        while (undiscoveredPositions != 0) {
            for (int i = 0; i < 20; i++) {
                if (visibleBoard[i]) {
                    if (invisibleBoard[i] == bomb) {
                        System.out.print("* ");
                    } else {
                        System.out.print(invisibleBoard[i] + " ");
                    }
                } else {
                    System.out.print("? ");
                }
            }
            System.out.println();
            System.out.print("Ingresa la posición a descubrir (1-20): ");
            int position = scanner.nextInt() - 1;
            while(position < 0 || position >= 20) {
                System.out.println("Posición inválida. Intenta de nuevo.");
                System.out.print("Ingresa la posición a descubrir (1-20): ");
                position = scanner.nextInt()-1;
            }
            if (visibleBoard[position]) {
                System.out.println("Ya has visto esta posición. Elige otra.");
            }
            visibleBoard[position] = true;
            if (invisibleBoard[position] == bomb) {
                Arrays.fill(visibleBoard, true);
                for (int i = 0; i < 20; i++) {
                    if (invisibleBoard[i] == bomb) {
                        System.out.print("* ");
                    } else {
                        System.out.print(invisibleBoard[i] + " ");
                    }
                }
                System.out.println("\n¡Has perdido! Había una mina en la posición " + position);
                break;
            }
            undiscoveredPositions--;
        }
        if (undiscoveredPositions == 0) {
            System.out.println("\n¡Felicidades, has ganado!");
            System.out.println(Arrays.toString(invisibleBoard));
        }
    }
}

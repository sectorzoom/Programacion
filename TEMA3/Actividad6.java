import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Actividad6 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] board = new int[20];
        Arrays.fill(board, 0);
        boolean[] visibleBoard = new boolean[20];
        Arrays.fill(visibleBoard, false);
        placeTheBombs(board);
        game(board, visibleBoard);
    }

    public static void placeTheBombs(int[] invisibleBoard) {
        int bomb = -1;
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
    }
    public static void invisibleBoard(boolean[]playerBoard, int[]board , int bomb) {
        for (int i = 0; i < 20; i++) {
            if (playerBoard[i]) {
                if (board[i] == bomb) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[i] + " ");
                }
            } else {
                System.out.print("? ");
            }
        }
        System.out.println();
    }
    public static void game(int[] board, boolean[] playerBoard) {
        int bomb = -1;
        int undiscoveredPositions = 14;
        boolean winner = true;
        while (undiscoveredPositions != 0 && winner) {
            invisibleBoard(playerBoard,board,bomb);
            System.out.print("Ingresa la posición a descubrir (1-20): ");
            int position = scanner.nextInt() - 1;
            undiscoveredPositions = selectYourPosition(playerBoard, undiscoveredPositions, position);
            winner = youLose(board,position,bomb,playerBoard);
            if (undiscoveredPositions == 0) {
                System.out.println("\n¡Felicidades, has ganado!");
                System.out.println(Arrays.toString(board));
            }
        }
    }
    public static int selectYourPosition(boolean[]playerBoard, int undiscoveredPositions, int position) {
        while (position < 0 || position >= 20 || playerBoard[position]) {
            if (position < 0 || position >= 20) {
                System.out.println("Posición inválida. Intenta de nuevo.");
                System.out.print("Ingresa la posición a descubrir (1-20): ");
                position = scanner.nextInt() - 1;
            }
            if (playerBoard[position]) {
                System.out.println("Ya has visto esta posición. Elige otra.");
                position = scanner.nextInt() - 1;
            }
        }
        undiscoveredPositions--;
        playerBoard[position] = true;
        return undiscoveredPositions;
    }
    public static boolean youLose(int[]board,int position,int bomb,boolean[]playerBoard) {
        boolean winner = true;
        if (board[position] == bomb) {
            Arrays.fill(playerBoard, true);
            for (int i = 0; i < 20; i++) {
                if (board[i] == bomb) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[i] + " ");
                }
            }
            winner = false;
            System.out.println("\n¡Has perdido! Había una mina en la posición ");
        }
        return winner;
    }
}

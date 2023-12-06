package Actividades_Matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Actividad2 {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        game();
    }
    public static void game() {
        System.out.println("Bienvenido al juego de la mosca de David Giménez.");
        boolean win = false;
        boolean[][] board = createBoard();
        int[] flyPosition = {random.nextInt(board.length), random.nextInt(board[0].length)};
        board[flyPosition[0]][flyPosition[1]] = true;
        while (!win){
            System.out.println(Arrays.deepToString(board));
            String fila = "fila";
            int row = validValue(fila);
            String columna = "columna";
            int column = validValue(columna);
            win = whenPlayerClick(board,flyPosition,row,column,win);
        }
    }
    public static boolean[][] createBoard(){
        boolean[][] board = new boolean[4][4];
        for (boolean[] booleans : board) {
            Arrays.fill(booleans, false);
        }
        return board;
    }
    public static int validValue (String posicion){
        System.out.println("Por favor, introduzca en qué " + posicion + " cree que está la mosca (Del 1 al 4):");
        int value = -1;
        while (value < 0 || value > 3){
            value = in.nextInt()-1;
            if (value < 0 || value > 3){
                System.out.println("Por favor, introduzca un valor válido entre 1 y 4");
            }
        }
        return value;
    }
    public static boolean whenPlayerClick(boolean[][]board, int[]flyPosition, int row, int column, boolean win){
        if (board[row][column]){
            System.out.println("Has acertado!");
            win = true;
        } else if (((row == flyPosition[0] - 1 || row == flyPosition[0] + 1) && column == flyPosition[1]) ||
                ((column == flyPosition[1] - 1 || column == flyPosition[1] + 1) && (row == flyPosition[0]))) {
            System.out.println("Casi! La mosca ha salido volando y se ha posado en otro sitio");
            board[flyPosition[0]][flyPosition[1]] = false;
            flyPosition[0] = random.nextInt(board.length);
            flyPosition[1] = random.nextInt(board.length);
            board[flyPosition[0]][flyPosition[1]] = true;
        } else {
            System.out.println("Has fallado");
        }
        return win;
    }
}

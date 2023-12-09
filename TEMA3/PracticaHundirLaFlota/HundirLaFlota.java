package PracticaHundirLaFlota;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        game();
    }
    public static void game(){
        int gameMode = menuGameMode();
        int height = 0;
        int width = 0;
        if(gameMode != 4){
            height = 11;
            width = 11;
        } else {
            System.out.println("Por favor, elige de cuánto va a ser tu tablero:");
            System.out.println("Altura:");
            while (height <= 0){
                height = scanner.nextInt();
                if (height <= 0){
                    System.out.println("Por favor, introduce un valor válido");
                }
            }
            System.out.println("Anchura:");
            while (width <= 0){
                width = scanner.nextInt();
                if (width <= 0){
                    System.out.println("Por favor, introduce un valor válido");
                }
            }
        }
        char inside = '-';
        char[][] playerBoard = createBoard(inside, height, width);
        char[][] boardGame = selectBoard(gameMode, height, width);
        combat(gameMode,boardGame,playerBoard);

    }

    // Muestra el menú y devuelve la opción elegida por el usuario (1, 2, 3 o 4)
    public static int menuGameMode(){
        System.out.println("""
                Selecciona un modo de juego:
                (1) Fácil (10 barcos (5 lanchas, 3 buques, 1 acorazado y 1 portaaviones) y 50 disparos.
                (2) Medio 5 barcos (2 lanchas, 1 buque, 1 acorazado y 1 portaaviones) y 30 disparos.
                (3) Difícil 2 barcos (1 lancha y 1 buque) y 10 disparos.
                (4) Personalizado (tamaño tablero, nº barcos y nº disparos)""");
        int gameMode = scanner.nextInt();
        while (gameMode > 4 || gameMode < 1){
            System.out.println("Por favor, introduzca un modo de juego válido: ");
            gameMode = scanner.nextInt();
        }
        return gameMode;
    }

    //Selecciona el tablero según lo elegido en menuGameMode
    public static char[][] selectBoard(int gameMode, int height, int width){
        char[][]board = new char[0][0];
        switch (gameMode){
            case 1:
                board = easyGameBoard(height,width);
                break;
            case 2:
                board = mediumGameBoard(height,width);
                break;
            case 3:
                board = hardGameBoard(height,width);
                break;
            case 4:
                board = customGameBoard(height,width);
                break;
        }
        return board;
    }

    //Crea ambos tableros pero sin nada
    public static char[][] createBoard(char inside, int height, int width) {
        char[][] board = new char[height][width];
        char capitalLetter = 'A';
        char number = '1';
        for (int i = 0; i < board.length; i++){
            Arrays.fill(board[i],inside);
            if (i == 0){
                board[i][0] = ' ';
            } else {
                board[i][0] = capitalLetter;
                capitalLetter++;
            }
        }
        for (int j = 0; j < board[0].length; j++){
            if (j == 10){
                board[0][10] = '0';
            } else if (j == 0){
                board[0][j] = ' ';
            } else {
                board[0][j] = number;
                number++;
                if (number == ':'){
                    number = '1';
                }
            }
        }
        return board;
    }


    //Crea el tablero del modo de juego Fácil, adjudicando la cantidad de barcos, pero no la posicion
    public static char[][] easyGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width).clone();
        int boatCounter = 5;
        int warShipCounter = 3;
        int battleshipCounter = 1;
        int aircraftCarrierCounter = 1;
        insertBoat(board,boatCounter);
        insertWarShip(board,warShipCounter);
        insertBattleship(board,battleshipCounter);
        insertAircraftCarrier(board,aircraftCarrierCounter);
        return board;
    }

    //Crea el tablero del modo de juego Medio, adjudicando la cantidad de barcos, pero no la posicion
    public static char[][] mediumGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width).clone();
        int boatCounter = 2;
        int warShipCounter = 1;
        int battleshipCounter = 1;
        int aircraftCarrierCounter = 1;
        insertBoat(board,boatCounter);
        insertWarShip(board,warShipCounter);
        insertBattleship(board,battleshipCounter);
        insertAircraftCarrier(board,aircraftCarrierCounter);
        return board;
    }

    //Crea el tablero del modo de juego Difícil, adjudicando la cantidad de barcos, pero no la posicion
    public static char[][] hardGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width).clone();
        int boatCounter = 1;
        int warShipCounter = 1;
        insertBoat(board,boatCounter);
        insertWarShip(board,warShipCounter);
        return board;
    }

    //Crea el tablero del modo de juego Personalizado, adjudicando la cantidad de barcos, pero no la posicion
    public static char[][] customGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width).clone();
        System.out.println("Ahora elige la cantad de barcos:");
        System.out.print("Lanchas (L): ");
        int boatCounter = 0;
        while (boatCounter <= 0){
            boatCounter = scanner.nextInt();
            if (boatCounter <= 0){
                System.out.println("Por favor, introduce un valor válido");
            }
        }
        System.out.print("Buques (B): ");
        int warShipCounter = 0;
        while (warShipCounter <= 0){
            warShipCounter = scanner.nextInt();
            if (warShipCounter <= 0){
                System.out.println("Por favor, introduce un valor válido");
            }
        }
        System.out.print("Acorazados (Z): ");
        int battleshipCounter = 0;
        while (battleshipCounter <= 0){
            battleshipCounter = scanner.nextInt();
            if (battleshipCounter <= 0){
                System.out.println("Por favor, introduce un valor válido");
            }
        }
        System.out.print("Portaaviones (P): ");
        int aircraftCarrierCounter = 0;
        while (aircraftCarrierCounter <= 0){
            aircraftCarrierCounter = scanner.nextInt();
            if (aircraftCarrierCounter <= 0){
                System.out.println("Por favor, introduce un valor válido");
            }
        }
        insertBoat(board,boatCounter);
        insertWarShip(board,warShipCounter);
        insertBattleship(board,battleshipCounter);
        insertAircraftCarrier(board,aircraftCarrierCounter);
        return board;
    }

    //Inserta los botes
    public static void insertBoat(char[][]board, int boatCounter){
        while (boatCounter != 0){
            int i = random.nextInt(board.length-1)+1;
            int j = random.nextInt(board[0].length-1)+1;
            if (board[i][j] == '0'){
                board[i][j] = 'L';
                boatCounter--;
            }
        }
    }

    //Inserta los buques
    public static void insertWarShip(char[][]board, int warShipCounter){
        while (warShipCounter != 0){
            int i = random.nextInt(board.length-1)+1;
            int j = random.nextInt(board[0].length-3)+1;
            if (board[i][j] == '0' && board[i][j+1] == '0' && board[i][j+2] == '0'){
                board[i][j] = 'B';
                board[i][j+1] = 'B';
                board[i][j+2] = 'B';
                warShipCounter--;
            }
        }
    }

    //Inserta los acorazados
    public static void insertBattleship(char[][]board, int battleshipCounter){
        while (battleshipCounter != 0){
            int i = random.nextInt(board.length-1)+1;
            int j = random.nextInt(board[0].length-4)+1;
            if (board[i][j] == '0' && board[i][j+1] == '0' && board[i][j+2] == '0' && board[i][j+3] == '0'){
                board[i][j] = 'Z';
                board[i][j+1] = 'Z';
                board[i][j+2] = 'Z';
                board[i][j+3] = 'Z';
                battleshipCounter--;
            }
        }
    }

    //Inserta los portaaviones
    public static void insertAircraftCarrier(char[][]board, int aircraftCarrierCounter){
        while (aircraftCarrierCounter != 0){
            int i = random.nextInt(board.length - 5) + 1;
            int j = random.nextInt(board[0].length - 6) + 1;
            if (board[i][j] == '0' && board[i+1][j] == '0' && board[i+2][j] == '0' && board[i+3][j] == '0' && board[i+4][j] == '0'){
                board[i][j] = 'P';
                board[i+1][j] = 'P';
                board[i+2][j] = 'P';
                board[i+3][j] = 'P';
                board[i+4][j] = 'P';
                aircraftCarrierCounter--;
            }
        }
    }

    // Cantidad de disparos que tendrá el jugador
    public static int numberOfShots(int gameMode){
        int shots = 0;
        if (gameMode == 1){
            shots = 50;
        } else if (gameMode == 2){
            shots = 30;
        } else if (gameMode == 3){
            shots = 10;
        } else {
            System.out.print("Selecciona la cantidad de disparos que tendrás: ");
            while (shots <= 0){
                shots = scanner.nextInt();
                if (shots <= 0){
                    System.out.println("Por favor, introduce un valor válido");
                }
            }
        }
        System.out.println("Muy bien, en este combate tendrás un total de " + shots + " disparos.");
        return shots;
    }

    //Combate, aquí será donde el jugador seleccione dónde disparará, se comprobará la cantidad de disparos que quedan y si el jugador ha ganado o no
    public static void combat(int gameMode, char[][]boardGame, char[][]playerBoard){
        int shots = numberOfShots(gameMode);
        System.out.println("Que comience el combate!");
        System.out.println("Tienes " + shots + " disparos.");
        while(shots != 0){
            showBoard(playerBoard);
            System.out.println("Escribe en qué vertical quieres atacar (LETRA)");
            int rowNumber = 0;
            boolean booleanRow = false;
            while (!booleanRow){
                char row = scanner.next().toUpperCase().charAt(0);
                if (row >= 'A' && row <= boardGame[boardGame.length-1][0]) {
                    rowNumber = row - 'A' + 1;
                    booleanRow = true;
                } else {
                    System.out.println("Caracter inválido. Ingresa una letra de la A a la Z.");
                }
            }
            System.out.println("Escribe en qué horizontal quieres atacar (NÚMERO)");
            int columnNumber = 0;
            while (columnNumber <= 0 || columnNumber > boardGame[0].length){
                columnNumber = scanner.nextInt();
                if (columnNumber <= 0){
                    System.out.println("Por favor, introduce un valor válido");
                }
            }
            attack(playerBoard,boardGame,rowNumber,columnNumber);
            if (!checkWins(boardGame)){
                System.out.println("Has ganado!");
                showBoard(boardGame);
                break;
            }
            shots--;
            System.out.println("Te quedan " + shots + " disparos.");
            if (shots == 0){
                System.out.println("Has perdido!");
            }
        }

    }

    //Comprueba si el jugador ha ganado
    public static boolean checkWins(char[][]board){
        boolean win = false;
            for (int i = 1; i < board.length; i++) {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] == 'L' || board[i][j] == 'B' || board[i][j] == 'Z' || board[i][j] == 'P') {
                        win = true;
                        break;
                    }
                }
            }
            return win;
    }

    //Comprueba si el disparo del jugador da o no en el blanco
    public static void attack(char[][] playerBoard, char[][] boardGame, int row, int column){
        if (boardGame[row][column] == '0'){
            System.out.println("AGUA!");
            playerBoard[row][column] = boardGame[row][column];
        } else {
            System.out.println("TOCADO!");
            playerBoard[row][column] = boardGame[row][column];
            boardGame[row][column] = 'X';
        }
    }

    //Muestra el tablero que corresponda
    public static void showBoard (char[][]board){
        for (char[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }
    }
}


package PracticaHundirLaFlota;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    public static final int HEIGHT = 10 + 1; // 10 casillas
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        game();
    }
    public static void game(){
        int gameMode = menuGameMode(); //Seleccionas el modo de juego
        int height; int width;
        if(gameMode != 4){ //Si el modo de juego no es Personalizado el tablero es 11x11
            height = HEIGHT;
            width = 10;
        } else { //En caso de ser modo Personalizado
            System.out.println("Por favor, elige de cuánto va a ser tu tablero:");
            System.out.println("Altura:");
            height = (validNumValue(20,1)+1);
            System.out.println("Anchura:");
            width = (validNumValue(20,1)+1);
        }
        char inside = '-';
        char[][] playerBoard = createBoard(inside, height, width); //Crea el tablero que verá el jugador
        char[][] boardGame = selectBoard(gameMode, height, width); //Crea el tablero de juego, NO VISIBLE
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
        return validNumValue(4,1);
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
            default:
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
                board[i][0] = ' '; //board[0][0] = hueco en blanco
            } else {
                board[i][0] = capitalLetter; // coordenada con letra
                capitalLetter++;
            }
        }
        for (int j = 0; j < board[0].length; j++){
            if (j == 10){
                board[0][10] = '0';
            } else if (j == 0){
                board[0][j] = ' ';
            } else {
                board[0][j] = number; // coordenada con números
                number++;
                if (number == ':'){ // en caso de ser : cambie a 1, al no saber cómo poner 10 en adelante opté por esto para que siga siendo char
                    number = '1';
                }
            }
        }
        return board;
    }


    //Crea el tablero del modo de juego Fácil, adjudicando la cantidad de barcos
    public static char[][] easyGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width);
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

    //Crea el tablero del modo de juego Medio, adjudicando la cantidad de barcos
    public static char[][] mediumGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width);
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

    //Crea el tablero del modo de juego Difícil, adjudicando la cantidad de barcos
    public static char[][] hardGameBoard(int height, int width){
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width);
        int boatCounter = 1;
        int warShipCounter = 1;
        insertBoat(board,boatCounter);
        insertWarShip(board,warShipCounter);
        return board;
    }

    //Crea el tablero del modo de juego Personalizado
    public static char[][] customGameBoard(int height, int width) {
        String[] nameShips = {"Lanchas (L): ", "Buques (B): ", "Acorazados (Z): ", "Portaaviones (P): "};
        char inBoard = '0';
        char[][] board = createBoard(inBoard, height, width); //Crea el tablero vacío
        //int[] boardShips se compone de {máximo de espacios posibles para colocar barcos, nº de (L), nº de (B), nº de (Z), nº de (P)}
        int[] boardShips = {(height - 1) * (width - 1), 0, 0, 0, 0};
        System.out.println("Ahora elige la cantidad de barcos de cada tipo que quieres poner en el tablero");
        amountShips(boardShips,nameShips);
        insertBoat(board,boardShips[1]);
        insertWarShip(board,boardShips[2]);
        insertBattleship(board,boardShips[3]);
        insertAircraftCarrier(board,boardShips[4]);
        return board;
    }

    //Permite elegir la cantidad de barcos que quieres de cada tipo
    public static void amountShips(int[]boardShips,String[]nameShips){
        boolean ships = true;
        while (ships) {
            //selectShips(boardShips,nameShips, tipo de Barco L,B,Z,P (boardShips), nombre del barco (nameShips), máximo de barcos que puedes poner, mínimo de barcos que puedes poner)
            selectShips(boardShips, nameShips, 1, 0, 5, 0);
            if (boardShips[0] >= 5) {
                selectShips(boardShips,nameShips,4,3,2,0);
            } else if (boardShips[0] == 4) {
                selectShips(boardShips,nameShips,3,2,5,0);
            } else if (boardShips[0] == 3) {
                selectShips(boardShips,nameShips,2,1,5,0);
            }
            ships = false;
            if (boardShips[0] < 0){
                System.out.println("No te caben tantos barcos en el tablero");
                ships = true;
            }
        }
    }

    // Te permite seleccionar el nº de barcos que quieres de un tipo concreto de barco
    public static void selectShips(int[] boardShips, String[] nameShips, int typeShip, int nameShip, int max, int min) {
        System.out.println(nameShips[nameShip]);
        boardShips[typeShip] = validNumValue(max, min);
        boardShips[0] = boardShips[0] - (boardShips[typeShip]);
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
            int j = random.nextInt(board[0].length - 1) + 1;
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
        int shots;
        if (gameMode == 1){
            shots = 50;
        } else if (gameMode == 2){
            shots = 30;
        } else if (gameMode == 3){
            shots = 10;
        } else {
            System.out.print("Selecciona la cantidad de disparos que tendrás: ");
            shots = validNumValue(100,1);
        }
        System.out.println("Muy bien, en este combate tendrás un total de " + shots + " disparos.");
        return shots;
    }

    //Combate, aquí será donde el jugador seleccione dónde disparará, se comprobará la cantidad de disparos que quedan y si el jugador ha ganado o no
    public static void combat(int gameMode, char[][]boardGame, char[][]playerBoard){
        int shots = numberOfShots(gameMode);
        System.out.println("Que comience el combate!");
        System.out.println("Tienes " + shots + " disparos.");
        boolean win = false;
        if (checkWins(boardGame)){ //Antes de nada chequea si se puede jugar, por si se intenta colocar una matrix sin barcos
            System.out.println("Has ganado!");
            showBoard(boardGame);
            win = true;
        }
        while(!win){
            showBoard(playerBoard);
            System.out.println("Escribe en qué vertical quieres atacar (LETRA)");
            char row = validCharValue('A', (char) ('A'+(boardGame.length-2)));
            int rowNumber = row - 'A' + 1;
            System.out.println("Escribe en qué horizontal quieres atacar (NÚMERO)");
            int columnNumber = validNumValue((boardGame[0].length-1),1);
            attack(playerBoard,boardGame,rowNumber,columnNumber);
            if (checkWins(boardGame)){
                System.out.println("Has ganado!");
                showBoard(boardGame);
                break;
            }
            shots--;
            System.out.println("Te quedan " + shots + " disparos.");
            if (shots == 0){
                System.out.println("Has perdido!");
                win = true;
            }
        }

    }

    //Valida la entrada de caracteres
    public static char validCharValue(char min, char max) {
        char answer;
        do {
            System.out.println("Introduzca una letra entre " + min + " y " + max);
            answer = scanner.next().toUpperCase().charAt(0);
            if (answer < min || answer > max) {
                System.out.println("Opción incorrecta. Debes introducir una letra válida");
            }
        } while (answer < min || answer > max);
        return answer;
    }

    //Valida los números ingresados impidiendo caracteres extraños
    public static int validNumValue(int max, int min) {
        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Ingresa un número entre " + min + " y " + max + ": ");
                number = scanner.nextInt();

                if (number > max || number < min){
                    System.out.println("Por favor, ingresa un número dentro del rango permitido.");
                } else {
                    isValidInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        return number;
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
        return !win;
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
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}


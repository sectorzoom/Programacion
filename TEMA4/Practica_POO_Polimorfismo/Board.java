package Practica_POO_Polimorfismo;

//Clase que define cómo será el tablero que se creará en el Concurso
public class Board {

    //Atributos
    private final Cell[][] board;

    //Constructor
    public Board(int rows, int columns, Question[][] questions, Prize[][] prizes) {
        board = new Cell[rows][columns];
        initiateBoard(questions, prizes);
    }

    //Método que inicia el tablero, añadiendo una pregunta y un premio en cada celda
    private void initiateBoard(Question[][] questions, Prize[][] prizes) {
        // Itera sobre las filas y columnas del tablero
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // Crea una nueva celda
                board[i][j] = new Cell();
                // Añade la pregunta y el premio correspondientes a la celda
                board[i][j].addQuestion(questions[i][j]);
                board[i][j].addPrize(prizes[i][j]);
            }
        }
    }

    //Devuelve el objeto celda del tablero.
    public Cell getCell(int row, int column) {
        return board[row][column];
    }

    //Devuelve el número de filas.
    public int getRows() {
        return board.length;
    }

    //Devuelve el número de columnas.
    public int getColumns() {
        return board[0].length;
    }

    //Devuelve un objeto Pregunta que es la pregunta que hay en una celda del tablero.
    public Question getQuestion(int row, int column) {
        return board[row][column].getQuestion();
    }

    //Devuelve un objeto Premio que devuelve el premio que hay en una celda del tablero.
    public Prize getPrize(int row, int column) {
        return board[row][column].getPrize();
    }
}


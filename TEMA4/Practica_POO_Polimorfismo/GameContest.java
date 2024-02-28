package Practica_POO_Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

//Concurso, Main
public class GameContest {
    static Scanner scanner = new Scanner(System.in);
    private static final int rows = 4; //Las filas del tablero
    private static final int columns = 4; // Las columnas del tablero


    public static void main(String[] args) {
        Question[][] questions = generateQuestions(); //Generamos la matriz con todas las preguntas.
        Prize[][] prizes = generatePrizes(); //Generamos la matriz con todos los premios.

        Board board = new Board(rows, columns, questions, prizes); //Creamos el tablero.


        // Mostrar la cuadrícula inicialmente
        System.out.println("Cuadrícula inicial:");
        printGrid(board); //Cuadrícula vacía, la que va a ver el jugador.

        Player player = new Player("David"); //Creamos el objeto jugador.
        System.out.println("Empieza el concurso!\n" +
                "Está jugando " + player.getName());

        while (player.canContinue()) {
            System.out.println("Elige la posición de la cuadrícula\n" +
                    "Fila: ");
            int row = scanner.nextInt()-1; //Restamos 1 para que entre en los índice 0 de la matriz
            System.out.println("Columna: ");
            int column = scanner.nextInt()-1; //Restamos 1 para que entre en los índice 0 de la matriz

            if (!board.getCell(row, column).isAnswered()) { //Si la pregunta no ha sido respondida, entra en el if
                Question question = board.getQuestion(row, column); //Crea un objeto Pregunta con la pregunta que hay la celda elegida
                if (question != null) { //Si la pregunta no es nula, entra en el if
                    boolean correctAnswer = player.answerQuestion(question); //Accede al método contestaPregunta de la clase Jugador
                    if (!correctAnswer) { // Si la respuesta es incorrecta, terminar la partida
                        break;
                    }
                    // Actualizar la cuadrícula después de responder la pregunta
                    board.getCell(row, column).setAnswered(true);
                    System.out.println("Cuadrícula actualizada:");
                    printGrid(board); //Imprime la cuadrícula actualizada
                } else {
                    System.out.println("Error: No hay una pregunta en esta celda.");
                }
            } else {
                System.out.println("Esta pregunta ya ha sido respondida. Por favor, selecciona otra.");
            }
            // Verificar si todas las celdas han sido respondidas
            if (allCellsAnswered(board)) {
                System.out.println("¡Felicidades! Has respondido todas las preguntas correctamente. ¡Fin del juego!");
                player.showPrizes();
                return;
            }
        }
        System.out.println("Fin del juego");
    }

    // Método para imprimir la cuadrícula mostrando los premios asociados a las celdas respondidas
    public static void printGrid(Board board) {
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                if (board.getCell(i, j).isAnswered()) {
                    System.out.print("[" + board.getPrize(i, j).getMoney() + "] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    // Método para verificar si todas las celdas han sido respondidas
    public static boolean allCellsAnswered(Board board) {
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                if (!board.getCell(i, j).isAnswered()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Question[][] generateQuestions() {
        Question[][] questions = new Question[4][4];
        ArrayList<Question> availableQuestions = new ArrayList<>();

        availableQuestions.add(new TrueFalseQuestion("¿Verdadero o Falso? - La Tierra es Plana", false));
        availableQuestions.add(new OpenEndedQuestion("¿Quién escribió la obra \"Cien años de soledad\"?", "gabriel garcía márquez"));
        availableQuestions.add(new MultiAnswerQuestion("¿Cuál es la capital de Japón?", new String[]{"París", "Londres", "Madrid", "Roma"}, "tokio"));
        availableQuestions.add(new FillInBlankQuestion("El capital de España es ____________.", "Madrid"));

        availableQuestions.add(new MultiAnswerQuestion("¿Cuántos planetas hay en el Sistema Solar?", new String[]{"7", "8", "9", "6"}, "8"));
        availableQuestions.add(new OpenEndedQuestion("¿Cuál es la fórmula química del agua?", "h2o"));
        availableQuestions.add(new TrueFalseQuestion("¿Verdadero o Falso? - El Sol es una estrella", true));
        availableQuestions.add(new MultiAnswerQuestion("¿Cuál es el océano más grande del mundo?", new String[]{"Océano Atlántico", "Océano Índico", "Océano Pacífico", "Océano Antártico"}, "Océano Pacífico"));

        availableQuestions.add(new OpenEndedQuestion("¿Quién pintó la Mona Lisa?", "leonardo da vinci"));
        availableQuestions.add(new TrueFalseQuestion("¿Verdadero o Falso? - La Luna es más grande que la Tierra", false));
        availableQuestions.add(new FillInBlankQuestion("El número de lados en un triángulo equilátero es ____________.", "3"));
        availableQuestions.add(new MultiAnswerQuestion("¿Cuál es el río más largo del mundo?", new String[]{"Yangtse", "Nilo", "Missisipi", "Amazonas"}, "Amazonas"));

        availableQuestions.add(new FillInBlankQuestion("La fórmula química del agua es H__________O.", "2"));
        availableQuestions.add(new MultiAnswerQuestion("¿De qué color era el caballo blanco de Santiago?", new String[]{"Gris", "Blanco", "Verde", "No existe tal caballo"}, "Blanco"));
        availableQuestions.add(new OpenEndedQuestion("¿Cómo se llama Tony Stark cuando se enfunda su traje?", "ironman"));
        availableQuestions.add(new TrueFalseQuestion("¿Verdadero o Falso? - Programación puede llegar a ser muy frustrante cuando no te sale POO y Polimorfismo", true));

        // Aleatorizar el orden de la lista de preguntas
        Collections.shuffle(availableQuestions);

        // Asignar las preguntas aleatorizadas a la matriz de preguntas
        int index = 0;
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                questions[i][j] = availableQuestions.get(index);
                index++;
            }
        }
        return questions;
    }


    //Método estático que genera objetos Premio aleatorios para meterlos en las celdas
    public static Prize[][] generatePrizes() {
        Prize[][] prizes = new Prize[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                prizes[i][j] = new Prize();
            }
        }

        return prizes;
    }
}


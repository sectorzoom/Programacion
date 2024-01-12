package Actividades_String;

import java.util.Arrays;
import java.util.Scanner;

public class HangManGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        game();
    }
    public static void game(){
        System.out.println("Bienvenido al juego del ahorcado.");
        String gameWord = setGameword();
        StringBuilder currentProgress = new StringBuilder("_".repeat(gameWord.length()));
        System.out.println("Comienza el juego!");
        System.out.println("Nota: tienes 6 intentos.");
        int attempts = 6;
        String[][] hangman = displayHangman();
        int counter = 1;
        while (attempts > 0 && currentProgress.toString().contains("_")){
            showAttemptsLeft(attempts);
            showHangman(hangman);
            displayCurrentProgress(currentProgress);
            char letter = setLetter();
            boolean letterFound = checkLetter(gameWord,currentProgress, letter);
            if (!letterFound){
                attempts--;
            }
            counter = showPartsOfHangman(gameWord,hangman,currentProgress,letter,counter);
        }
        showHangman(hangman);
        showAttemptsLeft(attempts);
        displayResult(gameWord,attempts);
    }
    public static String setGameword(){
        System.out.println("Por favor, introduce la palabra de juego.");
        return scanner.next().toUpperCase();
    }
    public static char setLetter(){
        System.out.println("Dime, qué letra crees que está?");
        return scanner.next().toUpperCase().charAt(0);
    }
    public static String[][] displayHangman(){
        return new String[][]{{"-","-","-","-"},{"|"," "," "," "},{"|"," "," "," "},{"|"," "," "," "},{"|"," "," "," "},{"-","-","-","-"}};
    }
    public static String[][] completeHangman(){
        return new String[][]{{"-","-","-","-"},{"|"," ","O"," "},{"|"," "," "," "},{"|","/","|","/"},{"|","/"," ","/"},{"-","-","-","-"}};
    }
    public static int showPartsOfHangman(String gameWord, String[][] hangman, StringBuilder currentProgress, char letter, int counter){
        String[][] completeHangman = completeHangman();
        if (!checkLetter(gameWord, currentProgress, letter)){
            if (counter == 1){
                hangman[counter] = completeHangman[counter];
                counter++;
            } else if (counter == 2){
                hangman[counter+1][1] = completeHangman[counter+1][1];
                counter++;
            } else if (counter == 3){
                hangman[counter][2] = completeHangman[counter][2];
                counter++;
            } else if (counter == 4){
                hangman[counter-1][3] = completeHangman[counter-1][3];
                counter++;
            } else if (counter == 5){
                hangman[counter-1][1] = completeHangman[counter-1][1];
                counter++;
            } else {
                hangman[counter-2][3] = completeHangman[counter-2][3];
                counter++;
            }
        }
        return counter;
    }
    public static void showAttemptsLeft(int attempts){
        System.out.println("Te quedan " + attempts + " intentos.");
    }
    public static void showHangman(String[][] hangman){
        for (String[] strings : hangman) {
            System.out.println((Arrays.toString(strings)));
        }
    }
    public static void displayCurrentProgress(StringBuilder currentProgress){
        System.out.println("\nPalabra a adivinar: ");
        System.out.println(currentProgress);
    }
    public static boolean checkLetter(String gameWord, StringBuilder currentProgress, char letter){
        boolean letterFound = false;
        for (int i = 0; i < gameWord.length(); i++){
            if(gameWord.charAt(i) == letter){
                currentProgress.setCharAt(i,letter);
                letterFound = true;
            }
        }
        return letterFound;
    }
    public static void displayResult(String gameWord, int attempts) {
        if (attempts > 0) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + gameWord);
        } else {
            System.out.println("Lo siento, te has quedado sin intentos. La palabra era: " + gameWord);
        }
    }
}

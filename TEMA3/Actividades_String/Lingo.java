package Actividades_String;

import java.util.Arrays;
import java.util.Scanner;

public class Lingo{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        game();
    }
    public static String setHiddenWord(){
        System.out.println("Introduce la palabra escondida: ");
        return scanner.nextLine().toUpperCase();
    }
    public static String setTry(){
        System.out.println("Introduce la palabra que crees que es: ");
        return scanner.nextLine().toUpperCase();
    }
    public static char[] fillHint(String hiddenWord){
        char[] hint = new char[hiddenWord.length()];
        Arrays.fill(hint, '_');
        System.out.println("Palabra a adivinar: ");
        System.out.println(hint);
        return hint;
    }
    public static void showHint(String hiddenWord, String wordTry, char[] hint) {
        boolean[] letterUsed = new boolean[hiddenWord.length()];
        boolean[] letterMatched = new boolean[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); i++) {
            char hiddenChar = Character.toUpperCase(hiddenWord.charAt(i));
            char tryChar = Character.toUpperCase(wordTry.charAt(i));
            if (tryChar == hiddenChar && !letterUsed[i]) {
                hint[i] = tryChar;
                letterUsed[i] = true;
                letterMatched[i] = true;
            } else if (hiddenWord.indexOf(tryChar) != -1) {
                int index = hiddenWord.indexOf(tryChar);
                while (index != -1 && (letterUsed[index] || letterMatched[index])) {
                    index = hiddenWord.indexOf(tryChar, index + 1);
                }
                if (index != -1) {
                    hint[index] = '*';
                    letterUsed[index] = true;
                }
            }
        }
        System.out.println(hint);
    }

    public static void game(){
        String hiddenWord = setHiddenWord();
        char[] hint = fillHint(hiddenWord);
        int attempts = 5;
        System.out.println("Tienes " + attempts + " intentos.");
        while (attempts != 0){
            String wordTry = setTry();
            if (hiddenWord.equals(wordTry)){
                System.out.println("Enhorabuena has ganado!");
                System.out.println(hiddenWord);
                attempts = 0;
            } else {
                showHint(hiddenWord,wordTry, hint);
                attempts--;
                System.out.println("Te quedan " + attempts + " intentos.");
                if (attempts == 0){
                    System.out.println("Lo siento, has perdido la palabra era: ");
                    System.out.println(hiddenWord);
                }
            }
        }
    }
}
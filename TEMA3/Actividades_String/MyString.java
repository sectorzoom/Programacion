package Actividades_String;

import java.util.Scanner;

public class MyString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //invertedString();
        //sayNumOfVowels();
        //sayTheMostLarge();
        sayNumOfWords();
        //sayNumOfStringRep();
    }
    public static void invertedString () {
        System.out.println("Introduzca la cadena que quiere dar la vuelta y ponerla en mayúscula");
        String string = scanner.nextLine();
        System.out.println(string + " al revés y en mayúscula es " + invertAndUpperCase(string));
    }
    public static String invertAndUpperCase(String string){
        return new StringBuilder(string).reverse().toString().toUpperCase();
    }
    public static void sayNumOfVowels(){
        System.out.println("Introduzca la cadena de la que quiere saber el número de vocales que contiene");
        String string = scanner.nextLine();
        System.out.println(string + " tiene " + countNumOfVowels(string) + " vocales.");
    }
    public static int countNumOfVowels(String string){
        String stringLowerCase = string.toLowerCase();
        char[]characters = stringLowerCase.toCharArray();
        int count = 0;
        for (char character : characters) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void sayTheMostLarge() {
        System.out.println("Introduzca la cadena que quiere comparar y diré cuál es la palabra más larga que tiene");
        String string = scanner.nextLine();
        System.out.println("La palabra más larga es " + theMostLarge(string));

    }
    public static String theMostLarge(String string) {
        String[] words = string.split(" ");
        String mostLargeWord = "";
        for (String word : words) {
            if (word.length() > mostLargeWord.length()) {
                mostLargeWord = word;
            }
        }
        return mostLargeWord;
    }
    public static void sayNumOfStringRep(){
        System.out.println("Introduce dos cadenas y te diré cuántas veces se repite la segunda en la primera");
        System.out.println("Primera cadena: ");
        String string1 = scanner.nextLine();
        System.out.println("Segunda cadena: ");
        String string2 = scanner.nextLine();
        System.out.println("La segunda cadena se repite " + countNumOfRep(string1,string2) + " veces.");
    }
    public static int countNumOfRep(String string1, String string2){
        int numOfRep = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.startsWith(string2, i)) {
                numOfRep++;
            }
        }
        return numOfRep;
    }


    public static void sayNumOfWords(){
        System.out.println("Introduzca la cadena y diré cuántas palabras tiene");
        String string = scanner.nextLine();
        System.out.println("Tu cadena tiene " + countNumOfWords(string) + " palabras.");
    }
    public static int countNumOfWords(String string){
        String[] words = string.split(" ");
        return words.length;
    }

}




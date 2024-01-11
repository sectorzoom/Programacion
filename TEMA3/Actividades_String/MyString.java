package Actividades_String;

import java.util.Scanner;

public class MyString {
    static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu (){
        boolean option = true;
        while (option) {
            System.out.println("""
                     Introduzca qué ejercicio quiere hacer:
                     a) Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas.
                     b) Una función que reciba una cadena y devuelva el número de vocales.
                     c) Una función que reciba una cadena y devuelva la palabra de mayor longitud.
                     d) Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera.
                     e) Una función que reciba una cadena y devuelva el número de palabras que contiene.
                     f) Una función que reciba un número de teléfono, por ejemplo “34555332211” y lo convierta al formato (+34)-555-332211.
                     g) Un procedimiento que reciba una cadena y muestre por pantalla el histograma de frecuencias de las vocales (las veces que se repiten)
                     h) Pulsa H para salir""");
            System.out.print("Indique aquí su elección:");
            char election = scanner.nextLine().toLowerCase().charAt(0);
            switch (election) {
                case 'a':
                    invertedString();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'b':
                    sayNumOfVowels();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'c':
                    sayTheMostLarge();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'd':
                    sayNumOfWords();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'e':
                    sayNumOfStringRep();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'f':
                    showFormatPhone();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'g':
                    showAmountEachVowels();
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'h':
                    option = false;
                    break;
                default:
                    System.out.println("Introduce un valor correcto");
            }
        }
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
    public static void showFormatPhone(){
        System.out.println("Introduzca el número de teléfono que quiere cambiar de formato");
        System.out.println("Nota: el número debe tener 11 dígitos");
        long number = Long.parseLong(scanner.nextLine());

        String phone = String.valueOf(number);
        System.out.println("El nuevo formato es: " + convertFormat(phone));
    }
    public static String convertFormat(String phone){
        StringBuilder stringBuilder = new StringBuilder(phone);
        stringBuilder.insert(0,"(+");
        stringBuilder.insert(4,")-");
        stringBuilder.insert(9,"-");
        return stringBuilder.toString();
    }
    public static void showAmountEachVowels(){
        System.out.println("Escribe la cadena y te diré cuántas vocales tiene de cada una");
        String string = scanner.nextLine();
        countAmountEachVowel(string);

    }
    public static void countAmountEachVowel(String string){
        string = string.toLowerCase();
        int[]numVowels = new int[5];
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == 'a') {
                numVowels[0]++;
            } else if (character == 'e') {
                numVowels[1]++;
            } else if (character == 'i') {
                numVowels[2]++;
            } else if (character == 'o') {
                numVowels[3]++;
            } else if (character == 'u') {
                numVowels[4]++;
            }
        }
        System.out.println("Histograma de frecuencias de vocales:");
        System.out.println("A: " + numVowels[0]);
        System.out.println("E: " + numVowels[1]);
        System.out.println("I: " + numVowels[2]);
        System.out.println("O: " + numVowels[3]);
        System.out.println("U: " + numVowels[4]);
    }

}




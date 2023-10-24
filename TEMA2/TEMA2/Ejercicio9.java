package TEMA2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void triangle (char character, int numberLines) {
        for (int i = 1; i <= numberLines; i++){
            for (int z = 1; z <= numberLines-i; z++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba un caracter:");
        char character;
        character = in.next().charAt(0);
        System.out.println("Escriba el número de líneas de tu triángulo");
        int numberLines;
        numberLines = in.nextInt();
        triangle(character,numberLines);
    }
}

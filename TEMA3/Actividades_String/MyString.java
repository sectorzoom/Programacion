package Actividades_String;

import java.util.Scanner;

public class MyString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(invertedString());
    }
    public static String invertedString () {
        System.out.println("Introduzca la cadena que quiere dar la vuelta y ponerla en mayúscula");
        String string = scanner.next();
        return invertAndUpperCase(string);
    }
    public static String invertAndUpperCase(String string){
        String invertedString = new StringBuilder(string).reverse().toString();
        return invertedString.toUpperCase();
    }
}




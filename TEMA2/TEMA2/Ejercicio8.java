package TEMA2;
import java.util.Scanner;
public class Ejercicio8 {
    public static boolean verifyDate(int day, int month, int year) {
        boolean correct = false;
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day <= 30;
            }
            if (month == 2) {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            }
            correct = true;
        }
        return correct;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Ingresa el mes (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Ingresa el año: ");
        int year = scanner.nextInt();

        boolean correctDate = verifyDate(day, month, year);

        if (correctDate) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
}



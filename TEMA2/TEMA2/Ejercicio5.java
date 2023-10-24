package TEMA2;
import java.util.Scanner;
public class Ejercicio5 {
    public static void multiplicationTable(int number) {
        System.out.println("La tabla de multiplicar de " + number + " es:");
        int multiplicator = 0;
        do {
            System.out.println(multiplicator + " x " + number + " = " + (multiplicator * number));
            multiplicator++;
        } while (multiplicator < 11);
    }
    public static boolean selectionNumber(int selection) {
        return selection <= 0 || selection > 10;
    }
    public static boolean repeatTable(char repeat) {
        boolean correct = repeat == 's' || repeat == 'S';
        if (!correct) {
            System.out.println("Introduzca un valor válido. S o N");
        }
        return correct;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean select = true;
        while (select) {
            System.out.println("Introduzca el número del que quiere saber su tabla");
            int number = in.nextInt();
            while (selectionNumber(number)) {
                System.out.println("Por favor, introduzca un valor válido, entre 0 y 10");
                number = in.nextInt();
            }
            multiplicationTable(number);
            System.out.println("¿Quieres ver la tabla de otro número?");
            while (true) {
                char selection = in.next().charAt(0);
                if (selection == 'n' || selection == 'N') {
                    select = false;
                    break;
                } else if (repeatTable(selection))
                    break;
            }
        }
    }
}

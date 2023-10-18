package TEMA2;
import java.util.Scanner;
public class Ejercicio5 {
    public static void multiplication_table (int number) {
        System.out.println("La tabla de multiplicar de " + number + " es:");
        int multiplicator = 0;
        do {
            System.out.println(multiplicator + " x " + number + " = " + (multiplicator * number));
            multiplicator++;
        }while (multiplicator<11);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean select = true;
        while (select){
            int number = 0;
            while ((number <= 0) || (number > 10)) {
                System.out.println("Por favor, introduzca el número que quiere saber su tabla:");
                number = in.nextInt();
                if ((number <= 0) || (number > 10)) {
                    System.out.println("Introduzca un número del 1 al 10");
                }
            }
            multiplication_table(number);
            System.out.println("¿Quieres ver la tabla de otro número?");
            char selection;
            while (true) {
                selection = in.next().charAt(0);
                if ((selection == 'n') || (selection == 'N')) {
                    select = false;
                    break;
                }
                if ((selection == 's') || (selection == 'S')) {
                    break;
                }
                else {
                    System.out.println("Por favor, escriba s o n");
                }
            }
        }
    }
}

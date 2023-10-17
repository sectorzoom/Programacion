package TEMA2;
import java.util.Scanner;
public class Ejercicio1 {
    public static int numberSign (int number){
        int valor = 0;
        if (number<0){
            valor = -1;
        }
        if (number>0){
            valor = 1;
        }
        return valor;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Si es positivo, saldrá 1, si es negativo, -1, si es 0, 0.");
        System.out.println("Introduzca un valor: ");
        int number = in.nextInt();
        System.out.println("Su valor es " + numberSign(number));
    }
}

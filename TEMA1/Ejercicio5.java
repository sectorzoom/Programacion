import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Escriba su primer número: ");
        float a = in.nextInt();
        System.out.println("Escriba su segundo número: ");
        float b = in.nextInt();
        System.out.println("Escriba su tercer número: ");
        float c = in.nextInt();
        float media_con_decimales = ((a+b+c)/3);
        int media_sin_decimales = (int) ((a+b+c)/3);
        System.out.println("La media de los tres números con decimales es: " + media_con_decimales);
        System.out.println("La media de los tres sin decimales es: " + media_sin_decimales);
    }
}

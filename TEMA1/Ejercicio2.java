import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]largs){
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la base del rectángulo: ");
        int base = in.nextInt();
        System.out.println("Escriba la altura del rectángulo: ");
        int altura = in.nextInt();
        System.out.println("El área del rectángulo es: " + (base*altura));
        System.out.println("El perímetro del rectángulo es: " + ((2*base)+(2*altura)));
    }
}

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        double a = in.nextDouble();
        System.out.println("Escriba el segundo número: ");
        double b = in.nextDouble();
        System.out.println("Escriba el tercer número: ");
        double c = in.nextDouble();
        if ((b==a+1) && (c==b+1)){
            System.out.println("Los números son consecutivos.");
        }
        else{
            System.out.println("Los números no son consecutivos.");
        }
    }
}

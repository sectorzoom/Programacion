import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        int a = in.nextInt();
        System.out.println("Escriba el segundo número: ");
        int b = in.nextInt();
        System.out.println("Escriba el tercer número: ");
        int c = in.nextInt();
        if ((b==a+1) && (c==b+1)){
            System.out.println("Los números son consecutivos.");
        }
        else{
            System.out.println("Los números no son consecutivos.");
        }
    }
}

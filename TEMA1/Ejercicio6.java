import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Escribe el número: ");
        int a = in.nextInt();
        if (a>0){
            System.out.println("El número es positivo");
        }
        if (a<0){
            System.out.println("El número es negativo");
        }
        if (a==0){
            System.out.println("El número es 0");
        }
    }
}

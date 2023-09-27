import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe 0 para cuadrado, 1 para rectángulo y 2 para tríangulo");
        int a = in.nextInt();
        if (a==0){
            System.out.println("Escriba el lado del cuadrado: ");
            int lado = in.nextInt();
            System.out.println("El área del cuadrado es " + (lado*lado));
            System.out.println("El perímetro del cuadrado es " + (4*lado));
        }
        if (a==1){
            System.out.println("Escriba la base del rectángulo: ");
            int base = in.nextInt();
            System.out.println("Escriba la altura del rectángulo: ");
            int altura = in.nextInt();
            System.out.println("El área del rectángulo es: " + (base*altura));
            System.out.println("El perímetro del rectángulo es: " + ((2*base)+(2*altura)));
        }
        if (a==2){
            System.out.println("Escriba la base del triángulo: ");
            int base = in.nextInt();
            System.out.println("Escriba la altura del triángulo: ");
            int altura = in.nextInt();
            System.out.println("El área del triángulo es: " + ((base * altura)/2));
        }
    }
}

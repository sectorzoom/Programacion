import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el lado del cuadrado: ");
        int lado = in.nextInt();
        System.out.println("El área del cuadrado es " + (lado*lado));
        System.out.println("El perímetro del cuadrado es " + (4*lado));
        
    }
}

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Escriba el primer número: ");
        int a= in.nextInt();
        System.out.println("Escriba el segundo número: ");
        int b= in.nextInt();
        if (a>b){
            System.out.println(a-b);
        }
        if (b>a){
            System.out.println(b-a);
        }
        if (a==b) {
            System.out.println("0");
        }
    }
}

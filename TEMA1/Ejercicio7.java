import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        if (a>b){
            System.out.println(a-b);
        }
        if (b>a){
            System.out.println(b-a);
        }
        else {
            System.out.println("0");
        }
    }
}

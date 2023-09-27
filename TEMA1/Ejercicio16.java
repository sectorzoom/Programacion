import java.util.Date;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la cantidad: ");
        double cantidad = in.nextDouble();
        System.out.println("Escriba D si quiere convertir de € a $ o escriba E si quiere convertir de $ a €: ");
        char a = in.next().charAt(0);
        if (a=='D'){
            double conversion_euro_dolares=1.06;
            double euros = cantidad;
            double dolares = euros*conversion_euro_dolares;
            System.out.println("Tus " + euros + " euros" + " equivalen a " + (dolares) + " dólares.");
        }
        if (a=='E'){
            double conversion_dolares_euro=0.95;
            double dolares = cantidad;
            double euros = dolares*conversion_dolares_euro;
            System.out.println("Tus " + dolares + " dólares" + " equivalen a " + (euros) + " euros.");
        }
    }
}

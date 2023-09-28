import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int numero;
        double suma_numeros = 0;
        double suma_veces = 0;
        do {
            numero = in.nextInt();
            if (numero >= 0){
                suma_numeros += numero;
                suma_veces++;
            }
            System.out.println("Introduzca un número: ");
        } while (numero>= 0);
        double resultado = suma_numeros / suma_veces;
        System.out.println("La media es " + resultado + ".");

    }
}

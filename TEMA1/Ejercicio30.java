import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Estás ante la magnífica calculadora de David Gimenez.");
        char contestacion = 'S';
        while (contestacion != 'N'){
            System.out.println("Dime, ¿cuál es tu primero número?");
            double numero1 = in.nextDouble();
            System.out.println("Gran número el " + numero1 + ", y ¿qué te gustaría hacer con él?");
            char operacion = in.next().charAt(0);
            switch (operacion) {
                case '+':
                    System.out.println("Entonces quieres sumar tu gran " + numero1 + " pero, ¿a qué número?");
                    double numero2 = in.nextDouble();
                    System.out.println("Perfecto, ya tenemos tus dos números y tu operación, tu resultado es " + (numero1 + numero2) + ".");
                    break;
                case '-':
                    System.out.println("Entonces quieres restar tu gran " + numero1 + " pero, ¿a qué número?");
                    double numero3 = in.nextDouble();
                    System.out.println("Perfecto, ya tenemos tus dos números y tu operación, tu resultado es " + (numero1 - numero3) + ".");
                    break;
                case 'x':
                    System.out.println("Entonces quieres multiplicar tu gran " + numero1 + " pero, ¿con qué número?");
                    double numero4 = in.nextDouble();
                    System.out.println("Perfecto, ya tenemos tus dos números y tu operación, tu resultado es " + (numero1 * numero4) + ".");
                    break;
                case '/':
                    System.out.println("Entonces quieres dividir tu gran " + numero1 + " pero, ¿con qué número?");
                    double numero5 = in.nextDouble();
                    System.out.println("Perfecto, ya tenemos tus dos números y tu operación, tu resultado es " + (numero1 / numero5) + ".");
                    break;
                case '%':
                    System.out.println("Entonces quieres saber el resto de tu gran " + numero1 + " pero, ¿con qué número?");
                    double numero6 = in.nextDouble();
                    System.out.println("Perfecto, ya tenemos tus dos números y tu operación, tu resultado es " + (numero1 % numero6) + ".");
                    break;
                default:
                    System.out.println("Ups, creo que te has colado, inténtalo de nuevo.");
            }
            System.out.println("¿Quieres hacer otra operación?");
            System.out.println("Contesta [S] o [N]");
            contestacion =  in.next().charAt(0);
            while ((contestacion != 'S') && (contestacion != 'N')) {
                System.out.println("Lo siento, no te he entendido, escribe S o N.");
                contestacion = in.next().charAt(0);
            }
        }
    }
}

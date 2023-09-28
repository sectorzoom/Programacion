import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la nota del alumno: ");
        double nota;
        int aprobados = 0;
        int suspendidos = 0;
        do {
            nota = in.nextDouble();
            if (nota>=5){
                aprobados++;
                System.out.println("Aprobados: " + aprobados + ".");
            } else {
                suspendidos++;
                System.out.println("Suspendidos: " + suspendidos + ".");
            }
        } while (nota<10);
    }
}

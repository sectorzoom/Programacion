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
            if ((nota>=5) && (nota<=10)){
                aprobados++;
                System.out.println("Aprobados: " + aprobados + ".");
            }
            if ((nota<5) && (nota>=0)) {
                suspendidos++;
                System.out.println("Suspendidos: " + suspendidos + ".");
            }
            if ((nota<0) || (nota>10)) {
                System.out.println("Error, nota inválida.");
            }
        } while (nota==nota);
    }
}

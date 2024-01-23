package POO1;

import java.util.Scanner;

public class MainReloj {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el modo de hora (12 o 24)");
        int mode = scanner.nextInt();
        System.out.println("Introduce hora");
        int hour = scanner.nextInt();
        System.out.println("Introduce minutos");
        int minutes = scanner.nextInt();
        System.out.println("Introduce segundos");
        int seconds = scanner.nextInt();
        Reloj reloj = new Reloj(hour,minutes,seconds,mode);
        reloj.showReloj();
        System.out.println(reloj);
    }
}
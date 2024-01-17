package POO1;

import java.util.Scanner;

public class mainReloj {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        System.out.println("Introduce el modo de hora (12 o 24)");
        int mode = scanner.nextInt();
        reloj.setMode(mode);
        System.out.println("Introduce hora");
        int hour = scanner.nextInt();
        System.out.println("Introduce minutos");
        int minutes = scanner.nextInt();
        System.out.println("Introduce segundos");
        int seconds = scanner.nextInt();
        reloj.setHours(hour,mode);
        reloj.setMinutes(minutes);
        reloj.setSeconds(seconds);
        reloj.showReloj();
        System.out.println(reloj);
        Reloj reloj1 = new Reloj(hour,minutes,seconds);
        reloj1.showReloj();

    }
}

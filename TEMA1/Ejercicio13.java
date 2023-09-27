import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la hora actual:");
        int horas = in.nextInt();
        System.out.println("Escriba los minutos actuales:");
        int minutos = in.nextInt();
        System.out.println("Escriba los segundos actuales:");
        int segundos = in.nextInt();
        if ((horas<24) && (segundos<59)){
            int a = segundos+1;
            System.out.println("La hora es " + horas + ":" + minutos + ":" + a);
        }
        if ((horas<24) && (segundos==59) && (minutos<59)){
            int b = minutos+1;
            System.out.println("La hora es " + horas + ":" + b + ":" + "00");
        }
        if ((horas<24) && (minutos==59) && (segundos<=59)){
            int c = horas+1;
            System.out.println("La hora es " + c + ":" + "00" + ":" + "00");
        }
        if ((horas>=24) || (minutos>=60) || (segundos>=60)){
            System.out.println("Hora errónea.");
        }
    }
}

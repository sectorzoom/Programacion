import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe el mes: ");
        int mes = in.nextInt();
        System.out.println("Escribe el año: ");
        int year = in.nextInt();
        if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==11)){
            int dias = 31;
            System.out.println("El mes tiene " + dias + " días.");
        }
        if ((mes==4) || (mes==6) || (mes==9) || (mes==10)) {
            int dias = 30;
            System.out.println("El mes tiene " + dias + " días.");
        }
        if ((mes==2) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0))){
            int dias = 29;
            System.out.println("El mes tiene " + dias + " días.");
        }
        if ((mes==2) && !((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0))){
            int dias = 28;
            System.out.println("El mes tiene " + dias + " dias.");
        }

    }
}

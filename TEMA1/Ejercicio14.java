import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el número de personas:");
        int personas= in.nextInt();
        System.out.println("Escriba el número de días:");
        int dias= in.nextInt();
        if ((personas>5) && (dias>=7)){
            double tarifa = ((dias*personas*15)*0.75);
            System.out.println("El precio final es " + tarifa);
        }
        else{
            int tarifa = (dias*personas*15);
            System.out.println("El precio final es " + tarifa);
        }
    }
}

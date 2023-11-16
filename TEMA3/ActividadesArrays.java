import java.util.Arrays;
import java.util.Scanner;
public class ActividadesArrays {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] example = new int[5];
        System.out.println("a) Procedimiento que imprima el array.");
        randomNumbers(example);
        a(example);

        System.out.println("b) Función que devuelva el máximo del array.");
        System.out.println(b(example));

        System.out.println("c) Función que devuelva el mínimo del array.");
        System.out.println(c(example));

        System.out.println("d) Función que devuelva la media");
        System.out.println(d(example));

        System.out.println(" e) Función que te diga si un elemento existe en el array o no");
        if (e(example)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }

    }
    public static void randomNumbers (int[] random) {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
    }
    public static void a (int[] exampleA) {
        System.out.println(Arrays.toString(exampleA));
    }
    public static int b (int[] exampleB) {
        int max = exampleB[0];
        for (int j : exampleB) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int c (int[] exampleC) {
        int min = exampleC[0];
        for (int j : exampleC) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static int d (int[] exampleD) {
        int suma = 0;
        for (int j : exampleD) {
            suma += j;
        }
        return suma / exampleD.length;
    }
    public static boolean e (int[] exampleE) {
        boolean exist = false;
        System.out.println("Escribe el número que deseas saber si está en el array");
        int number = in.nextInt();
        for (int i : exampleE) {
            if (i == number) {
                exist = true;
                System.out.println();
                break;
            }
        }
        return exist;
    }
}

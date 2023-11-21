import java.util.Arrays;
import java.util.Scanner;
public class ActividadesArrays {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] example = new int[5];
        int[] example2 = new int[5];
        System.out.println("a) Procedimiento que imprima el array.");
        randomNumbers(example);
        a(example);

        System.out.println("b) Función que devuelva el máximo del array.");
        System.out.println(b(example));

        System.out.println("c) Función que devuelva el mínimo del array.");
        System.out.println(c(example));

        System.out.println("d) Función que devuelva la media");
        System.out.println(d(example));

        System.out.println("e) Función que te diga si un elemento existe en el array o no");
        if (e(example)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }

        System.out.println("f) Función que haga la suma de dos vectores (arrays)");
        a(example);
        System.out.println("         +");
        randomNumbers(example2);
        a(example2);
        System.out.println("         =");
        System.out.println(Arrays.toString(f(example, example2)));

        System.out.println("g) Función que haga la resta de dos vectores (arrays)");
        a(example);
        System.out.println("         -");
        randomNumbers(example2);
        a(example2);
        System.out.println("         =");
        System.out.println(Arrays.toString(g(example, example2)));

        System.out.println("h) Función que haga el producto escalar de dos vectores (arrays)");
        a(example);
        System.out.println("         *");
        randomNumbers(example2);
        a(example2);
        System.out.println("         =");
        System.out.println(h(example, example2));
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
    public static int[] f (int[] exampleF1, int[] exampleF2) {
        int length = Math.max(exampleF1.length, exampleF2.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = exampleF1[i] + exampleF2[i];
        }
        return result;
    }
    public static int[] g (int[] exampleG1, int[] exampleG2) {
        int length = Math.max(exampleG1.length, exampleG2.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = exampleG1[i] - exampleG2[i];
        }
        return result;
    }
    public static int h (int[] exampleG1, int[] exampleH2) {
        int length = Math.max(exampleG1.length, exampleH2.length);
        int[] result = new int[length];
        int suma = 0;
        for (int i = 0; i < length; i++) {
            result[i] = exampleG1[i] * exampleH2[i];
        }
        for (int i : result) {
            suma += i;

        }
        return suma;
    }
}

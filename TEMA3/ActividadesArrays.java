import java.util.Arrays;
import java.util.Scanner;
public class ActividadesArrays {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        exercise1();
    }
    public static void exercise1 () {
        int[] example = new int[5];
        int[] example2 = new int[5];
        System.out.println("a) Procedimiento que imprima el array.");
        randomNumbers(example);
        printArray(example);

        System.out.println("b) Función que devuelva el máximo del array.");
        System.out.println(maxValue(example));

        System.out.println("c) Función que devuelva el mínimo del array.");
        System.out.println(minValue(example));

        System.out.println("d) Función que devuelva la media");
        System.out.println(average(example));

        System.out.println("e) Función que te diga si un elemento existe en el array o no");
        if (ifExistElement(example)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }

        System.out.println("f) Función que haga la suma de dos vectores (arrays)");
        printArray(example);
        System.out.println("         +");
        randomNumbers(example2);
        printArray(example2);
        System.out.println("         =");
        System.out.println(Arrays.toString(additionArrays(example, example2)));

        System.out.println("g) Función que haga la resta de dos vectores (arrays)");
        printArray(example);
        System.out.println("         -");
        randomNumbers(example2);
        printArray(example2);
        System.out.println("         =");
        System.out.println(Arrays.toString(substractionArrays(example, example2)));

        System.out.println("h) Función que haga el producto escalar de dos vectores (arrays)");
        printArray(example);
        System.out.println("         *");
        randomNumbers(example2);
        printArray(example2);
        System.out.println("         =");
        System.out.println(scalarProduct(example, example2));
    }
    public static void randomNumbers (int[] random) {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
    }
    public static void printArray (int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static int maxValue (int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int minValue (int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static int average (int[] array) {
        int suma = 0;
        for (int j : array) {
            suma += j;
        }
        return suma / array.length;
    }
    public static boolean ifExistElement (int[] array) {
        boolean exist = false;
        System.out.println("Escribe el número que deseas saber si está en el array");
        int number = in.nextInt();
        for (int i : array) {
            if (i == number) {
                exist = true;
                System.out.println();
                break;
            }
        }
        return exist;
    }
    public static int[] additionArrays (int[] array1, int[] array2) {
        int[] result;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = new int[array1.length];
                for (int i = 0; i < array2.length; i++) {
                    result [i] = array1[i] + array2 [i];
                }
                System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
            }
            else {
                result = new int[array2.length];
                for (int i = 0; i < array1.length; i++) {
                    result [i] = array2[i] + array1 [i];
                }
                System.arraycopy(array2, array1.length, result, array1.length, array2.length - array1.length);
            }

        } else {
            int length = array1.length;
            result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = array1[i] + array2[i];
            }
        }
        return result;
    }
    public static int[] substractionArrays (int[] array1, int[] array2) {
        int[] result;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = new int[array1.length];
                for (int i = 0; i < array2.length; i++) {
                    result [i] = array1[i] - array2 [i];
                }
                System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
            }
            else {
                result = new int[array2.length];
                for (int i = 0; i < array1.length; i++) {
                    result [i] = array2[i] - array1 [i];
                }
                System.arraycopy(array2, array1.length, result, array1.length, array2.length - array1.length);
            }

        } else {
            int length = array1.length;
            result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = array1[i] - array2[i];
            }
        }
        return result;
    }
    public static int scalarProduct (int[] array1, int[] array2) {
        int length = Math.max(array1.length, array2.length);
        int[] result = new int[length];
        int suma = 0;
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] * array2[i];
        }
        for (int i : result) {
            suma += i;

        }
        return suma;
    }
    public static int[] invertArray (int[]array) {
        int length = array.length-1;
        int[] array2 = array.clone();
        for(int i = 0; i < array.length; i++) {
            array[i] = array2[length-i];
        }
        return array;
    }
}

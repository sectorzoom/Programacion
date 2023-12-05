package Actividades_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    static Scanner in = new Scanner(System.in);

    public static void printArray(int[] array) {
        System.out.println("a) Procedimiento que imprima el array.");
        System.out.println(Arrays.toString(array));
    }

    public static int maxValue(int[] array) {
        System.out.println("b) Función que devuelva el máximo del array.");
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minValue(int[] array) {
        System.out.println("c) Función que devuelva el mínimo del array.");
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int average(int[] array) {
        System.out.println("d) Función que devuelva la media");
        int suma = 0;
        for (int j : array) {
            suma += j;
        }
        return suma / array.length;
    }

    public static void ifElementExists(int[] array) {
        System.out.println("e) Función que te diga si un elemento existe en el array o no");
        if (showIfElementExists(array)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }
    }

    public static boolean showIfElementExists(int[] array) {
        boolean exist = false;
        System.out.print("Escribe el número que deseas saber si está en el array\nNúmero: ");
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

    public static void additionArrays(int[] array1, int[] array2) {
        System.out.println("f) Función que haga la suma de dos vectores (arrays)");
        System.out.print(Arrays.toString(array1));
        System.out.print(" + ");
        System.out.print(Arrays.toString(array2));
        System.out.print(" = ");
        System.out.println(Arrays.toString(howAddingArrays(array1, array2)));
    }
    public static int[] howAddingArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int lengthResult = Math.max(length1, length2);
        int[] result = new int[lengthResult];
        for (int i = 0; i < lengthResult; i++) {
            int value1 = 0;
            if (i < length1) {
                value1 = array1[i];
            }
            int value2 = 0;
            if (i < length2) {
                value2 = array2[i];
            }
            result[i] = value1 + value2;
        }
        return result;
    }

    public static void subtractArrays(int[] array1, int[] array2) {
        System.out.println("g) Función que haga la resta de dos vectores (arrays)");
        System.out.println(Arrays.toString(array1));
        System.out.print(" - ");
        System.out.println(Arrays.toString(array2));
        System.out.print(" = ");
        System.out.println(Arrays.toString(howSubtractArrays(array1, array2)));
    }
    public static int[] howSubtractArrays(int[]array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int lengthResult = Math.max(length1, length2);
        int[] result = new int[lengthResult];
        for (int i = 0; i < lengthResult; i++) {
            int value1 = 0;
            if (i < length1) {
                value1 = array1[i];
            }
            int value2 = 0;
            if (i < length2) {
                value2 = array2[i];
            }
            result[i] = value1 - value2;
        }
        return result;
    }

    public static void scalarProduct(int[] array1, int[] array2) {
        System.out.println("h) Función que haga el producto escalar de dos vectores (arrays)");
        System.out.println(Arrays.toString(array1));
        System.out.print(" * ");
        System.out.println(Arrays.toString(array2));
        System.out.print(" = ");
        System.out.println(howScalarArrays(array1, array2));
    }
    public static int howScalarArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int lengthResult = Math.max(length1, length2);
        int result = 0;
        for (int i = 0; i < lengthResult; i++) {
            int value1 = 0;
            if (i < length1) {
                value1 = array1[i];
            }
            int value2 = 0;
            if (i < length2) {
                value2 = array2[i];
            }
            result = result + (value1 * value2);
        }
        return result;
    }

    public static void invertArrayUsingFunction(int[] array) {
        System.out.println("i) Función que invierta el orden de un array");
        System.out.println(Arrays.toString(invertArrayFunction(array)));
    }

    public static int[] invertArrayFunction(int[] array) {
        System.out.println("La array inversa de " + Arrays.toString(array) + " es: ");
        int length = array.length - 1;
        int[] array2 = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[length - i];
        }
        return array;
    }

    public static void invertArrayUsingVoid(int[] array) {
        System.out.println("j) Procedimiento que invierta el orden de un array");
        int[] invertedArray = new int[array.length];
        invertArrayVoid(array, invertedArray);
    }

    public static void invertArrayVoid(int[] array, int[] invertedArray) {
        System.out.println("La array inversa de " + Arrays.toString(array) + " es: ");
        for (int i = 0; i < array.length; i++) {
            invertedArray[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertedArray));
    }

    public static void capicua(int[] array) {
        System.out.println("k) Función que devuelva si un array es capicua");
        if (isCapicua(array)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public static boolean isCapicua(int[] array) {
        boolean capicua = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                capicua = false;
                break;
            }
        }
        return capicua;
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class ActividadesArrays {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        selection();
    }
    public static void exercise1 (int[] array1, int[] array2) {
        boolean option = true;
        while (option){
            System.out.println("""
                Introduzca qué ejercicio quiere hacer:
                a) Procedimiento que imprima el array.
                b) Función que devuelva el máximo del array.
                c) Función que devuelva el mínimo del array.
                d) Función que devuelva la media
                e) Función que te diga si un elemento existe en el array o no
                f) Función que haga la suma de dos vectores (arrays)
                g) Función que haga la resta de dos vectores (arrays)
                h) Función que haga el producto escalar de dos vectores (arrays)
                i) Función que invierta el orden de un array
                j) Procedimiento que invierta el orden de un array
                k) Función que devuelva si un array es capicua""");
            System.out.print("Indique aquí su elección:");
            char election = in.next().charAt(0);
            switch (election) {
                case 'a':
                    System.out.println("a) Procedimiento que imprima el array.");
                    printArray(array1);
                    printArray(array2);
                    break;
                case 'b':
                    System.out.println("b) Función que devuelva el máximo del array.");
                    System.out.println(maxValue(array1));
                    System.out.println(maxValue(array2));
                    break;
                case 'c':
                    System.out.println("c) Función que devuelva el mínimo del array.");
                    System.out.println(minValue(array1));
                    System.out.println(minValue(array2));
                    break;
                case 'd':
                    System.out.println("d) Función que devuelva la media");
                    System.out.println(average(array1));
                    System.out.println(average(array2));
                    break;
                case 'e':
                    System.out.println("e) Función que te diga si un elemento existe en el array o no");
                    if (ifExistElement(array1)) {
                        System.out.println("Existe");
                    } else {
                        System.out.println("No Existe");
                    }
                    if (ifExistElement(array2)) {
                        System.out.println("Existe");
                    } else {
                        System.out.println("No Existe");
                    }
                    break;
                case 'f':
                    System.out.println("f) Función que haga la suma de dos vectores (arrays)");
                    printArray(array1);
                    System.out.print(" + ");
                    printArray(array2);
                    System.out.print(" = ");
                    System.out.println(Arrays.toString(additionArrays(array1, array2)));
                    break;
                case 'g':
                    System.out.println("g) Función que haga la resta de dos vectores (arrays)");
                    printArray(array1);
                    System.out.print(" - ");
                    printArray(array2);
                    System.out.print(" = ");
                    System.out.println(Arrays.toString(minusArrays(array1, array2)));
                    break;
                case 'h':
                    System.out.println("h) Función que haga el producto escalar de dos vectores (arrays)");
                    printArray(array1);
                    System.out.print(" * ");
                    printArray(array2);
                    System.out.print(" = ");
                    System.out.println(scalarProduct(array1, array2));
                    break;
                case 'i':
                    System.out.println("i) Función que invierta el orden de un array");
                    System.out.println(Arrays.toString(invertArrayFunction(array1)));
                    System.out.println(Arrays.toString(invertArrayFunction(array2)));
                    break;
                case 'j':
                    System.out.println("j) Procedimiento que invierta el orden de un array");
                    invertArrayVoid(array1);
                    invertArrayVoid(array2);
                    break;
                case 'k':
                    System.out.println("k) Función que devuelva si un array es capicua");
                    if (capicua(array1)) {
                        System.out.println("Es capicua");
                    } else {
                        System.out.println("No es capicua");
                    }
                    if (capicua(array2)) {
                        System.out.println("Es capicua");
                    } else {
                        System.out.println("No es capicua");
                    }
                    break;
                case 's':
                    option = false;
                    break;
                default:
                    System.out.println("Introduce un valor correcto");
            }

        }










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
    public static int[] minusArrays(int[] array1, int[] array2) {
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
        int[] result;
        int suma = 0;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = new int[array1.length];
                for (int i = 0; i < array2.length; i++) {
                    result[i] = array1[i] * array2[i];
                }
                System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
            }
            else {
                result = new int[array2.length];
                for (int i = 0; i < array1.length; i++) {
                    result[i] = array2[i] * array1[i];
                }
                System.arraycopy(array2, array1.length, result, array1.length, array2.length - array1.length);
            }

        } else {
            result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = array2[i] * array1[i];
            }
        }
        for (int i : result) {
            suma += i;

        }
        return suma;
    }
    public static int[] invertArrayFunction (int[]array) {

        System.out.println("La array inversa de " + Arrays.toString(array) + " es: ");
        int length = array.length-1;
        int[] array2 = array.clone();
        for(int i = 0; i < array.length; i++) {
            array[i] = array2[length-i];
        }
        return array;
    }
    public static void invertArrayVoid (int[]array) {
        System.out.println("La array inversa de " + Arrays.toString(array) + " es: ");
        int length = array.length-1;
        int[] array2 = array.clone();
        for(int i = 0; i < array.length; i++) {
            array[i] = array2[length-i];
        }
        System.out.println(Arrays.toString(array));
    }
    public static boolean capicua (int[]array) {
        boolean capicua = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                capicua = false;
                break;
            }
        }
        return capicua;
    }
    public static void selection () {
        System.out.println("Qué te gustaría hacer, los ejercicios introduciendo tus propias arrays o con arrays aleatorias?");
        System.out.println("1) Aleatorio\n2) Personalizado");
        int selection = in.nextInt();
        int[] array1;
        int[] array2;
        switch (selection) {
            case 1:
                array1 = new int[randomLengthArray()];
                array2 = new int[randomLengthArray()];
                randomNumbers(array1);
                randomNumbers(array2);
                exercise1(array1,array2);
                break;
            case 2:
                System.out.println("Introduzca el tamaño del array1:");
                array1 = new int[in.nextInt()];
                System.out.println("Introduzca el tamaño del array2:");
                array2 = new int[in.nextInt()];
                System.out.println("Introduzca los números de tu array1:");
                personalizeArray(array1);
                System.out.println("Introduzca los números de tu array2:");
                personalizeArray(array2);
                exercise1(array1,array2);
        }
    }
    public static int randomLengthArray () {
        return (int) (Math.random() * 10);
    }
    public static void personalizeArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca el numero en la posición " + i+1 + " de " + array.length);
            array[i] = in.nextInt();
        }
    }
}

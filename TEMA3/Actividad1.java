import java.util.Arrays;
import java.util.Scanner;
public class Actividad1 {
    static Scanner in = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.println("""
                Qué te gustaría hacer, los ejercicios introduciendo tus propias arrays o con arrays aleatorias?
                1) Aleatorio
                2) Personalizado""");
        int selection = in.nextInt();
        switch (selection) {
            case 1:
                case1Selection();
                break;
            case 2:
                case2Selection();
        }
    }
    public static void case1Selection() {
        int[] array1 = new int[randomLengthArray()];
        int[] array2 = new int[randomLengthArray()];
        randomNumbers(array1);
        randomNumbers(array2);
        exercise1(array1, array2);
    }
    public static void case2Selection() {
        System.out.println("Introduzca el tamaño del array1:");
        int[] array1 = new int[in.nextInt()];
        System.out.println("Introduzca el tamaño del array2:");
        int[] array2 = new int[in.nextInt()];
        System.out.println("Introduzca los números de tu array1:");
        personalizeArray(array1);
        System.out.println("Introduzca los números de tu array2:");
        personalizeArray(array2);
        exercise1(array1,array2);
    }
    public static int randomLengthArray () {
        return (int) (Math.random() * 10 + 2);
    }
    public static void randomNumbers (int[] random) {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
    }
    public static void personalizeArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca el numero en la posición " + i+1 + " de " + array.length);
            array[i] = in.nextInt();
        }
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
                k) Función que devuelva si un array es capicua
                s) Pulsa S para salir""");
            System.out.print("Indique aquí su elección:");
            char election = in.next().charAt(0);
            String texto;
            switch (election) {
                case 'a':
                    printArray(array1);
                    printArray(array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'b':
                    System.out.println(maxValue(array1));
                    System.out.println(maxValue(array2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'c':
                    System.out.println(minValue(array1));
                    System.out.println(minValue(array2));
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'd':
                    System.out.println(average(array1));
                    System.out.println(average(array2));
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'e':
                    ifElementExists(array1);
                    ifElementExists(array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'f':
                    additionArrays(array1,array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'g':
                    subtractArrays(array1,array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'h':
                    scalarProduct(array1,array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'i':
                    invertArrayUsingFunction(array1);
                    invertArrayUsingFunction(array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'j':
                    invertArrayUsingVoid(array1);
                    invertArrayUsingVoid(array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 'k':
                    capicua(array1);
                    capicua(array2);
                    System.out.println("Pulsa enter para continuar");
                    texto = sc.nextLine();
                    break;
                case 's':
                    option = false;
                    break;
                default:
                    System.out.println("Introduce un valor correcto");
            }

        }

    }
    public static void printArray(int[]array) {
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
    public static int minValue (int[] array) {
        System.out.println("c) Función que devuelva el mínimo del array.");
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static int average (int[] array) {
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
        System.out.println(Arrays.toString(conditionsForAddingArrays(array1, array2)));
    }
    public static int[] conditionsForAddingArrays(int[] array1, int[] array2) {
        int[] result;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = howAddingArrays(array1,array2);
            }
            else {
                result = howAddingArrays(array2,array1);
            }

        } else {
            result = howAddingArrays(array1,array2);
        }
        return result;
    }
    public static int[] howAddingArrays(int[]array1, int[]array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            result[i] = array1[i] + array2 [i];
        }
        if (array1.length != array2.length) {
            System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
        }
        return result;
    }
    public static void subtractArrays (int[]array1,int[]array2) {
        System.out.println("g) Función que haga la resta de dos vectores (arrays)");
        printArray(array1);
        System.out.print(" - ");
        printArray(array2);
        System.out.print(" = ");
        System.out.println(Arrays.toString(conditionsToSubtractArrays(array1, array2)));
    }
    public static int[] conditionsToSubtractArrays(int[] array1, int[] array2) {
        int[] result;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = howSubtractArrays(array1,array2);
            }
            else {
                result = howSubtractArrays(array2,array1);
            }
        } else {
            result = howSubtractArrays(array1,array2);
        }
        return result;
    }
    public static int[] howSubtractArrays(int[]array1, int[]array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            result[i] = array1[i] - array2 [i];
        }
        if (array1.length != array2.length) {
            System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
        }
        return result;
    }
    public static void scalarProduct(int[]array1, int[]array2) {
        System.out.println("h) Función que haga el producto escalar de dos vectores (arrays)");
        printArray(array1);
        System.out.print(" * ");
        printArray(array2);
        System.out.print(" = ");
        System.out.println(conditionsToScalarProduct(array1, array2));
    }
    public static int conditionsToScalarProduct(int[] array1, int[] array2) {
        int length = Math.max(array1.length, array2.length);
        int[] result;
        int suma = 0;
        if (array1.length != array2.length) {
            if (array1.length > array2.length) {
                result = howScalarArrays(array1,array2);
            }
            else {
                result = howScalarArrays(array2,array1);
            }
        } else {
            result = howScalarArrays(array1,array2);
        }
        for (int i : result) {
            suma += i;
        }
        return suma;
    }
    public static int[] howScalarArrays(int[]array1, int[]array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            result[i] = array1[i] - array2 [i];
        }
        if (array1.length != array2.length) {
            System.arraycopy(array1, array2.length, result, array2.length, array1.length - array2.length);
        }
        return result;
    }
    public static void invertArrayUsingFunction (int[]array) {
        System.out.println("i) Función que invierta el orden de un array");
        System.out.println(Arrays.toString(invertArrayFunction(array)));
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
    public static void invertArrayUsingVoid (int[]array) {
        System.out.println("j) Procedimiento que invierta el orden de un array");
        invertArrayVoid(array);
    }
    public static void invertArrayVoid (int[]array) {
        System.out.println("La array inversa de " + Arrays.toString(array) + " es: ");
        int length = array.length-1;
        int[] arrayCloned = array.clone();
        for(int i = 0; i < array.length; i++) {
            array[i] = arrayCloned[length-i];
        }
        System.out.println(Arrays.toString(array));
    }
    public static void capicua (int[]array) {
        System.out.println("k) Función que devuelva si un array es capicua");
        if (isCapicua(array)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public static boolean isCapicua (int[]array) {
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

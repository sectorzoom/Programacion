import java.util.Scanner;
public class Actividad1 {
    static Scanner in = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        selectionTypeArray();
    }
    public static void selectionTypeArray() {
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
        showMenu(array1, array2);
    }

    public static void case2Selection() {
        System.out.println("Introduzca el tamaño del array1:");
        int[] array1 = new int[Actividad1.in.nextInt()];
        System.out.println("Introduzca el tamaño del array2:");
        int[] array2 = new int[Actividad1.in.nextInt()];
        System.out.println("Introduzca los números de tu array1:");
        personalizeArray(array1);
        System.out.println("Introduzca los números de tu array2:");
        personalizeArray(array2);
        showMenu(array1, array2);
    }

    public static int randomLengthArray() {
        return (int) (Math.random() * 10 + 2);
    }
    public static void randomNumbers(int[] random) {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
    }
    public static void personalizeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca el numero en la posición " + (i + 1) + " de " + array.length);
            array[i] = Actividad1.in.nextInt();
        }
    }
    public static void showMenu(int[] array1, int[] array2) {
        boolean option = true;
        while (option) {
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
            char election = Actividad1.in.next().charAt(0);
            switch (election) {
                case 'a':
                    MyArray.printArray(array1);
                    MyArray.printArray(array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'b':
                    System.out.println(MyArray.maxValue(array1));
                    System.out.println(MyArray.maxValue(array2));
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'c':
                    System.out.println(MyArray.minValue(array1));
                    System.out.println(MyArray.minValue(array2));
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'd':
                    System.out.println(MyArray.average(array1));
                    System.out.println(MyArray.average(array2));
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'e':
                    MyArray.ifElementExists(array1);
                    MyArray.ifElementExists(array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'f':
                    MyArray.additionArrays(array1, array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'g':
                    MyArray.subtractArrays(array1, array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'h':
                    MyArray.scalarProduct(array1, array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'i':
                    MyArray.invertArrayUsingFunction(array1);
                    MyArray.invertArrayUsingFunction(array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'j':
                    MyArray.invertArrayUsingVoid(array1);
                    MyArray.invertArrayUsingVoid(array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 'k':
                    MyArray.capicua(array1);
                    MyArray.capicua(array2);
                    System.out.println("Pulsa enter para continuar");
                    Actividad1.sc.nextLine();
                    break;
                case 's':
                    option = false;
                    break;
                default:
                    System.out.println("Introduce un valor correcto");
            }

        }
    }
}

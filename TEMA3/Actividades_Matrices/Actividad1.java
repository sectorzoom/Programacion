package Actividades_Matrices;

import java.util.Scanner;

public class Actividad1 {
    static Scanner in = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        selectionTypeMatrix();
    }
    public static void selectionTypeMatrix() {
        System.out.println("""
                    Qué te gustaría hacer, los ejercicios introduciendo tus propias matriz o con matrices aleatorias?
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
    public static void case1Selection () {
        int[][] matrix1 = new int[randomLengthArray()][randomLengthArray()];
        int[][] matrix2 = new int[randomLengthArray()][randomLengthArray()];
        randomNumbers(matrix1);
        randomNumbers(matrix2);
        showMenu(matrix1,matrix2);
    }
    public static void case2Selection () {
        System.out.println("Introduzca el tamaño de la matriz1:");
        int[][] matrix1 = new int[in.nextInt()][in.nextInt()];
        System.out.println("Introduzca el tamaño del matriz2:");
        int[][] matrix2 = new int[in.nextInt()][in.nextInt()];
        System.out.println("Introduzca los números de tu array1:");
        personalizeArray(matrix1);
        System.out.println("Introduzca los números de tu array2:");
        personalizeArray(matrix2);
        showMenu(matrix1,matrix2);
    }
    public static int randomLengthArray () {
        return (int) (Math.random() * 10 + 2);
    }
    public static void randomNumbers ( int[][] random){
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    public static void personalizeArray ( int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduzca el numero en la posición " + "[" + (i) + "]" + "[" + (j) + "]");
                array[i][j] = in.nextInt();
            }
        }
    }
    public static void showMenu ( int[][] matrix1, int[][] matrix2){
        boolean option = true;
        while (option) {
            System.out.println("""
                     Introduzca qué ejercicio quiere hacer:
                     a) Procedimiento que imprima la matriz.
                     b) Función que devuelva el máximo de la matriz.
                     c) Función que devuelva el mínimo de la matriz.
                     d) Función que devuelva la media.
                     e) Función que te diga si un elemento existe en la matriz o no.
                     f) Función que te diga cuántas veces se repite un número.
                     g) Función que haga la suma de dos matrices.
                     h) Función que haga la resta de dos matrices.
                     i) función que compruebe si una matriz es la matriz unidad, es decir tiene el mismo número de filas
                      y de columnas y tiene en su diagonal principal 1s y el resto 0s
                     s) Pulsa S para salir""");
            System.out.print("Indique aquí su elección:");
            char election = in.next().charAt(0);
            switch (election) {
                case 'a':
                    MyMatrix.printMatrix(matrix1);
                    MyMatrix.printMatrix(matrix2);
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'b':
                    System.out.println(MyMatrix.maxValue(matrix1));
                    System.out.println(MyMatrix.maxValue(matrix2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'c':
                    System.out.println(MyMatrix.minValue(matrix1));
                    System.out.println(MyMatrix.minValue(matrix2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'd':
                    System.out.println(MyMatrix.average(matrix1));
                        System.out.println(MyMatrix.average(matrix2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'e':
                    MyMatrix.ifElementExists(matrix1);
                    MyMatrix.ifElementExists(matrix2);
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'f':
                    System.out.println(MyMatrix.howManyTimesNumberRepeat(matrix1));
                    System.out.println(MyMatrix.howManyTimesNumberRepeat(matrix2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'g':
                    MyMatrix.addMatrix(matrix1,matrix2);
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'h':
                    MyMatrix.substractionMatrix(matrix1, matrix2);
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 'i':
                    System.out.println(MyMatrix.unitMatrix(matrix1));
                    System.out.println(MyMatrix.unitMatrix(matrix2));
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
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
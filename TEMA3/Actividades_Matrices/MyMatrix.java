package Actividades_Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    static Scanner in = new Scanner(System.in);
    public static void printMatrix (int[][]matrix) {
        System.out.println("a) Procedimiento que imprima la matriz.");
        System.out.println(Arrays.deepToString(matrix));
    }
    public static int maxValue(int[][]matrix) {
        System.out.println("b) Función que devuelva el máximo de la matriz.");
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    public static int minValue(int[][] matrix) {
        System.out.println("c) Función que devuelva el mínimo de la matriz.");
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }

    public static int average(int[][] matrix) {
        System.out.println("d) Función que devuelva la media");
        int suma = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                suma += anInt;

            }
        }
        return suma/ (matrix.length*matrix[0].length);
    }
    public static void ifElementExists(int[][] matrix) {
        System.out.println("e) Función que te diga si un elemento existe en la matriz o no");
        if (showIfElementExists(matrix)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }
    }

    public static boolean showIfElementExists(int[][] matrix) {
        boolean exist = false;
        System.out.print("Escribe el número que deseas saber si está en la matriz\nNúmero: ");
        int number = in.nextInt();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == number) {
                    exist = true;
                    System.out.println();
                    break;
                }
            }
        }
        return exist;
    }
    public static void addMatrix(int[][]matrix1, int[][]matrix2) {
        System.out.println("g) Función que haga la suma de dos matrices");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(" + ");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(" = ");
        System.out.println(Arrays.deepToString(howToAddMatrix(matrix1, matrix2)));
    }
    public static int[][] howToAddMatrix(int[][]matrix1, int[][]matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        int rowsResult = Math.max(rows1, rows2);
        int columnsResult = Math.max(columns1, columns2);
        int[][] result = new int[rowsResult][columnsResult];
        for (int i = 0; i < rowsResult; i++) {
            for (int j = 0; j < columnsResult; j++) {
                int value1 = 0;
                if (i < rows1 && j < columns1) {
                    value1 = matrix1[i][j];
                }
                int value2 = 0;
                if (i < rows2 && j < columns2) {
                    value2 = matrix2[i][j];
                }
                result[i][j] = value1 + value2;
            }
        }
        return result;
    }
    public static void substractionMatrix(int[][]matrix1, int[][]matrix2){
        System.out.println("g) Función que haga la resta de dos matrices");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(" - ");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(" = ");
        System.out.println(Arrays.deepToString(howSubstractMatrix(matrix1, matrix2)));
    }
    public static int[][] howSubstractMatrix(int[][]matrix1, int[][]matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        int rowsResult = Math.max(rows1, rows2);
        int columnsResult = Math.max(columns1, columns2);
        int[][] result = new int[rowsResult][columnsResult];
        for (int i = 0; i < rowsResult; i++) {
            for (int j = 0; j < columnsResult; j++) {
                int value1 = 0;
                if (i < rows1 && j < columns1) {
                    value1 = matrix1[i][j];
                }

                int value2 = 0;
                if (i < rows2 && j < columns2) {
                    value2 = matrix2[i][j];
                }
                if (i < rows1 && j < columns1 && i < rows2 && j < columns2) {
                    result[i][j] = value1 - value2;
                } else if (i < rows2 && j < columns2) {
                    result[i][j] = value2;
                } else if (i < rows1 && j < columns1) {
                    result[i][j] = value1;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}

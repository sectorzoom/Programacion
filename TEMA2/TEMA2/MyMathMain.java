package TEMA2;

import java.util.Scanner;

public class MyMathMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean select = true;
        while (select) {
            System.out.println("""
                    Elige una de las siguientes opciones:
                    a) Muestra el perímetro de un cuadrado.
                    b) Muestra el área de un cuadrado.
                    c) Muestra el perímetro de un rectángulo.
                    d) Muestra el área de un rectángulo.
                    e) Muestra el perímetro de un círculo.
                    f) Muestra el área de un círculo.
                    g) Muestra si el número que das es primo.
                    h) Muestra si el número que das no es primo.
                    i) Nos indica el número de dígitos de un número entero.
                    j) Nos devuelve el número de dígitos pares de un número entero.
                    k) Nos devuelve el número de dígitos impares de un número entero.
                    l) Nos calcula el factorial de un número.
                    m) Nos calcula el factorial pero de manera recursiva.
                    n) Nos dice la cantidad de soluciones posibles que tiene una ecuación de segundo grado.
                    o) Suma los dígitos de un número entero.
                    
                    """);
            selection();
            while (true) {
                System.out.println("¿Quiere hacer otro ejercicio?");
                char selection = in.next().charAt(0);
                if (selection == 'n' || selection == 'N') {
                    select = false;
                    break;
                } else if (repeatTable(selection))
                    break;
            }
        }
    }

    public static void selection() {
        Scanner in = new Scanner(System.in);
        char selection = in.next().charAt(0);
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        switch (selection) {
            case 'a':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.squarePerimeter(firstDigit));
                break;
            case 'b':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.squareArea(firstDigit));
                break;
            case 'c':
                System.out.println("Escribe el primer dígito");
                firstDigit = in.nextInt();
                System.out.println("Escribe el segundo dígito");
                secondDigit = in.nextInt();
                System.out.println(MyMath.rectanglePerimeter(firstDigit,secondDigit));
                break;
            case 'd':
                System.out.println("Escribe el primer dígito");
                firstDigit = in.nextInt();
                System.out.println("Escribe el segundo dígito");
                secondDigit = in.nextInt();
                System.out.println(MyMath.rectangleArea(firstDigit,secondDigit));
                break;
            case 'e':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.circlePerimeter(firstDigit));
                break;
            case 'f':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.circleArea(firstDigit));
                break;
            case 'g':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.isPrime(firstDigit));
                break;
            case 'h':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.isNotPrime(firstDigit));
                break;
            case 'i':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.figureCount(firstDigit));
                break;
            case 'j':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.evenFigureCount(firstDigit));
                break;
            case 'k':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.oddFigureCount(firstDigit));
                break;
            case 'l':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.factorial(firstDigit));
                break;
            case 'm':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.factorialRecursive(firstDigit));
                break;
            case 'n':
                System.out.println("Escribe el primer dígito");
                firstDigit = in.nextInt();
                System.out.println("Escribe el segundo dígito");
                secondDigit = in.nextInt();
                System.out.println("Escribe el tercer dígito");
                thirdDigit = in.nextInt();
                System.out.println(MyMath.quadraticEcuationSolutions(firstDigit,secondDigit,thirdDigit));
                break;
            case 'o':
                System.out.println("Escribe el dígito");
                firstDigit = in.nextInt();
                System.out.println(MyMath.figuresSumatory(firstDigit));
                break;
        }
    }
    public static boolean repeatTable(char repeat) {
        boolean correct = repeat == 's' || repeat == 'S';
        if (!correct) {
            System.out.println("Introduzca un valor válido. S o N");
        }
        return correct;
    }
}

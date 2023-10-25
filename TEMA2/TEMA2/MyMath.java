package TEMA2;

public class MyMath {
    public static double squarePerimeter (double lado) {
        double squarePerimeter;
        if (lado < 0) {
            squarePerimeter = 0;
        } else {
            squarePerimeter = (lado * 4);
        }
        return squarePerimeter;
    }
    public static double squareArea (double lado) {
        double squareArea;
        if (lado < 0) {
            squareArea = 0;
        } else {
            squareArea = (lado * lado);
        }
        return squareArea;
    }
    public static double rectanglePerimeter (double lado1, double lado2) {
        double rectanglePerimeter;
        if (lado1 <= 0 || lado2 <=  0) {
            rectanglePerimeter = 0;
        } else {
            rectanglePerimeter = (lado1*2 + lado2*2);
        }
        return rectanglePerimeter;
    }
    public static double rectangleArea (double lado1, double lado2) {
        double rectangleAreaTest;
        if (lado1 <= 0 || lado2 <= 0) {
            rectangleAreaTest = 0;
        } else {
            rectangleAreaTest = lado1 * lado2;
        }
        return  rectangleAreaTest;
    }
    public static double circlePerimeter (double radius) {
        double circlePerimeter;
        if (radius <= 0) {
            circlePerimeter = 0;
        } else {
            circlePerimeter = 2* Math.PI * radius;
        }
        return circlePerimeter;
    }
    public static double circleArea (double radius) {
        double circleArea;
        if (radius <= 0) {
            circleArea = 0;
        } else {
            circleArea = Math.PI * Math.pow(radius,2);
        }
        return circleArea;
    }
    public static boolean isPrime (int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static boolean isNotPrime (int number) {
        return !isPrime(number);
    }
    public static int figureCount (int number) {
        number = Math.abs (number);
        int conteo = 0;
        do {
            number = number/10;
            conteo++;
        } while (number > 0);
        return conteo;
    }
    public static int evenFigureCount (int number) {
        number = Math.abs (number);
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        while (number > 0) {
            if (number % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static int oddFigureCount (int number) {
        number = Math.abs (number);
        int count = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static int factorial (int number) {
        int factorial = 0;
        if (number >= 0) {
            factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
    public static int factorialRecursive (int number) {
        int factorial = 0;
        if (number >= 0) {
            factorial = 1;
            for (int i = 1; i < number; number--) {
                factorial *= number;
            }
        }
        return factorial;
    }
    public static int quadraticEcuationSolutions (int number1, int number2, int number3) {
        int result = 0;
        int discriminant = (number2*2) - (4*number1*number3);
        if (discriminant>0){
            result = 2;
        } else if (discriminant == 0){
            result = 1;
        }
        return result;
    }
    public static int figuresSumatory (int number) {
        number = Math.abs(number);
        int result = 0;
        while (number>0) {
            result += number %10;
            number /= 10;
        }
        return result;
    }
}



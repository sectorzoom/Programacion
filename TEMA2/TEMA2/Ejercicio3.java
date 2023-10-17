package TEMA2;

import java.util.Scanner;

public class Ejercicio3 {
    public static boolean validRadius(double radius) {
        return radius <0;
    }
    public static double calculateCirclePerimeter(double radius) {
        return 2*(Math.PI)*radius;
    }
    public static double calculateCircleArea(double radius) {
        return (Math.PI)*Math.pow(radius,2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;
        System.out.println("Introduce el valor del radio: ");
        radius = in.nextDouble();
        if (validRadius(radius)) {
            System.out.println("El valor es incorrecto.");
        } else {
            System.out.println("El perímetro de tu círculo es " + (int) calculateCirclePerimeter(radius));
            System.out.println("El área de tu círculo es " + (int) calculateCircleArea(radius));
        }
    }
}

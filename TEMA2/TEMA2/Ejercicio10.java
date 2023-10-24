package TEMA2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean select = true;
        while (select) {
            System.out.println("""
                    Elige una de las siguientes opciones:
                    a) Muestra el signo de un número introducido por el usuario.
                    b) Indica si el usuario es mayor de edad o no.
                    c) Calcula el área y perímetro de un círculo.
                    d) Conversor de euros a dólares y de dólares a euros.
                    e) Mostrar tabla de multiplicar de un número.
                    f) Mostrar tablas de multiplicar del 1 al 10.
                    g) Comprobador de números primos.
                    h) Comprobador de fechas.
                    i) Dibujar triángulos.
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
        String[] ejercicioClass = new String[0];
        switch (selection) {
            case 'a':
                Ejercicio1.main(ejercicioClass);
                break;
            case 'b':
                Ejercicio2.main(ejercicioClass);
                break;
            case 'c':
                Ejercicio3.main(ejercicioClass);
                break;
            case 'd':
                Ejercicio4.main(ejercicioClass);
                break;
            case 'e':
                Ejercicio5.main(ejercicioClass);
                break;
            case 'f':
                Ejercicio6.main(ejercicioClass);
                break;
            case 'g':
                Ejercicio7.main(ejercicioClass);
                break;
            case 'h':
                Ejercicio8.main(ejercicioClass);
                break;
            case 'i':
                Ejercicio9.main(ejercicioClass);
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


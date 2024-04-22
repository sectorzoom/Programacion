package Colecciones2.Ejercicio3;

import java.util.Random;

public class Anilla {
    private final char color;

    public Anilla() {
        Random random = new Random();
        char[] colores = {'r', 'v', 'a'};
        this.color = colores[random.nextInt(3)]; // Asignar un color aleatorio (r, v o a)
    }

    public char getColor() {
        return color;
    }
}







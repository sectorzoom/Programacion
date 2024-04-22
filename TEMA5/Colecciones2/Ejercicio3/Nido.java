package Colecciones2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nido {
    private final List<Serpiente> serpientes;
    private Random random;

    public Nido() {
        this.serpientes = new ArrayList<>();
        this.random = new Random();
    }

    public void simularVida(int duracionMinutos) {
        for (int segundo = 1; segundo <= duracionMinutos * 60; segundo++) {
            System.out.println("Segundo " + segundo + ":");

            // Nacimiento de nuevas serpientes
            if (segundo % 5 == 0) {
                int numSerpientesNacidas = random.nextInt(3) + 1;
                for (int i = 0; i < numSerpientesNacidas; i++) {
                    if (serpientes.size() < 20) {
                        serpientes.add(new Serpiente());
                        System.out.println("Nace una nueva serpiente en el nido.");
                    } else {
                        System.out.println("El nido está lleno, no puede nacer más serpientes.");
                    }
                }
            }

            // Ataque de la mangosta
            if (segundo % 10 == 0) {
                if (random.nextDouble() < 0.2) {
                    int numSerpientesAtacadas = random.nextInt(5);
                    if (numSerpientesAtacadas > serpientes.size()) {
                        numSerpientesAtacadas = serpientes.size();
                    }
                    for (int i = 0; i < numSerpientesAtacadas; i++) {
                        int indice = random.nextInt(serpientes.size());
                        serpientes.remove(indice);
                    }
                    System.out.println("¡Una mangosta atacó el nido y se comió " + numSerpientesAtacadas + " serpiente(s)!");
                }
            }

            // Simulación de vida para cada serpiente
            for (Serpiente serpiente : serpientes) {
                serpiente.envejecer();
                if (serpiente.getEdad() < 10) {
                    if (random.nextDouble() < 0.8) {
                        serpiente.crecer();
                        System.out.println("La serpiente ha crecido una anilla.");
                    } else if (random.nextDouble() < 0.2) {
                        serpiente.mudarPiel();
                        System.out.println("La serpiente ha mudado la piel.");
                    }
                } else {
                    if (random.nextDouble() < 0.9) {
                        serpiente.decrecer();
                        System.out.println("La serpiente ha decrecido una anilla.");
                    } else if (random.nextDouble() < 0.1) {
                        serpiente.mudarPiel();
                        System.out.println("La serpiente ha mudado la piel.");
                    }
                }

                if (serpiente.estaMuerta()) {
                    System.out.println("La serpiente ha muerto.");
                }
            }

            System.out.println();
        }
    }
}
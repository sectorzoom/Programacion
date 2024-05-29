package Colecciones2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Serpiente {
    private final List<Anilla> cuerpo;
    private int edad;

    public Serpiente() {
        this.cuerpo = new ArrayList<>();
        this.edad = 0;

        // Añadir una anilla al cuerpo de la serpiente al nacer
        cuerpo.add(new Anilla());
    }

    public void crecer() {
        cuerpo.add(new Anilla());
    }

    public void decrecer() {
        if (!cuerpo.isEmpty()) {
            cuerpo.removeLast();
        }
    }

    public void mudarPiel() {
        cuerpo.replaceAll(ignored -> new Anilla());
    }

    public boolean sufrirAtaqueMangosta() {
        Random random = new Random();
        return random.nextDouble() < 0.1;
    }

    public boolean estaMuerta() {
        return cuerpo.isEmpty();
    }

    public void envejecer() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }

    public List<Anilla> getCuerpo() {
        return cuerpo;
    }

    //public vivir
    //  if > 10 crezco si < años sisi
    // mangosta aquí o en el nido
    // suma año
}
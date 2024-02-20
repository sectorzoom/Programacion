package POO4.Ej3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Animal> animalesSalvajes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int tipoAnimal = random.nextInt(3);
            switch (tipoAnimal) {
                case 0:
                    animalesSalvajes.add(new Bird());
                    break;
                case 1:
                    animalesSalvajes.add(new Cat());
                    break;
                case 2:
                    animalesSalvajes.add(new Dog());
                    break;
            }
        }
        for (Animal animal : animalesSalvajes){
            int huida = random.nextInt(101);
            if (huida>=95){
                animal.ataca();
                break;
            } else {
                animal.haceRuido();
            }
        }
    }

}

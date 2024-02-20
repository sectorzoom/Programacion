package POO4.Ej3;

public class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void haceRuido() {
        System.out.println("Oyes un maullido fuera de la tienda, ese maullido se transforma en ronroneo" +
                "lo oyes tumbarse en la puerta y dormirse.");
    }

    @Override
    public void ataca() {
        System.out.println("Oyes el rugido de un animal fuera de la tienda, se trata de un léon, lo oyes " +
                "rugir ferozmente, debes huir.");

    }


}

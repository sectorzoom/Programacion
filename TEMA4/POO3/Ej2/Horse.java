package POO3.Ej2;

class Horse extends Animal {
    public Horse() {
    }

    @Override
    public void eat() {
        System.out.println("El caballo está comiendo.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("El caballo está durmiendo.");
        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("El caballo está relinchando.");
    }
}
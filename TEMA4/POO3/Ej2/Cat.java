package POO3.Ej2;

class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("El gato está comiendo.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("El gato está durmiendo.");
        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("El gato está maullando.");
    }
}

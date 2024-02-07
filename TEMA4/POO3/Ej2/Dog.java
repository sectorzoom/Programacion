package POO3.Ej2;

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("El perro está comiendo.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("El perro está durmiendo.");
        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("El perro está ladrando.");
    }
}

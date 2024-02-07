package POO3.Ej2;

class Bird extends Animal {
    public Bird() {
    }

    @Override
    public void eat() {
        System.out.println("El pájaro está comiendo.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("El pájaro está durmiendo.");
        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("El pájaro está cantando.");
    }
}
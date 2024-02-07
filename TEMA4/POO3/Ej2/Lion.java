package POO3.Ej2;

class Lion extends Animal {
    public Lion() {
    }

    @Override
    public void eat() {
        System.out.println("El león está comiendo.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("El león está durmiendo.");
        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("El león está rugiendo.");
    }
}
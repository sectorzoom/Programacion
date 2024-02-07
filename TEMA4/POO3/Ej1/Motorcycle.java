package POO3.Ej1;

class Motorcycle extends Vehicle {
    private int displacement;
    private final int MAX_DISPLACEMENT = 125;

    public Motorcycle(String brand, String model, String color, int wheels, int displacement, int yearProduction) {
        super(brand, model, color, wheels, yearProduction);
        this.displacement = displacement;
    }

    private boolean needID(){
        return displacement >= MAX_DISPLACEMENT;
    }
}

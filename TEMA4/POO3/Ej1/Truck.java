package POO3.Ej1;

class Truck extends Vehicle {
    private int maxWeight;
    private boolean dangerousGoods;

    public Truck(String brand, String model, String color, int wheels, int maxWeight, boolean dangerousGoods, int yearProduction) {
        super(brand, model, color, wheels, yearProduction);
        this.maxWeight = maxWeight;
        this.dangerousGoods = dangerousGoods;
    }
}

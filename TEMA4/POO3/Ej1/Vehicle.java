package POO3.Ej1;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String color;
    protected int yearProduction;
    protected int wheels;

    public Vehicle(String brand, String model, String color, int wheels, int yearProduction){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.yearProduction = yearProduction;
    }

}




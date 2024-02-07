package POO3.Ej1;

class Tourism extends Vehicle {
    private int numberOfPlaces;
    private TypeOfUse type;

    public Tourism(String brand, String model, String color, int wheels, int numberOfPlaces, int yearProduction, TypeOfUse type) {
        super(brand, model, color, wheels, yearProduction);
        this.numberOfPlaces = numberOfPlaces;
        this.type = type;
    }

    enum TypeOfUse {
        PROFESSIONAL, PARTICULAR;
    }
}

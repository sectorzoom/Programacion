package POO3.Ej3;

class Triangle extends Figure2D {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return base + 2 * Math.sqrt((base * base) / 4 + height * height);
    }

    @Override
    public String toString() {
        return "Triángulo de base " + base + " y altura " + height;
    }
}
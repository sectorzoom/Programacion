package POO3.Ej3;

class Rectangle extends Figure2D {
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * (base + height);
    }

    @Override
    public String toString() {
        return "Rectángulo de base " + base + " y altura " + height;
    }
}

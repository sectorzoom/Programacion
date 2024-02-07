package POO3.Ej3;

class Circle extends Figure2D {
    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo de radio " + radio;
    }
}

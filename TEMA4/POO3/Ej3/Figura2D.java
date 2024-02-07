package POO3.Ej3;

abstract class Figura2D {
    public abstract double area();

    public abstract double perimetro();

    @Override
    public abstract String toString();

}

class Cuadrado extends Figura2D {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado de lado " + lado;
    }
}

class Rectangulo extends Figura2D {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectángulo de base " + base + " y altura " + altura;
    }
}

class Triangulo extends Figura2D {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base + 2 * Math.sqrt((base * base) / 4 + altura * altura);
    }

    @Override
    public String toString() {
        return "Triángulo de base " + base + " y altura " + altura;
    }
}

class Circulo extends Figura2D {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo de radio " + radio;
    }
}


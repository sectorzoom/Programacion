package POO3.Ej3;

public class Main {
    public static void main(String[] args) {

        Figure2D cuadrado = new Square(6);
        System.out.println(cuadrado);
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Perímetro: " + cuadrado.perimeter());

        Figure2D rectangulo = new Rectangle(4, 6);
        System.out.println(rectangulo);
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimeter());

        Figure2D triangulo = new Triangle(3, 4);
        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimeter());

        Figure2D circulo = new Circle(3);
        System.out.println(circulo);
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimeter());
    }
}

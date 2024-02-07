package POO3.Ej3;

public class Main {
    public static void main(String[] args) {

        Figura2D cuadrado = new Cuadrado(5);
        System.out.println(cuadrado);
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Perímetro: " + cuadrado.perimetro());

        Figura2D rectangulo = new Rectangulo(4, 6);
        System.out.println(rectangulo);
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());

        Figura2D triangulo = new Triangulo(3, 4);
        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimetro());

        Figura2D circulo = new Circulo(3);
        System.out.println(circulo);
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());
    }
}

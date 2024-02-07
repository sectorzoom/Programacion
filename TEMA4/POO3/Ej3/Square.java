package POO3.Ej3;

class Square extends Rectangle {
    private final double side;
    Square(double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public String toString() {
        return "Cuadrado de base " + side + " y altura " + side;
    }
}

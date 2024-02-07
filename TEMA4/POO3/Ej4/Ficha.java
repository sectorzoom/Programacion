package POO3.Ej4;
abstract class Ficha {
    private final int number;
    private final String title;

    public Ficha(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public String toString(){
        return "Número: " + number + "\n"
                + "Título: " + title + "\n";
    }
}

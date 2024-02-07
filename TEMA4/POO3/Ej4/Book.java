package POO3.Ej4;

public class Book extends Ficha {
    private final String author;
    private final String publisher;

    public Book(int number, String title, String author, String publisher) {
        super(number, title);
        this.author = author;
        this.publisher = publisher;
    }
    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Autor: " + author + "\n"
                + "Editorial: " + publisher;
    }
}

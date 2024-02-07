package POO3.Ej4;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1, "Java Programming", "John Doe", "XYZ Publishers");
        System.out.println(book);

        Magazine magazine = new Magazine(2, "Tech Magazine", 123, 2024);
        System.out.println(magazine);

        DVD dvd = new DVD(3, "The Matrix", "Wachowskis", 1999, DVD.TypeOfDvd.CIENCIA_FICCION);
        System.out.println(dvd);
    }
}


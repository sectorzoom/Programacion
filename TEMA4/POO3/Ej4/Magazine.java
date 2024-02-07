package POO3.Ej4;

public class Magazine extends Ficha {
    private final int publicationNumber;
    private final int year;

    public Magazine(int number, String title, int publicationNumber, int year) {
        super(number, title);
        this.publicationNumber = publicationNumber;
        this.year = year;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Número Publicación: " + publicationNumber + "\n"
                + "Año de Publicación: " + year;
    }

}


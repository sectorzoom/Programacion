package POO3.Ej4;

public class DVD extends Ficha {
    private final String director;
    private final int year;
    private final TypeOfDvd type;

    public DVD(int number, String title, String director, int year, TypeOfDvd type) {
        super(number, title);
        this.director = director;
        this.year = year;
        this.type = type;
    }
    enum TypeOfDvd{
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
    }

    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Director: " + director + "\n"
                + "Año: " + year + "\n"
                + "Tipo: " + type;
    }

}
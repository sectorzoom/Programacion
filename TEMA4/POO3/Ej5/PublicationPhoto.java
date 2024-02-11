package POO3.Ej5;


public class PublicationPhoto implements IPublication, IOpenPublication {
    private final String photo;

    public PublicationPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public void post() {
        System.out.println("Imagen Publicada: " + photo);
    }

    @Override
    public void share() {
        System.out.println("Imagen Compartida: " + photo);
    }

    @Override
    public void open() {
        System.out.println("Abriendo foto: "+ photo);
    }
}

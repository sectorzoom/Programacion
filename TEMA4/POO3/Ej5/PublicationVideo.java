package POO3.Ej5;

public class PublicationVideo implements IPublication, IOpenPublication {
    private final String video;

    public PublicationVideo(String video) {
        this.video = video;
    }

    @Override
    public void post() {
        System.out.println("Publicando video: " + video);
    }

    @Override
    public void share() {
        System.out.println("Compartiendo video: " + video);
    }

    @Override
    public void open() {
        System.out.println("Abriendo video: " + video);
    }
}


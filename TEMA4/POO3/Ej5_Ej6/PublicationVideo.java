package POO3.Ej5_Ej6;

public class PublicationVideo implements IPublication, IOpenPublication, IPostWithReaction {
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

    @Override
    public void reaction() {
        System.out.println("Video reaccionado: " + video);

    }
}


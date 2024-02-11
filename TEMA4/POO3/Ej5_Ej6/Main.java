package POO3.Ej5_Ej6;

public class Main {
    public static void main(String[] args) {
        PublicationText publicationText = new PublicationText("Hola!");
        publicationText.post();
        publicationText.share();

        PublicationPhoto publicationPhoto = new PublicationPhoto("Ruta de la foto");
        publicationPhoto.post();
        publicationPhoto.share();
        publicationPhoto.open();

        PublicationVideo publicationVideo = new PublicationVideo("Ruta del video");
        publicationVideo.post();
        publicationVideo.share();
        publicationVideo.open();
    }
}

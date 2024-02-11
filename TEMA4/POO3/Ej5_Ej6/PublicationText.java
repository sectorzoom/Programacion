package POO3.Ej5_Ej6;

public class PublicationText implements IPublication, IPostWithReaction {
    private final String texto;

    public PublicationText(String texto) {
        this.texto = texto;
    }

    @Override
    public void post() {
        System.out.println("Texto Publicado: " + texto);
    }

    @Override
    public void share() {
        System.out.println("Texto Compartido: " + texto);
    }

    @Override
    public void reaction() {
        System.out.println("Texto Reaccionado: " + texto);
    }
}


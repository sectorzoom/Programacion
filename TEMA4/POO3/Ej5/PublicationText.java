package POO3.Ej5;

public class PublicationText implements IPublication {
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
}


package POO4.Ej4;

public class Revistas extends Articulos{
    String tema;
    int paginas;

    public Revistas(int codigoArticulo, String titulo, String tema, int paginas) {
        super(codigoArticulo, titulo);
        this.tema = tema;
        this.paginas = paginas;
    }
}

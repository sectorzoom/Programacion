package POO4.Ej4;

public class Revistas extends Articulos{
    String tema;
    int paginas;

    public Revistas(int codigoArticulo, String titulo, int paginas,String tema) {
        super(codigoArticulo, titulo);
        this.tema = tema;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "La revista tiene los siguientes datos:\n" +
                "Código = " + super.codigoArticulo +
                "\nTítulo = " + super.titulo +
                "\nCantidad de Páginas = " + paginas +
                "\nTema = " + tema;
    }
}

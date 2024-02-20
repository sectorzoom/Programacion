package POO4.Ej4;

public class Libros extends Articulos{
    int cantidadPaginas;
    int ISBN;

    public Libros(int codigoArticulo, String titulo, int cantidadPaginas, int ISBN) {
        super(codigoArticulo, titulo);
        this.cantidadPaginas = cantidadPaginas;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "El libro tiene los siguientes datos:\n" +
                "Código = " + super.codigoArticulo +
                "\nTítulo = " + super.titulo +
                "\nCantidad de Páginas = " + cantidadPaginas +
                "\nISBN = " + ISBN;
    }
}

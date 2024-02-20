package POO4.Ej4;

public class DVD extends Articulos {
    String genero;
    int duracion;

    public DVD(int codigoArticulo, String titulo, String genero, int duracion) {
        super(codigoArticulo, titulo);
        this.genero = genero;
        this.duracion = duracion;
    }
}

package POO4.Ej2;

public class Camion extends Vehiculo{
    public Camion(int momentoEntrada, int momentoSalida) {
        super(momentoEntrada, momentoSalida);
    }

    @Override
    public void inspeccionar() {
        System.out.println("Inspeccionando camión\n" + "le revisan al segundo " + momentoEntrada + " y sale al segundo " + momentoSalida);
    }
}

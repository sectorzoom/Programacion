package POO4.Ej2;

public class Ciclomotor extends Vehiculo{
    public Ciclomotor(int momentoEntrada, int momentoSalida) {
        super(momentoEntrada, momentoSalida);
    }

    @Override
    public void inspeccionar() {
        System.out.println("Inspeccionando ciclomotor\n" + "le revisan al segundo " + momentoEntrada + " y sale al segundo " + momentoSalida);
    }
}

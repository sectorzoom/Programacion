package POO4.Ej2;

public class Turismo extends Vehiculo{
    public Turismo(int ruedas, int momentoEntrada, int momentoSalida) {
        super(ruedas, momentoEntrada, momentoSalida);
    }

    @Override
    public void inspeccionar() {
        System.out.println("Inspeccionando turismo\n" + "le revisan al segundo " + momentoEntrada + " y sale al segundo " + momentoSalida);
    }
}

package POO4.Ej2;

public class Avion extends Vehiculo{

    public Avion(int momentoEntrada, int momentoSalida) {
        super(momentoEntrada, momentoSalida);
    }

    @Override
    public void inspeccionar() {
        System.out.println("Inspeccionando un Avión que llegar a la pista\n" + "le revisan al segundo " + momentoEntrada + " y sale al segundo " + momentoSalida);
    }
}

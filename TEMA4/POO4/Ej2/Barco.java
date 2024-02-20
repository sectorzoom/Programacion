package POO4.Ej2;

public  class Barco extends Vehiculo{
    public Barco(int momentoEntrada, int momentoSalida) {
        super(momentoEntrada, momentoSalida);
    }

    @Override
    public void inspeccionar() {
        System.out.println("Inspeccionando un Avión que llega al canal\n" + "le revisan al segundo " + momentoEntrada + " y sale al segundo " + momentoSalida);
    }
}

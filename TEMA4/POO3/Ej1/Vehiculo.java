package POO3.Ej1;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String color;
    protected int anoFabricacion;
    protected int ruedas;

    public Vehiculo(String marca, String modelo, String color, int ruedas, int anoFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
        this.anoFabricacion = anoFabricacion;
    }

}
class Turismo extends Vehiculo{
    private int numeroPlazas;
    private TipoUso tipo;

    public Turismo(String marca, String modelo, String color, int ruedas, int numeroPlazas, int anoFabricacion, TipoUso tipo) {
        super(marca, modelo, color, ruedas, anoFabricacion);
        this.numeroPlazas = numeroPlazas;
        this.tipo = tipo;
    }

    enum TipoUso{
        PROFESIONAL, PARTICULAR;
    }
}
class Camion extends Vehiculo{
    private int pesoMax;
    private boolean mercanciaPeligrosa;

    public Camion(String marca, String modelo, String color, int ruedas, int pesoMax, boolean mercanciaPeligrosa, int anoFabricacion) {
        super(marca, modelo, color, ruedas, anoFabricacion);
        this.pesoMax = pesoMax;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }
}
class Ciclomotor extends Vehiculo{
    private int cilindrada;
    private final int cilindradaMax = 125;

    public Ciclomotor(String marca, String modelo, String color, int ruedas, int cilindrada, int anoFabricacion) {
        super(marca, modelo, color, ruedas, anoFabricacion);
        this.cilindrada = cilindrada;
    }

    private boolean carnet(int cilindrada){
        if (cilindrada >= cilindradaMax){
            System.out.println("Necesita carnet");
            return true;
        } else{
            return false;
        }
    }
}

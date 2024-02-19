package POO4.Ej2;

public abstract class Vehiculo implements Iinspeccionar {
    int ruedas;
    int momentoEntrada;
    int momentoSalida;
    public Vehiculo(int ruedas, int momentoEntrada, int momentoSalida){
        this.ruedas = ruedas;
        this.momentoEntrada = momentoEntrada;
        this.momentoSalida = momentoSalida;
    }

}









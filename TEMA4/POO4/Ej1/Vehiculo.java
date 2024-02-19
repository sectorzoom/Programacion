package POO4.Ej1;

public abstract class Vehiculo {
    int ruedas;
    int momentoEntrada;
    int momentoSalida;
    public Vehiculo(int ruedas, int momentoEntrada, int momentoSalida){
        this.ruedas = ruedas;
        this.momentoEntrada = momentoEntrada;
        this.momentoSalida = momentoSalida;
    }
    public abstract void inspeccionar();
}









package Colecciones2.Ejercicio4;

public class Proceso {
    private final String id;
    private int tiempoRestante;

    public Proceso(String id, int tiempoEjecucion) {
        this.id = id;
        this.tiempoRestante = tiempoEjecucion;
    }

    public String getId() {
        return id;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void ejecutar(int quantum) {
        if (tiempoRestante > quantum) {
            tiempoRestante -= quantum;
        } else {
            tiempoRestante = 0;
        }
    }

    public boolean estaTerminado() {
        return tiempoRestante == 0;
    }
}





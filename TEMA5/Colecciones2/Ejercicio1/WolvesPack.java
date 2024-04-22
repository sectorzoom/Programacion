package Colecciones2.Ejercicio1;

class WolvesPack implements Isighting {
    private final int horaDelDia;
    private final int numeroLobos;
    private final String observaciones;

    public WolvesPack(int horaDelDia, int numeroLobos, String observaciones) {
        this.horaDelDia = horaDelDia;
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    public int getHoraDelDia() {
        return horaDelDia;
    }

    public int getNumeroLobos() {
        return numeroLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
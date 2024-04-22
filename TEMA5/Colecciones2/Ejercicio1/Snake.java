package Colecciones2.Ejercicio1;

class Snake implements Isighting {
    private final int horaDelDia;
    private final double longitud;
    private final String especie;

    public Snake(int horaDelDia, double longitud, String especie) {
        this.horaDelDia = horaDelDia;
        this.longitud = longitud;
        this.especie = especie;
    }

    public int getHoraDelDia() {
        return horaDelDia;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getEspecie() {
        return especie;
    }
}

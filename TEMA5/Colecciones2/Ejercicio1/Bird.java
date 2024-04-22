package Colecciones2.Ejercicio1;

class Bird implements Isighting {
    private final int horaDelDia;
    private final double peso;
    private final String especie;

    public Bird(int horaDelDia, double peso, String especie) {
        this.horaDelDia = horaDelDia;
        this.peso = peso;
        this.especie = especie;
    }

    public int getHoraDelDia() {
        return horaDelDia;
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }
}
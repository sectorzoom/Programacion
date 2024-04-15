package tema5.Ejercicio3;

public class Usuario {
    private final String nombre;
    private final int edad;
    private final String dni;

    public Usuario(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
}

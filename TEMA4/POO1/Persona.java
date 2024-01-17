package POO1;

import java.util.Scanner;

public class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int adultAge = 18;
    private static final int retiredAge = 65;
    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void print(){
        System.out.println("DNI: " + dni + "\n" + "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad);
    }
    public boolean isAdult() {
        return edad >= adultAge;
    }

    public boolean isRetired() {
        return edad >= retiredAge;
    }
    public int ageDifference(Persona otraPersona) {
        return Math.abs(this.edad - otraPersona.getEdad());
    }
    public static boolean checkDNI(String dni) {
        return true;
    }
    public static Persona obtenerDatosPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        return new Persona(dni, nombre, apellidos, edad);
    }
}

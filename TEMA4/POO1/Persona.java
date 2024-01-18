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
    public void showIsAdult(){
        if (isAdult()){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
    }

    public boolean isRetired() {
        return edad >= retiredAge;
    }
    public void showIsRetired(){
        if (isRetired()){
            System.out.println("Está jubilado");
        } else{
            System.out.println("No está jubilado");
        }
    }
    public int ageDifference(Persona otraPersona) {
        return Math.abs(this.edad - otraPersona.getEdad());
    }
    public static boolean checkDNI(String dni) {
        return dni.matches("\\d{8}[A-Za-z]");
    }
}

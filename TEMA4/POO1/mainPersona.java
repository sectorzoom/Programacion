package POO1;

import java.util.Scanner;

import static POO1.Persona.obtenerDatosPersona;

public class mainPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        Persona p = new Persona(dni, nombre, apellidos, edad);

        System.out.println("Ingresa los datos de la Persona 1");
        Persona persona1 = obtenerDatosPersona();
        System.out.println("Ingresa los datos de la Persona 2");
        Persona persona2 = obtenerDatosPersona();

        System.out.println("Información de la Persona 1:");
        persona1.print();
        System.out.println("Es mayor de edad: " + persona1.isAdult());
        System.out.println("Está jubilado: " + persona1.isRetired());

        System.out.println("\nInformación de la Persona 2:");
        persona2.print();
        System.out.println("Es mayor de edad: " + persona2.isAdult());
        System.out.println("Está jubilado: " + persona2.isRetired());

        System.out.println("\nDiferencia de edad entre las personas: " + persona1.ageDifference(persona2));
    }
    private static Persona obtenerDatosPersona() {
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

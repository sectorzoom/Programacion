package POO1;

import java.util.Scanner;


public class MainPersona {
    public static void main(String[] args) {
        System.out.println("Ingresa los datos de la Persona 1");
        Persona persona1 = obtenerDatosPersona();

        System.out.println("Ingresa los datos de la Persona 2");
        Persona persona2 = obtenerDatosPersona();

        System.out.println("Información de la Persona 1:");
        persona1.print();
        System.out.print("Es mayor de edad: ");
        persona1.showIsAdult();
        System.out.print("Está jubilado: ");
        persona1.showIsRetired();

        System.out.println("\nInformación de la Persona 2:");
        persona2.print();
        System.out.print("Es mayor de edad: ");
        persona2.showIsAdult();
        System.out.print("Está jubilado: ");
        persona2.showIsRetired();

        System.out.println("\nDiferencia de edad entre las personas: " + persona1.ageDifference(persona2));

    }
    private static Persona obtenerDatosPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI:");
        String dni;
        int attempts = 0;
        do {
            if (attempts != 0){
                System.out.println("Escriba un dni válido");
            }
            dni = scanner.nextLine();
            attempts++;
        } while (!Persona.checkDNI(dni));

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        return new Persona(dni, nombre, apellidos, edad);
    }

}

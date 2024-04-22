package Colecciones2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        URLShortener acortador = new URLShortener();

        // Crear nuevos registros
        String clave1 = acortador.crearNuevoRegistro("https://es.wikipedia.org/wiki/Wikipedia");
        String clave2 = acortador.crearNuevoRegistro("https://www.google.com/");
        String clave3 = acortador.crearNuevoRegistro("https://www.youtube.com/");

        // Resolver direcciones
        System.out.println("Dirección asociada a la clave " + clave1 + ": " + acortador.resolverDireccion(clave1));
        System.out.println("Dirección asociada a la clave " + clave2 + ": " + acortador.resolverDireccion(clave2));
        System.out.println("Dirección asociada a la clave " + clave3 + ": " + acortador.resolverDireccion(clave3));
        System.out.println("Dirección asociada a una clave no existente: " + acortador.resolverDireccion("claveNoExistente"));

        // Mostrar todos los registros
        acortador.mostrarRegistros();

        // Borrar un registro
        acortador.borrarRegistro(clave2);
        System.out.println("\nDespués de borrar el registro asociado a la clave " + clave2 + ":");
        acortador.mostrarRegistros();
    }
}
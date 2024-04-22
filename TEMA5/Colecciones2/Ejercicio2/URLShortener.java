package Colecciones2.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class URLShortener {
    private final Map<String, String> urlMap;
    private Random random;

    public URLShortener() {
        this.urlMap = new HashMap<>();
        this.random = new Random();
    }

    public String crearNuevoRegistro(String url) {
        String clave = generarClaveUnica();
        urlMap.put(clave, url);
        return clave;
    }

    public String resolverDireccion(String clave) {
        return urlMap.getOrDefault(clave, "La URL asociada a esta clave no existe.");
    }

    public void borrarRegistro(String clave) {
        urlMap.remove(clave);
    }

    public void mostrarRegistros() {
        System.out.println("Registros:");
        urlMap.forEach((clave, url) -> System.out.println(clave + " -> " + url));
    }

    private String generarClaveUnica() {
        StringBuilder sb = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 6; // Longitud de la clave única
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(indice));
        }
        return sb.toString();
    }
}



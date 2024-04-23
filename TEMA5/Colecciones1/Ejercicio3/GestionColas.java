package Colecciones1.Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class GestionColas {

    private final Queue<Usuario> cola;
    // cambia queue por list

    public GestionColas() {
        cola = new LinkedList<>();
    }

    public void agregarACola(Usuario usuario) {
        cola.offer(usuario);
        System.out.println(usuario.getNombre() + " ha sido añadido a la cola.");
    }

    public void quitarPrimeroDeCola() {
        Usuario usuarioAtendido = cola.poll();
        if (usuarioAtendido != null) {
            System.out.println(usuarioAtendido.getNombre() + " ha sido atendido.");
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public void quitarDeCola(String dni) {
        Usuario usuario = null;
        for (Usuario u : cola) {
            if (u.getDni().equals(dni)) {
                usuario = u;
                break;
            }
        }

        if (usuario != null) {
            cola.remove(usuario);
            System.out.println(usuario.getNombre() + " ha sido eliminado de la cola.");
        } else {
            System.out.println("No se encontró a ninguna persona con el DNI especificado en la cola.");
        }
    }
}




package Colecciones1.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class GestionColas {

    private final List<Usuario> cola;

    public GestionColas() {
        cola = new ArrayList<>();
    }

    public void agregarACola(Usuario usuario) {
        cola.add(usuario); // Agregar al final de la lista
        System.out.println(usuario.getNombre() + " ha sido añadido a la cola.");
    }

    public void quitarPrimeroDeCola() {
        if (!cola.isEmpty()) {
            Usuario usuarioAtendido = cola.removeFirst(); // Eliminar y retornar el primer elemento
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

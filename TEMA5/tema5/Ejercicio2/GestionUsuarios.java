package tema5.Ejercicio2;

        import java.util.HashMap;
        import java.util.Map;

public class GestionUsuarios {
    private final Map<String, Usuario> usuarios;

    public GestionUsuarios() {
        usuarios = new HashMap<>();
    }

    public void altaUsuario(String dni, String nombre, int edad) {
        Usuario nuevoUsuario = new Usuario(nombre, edad);
        usuarios.put(dni, nuevoUsuario);
        System.out.println("Usuario dado de alta correctamente.");
    }

    public void bajaUsuario(String dni) {
        if (usuarios.containsKey(dni)) {
            usuarios.remove(dni);
            System.out.println("Usuario dado de baja correctamente.");
        } else {
            System.out.println("No se pudo encontrar el usuario con el DNI especificado.");
        }
    }

    public void mostrarUsuario(String dni) {
        Usuario usuario = usuarios.get(dni);
        if (usuario != null) {
            System.out.println("Datos del usuario:");
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Edad: " + usuario.getEdad());
        } else {
            System.out.println("No se pudo encontrar el usuario con el DNI especificado.");
        }
    }

    public void modificarUsuario(String dni, String nuevoNombre, int nuevaEdad) {
        Usuario usuario = usuarios.get(dni);
        if (usuario != null) {
            usuario.setNombre(nuevoNombre);
            usuario.setEdad(nuevaEdad);
            System.out.println("Usuario modificado correctamente.");
        } else {
            System.out.println("No se pudo encontrar el usuario con el DNI especificado.");
        }
    }
}
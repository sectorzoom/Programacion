package AWS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainPiloto {
    public static void main(String[] args) {
        String urlConexion = "jdbc:postgresql://david.c9avrrmzhkv1.us-east-1.rds.amazonaws.com:5432/f12006";
        String usuario = "postgres";
        String password = "Qwertyuiop";

        try (Connection conexion = DriverManager.getConnection(urlConexion, usuario, password)) {
            // Leer pilotos desde la base de datos
            List<Piloto> pilotos = Piloto.leerPilotos(conexion);
            for (Piloto piloto : pilotos) {
                System.out.println(piloto);
            }

            // Escribir un nuevo piloto en la base de datos // CAMBIAR DE PILOTO SI NO DA ERROR
            Piloto nuevoPiloto = new Piloto(0, "MSH", "Mick", "Schumacher", Date.valueOf("1999-03-22"), "German");
            nuevoPiloto.escribirPiloto(conexion);


            // Verificar que el nuevo piloto fue agregado
            System.out.println("\nPilotos después de la inserción:");
            pilotos = Piloto.leerPilotos(conexion);
            for (Piloto piloto : pilotos) {
                System.out.println(piloto);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
}


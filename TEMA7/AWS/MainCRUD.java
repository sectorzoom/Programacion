package AWS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainCRUD {
    public static void main(String[] args) {
        String urlConexion = "jdbc:postgresql://david.c9avrrmzhkv1.us-east-1.rds.amazonaws.com:5432/f12006";
        String usuario = "postgres";
        String password = "Qwertyuiop";

        try (Connection conexion = DriverManager.getConnection(urlConexion, usuario, password)) {

            // Crear un nuevo piloto // // CAMBIAR DE PILOTO SI NO DA ERROR
            Piloto nuevoPiloto = new Piloto(0, "LHM", "Lewis", "Hamilton", Date.valueOf("1985-01-07"), "Britain");
            PilotsCRUD.createPilot(conexion, nuevoPiloto);

            // Leer un piloto por ID
            Piloto piloto = PilotsCRUD.readPilot(conexion, 1);
            if (piloto != null) {
                System.out.println("Piloto leído: " + piloto);
            }

            // Leer todos los pilotos
            List<Piloto> pilotos = PilotsCRUD.readPilots(conexion);
            System.out.println("Todos los pilotos:");
            for (Piloto p : pilotos) {
                System.out.println(p);
            }

            // Actualizar un piloto
            if (piloto != null) {
                piloto.setSurname("UpdatedSurname");
                PilotsCRUD.updatePilot(conexion, piloto);
                System.out.println("Piloto actualizado: " + piloto);
            }

            // Eliminar un piloto
            if (piloto != null) {
                PilotsCRUD.deletePilot(conexion, piloto);
                System.out.println("Piloto eliminado: " + piloto);
            }

            // Mostrar la clasificación de pilotos
            PilotsCRUD.showPilotClassification(conexion);

            // Mostrar la clasificación de equipos
            PilotsCRUD.showBuildersClassification(conexion);

        } catch (SQLException ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
}

package AWS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {
    // Método para insertar un piloto en la base de datos
    public static void createPilot(Connection conexion, Piloto piloto) throws SQLException {
        String insercionSQL = "INSERT INTO drivers (code, forename, surname, dob, nationality) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement consulta = conexion.prepareStatement(insercionSQL)) {
            consulta.setString(1, piloto.getCode());
            consulta.setString(2, piloto.getForename());
            consulta.setString(3, piloto.getSurname());
            consulta.setDate(4, piloto.getDob());
            consulta.setString(5, piloto.getNationality());
            consulta.executeUpdate();
        }
    }

    // Método para leer un piloto de la base de datos por ID
    public static Piloto readPilot(Connection conexion, int driverId) throws SQLException {
        String consultaSQL = "SELECT driverid, code, forename, surname, dob, nationality FROM drivers WHERE driverid = ?";
        try (PreparedStatement consulta = conexion.prepareStatement(consultaSQL)) {
            consulta.setInt(1, driverId);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                return new Piloto(
                        resultado.getInt("driverid"),
                        resultado.getString("code"),
                        resultado.getString("forename"),
                        resultado.getString("surname"),
                        resultado.getDate("dob"),
                        resultado.getString("nationality")
                );
            }
        }
        return null;
    }

    // Método para leer todos los pilotos de la base de datos
    public static List<Piloto> readPilots(Connection conexion) throws SQLException {
        List<Piloto> pilotos = new ArrayList<>();
        String consultaSQL = "SELECT driverid, code, forename, surname, dob, nationality FROM drivers";
        try (PreparedStatement consulta = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultados = consulta.executeQuery();
            while (resultados.next()) {
                Piloto piloto = new Piloto(
                        resultados.getInt("driverid"),
                        resultados.getString("code"),
                        resultados.getString("forename"),
                        resultados.getString("surname"),
                        resultados.getDate("dob"),
                        resultados.getString("nationality")
                );
                pilotos.add(piloto);
            }
        }
        return pilotos;
    }

    // Método para actualizar un piloto en la base de datos
    public static void updatePilot(Connection conexion, Piloto piloto) throws SQLException {
        String actualizacionSQL = "UPDATE drivers SET code = ?, forename = ?, surname = ?, dob = ?, nationality = ? WHERE driverid = ?";
        try (PreparedStatement consulta = conexion.prepareStatement(actualizacionSQL)) {
            consulta.setString(1, piloto.getCode());
            consulta.setString(2, piloto.getForename());
            consulta.setString(3, piloto.getSurname());
            consulta.setDate(4, piloto.getDob());
            consulta.setString(5, piloto.getNationality());
            consulta.setInt(6, piloto.getDriverId());
            consulta.executeUpdate();
        }
    }

    // Método para eliminar un piloto de la base de datos
    public static void deletePilot(Connection conexion, Piloto piloto) throws SQLException {
        String eliminacionSQL = "DELETE FROM drivers WHERE driverid = ?";
        try (PreparedStatement consulta = conexion.prepareStatement(eliminacionSQL)) {
            consulta.setInt(1, piloto.getDriverId());
            consulta.executeUpdate();
        }
    }

    // Método para mostrar la clasificación final del mundial ordenada por puntos de los pilotos
    public static void showPilotClassification(Connection conexion) throws SQLException {
        String consultaSQL = "SELECT d.code, d.forename, d.surname, SUM(r.points) AS total_points " +
                "FROM drivers d " +
                "JOIN results r ON d.driverid = r.driverid " +
                "GROUP BY d.code, d.forename, d.surname " +
                "ORDER BY total_points DESC";
        try (PreparedStatement consulta = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultados = consulta.executeQuery();
            System.out.format("\n%5s%20s%10s\n", "Code", "Nombre", "Puntos");
            System.out.println("-------------------------------");
            while (resultados.next()) {
                System.out.format("%5s%20s%10d\n",
                        resultados.getString("code"),
                        resultados.getString("forename") + " " + resultados.getString("surname"),
                        resultados.getInt("total_points"));
            }
        }
    }

    // Método para mostrar la clasificación del mundial ordenada por puntos de los equipos
    public static void showBuildersClassification(Connection conexion) throws SQLException {
        String consultaSQL = "SELECT t.name, SUM(r.points) as total_points " +
                "FROM constructors t " +
                "JOIN results r ON t.constructorid = t.constructorid " +
                "GROUP BY t.constructorid, t.name " +
                "ORDER BY total_points DESC";
        try (PreparedStatement consulta = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultados = consulta.executeQuery();
            System.out.format("\n%20s%10s\n", "Equipo", "Puntos");
            System.out.println("--------------------------");
            while (resultados.next()) {
                System.out.format("%20s%10d\n",
                        resultados.getString("name"),
                        resultados.getInt("total_points"));
            }
        }
    }
}


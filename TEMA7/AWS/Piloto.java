package AWS;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Piloto {
    private int driverId;
    private String code;
    private String forename;
    private String surname;
    private Date dob;
    private String nationality;

    // Constructor
    public Piloto(int driverId, String code, String forename, String surname, Date dob, String nationality) {
        this.driverId = driverId;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
    }

    // Getters y Setters
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Método para leer pilotos desde la base de datos
    public static List<Piloto> leerPilotos(Connection conexion) throws SQLException {
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

    // Método para escribir un piloto en la base de datos
    public void escribirPiloto(Connection conexion) throws SQLException {
        String insercionSQL = "INSERT INTO drivers (code, forename, surname, dob, nationality) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement consulta = conexion.prepareStatement(insercionSQL)) {
            consulta.setString(1, this.code);
            consulta.setString(2, this.forename);
            consulta.setString(3, this.surname);
            consulta.setDate(4, this.dob);
            consulta.setString(5, this.nationality);
            consulta.executeUpdate();
        }
    }

    @Override
    public String toString() {
        return "AWS.Piloto{" +
                "driverId=" + driverId +
                ", code='" + code + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

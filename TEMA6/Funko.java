import java.io.Serializable;
import java.util.Date;

public class Funko implements Serializable {
    String nombre;
    String modelo;
    Date launch;
    double precio;

    public Date getLaunch() {
        return launch;
    }

    public Funko(String nombre, String modelo, Date launch, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.launch = launch;
        this.precio = precio;
    }
}




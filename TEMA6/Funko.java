import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Funko implements Serializable {
    @Serial
    private static final long serialVersionUID = 100L;
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




package POO4.Ej1;

import java.util.ArrayList;
import java.util.Random;

public class ITV {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculosEnEspera = new ArrayList<>();
        Random random = new Random();
        int momentoActual = 1;
        for (int i = 0; i < 10; i++) {
            int tipoVehiculo = random.nextInt(3);
            switch (tipoVehiculo) {
                case 0:
                    vehiculosEnEspera.add(new Turismo(4,momentoActual,momentoActual+1));
                    break;
                case 1:
                    vehiculosEnEspera.add(new Camion(8,momentoActual,momentoActual+1));
                    break;
                case 2:
                    vehiculosEnEspera.add(new Ciclomotor(2,momentoActual,momentoActual+1));
                    break;
            }
            momentoActual++;
        }

        for (Vehiculo vehiculo : vehiculosEnEspera) {
            vehiculo.inspeccionar();
        }
    }
}
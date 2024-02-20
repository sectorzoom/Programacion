package POO4.Ej2;

import java.util.ArrayList;
import java.util.Random;

public class ITV {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculosEnEspera = new ArrayList<>();
        Random random = new Random();
        int momentoActual = 1;
        for (int i = 0; i < 10; i++) {
            int tipoVehiculo = random.nextInt(5);
            switch (tipoVehiculo) {
                case 0:
                    vehiculosEnEspera.add(new Turismo(momentoActual,momentoActual+1));
                    break;
                case 1:
                    vehiculosEnEspera.add(new Camion(momentoActual,momentoActual+1));
                    break;
                case 2:
                    vehiculosEnEspera.add(new Ciclomotor(momentoActual,momentoActual+1));
                    break;
                case 3:
                    vehiculosEnEspera.add(new Avion(momentoActual,momentoActual+1));
                case 4:
                    vehiculosEnEspera.add(new Barco(momentoActual, momentoActual+1));
            }
            momentoActual++;
        }

        for (Vehiculo vehiculo : vehiculosEnEspera) {
            vehiculo.inspeccionar();
        }
    }
}
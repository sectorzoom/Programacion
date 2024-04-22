package Colecciones2.Ejercicio4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {
    private final Queue<Proceso> colaProcesos;
    private Random random;

    public Simulador() {
        this.colaProcesos = new LinkedList<>();
        this.random = new Random();
    }

    public void simular(int duracionMinutos) {
        int tiempoSegundos = 0;
        int idProceso = 1;

        while (tiempoSegundos < duracionMinutos * 60) {
            // Llegada de procesos cada 2 segundos
            if (tiempoSegundos % 2 == 0) {
                int tiempoEjecucion = random.nextInt(4) + 1; // Tiempo de ejecución entre 1 y 4 segundos
                Proceso proceso = new Proceso("p" + idProceso, tiempoEjecucion);
                colaProcesos.offer(proceso);
                System.out.println("Llega proceso " + proceso.getId() + " con tiempo de ejecución " + tiempoEjecucion + " segundos.");
                idProceso++;
            }

            // Ejecución de procesos en la CPU durante 0,2 segundos
            if (!colaProcesos.isEmpty()) {
                Proceso procesoActual = colaProcesos.poll();
                procesoActual.ejecutar(1); // Ejecutar proceso durante 0,2 segundos
                System.out.println("Ejecutando proceso " + procesoActual.getId() + ", tiempo restante: " + procesoActual.getTiempoRestante() + " segundos.");

                // Si el proceso no ha terminado, vuelve a la cola
                if (!procesoActual.estaTerminado()) {
                    colaProcesos.offer(procesoActual);
                } else {
                    System.out.println("Proceso " + procesoActual.getId() + " ha terminado su ejecución.");
                }
            }

            tiempoSegundos++;
            try {
                Thread.sleep(200); // Simular 0,2 segundos de ejecución de CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
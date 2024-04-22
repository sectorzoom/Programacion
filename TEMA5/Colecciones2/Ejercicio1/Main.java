package Colecciones2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear un parque natural
        NaturalPark parque = new NaturalPark();

        // Añadir algunos avistamientos
        parque.addSighting(new Snake(10, 1.5, "Cobra"));
        parque.addSighting(new Bird(6, 0.2, "Canario"));
        parque.addSighting(new WolvesPack(22, 7, "Manada grande cerca del río"));
        parque.addSighting(new Snake(14, 2.1, "Pitón"));
        parque.addSighting(new Bird(9, 0.5, "Águila"));
        parque.addSighting(new WolvesPack(19, 10, "Manada en las colinas"));
        parque.addSighting(new Snake(16, 1.7, "Víbora"));
        parque.addSighting(new Bird(7, 0.3, "Búho"));
        parque.addSighting(new WolvesPack(21, 5, "Manada en el bosque"));
        parque.addSighting(new Snake(11, 1.8, "Boa"));
        parque.addSighting(new Bird(5, 0.4, "Colibrí"));
        parque.addSighting(new WolvesPack(20, 8, "Manada cerca del lago"));
        parque.addSighting(new Snake(13, 1.9, "Mamba"));
        parque.addSighting(new Bird(8, 0.6, "Pavo real"));
        parque.addSighting(new WolvesPack(18, 6, "Manada en la montaña"));
        parque.addSighting(new Snake(17, 1.6, "Anaconda"));
        parque.addSighting(new Bird(12, 0.7, "Gavilán"));
        parque.addSighting(new WolvesPack(23, 12, "Manada en el valle"));

        // Mostrar avistamientos a partir de las 8 am
        System.out.println("Avistamientos a partir de las 8 am:");
        parque.mostrarAvistamientosAPartirDeLas8().forEach(avistamiento -> System.out.println("Hora: " + avistamiento.getHoraDelDia()));

        // Mostrar avistamientos nocturnos
        System.out.println("\nAvistamientos nocturnos:");
        parque.mostrarAvistamientosNocturnos().forEach(avistamiento -> System.out.println("Hora: " + avistamiento.getHoraDelDia()));

        // Mostrar serpientes avistadas
        System.out.println("\nSerpientes avistadas:");
        parque.mostrarSerpientes().forEach(snake -> System.out.println("Especie: " + snake.getEspecie() + ", Longitud: " + snake.getLongitud()));

        // Mostrar pájaros avistados
        System.out.println("\nPájaros avistados:");
        parque.mostrarPajaros().forEach(bird -> System.out.println("Especie: " + bird.getEspecie() + ", Peso: " + bird.getPeso()));

        // Mostrar manadas de lobos avistadas
        System.out.println("\nManadas de lobos avistadas:");
        parque.mostrarManadas().forEach(manada -> System.out.println("Número de lobos: " + manada.getNumeroLobos() + ", Observaciones: " + manada.getObservaciones()));
    }
}



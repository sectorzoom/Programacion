package Colecciones2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class NaturalPark {
    private final List<Isighting> isightings;

    public NaturalPark() {
        this.isightings = new ArrayList<>();
    }

    public void addSighting(Isighting isighting) {
        isightings.add(isighting);
    }

    public List<Isighting> mostrarAvistamientosAPartirDeLas8() {
        return isightings.stream()
                .filter(isighting -> isighting.getHoraDelDia() >= 8)
                .collect(Collectors.toList());
    }

    public List<Isighting> mostrarAvistamientosNocturnos() {
        return isightings.stream()
                .filter(isighting -> isighting.getHoraDelDia() >= 20 || isighting.getHoraDelDia() < 8)
                .collect(Collectors.toList());
    }

    public List<WolvesPack> mostrarManadas() {
        return isightings.stream()
                .filter(isighting -> isighting instanceof WolvesPack)
                .map(isighting -> (WolvesPack) isighting)
                .collect(Collectors.toList());
    }

    public List<Snake> mostrarSerpientes() {
        return isightings.stream()
                .filter(isighting -> isighting instanceof Snake)
                .map(isighting -> (Snake) isighting)
                .collect(Collectors.toList());
    }

    public List<Bird> mostrarPajaros() {
        return isightings.stream()
                .filter(isighting -> isighting instanceof Bird)
                .map(isighting -> (Bird) isighting)
                .collect(Collectors.toList());
    }
}
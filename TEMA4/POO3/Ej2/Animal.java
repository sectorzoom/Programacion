package POO3.Ej2;

// Clase abstracta Animal
abstract class Animal {
    public abstract void comer();
    public abstract void dormir();
    public abstract void hacerRuido();
}

// Subclase Perro
class Perro extends Animal {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro está ladrando.");
    }
}

// Subclase Gato
class Gato extends Animal {
    public Gato() {
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato está maullando.");
    }
}

// Subclase Caballo
class Caballo extends Animal {
    public Caballo() {
    }

    @Override
    public void comer() {
        System.out.println("El caballo está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El caballo está durmiendo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El caballo está relinchando.");
    }
}

// Subclase Pájaro
class Pajaro extends Animal {
    public Pajaro() {
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El pájaro está durmiendo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El pájaro está cantando.");
    }
}

// Subclase León
class Leon extends Animal {
    public Leon() {
    }

    @Override
    public void comer() {
        System.out.println("El león está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El león está durmiendo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El león está rugiendo.");
    }
}



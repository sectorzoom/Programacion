package POO4.Ej3;

public class Bird extends Animal {
    public Bird() {
    }

    @Override
    public void haceRuido() {
        System.out.println("El pajarito hace pío pío, revolotea felizmente fuera de la tienda de campaña.");
    }

    @Override
    public void ataca() {
        System.out.println("Oyes un sonido estridente, parece un águila, ataca tu tienda y debes huir");
    }


}
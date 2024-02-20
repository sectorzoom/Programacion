package POO4.Ej3;

public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public void haceRuido() {
        System.out.println("Oyes los gemidos de un perrito fuera de la tienda, es un yorkshire que quiere" +
                "entrar en tu tienda, le abres y se duerme contigo.");
    }

    @Override
    public void ataca() {
        System.out.println("Oyes los gemidos de un animal fuera, cuando abres, se trata de un lobo que al " +
                "verte te gruñe y se prepara para atacar, debes huir.");
    }


}

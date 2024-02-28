package Practica_POO_Polimorfismo;

import java.util.Random;

//Clase que define los Premios que irán en las celdas
public class Prize {

    //Atributos
    int money;

    //Constructor
    public Prize() {
        this.money = randomPrize();
    }

    //Método que devuelve un premio aleatorio
    private int randomPrize() {
        Random random = new Random();
        int baseAmount = random.nextInt(540);
        return baseAmount  * 50;
    }

    //Método que devuelve el premio
    public int getMoney() {
        return money;
    }
}


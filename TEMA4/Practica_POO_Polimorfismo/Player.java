package Practica_POO_Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

//Clase que define las características de los Jugadores del Concurso
public class Player {

    //Atributos
    private final String name;
    private final ArrayList<Prize> prizes;
    static Scanner scanner = new Scanner(System.in);

    //Constructor
    public Player(String name) {
        this.name = name;
        prizes = new ArrayList<>();
    }

    //Getter, devuelve el nombre
    public String getName() {
        return name;
    }

    //Devuelve si el jugador puede continuar jugando
    public boolean canContinue() {
        return true;
    }

    //Devuelve true o false según si el jugador responde correctamente o no. Es el método de respuesta del jugador.
    public boolean answerQuestion(Question question) {
        System.out.println(question.getQuestion()); //Muestra por pantalla la pregunta
        String answer = scanner.nextLine().toLowerCase();
        if (question.verifyIfIsGoodAnswer(answer)) { //Verifica la respuesta, si es correcta, entra en el if
            System.out.println("Respuesta correcta");
            prizes.add(new Prize()); //Añade un objeto Premio al ArrayList del jugador
            return true;
        } else {
            System.out.println("Has fallado! Has perdido el concurso!");
            return false;
        }
    }

    //Metodo que muestra los premios obtenidos
    public void showPrizes() {
        System.out.println("Premios obtenidos: ");
        int premioTotal = 0;
        for (Prize prize : prizes) {
            System.out.println(prize.getMoney());
            premioTotal = premioTotal + prize.getMoney();
        }
        System.out.println("Premio Total: " + premioTotal);
    }
}
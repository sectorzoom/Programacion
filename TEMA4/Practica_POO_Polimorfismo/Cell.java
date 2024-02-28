package Practica_POO_Polimorfismo;

import java.util.ArrayList;

//Clase que define las características de las Celdas que formarán el tablero
public class Cell {

    //Atributos
    private final ArrayList<Question> questions;
    private final ArrayList<Prize> prizes;
    private boolean answered;

    //Constructor
    public Cell() {
        this.questions = new ArrayList<>();
        this.prizes = new ArrayList<>();
        this.answered = false;
    }

    //Método que añade una pregunta a una celda
    public void addQuestion(Question question) {
        questions.add(question);
    }

    //Método que añade un premio a una celda
    public void addPrize(Prize prize) {
        prizes.add(prize);
    }

    //Método que devuelve un objeto Pregunta, sólo la primera pregunta, para simplificar
    public Question getQuestion() {
        return questions.getFirst();
    }

    //Método que devuelve un objeto Premio, sólo el primer premio, para simplificar
    public Prize getPrize() {
        return prizes.getFirst();
    }

    //Devuelve si la pregunta ha sido o no contestada
    public boolean isAnswered() {
        return answered;
    }

    //Setter, marca una pregunta como contestada
    public void setAnswered(boolean answered) {
        this.answered = answered;
    }
}

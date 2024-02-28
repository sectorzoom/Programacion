package Practica_POO_Polimorfismo;

//Clase que especifica las Preguntas de Verdadero o Falso, hereda de la Clase Abstracta Pregunta
public class TrueFalseQuestion extends Question {

    //Constructor
    public TrueFalseQuestion(String question, boolean correctAnswer) {
        super(question, null, correctAnswer ? "verdadero" : "falso");
    }

}
package Practica_POO_Polimorfismo;


//Clase que especifica las Preguntas de Opción Múltiple, hereda de la Clase Abstracta Pregunta
public class MultiAnswerQuestion extends Question {

    //Constructor
    public MultiAnswerQuestion(String question, String[] answers, String correctAnswer) {
        super(question, answers, correctAnswer);
    }

}

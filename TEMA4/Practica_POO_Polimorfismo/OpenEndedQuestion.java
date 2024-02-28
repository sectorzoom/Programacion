package Practica_POO_Polimorfismo;

//Clase que especifica las Preguntas de Respuesta Corta, hereda de la Clase Abstracta Pregunta
public class OpenEndedQuestion extends Question {

    //Constructor
    public OpenEndedQuestion(String question, String correctAnswer) {
        super(question, null, correctAnswer.toLowerCase());
    }

}


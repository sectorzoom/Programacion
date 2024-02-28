package Practica_POO_Polimorfismo;

//Clase que especifica las Preguntas de Hueco en Blanco, hereda de la Clase Abstracta Pregunta
public class FillInBlankQuestion extends Question {

    //Constructor
    public FillInBlankQuestion(String question, String correctAnswer) {
        super(question, null, correctAnswer);
    }


}


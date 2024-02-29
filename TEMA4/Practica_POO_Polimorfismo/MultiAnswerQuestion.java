package Practica_POO_Polimorfismo;


import java.util.Arrays;

//Clase que especifica las Preguntas de Opción Múltiple, hereda de la Clase Abstracta Pregunta
public class MultiAnswerQuestion extends Question {

    //Constructor
    public MultiAnswerQuestion(String question, String[] answers, String correctAnswer) {
        super(question, answers, correctAnswer);
    }

    @Override
    public String getQuestion() {
        StringBuilder stringBuilder = new StringBuilder(super.getQuestion());
        for (int i = 0; i < answers.length; i++) {
            stringBuilder.append("\n").append(i + 1).append(". ").append(answers[i]);
        }
        return stringBuilder.toString();    }

}

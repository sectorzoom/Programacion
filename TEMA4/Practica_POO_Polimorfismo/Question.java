package Practica_POO_Polimorfismo;

//Clase que define a las Preguntas del Concurso
public abstract class Question {

    // Parámetros
    protected String question;
    protected String[] answers;
    protected String correctAnswer;
    protected boolean answered;

    //Constructor
    public Question(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.answered = false;
    }

    // Método abstracto para la verificación si ha sido respondida
    public boolean verifyIfIsGoodAnswer(String answer) {
        answered = true;
        return answer.trim().equalsIgnoreCase(correctAnswer);
    }

    // Getter, devuelve la pregunta
    public String getQuestion() {
        return question;
    }
}

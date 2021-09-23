package main;

public abstract class Question {

    //Class Variables
    private final String theQuestion;
    private final String theAnswer;

    //Constructors

    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }



    //Methods


    //Getters
    public String getTheQuestion() { return this.theQuestion; }
    public String getTheAnswer() { return this.theQuestion; }


    public abstract boolean checkAnswer(String answer);
}

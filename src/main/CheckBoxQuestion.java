package main;

public class CheckBoxQuestion extends Question {

    //Class Variables

    //Constructors

    public CheckBoxQuestion(String question, String answer){
        super(question, answer);
    }


    //Methods


    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(correctAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}

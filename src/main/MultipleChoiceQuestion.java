package main;

import java.util.Locale;

public class MultipleChoiceQuestion extends Question {

    //Class Variables


    //Constructors
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
   //Case Insensitive
        if (answer.toUpperCase().equals(correctAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}

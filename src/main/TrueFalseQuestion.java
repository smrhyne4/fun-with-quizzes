package main;

public class TrueFalseQuestion extends Question {

    //Class Variables

    //Constructors

    public TrueFalseQuestion(String question, String answer){
        super(question, answer);
    }


    //Methods


    @Override
    public boolean checkAnswer(String answer) {

        if (answer.toLowerCase().equals(this.getTheAnswer().toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}

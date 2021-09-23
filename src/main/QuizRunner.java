package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

    MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What is the largest animal" +
            " in the world today?\nA: Blue Whale\nB: African Elephant\nC: House Cat\nPlease type a single letter as" +
            "an answer.", "A");
    myQuiz.addQuestion(myMultipleChoiceQuestion);

    CheckBoxQuestion myCheckBoxQuestionQuestion = new CheckBoxQuestion("Select all that apply, " +
            "which animals are venomous?\nA" +
            " Chicken\nB Cooperhead Snake\nC Greening's Frog\nD Horse", "B, C");
    myQuiz.addQuestion(myCheckBoxQuestionQuestion);

    TrueFalseQuestion myTrueFlaseQuestion = new TrueFalseQuestion("Are chickens omnivores?" +
            " \n True or False?", "True");
    myQuiz.addQuestion(myTrueFlaseQuestion);

    myQuiz.runQuiz();
    }
}

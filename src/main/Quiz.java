package main;

import java.util.ArrayList;
import java.util.Scanner;

//Add questions
//Run or carry out the quiz
//Grade the quiz

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private final Scanner scanner = new Scanner(System.in);
    //Constructor

    public Quiz() {

    }

    //Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //Loop through each question
        for (Question question : questions) {
        //Ask Questions
            System.out.println(question.getTheQuestion());
        //Get the Users Answer
        String usersAnswer = this.getUsersAnswer();
        //Check Answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);

            if(userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        double percentageCorrect = (this.numberOfQuestionsCorrect / this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswer() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }


}

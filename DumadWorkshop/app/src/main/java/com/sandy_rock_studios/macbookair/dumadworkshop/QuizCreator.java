package com.sandy_rock_studios.macbookair.dumadworkshop;

/**
 * Created by macbookair on 10/22/17.
 */

import java.util.ArrayList;

public class QuizCreator {
    public static Quiz createQuiz(){
        Question[] animalQuestions = new Question[3];

        ArrayList<Answer> animalWrongAnswers = new ArrayList<Answer>();
        animalWrongAnswers.add(new Answer("Cat", "https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/cat.jpg?alt=media&token=069fdbff-4e5a-4375-8d94-0f0e8afc6f04"));
        animalWrongAnswers.add(new Answer ("Cow","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/cow.jpg?alt=media&token=6a263167-b23a-467d-bd7c-b7bfe8d8f286"));
        animalWrongAnswers.add(new Answer ("Dog","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/cow.jpg?alt=media&token=6a263167-b23a-467d-bd7c-b7bfe8d8f286"));
        animalWrongAnswers.add(new Answer ("Dolphin","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/dolphin.jpg?alt=media&token=c92e55b8-4de0-49fe-8f07-8883c2659eb8"));
        Answer animalRightAnswer = new Answer("Frog", "https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/frog.jpg?alt=media&token=31a14014-966d-43f8-a1ce-17072cfbe7e7");
        Question animalQuestion = new Question();
        animalQuestion.wrongAnswers = animalWrongAnswers;
        animalQuestion.correctAnswer = animalRightAnswer;
        animalQuestion.question = "Which animal is this?";
        animalQuestions[0] = animalQuestion;

        ArrayList<Answer> animalWrongAnswers2 = new ArrayList<Answer>();
        animalWrongAnswers2.add(new Answer("Giraffe","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/giraffe.jpg?alt=media&token=0a3ad96f-b498-46f5-9e75-5ce78212cb1e"));
        animalWrongAnswers2.add(new Answer("Pig","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/pig.jpg?alt=media&token=4573c21a-9401-4b38-b2ae-b9c8dcf42e3c"));
        animalWrongAnswers2.add(new Answer("Rabbit","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/rabbit.jpg?alt=media&token=16c2ef14-38a5-4c36-9b9f-63f2e26f70f1"));
        animalWrongAnswers2.add(new Answer("Sheep", "https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/sheep.jpg?alt=media&token=70b0add9-836b-48ea-9d83-16c27a0649f0"));
        Answer animalRightAnswer2 = new Answer("Dolphin","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/dolphin.jpg?alt=media&token=c92e55b8-4de0-49fe-8f07-8883c2659eb8");
        Question animalQuestion2 = new Question();
        animalQuestion2.wrongAnswers = animalWrongAnswers2;
        animalQuestion2.correctAnswer = animalRightAnswer2;
        animalQuestion2.question = "Which animal is this?";
        animalQuestions[1] = animalQuestion2;

        ArrayList<Answer> animalWrongAnswers3 = new ArrayList<Answer>();
        animalWrongAnswers3.add(new Answer ("Dog","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/cow.jpg?alt=media&token=6a263167-b23a-467d-bd7c-b7bfe8d8f286"));
        animalWrongAnswers3.add(new Answer("Pig","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/pig.jpg?alt=media&token=4573c21a-9401-4b38-b2ae-b9c8dcf42e3c"));
        animalWrongAnswers3.add(new Answer("Frog", "https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/frog.jpg?alt=media&token=31a14014-966d-43f8-a1ce-17072cfbe7e7"));
        animalWrongAnswers3.add(new Answer("Cat", "https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/cat.jpg?alt=media&token=069fdbff-4e5a-4375-8d94-0f0e8afc6f04"));
        Answer animalRightAnswer3 = new Answer("Giraffe","https://firebasestorage.googleapis.com/v0/b/quizapp-2be48.appspot.com/o/giraffe.jpg?alt=media&token=0a3ad96f-b498-46f5-9e75-5ce78212cb1e");
        Question animalQuestion3 = new Question();
        animalQuestion3.wrongAnswers = animalWrongAnswers3;
        animalQuestion3.correctAnswer = animalRightAnswer3;
        animalQuestion3.question = "Which animal is this?";
        animalQuestions[2] = animalQuestion3;


        return new Quiz("Animal Quiz", animalQuestions);
    }
}

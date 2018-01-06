package com.sandy_rock_studios.macbookair.dumadworkshop;

/**
 * Created by macbookair on 10/1/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
public class Quiz {
    ArrayList<Question> questions;
    String title;

    public Quiz(){

    }
    public Quiz(String title, Question[] questions){
        this.title = title;
        this.questions = new ArrayList<>(Arrays.asList(questions));

    }


    public String getTitle(){
        return title;
    }

    public int size(){
        return questions.size();
    }

    public Question getQuestion(int index){
        if(0 <= index && index < questions.size()){
            return questions.get(index);
        }
        throw new IndexOutOfBoundsException("bad index " + index);
    }
}
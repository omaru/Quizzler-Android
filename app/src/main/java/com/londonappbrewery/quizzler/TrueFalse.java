package com.londonappbrewery.quizzler;

/**
 * Created by omaru on 17/09/17.
 */

public class TrueFalse {
    private int questionId;
    private boolean answer;

    public TrueFalse(int questionId, boolean answer){
        this.questionId = questionId;
        this.answer = answer;
    }
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

}

package com_country_city.country_city_java.countrycitygame.Moduls;

import java.util.HashMap;

public class ItemQuestion {

    private int image, answer;
    private String question, optionOne, optionTwo, optionThree, optionFour;

    public ItemQuestion(int image, String question, int answer, String optionOne, String optionTwo, String optionThree, String optionFour) {
        this.image = image;
        this.question = question;
        this.answer = answer;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
    }

    public int getImage() {
        return image;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }
}

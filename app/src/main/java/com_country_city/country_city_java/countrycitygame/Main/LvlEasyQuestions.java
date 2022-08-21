package com_country_city.country_city_java.countrycitygame.Main;

import android.content.Context;

import java.util.ArrayList;
import java.util.Random;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class LvlEasyQuestions {

    private ArrayList<ItemQuestion> list;
    private Context context;

    public LvlEasyQuestions(ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }



    protected void addQuestionsAndOptionsForLvl1() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_1), 3,
                context.getResources().getString(R.string.easy_lvl_question_1_option_1), context.getResources().getString(R.string.easy_lvl_question_1_option_2),
                context.getResources().getString(R.string.easy_lvl_question_1_option_3), context.getResources().getString(R.string.easy_lvl_question_1_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_2), 2,
                context.getResources().getString(R.string.easy_lvl_question_2_option_1), context.getResources().getString(R.string.easy_lvl_question_2_option_2),
                context.getResources().getString(R.string.easy_lvl_question_2_option_3), context.getResources().getString(R.string.easy_lvl_question_2_option_4)));

        list.add(new ItemQuestion(R.drawable.img_compas_question, context.getResources().getString(R.string.easy_lvl_question_3), 1,
                context.getResources().getString(R.string.easy_lvl_question_3_option_1), context.getResources().getString(R.string.easy_lvl_question_3_option_2),
                context.getResources().getString(R.string.easy_lvl_question_3_option_3), context.getResources().getString(R.string.easy_lvl_question_3_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_4), 4,
                context.getResources().getString(R.string.easy_lvl_question_4_option_1), context.getResources().getString(R.string.easy_lvl_question_4_option_2),
                context.getResources().getString(R.string.easy_lvl_question_4_option_3), context.getResources().getString(R.string.easy_lvl_question_4_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_5), 2,
                context.getResources().getString(R.string.easy_lvl_question_5_option_1), context.getResources().getString(R.string.easy_lvl_question_5_option_2),
                context.getResources().getString(R.string.easy_lvl_question_5_option_3), context.getResources().getString(R.string.easy_lvl_question_5_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_6), 2,
                context.getResources().getString(R.string.easy_lvl_question_6_option_1), context.getResources().getString(R.string.easy_lvl_question_6_option_2),
                context.getResources().getString(R.string.easy_lvl_question_6_option_3), context.getResources().getString(R.string.easy_lvl_question_6_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_7), 1,
                context.getResources().getString(R.string.easy_lvl_question_7_option_1), context.getResources().getString(R.string.easy_lvl_question_7_option_2),
                context.getResources().getString(R.string.easy_lvl_question_7_option_3), context.getResources().getString(R.string.easy_lvl_question_7_option_4)));

        list.add(new ItemQuestion(R.drawable.img_australia_question, context.getResources().getString(R.string.easy_lvl_question_8), 1,
                context.getResources().getString(R.string.easy_lvl_question_8_option_1), context.getResources().getString(R.string.easy_lvl_question_8_option_2),
                context.getResources().getString(R.string.easy_lvl_question_8_option_3), context.getResources().getString(R.string.easy_lvl_question_8_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_9), 4,
                context.getResources().getString(R.string.easy_lvl_question_9_option_1), context.getResources().getString(R.string.easy_lvl_question_9_option_2),
                context.getResources().getString(R.string.easy_lvl_question_9_option_3), context.getResources().getString(R.string.easy_lvl_question_9_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_10), 3,
                context.getResources().getString(R.string.easy_lvl_question_10_option_1), context.getResources().getString(R.string.easy_lvl_question_10_option_2),
                context.getResources().getString(R.string.easy_lvl_question_10_option_3), context.getResources().getString(R.string.easy_lvl_question_10_option_4)));

    }


    protected void addQuestionsAndOptionsForLvl2() {
        list.add(new ItemQuestion(0, "What is the capital of Mexico?", 3,
                "Bangkok", "San Francisco",
                "Mexico city", "Moscow"));

        list.add(new ItemQuestion(0, "What is the name of the tallest mountain in the world?", 3,
                "Mount 1", "Mount 2",
                "Mount Everest", "Mount 4"));

        list.add(new ItemQuestion(0, "What is the name of the longest river in Africa?", 1,
                "The Nile River", "Lena",
                "Ti-ti-ca-ca", "Murmansk"));

        list.add(new ItemQuestion(R.drawable.img_flag_german, "What country this flag belongs to?", 1,
                "German", "GB",
                "France", "USA"));
    }

    protected void addQuestionsAndOptionsForLvl3() {

        list.add(new ItemQuestion(0, "What is the capital of Mexico?", 3,
                "Bangkok", "San Francisco",
                "Mexico city", "Moscow"));

        list.add(new ItemQuestion(0, "What is the name of the tallest mountain in the world?", 3,
                "Mount 1", "Mount 2",
                "Mount Everest", "Mount 4"));

        list.add(new ItemQuestion(0, "What is the name of the longest river in Africa?", 1,
                "The Nile River", "Lena",
                "Ti-ti-ca-ca", "Murmansk"));

        list.add(new ItemQuestion(R.drawable.img_flag_german, "What country this flag belongs to?", 1,
                "German", "GB",
                "France", "USA"));

    }

    protected void addQuestionsAndOptionsForLvl4() {}

    protected void addQuestionsAndOptionsForLvl5() {}

    protected void addQuestionsAndOptionsForLvl6() {}


}

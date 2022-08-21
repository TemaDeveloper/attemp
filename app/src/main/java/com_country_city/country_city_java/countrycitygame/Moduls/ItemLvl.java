package com_country_city.country_city_java.countrycitygame.Moduls;

public class ItemLvl {

   private String num, score;
   private int imgCircle;
   private boolean enabling = true;

    public ItemLvl(int imgCircle, String title, String score) {
        this.imgCircle = imgCircle;
        this.num = title;
        this.score = score;
    }



    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean isEnabling() {
        return enabling;
    }

    public void setEnabling(boolean enabling) {
        this.enabling = enabling;
    }

    public int getImgCircle() {
        return imgCircle;
    }

    public void setImgCircle(int imgCircle) {
        this.imgCircle = imgCircle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

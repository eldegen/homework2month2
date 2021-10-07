package com.company;

public class Food implements Printable{
    private Boolean isTastyForMe;
    private int quality;

    public Food(Boolean isTastyForMe, int quality) {
        this.isTastyForMe = isTastyForMe;
        this.quality = quality;
    }

    public Boolean getTastyForMe() {
        return isTastyForMe;
    }

    public void setTastyForMe(Boolean tastyForMe) {
        isTastyForMe = tastyForMe;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void print() {

    }
}

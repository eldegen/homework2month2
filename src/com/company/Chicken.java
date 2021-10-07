package com.company;

public class Chicken extends Food implements Printable{
    private boolean isMincedMeat;
    private String sideDish;

    public Chicken(Boolean isTastyForMe, int quality, boolean isMincedMeat, String sideDish) {
        super(isTastyForMe, quality);
        this.isMincedMeat = isMincedMeat;
        this.sideDish = sideDish;
    }

    public boolean isMincedMeat() {
        return isMincedMeat;
    }

    public void setMincedMeat(boolean mincedMeat) {
        isMincedMeat = mincedMeat;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    @Override
    public void print() {
        System.out.println("Chicken 🍗: is tasty for me? - " + getTastyForMe() + " | quality - " + getQuality() + " stars | is minced meat? - " +
                isMincedMeat() + " | side dish - " + getSideDish());
    }
}

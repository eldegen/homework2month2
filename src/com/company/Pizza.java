package com.company;

public class Pizza extends Food implements Printable{
    private boolean isVegetarian;
    private int howManyOlives;

    public Pizza(Boolean isTastyForMe, int quality, boolean isVegetarian, int howManyOlives) {
        super(isTastyForMe, quality);
        this.isVegetarian = isVegetarian;
        this.howManyOlives = howManyOlives;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getHowManyOlives() {
        return howManyOlives;
    }

    public void setHowManyOlives(int howManyOlives) {
        this.howManyOlives = howManyOlives;
    }

    @Override
    public void print() {
        System.out.println("Pizza 🍕: is tasty for me? - " + getTastyForMe() + " | quality - " + getQuality() + " stars | is vegetarian - " +
                isVegetarian() + " | how many olives? - " + getHowManyOlives() + " olives");
    }
}

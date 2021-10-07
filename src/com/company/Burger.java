package com.company;

public class Burger extends Food implements Printable{
    private String typeOfCutlet;

    public Burger(Boolean isTastyForMe, int quality, String typeOfCutlet) {
        super(isTastyForMe, quality);
        this.typeOfCutlet = typeOfCutlet;
    }

    public String getTypeOfCutlet() {
        return typeOfCutlet;
    }

    public void setTypeOfCutlet(String typeOfCutlet) {
        this.typeOfCutlet = typeOfCutlet;
    }

    @Override
    public void print() {
        System.out.println("Burger 🍔: is tasty for me? - " + getTastyForMe() + " | quality - " + getQuality() + " stars | type of cutlet - " +
                getTypeOfCutlet());
    }
}

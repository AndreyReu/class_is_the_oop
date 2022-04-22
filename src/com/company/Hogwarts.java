package com.company;

public class Hogwarts {

    private String magician;
    private int sorcery;
    private int transgress;

    public Hogwarts(String magician, int sorcery, int transgress) {
        this.magician = magician;
        this.sorcery = sorcery;
        this.transgress = transgress;
    }

    public String getMagician() {
        return magician;
    }

    public void setMagician(String magician) {
        this.magician = magician;
    }

    public int getSorcery() {
        return sorcery;
    }

    public void setSorcery(int sorcery) {
        this.sorcery = sorcery;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}

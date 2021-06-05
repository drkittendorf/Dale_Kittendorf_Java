package com.LizardsofTheBoast;

public class Constable extends PersonClass {

    public Constable (String name) {
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
    }


    protected String jurisdiction;

    public void arrest () {
        System.out.println("Constable " + name + " Says: You got a mailbox on your bumper and bald front tire. Outta the car... \n");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public void run() {

    }

    @Override
    public void heal() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void decreaseHealth() {

    }

    @Override
    public void increaseStamina() {

    }

    @Override
    public void decreaseStamina() {

    }
}

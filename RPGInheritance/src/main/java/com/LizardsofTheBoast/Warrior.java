package com.LizardsofTheBoast;

public class Warrior extends PersonClass {

    protected Integer shieldStrength;

    public void decreaseShieldStrength(){
        System.out.println("Warrior " + name + " beats shield badly! \n");
    }


    public Integer getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(Integer shieldStrength) {
        this.shieldStrength = shieldStrength;
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

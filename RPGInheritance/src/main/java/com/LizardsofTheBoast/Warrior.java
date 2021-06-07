package com.LizardsofTheBoast;

public class Warrior extends PersonClass {

    public Warrior (String name) {
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);

    }

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

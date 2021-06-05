package com.LizardsofTheBoast;

public class Farmer extends PersonClass {

    public Farmer (String name)    {
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }


    public void plow(){
        System.out.println("Farmer " + name + " Sows the seeds of love like its 1989 \n");
    }
    public void harvest(){
        System.out.println("Farmer " + name + " Reaps what they sow like its 1889 \n");
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

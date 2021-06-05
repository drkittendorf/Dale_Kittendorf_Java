package com.LizardsofTheBoast;

public class Main {

    public static void main(String[] args) {
        Farmer ferd = new Farmer ();
        ferd.setName("Ferd");
        ferd.setStrength(75);
        ferd.setHealth(100);
        ferd.setStamina(75);
        ferd.setSpeed(10);
        ferd.setAttackPower(1);


        Constable bobby = new Constable();
        bobby.setName("Bobby");
        bobby.setStrength(60);
        bobby.setHealth(100);
        bobby.setStamina(60);
        bobby.setSpeed(20);
        bobby.setAttackPower(5);
        bobby.setJurisdiction("Tamriel");



        Warrior ultimate = new Warrior();
        ultimate.setName("Ultimate");
        ultimate.setStrength(75);
        ultimate.setHealth(100);
        ultimate.setStamina(100);
        ultimate.setSpeed(50);
        ultimate.setAttackPower(10);
        ultimate.setShieldStrength(100);


        ferd.plow();
        bobby.arrest();
        ultimate.decreaseShieldStrength();
        ferd.harvest();

    }






}

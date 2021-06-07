package com.LizardsofTheBoast;

public class Main {

    public static void main(String[] args) {

        Farmer ferd = new Farmer("Ferd");
        ferd.setName("Ferd");
        Warrior ultimate = new Warrior("Ultimate");
        ultimate.setName("Ultimate");
        Constable bobby = new Constable("Bobby");
        bobby.setName("Bobby");
        bobby.setJurisdiction("Tamriel");




        ferd.plow();
        bobby.arrest();
        ultimate.decreaseShieldStrength();
        ferd.harvest();
        System.out.println("Ferd's Strength is " + ferd.getStrength());
        System.out.println("Bobby's Jurisdiction is all of " +  bobby.getJurisdiction());
        System.out.println("Ultimate's Strength and Stamina is " + ultimate.getStrength() + " and  " + ultimate.getStamina());
    }






}

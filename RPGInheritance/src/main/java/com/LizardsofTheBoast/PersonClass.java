package com.LizardsofTheBoast;

public abstract class PersonClass {
    protected String name;
    protected Integer strength;
    protected Integer health;
    protected Integer speed;
    protected Integer attackPower;


    public abstract void run();
    public abstract void heal();
    public abstract void attack();
    public abstract void decreaseHealth();
    public abstract void increaseStamina();
    public abstract void decreaseStamina();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(String attackPower) {
        this.attackPower = attackPower;
    }
}



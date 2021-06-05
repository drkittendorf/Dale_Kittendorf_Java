package com.LizardsofTheBoast;

public abstract class PersonClass {
    protected String name;
    protected Integer strength;
    protected Integer health;
    protected Integer stamina;
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

    public Integer getStrength() {
               return strength;

    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }
}



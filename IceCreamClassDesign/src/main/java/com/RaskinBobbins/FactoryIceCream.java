package com.RaskinBobbins;

import java.util.Objects;

public class FactoryIceCream {
    private String flavorName;
    private Long vatNumber;
    private Boolean limitedEdition;
    private Boolean lactose;


    public FactoryIceCream(String flavorName, Long vatNumber, Boolean limitedEdition, Boolean lactose) {
        this.flavorName = flavorName;
        this.vatNumber = vatNumber;
        this.limitedEdition = limitedEdition;
        this.lactose = lactose;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(Long vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Boolean getLimitedEdition() {
        return limitedEdition;
    }

    public void setLimitedEdition(Boolean limitedEdition) {
        this.limitedEdition = limitedEdition;
    }

    public Boolean getLactose() {
        return lactose;
    }

    public void setLactose(Boolean lactose) {
        this.lactose = lactose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactoryIceCream that = (FactoryIceCream) o;
        return Objects.equals(flavorName, that.flavorName) && Objects.equals(vatNumber, that.vatNumber) && Objects.equals(limitedEdition, that.limitedEdition) && Objects.equals(lactose, that.lactose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorName, vatNumber, limitedEdition, lactose);
    }

    @Override
    public String toString() {
        return "FactoryIceCream{" +
                "flavorName='" + flavorName + '\'' +
                ", vatNumber=" + vatNumber +
                ", limitedEdition=" + limitedEdition +
                ", lactose=" + lactose +
                '}';
    }
}
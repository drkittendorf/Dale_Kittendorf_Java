package com.RaskinBobbins;

import java.util.Objects;

public class FactoryIceCream {
    private String flavorName;
    private int vatNumber;
    private boolean limitedEdition;
    private boolean lactose;


    public FactoryIceCream(String flavorName, int vatNumber, boolean limitedEdition, boolean lactose) {
        this.flavorName = flavorName;
        this.vatNumber = vatNumber;
        this.limitedEdition = limitedEdition;
        this.lactose = lactose;
    }


    private boolean shouldIHurryMyOrder() {
        return this.limitedEdition;
    }

    private boolean shouldIOrderABatchForSensitiveCustomers() {
        return !this.lactose;
    }

    private boolean hasThisFlavorBeenAroundLong() {
        return this.vatNumber <= 100;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public boolean isLimitedEdition() {
        return limitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        this.limitedEdition = limitedEdition;
    }

    public boolean isLactose() {
        return lactose;
    }

    public void setLactose(boolean lactose) {
        this.lactose = lactose;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactoryIceCream that = (FactoryIceCream) o;
        return vatNumber == that.vatNumber && limitedEdition == that.limitedEdition && lactose == that.lactose && Objects.equals(flavorName, that.flavorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorName, vatNumber, limitedEdition, lactose);
    }
}
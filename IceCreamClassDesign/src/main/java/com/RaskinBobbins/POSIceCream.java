package com.RaskinBobbins;

import java.util.Objects;

public class POSIceCream {
    private String flavor;
    private double pricePerScoop;
    private boolean gotMilk;

    public POSIceCream(String flavor, double pricePerScoop, boolean gotMilk) {
        this.flavor = flavor;
        this.pricePerScoop = pricePerScoop;
        this.gotMilk = gotMilk;
    }




    public void sprinkles() {
        System.out.println("So colorful!!!");
    }

    public void waffleCone() {
        System.out.println("so Sweet and its broken ... awww.. ");
    }

    private boolean canIAfford() {
        return this.pricePerScoop < 4.0;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public boolean isGotMilk() {
        return gotMilk;
    }

    public void setGotMilk(boolean gotMilk) {
        this.gotMilk = gotMilk;
    }

    @Override
    public String toString() {
        return "POSIceCream{" +
                "flavor='" + flavor + '\'' +
                ", pricePerScoop=" + pricePerScoop +
                ", gotMilk=" + gotMilk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POSIceCream that = (POSIceCream) o;
        return Double.compare(that.pricePerScoop, pricePerScoop) == 0 && gotMilk == that.gotMilk && Objects.equals(flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, pricePerScoop, gotMilk);
    }
}

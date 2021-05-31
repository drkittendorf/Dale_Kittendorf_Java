package com.RaskinBobbins;

import java.util.Objects;

public class POSIceCream {
    private String flavor;
    private Float pricePerScoop;
    private Boolean gotMilk;

    public POSIceCream (String flavor, Float pricePerScoop, Boolean gotMilk) {
        this.flavor = flavor;
        this.pricePerScoop = pricePerScoop;
        this.gotMilk = gotMilk;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Float getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(Float pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public Boolean getGotMilk() {
        return gotMilk;
    }

    public void setGotMilk(Boolean gotMilk) {
        this.gotMilk = gotMilk;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POSIceCream that = (POSIceCream) o;
        return Objects.equals(flavor, that.flavor) && Objects.equals(pricePerScoop, that.pricePerScoop) && Objects.equals(gotMilk, that.gotMilk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, pricePerScoop, gotMilk);
    }

    @Override
    public String toString() {
        return "POSIceCream{" +
                "flavor='" + flavor + '\'' +
                ", pricePerScoop=" + pricePerScoop +
                ", gotMilk=" + gotMilk +
                '}';
    }

}






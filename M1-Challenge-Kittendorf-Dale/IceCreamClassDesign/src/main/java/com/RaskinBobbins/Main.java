package com.RaskinBobbins;


public class Main {
    public static void main(String[] args) {


        POSIceCream vanilla = new POSIceCream("Vanilla", 3.50, true);
        POSIceCream chocolate = new POSIceCream("Chocolate", 3.50, true);
        POSIceCream orangeSherbet = new POSIceCream("Orange Sherbet", 4.50, false);

        FactoryIceCream vanillaBean = new FactoryIceCream("Vanilla Bean", 1, false, true);
        FactoryIceCream strawberry = new FactoryIceCream("Strawberry", 3, false, true);
        FactoryIceCream saskatchewanRippleBerryNougat = new FactoryIceCream("saskatchewanRippleBerryNougat", 1, true, true);



    }




}

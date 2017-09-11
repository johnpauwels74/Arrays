package com.Arrays.java;

public class Main {

    public static void main(String[] args) {
	// project to demonstrate the use of an array
        String[] HotDogStandSupplyArray = new String[9];
        HotDogStandSupplyArray[0] = "hot dogs";
        HotDogStandSupplyArray[1] = "buns";
        HotDogStandSupplyArray[2] = "ketchup";
        HotDogStandSupplyArray[3] = "mustard";
        HotDogStandSupplyArray[4] = "pickles";
        HotDogStandSupplyArray[5] = "onions";
        HotDogStandSupplyArray[6] = "tomato";
        HotDogStandSupplyArray[7] = "salt";
        HotDogStandSupplyArray[8] = "pepper";

        for(int i = 0; i < HotDogStandSupplyArray.length; i++){
            System.out.println(HotDogStandSupplyArray[i]);
        }
    }
}

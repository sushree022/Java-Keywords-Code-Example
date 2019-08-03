package com.stackroute.innerClass;

// main class for inner class
public class DriverClass {
    public static void main(String[] args) {
//        object of non-static inner class
        Cars.PertrolCar pertrolCar = new Cars().new PertrolCar();
//        method of non-static inner class called
        pertrolCar.run();
//        object of static inner class
        Cars.DieselCar dieselCar = new Cars.DieselCar();
//        method of non-static inner class called
        dieselCar.start();
    }
}

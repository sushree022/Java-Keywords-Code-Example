package com.stackroute.innerClass;

//Implementation of inner classes
// main class
public class Cars {
    //    properties
    private int noOfWheels = 4;
    private String colour;

    //    getters and setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //    non-static inner class
    class PertrolCar {
        public void run() {

            System.out.println(noOfWheels);
            setColour("Red");
            System.out.println(getColour());
            System.out.println("running");
//            local inner class
            class SedanCar {
                public void getMusic() {
                    setColour("Blue");
                    System.out.println(noOfWheels);
                    System.out.println(getColour());
                    System.out.println("Can hear music");
                }
            }
//            object of local inner class created
            SedanCar sedancar = new SedanCar();
            sedancar.getMusic();
        }
    }

    //    static inner class
    static class DieselCar {
        public void start() {
            Cars dieselCar = new Cars();
            dieselCar.setColour("Green");
            System.out.println(dieselCar.noOfWheels);
            System.out.println(dieselCar.getColour());
            System.out.println("starts");

        }
    }
}
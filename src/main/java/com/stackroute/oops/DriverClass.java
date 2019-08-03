package com.stackroute.oops;

// Main class
public class DriverClass {
    public static void main(String args[]) {
//        object of lakme class created
        Lakme lakme = new Lakme();
        System.out.println("Lakme lipstick is having following characteristics: ");
//        values are set using setters
        lakme.setId(1);
        lakme.setColour("Red");
//        values are get using getters
        System.out.println("Id of the lipstick is: " + lakme.getId());
        System.out.println("colour of lipstick of this id is: " + lakme.getColour());
//        use of enum
        System.out.println("Type of lipstick is: " + LipstickImpl.TypeOfLipstick.Glossy);
        System.out.println("Lipstick is sealed: " + lakme.isSeal());
//        calling the method of LipstickImpl class through Lakme
        lakme.createLipstick();

    }
}

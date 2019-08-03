package com.stackroute.oops;

// Lipstickimpl class implements Lipstick
public class LipstickImpl implements Lipsticks {
    //    use of enum
    enum TypeOfLipstick {
        Matte, Glossy;
    }

    //    Declaration of variables
    private int id;
    private String colour;
    private boolean seal = true;

    //    constructors
    public LipstickImpl() {
    }

    public LipstickImpl(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    //    getters and setters
    public boolean isSeal() {
        return seal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //    method of lipstick interface over ridden
    @Override
    public void createLipstick() {
        System.out.println("Lipstick got created");
    }
}

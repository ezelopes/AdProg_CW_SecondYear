package mypackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Type4 extends Cardboard {

    public Type4(double width, double length, double height, String grade, String colour, boolean reinfBottom, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, colour, reinfBottom, sealTop, quantity);
        cost = calculatePrice();
    }

    /**
     *
     * @return final price of the cardboard
     */
    @Override
    public double calculatePrice() {
        double basicCost = basicCost();
        double additionalCost = 0;
        if(this.isSealableTop() == true) additionalCost += basicCost*0.1; //additional sealable top
        additionalCost += basicCost * 0.15; //additional 2 colours
        additionalCost += basicCost * 0.13; //additional bottom reinforcement
        cost = basicCost + additionalCost;
        cost *= this.quantity;
        return cost;
        //return this.cost *= 1.28;
    }
    
    public String getInformation(){
        return super.getInformation() + " - Colour " + this.colour + " - Bottom Re. " + this.reinfBottom;
    }
}
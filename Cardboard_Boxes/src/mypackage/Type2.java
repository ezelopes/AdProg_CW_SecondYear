package mypackage;


/**
 *
 * @author Andrew
 */
public class Type2 extends Cardboard {

    public Type2(double width, double length, double height, String grade, String colour, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, colour, sealTop, quantity);
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
        additionalCost += basicCost * 0.12; //additional 1 colour
        cost = basicCost + additionalCost;
        cost *= this.quantity;
        return cost;
        //return this.cost *= 1.12;   
    }
    
     public String getInformation(){
        return super.getInformation() + " - Colour " + this.colour;
    }
}
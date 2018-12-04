package mypackage;

/**
 * Child class of Cardboard
 */
public class Type2 extends Cardboard {

    public Type2(double width, double length, double height, String grade, String colour, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, colour, sealTop, quantity);
        cost = calculatePrice();
    }

     /**
     * Override the abstract method to calculate final price
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
    
    /**
    * Override the parent method, implementing new information based on the child
    * @return String containing the info of the cardboard
    */
     public String getInformation(){
        return super.getInformation() + " - Colour " + this.colour;
    }
}
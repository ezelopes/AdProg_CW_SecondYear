package mypackage;

/**
 * Child class of Cardboard
 */
public class Type5 extends Cardboard {

    public Type5(double width, double length, double height, String grade, String colour, boolean reinfBottom, boolean reinfCorner, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, colour, reinfBottom, reinfCorner, sealTop, quantity);
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
        additionalCost += basicCost * 0.15; //additional 2 colours
        additionalCost += basicCost * 0.13; //additional bottom reinforcement
        additionalCost += basicCost * 0.12; //additional corner reinforcement
        cost = basicCost + additionalCost;
        cost *= this.quantity;
        return cost;
        //return this.cost *= 1.3;
    }
    
    /**
    * Override the parent method, implementing new information based on the child
    * @return String containing the info of the cardboard
    */
     public String getInformation(){
        return super.getInformation() + " - Colour " + this.colour + " - Bottom Re. " + this.reinfBottom + " - Corner Re. " + this.reinfCorner;
    }

}

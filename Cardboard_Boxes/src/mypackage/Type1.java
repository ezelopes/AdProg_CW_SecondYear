package mypackage;

/**
 * Child class of Cardboard
 */
public class Type1 extends Cardboard {

    public Type1(double width, double length, double height, String grade, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, sealTop, quantity); //do not need colour & reinforcement
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
        if(sealableTop == true) additionalCost += basicCost*0.1;       
        cost = basicCost + additionalCost;
        cost *= this.quantity;
        return cost;
    }
    
    /**
    * Override the parent method, implementing new information based on the child
    * @return String containing the info of the cardboard
    */
    @Override
    public String getInformation(){
        return super.getInformation();
    }

}

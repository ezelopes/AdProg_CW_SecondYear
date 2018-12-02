package mypackage;


/**
 *
 * @author Andrew
 */
public class Type1 extends Cardboard {

    public Type1(double width, double length, double height, String grade, boolean sealTop, Integer quantity) {
        super(width, length, height, grade, sealTop, quantity); //do not need colour & reinforcement
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
        if(sealableTop == true){
            double sealableTopPrice = basicCost*0.1;
            additionalCost += sealableTopPrice;
        }        
        cost = basicCost + additionalCost;
        cost *= this.quantity;
        return cost;
    }
    
    public String getInformation(){
        return super.getInformation();
    }

}

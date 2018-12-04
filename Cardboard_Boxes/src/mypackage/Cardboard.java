package mypackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Abstract class of the Cardboard Boxes System
 * @author lopese
 */
public abstract class Cardboard {
    protected Integer quantity;
    protected double width, length, height;
    protected String grade, colour;
    protected boolean reinfBottom, reinfCorner, sealableTop;
    protected double[] gradeCosts = new double[]{0.55, 0.65, 0.82, 0.98, 1.5}; // Fixed costs of the grades
    protected double cost;
    
     /**
     * Construct a new box with the box specifications used by all other box
     * types
     *
     * @param inputWidth the width of the box
     * @param inputLength the length of the box
     * @param inputHeight the height of the box
     * @param inputGrade the grade of the box
     * @param inputColours the colours of the box
     * @param inputReinforcedBottom the reinforced state of the box
     * @param inputReinforcedCorners the reinforced state of the box
     * @param inputSealableTops the sealable state of the box
     * @param inputBoxQuantity the quantity of boxes
     */
    public Cardboard(double width, double length, double height, String grade, String colour, boolean reinfBottom, boolean reinfCorner, boolean sealTop, Integer quantity){
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.colour = colour;
        this.reinfBottom = reinfBottom;
        this.reinfCorner = reinfCorner;
        this.sealableTop = sealTop;
        this.quantity = quantity;
    }
    
    public Cardboard(double width, double length, double height, String grade, String colour, boolean reinfBottom, boolean sealTop, Integer quantity){
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.colour = colour;
        this.reinfBottom = reinfBottom;
        this.sealableTop = sealTop;
        this.quantity = quantity;
    }
    
    public Cardboard(double width, double length, double height, String grade, String colour, boolean sealTop, Integer quantity){
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.colour = colour;
        this.sealableTop = sealTop;
        this.quantity = quantity;
    }
    
    public Cardboard(double width, double length, double height, String grade, boolean sealTop, Integer quantity){
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealTop;
        this.quantity = quantity;
    }
    
    /**
    * @return the width
    */
    public double getWidth() {
        return width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @return the reinfBottom
     */
    public boolean isReinfBott() {
        return reinfBottom;
    }

    /**
     * @return the reinfCorner
     */
    public boolean isReinfCorner() {
        return reinfCorner;
    }
    
    /**
     * @return the sealableTop
     */
    public boolean isSealableTop() {
        return sealableTop;
    }
    
        /**
     * @return the gradeCosts
     */
    public double[] getGradeCosts() {
        return gradeCosts;
    }
    
    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }
    
    /**
    * Abstract method to be overridden within child class
    * Calculate final price of the current order of the box
    */
    public abstract double calculatePrice();
    
    /**
    * Method to calculate the basic cost of the box, independently from the Type
    * @return a double value containing the cost of the cardboard
    */
    public double basicCost(){
        int index = Integer.parseInt(this.grade)-1;
        double surface = 2*(height*length + height*width + length*width);
        double basicCost = surface * getGradeCosts()[index];/*(double) Math.round(surface * getGradeCosts()[index] * 100) / 100;*/
        return basicCost;
    }
    
    /**
    * Method to get the basic information of the Cardboard, such as cost, grade, sealable status and quantity
    * @return a String value containing the info of the cardboard
    */
    public String getInformation(){
       String info = "Cost " + String.format("%.2f", this.cost) + "£ - Grade " + this.grade + " - Sealable " + this.sealableTop + " - Quantity " + this.quantity;
       return info; 
    }

}

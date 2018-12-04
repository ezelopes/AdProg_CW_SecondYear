package gui;


import java.util.ArrayList;


/**
* Enum class to set default values for types
* This Enum class allow the control over the user input
*/
public enum Type {
    ONE(new String[]{"1", "2", "3"},"0", false, false), 
    TWO(new String[]{"2","3", "4"},"1", false, false),
    THREE(new String[]{"2","3", "4", "5"},"2", false, false),
    FOUR(new String[]{"2","3", "4", "5"},"2", true, false), 
    FIVE(new String[]{"3", "4", "5"},"2", true, true);
    
    private String[] gradesType;
    private String colour;
    private boolean reinforcedBottom, reinforcedCorner;
    
    // Constructor of the Type class
    Type(String[] gradesType, String colour, boolean reinforcedBottom, boolean reinforcedCorner){
        this.gradesType = gradesType;
        this.colour = colour;
        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorner = reinforcedCorner;
    }
    
    /**
    * Method to return values corresponding to one of the Enum Types
    * @return an ArrayList containing the 2nd, 3rd and 4th values of the selected Type
    */
    public ArrayList getValues(){
        ArrayList values = new ArrayList();
        values.add(this.colour);
        values.add(this.reinforcedBottom);
        values.add(this.reinforcedCorner);
        return values;
    }
    
    /**
    * Method to return possible grades of the selected Type
    * @return an Array of String containing the possible grades of the selected Type
    */
    public String[] getPossibleGrades(){
        return this.gradesType;
    }
}

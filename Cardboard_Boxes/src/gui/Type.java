package gui;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lopese
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
    
    Type(String[] gradesType, String colour, boolean reinforcedBottom, boolean reinforcedCorner){
        this.gradesType = gradesType;
        this.colour = colour;
        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorner = reinforcedCorner;
    }
    
    public ArrayList getValues(){
        ArrayList values = new ArrayList();
        values.add(this.colour);
        values.add(this.reinforcedBottom);
        values.add(this.reinforcedCorner);
        return values;
    }
    public String[] getPossibleGrades(){
        return this.gradesType;
    }
}

package com.benlink.model;

/**
 * It's a cup o' dice.
 * 
 * @author Ben Link
 *
 */
public class Cup {
    public static final int DEFAULT_DICE_SIDES = 6;
    
    private Die die1;
    private Die die2;
    private Die die3;
    private Die die4;
    private Die die5;
        
    public Cup(){
        die1 = new Die(DEFAULT_DICE_SIDES);
        die2 = new Die(DEFAULT_DICE_SIDES);
        die3 = new Die(DEFAULT_DICE_SIDES);
        die4 = new Die(DEFAULT_DICE_SIDES);
        die5 = new Die(DEFAULT_DICE_SIDES);
    } // end default constructor
    
    public void play(boolean roll1, boolean roll2, boolean roll3, boolean roll4, boolean roll5){
        if(roll1){
            die1.roll();
        }
        if(roll2){
            die2.roll();
        }
        if(roll3){
            die3.roll();
        }
        if(roll4){
            die4.roll();
        }
        if(roll5){
            die5.roll();
        }
        
    } // end play()
    
    public void display(){
            
    } // end Display()
}

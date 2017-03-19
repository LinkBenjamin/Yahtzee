package com.benlink.model;

/**
 * Fortunately not a verb, die is a thing you roll.
 * 
 * @author Ben Link
 *
 */
public class Die {
    private int value;
    private int sides;
    
    /**
     * Default constructor sets up a d6.
     */
    public Die(){
        initialize(6);
    } // End of Default Constructor
    
    /**
     * This is how you set up a die.
     * 
     * @param numberOfSides How many sides does your die have?
     */
    private void initialize(int numberOfSides) {
        setSides(numberOfSides);
        setValue(1);
    } // End of Initialize

    /**
     * Non-default constructor, sets up whatever you ask it to.
     * 
     * @param numberOfSides
     */
    public Die(int numberOfSides){
        if(numberOfSides < 2){
            //If you ask for an invalidly-sized die, you get a d3.
            numberOfSides = 3;
        }
        initialize(numberOfSides);
    } // End of non-default constructor

    /**
     * @return the current value of the die.
     */
    public int getValue() {
        return value;
    } // End of getValue()

    /**
     * @param value The value to set the current die to.
     */
    private void setValue(int value) {
        this.value = value;
    } // End of setValue()

    /**
     * @return The number of sides on this die.
     */
    public int getSides() {
        return sides;
    } // End of getSides()

    /**
     * @param sides The number of sides on this die.
     */
    private void setSides(int sides) {
        this.sides = sides;
    } // End of setSides()
    
    /**
     * @return the value you rolled.  This will also be stored in value
     *         in case you need to get it later.
     */
    public int roll(){
        setValue((int) (Math.random() * ((double) getSides())) + 1);
        return getValue();
    } // End of roll()
    
    /**
     * @param die Other die that you'd like to compare
     * @return Whether the current values are equal.
     */
    public boolean equals(Die die){
        return (getValue() == die.getValue());
    } // End of equals()

	public int compareTo(Die a) {
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;

	    //this optimization is usually worthwhile, and can
	    //always be added
	    if (this == a) return EQUAL;
	    
	    //primitive numbers follow this form
	    if (this.getValue() < a.getValue()) return BEFORE;
	    if (this.getValue() > a.getValue()) return AFTER;
	    
	    return EQUAL;
	}
}

package com.benlink.model;

/**
 * How we keep track of a player's score.
 * 
 * @author Ben Link
 *
 */
public class ScoreCard {
    public static final int SUBTOTAL_1_BONUS_THRESHOLD = 63;
    public static final int SUBTOTAL_1_BONUS_AMOUNT = 35;
    
    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
        
    private int threeOfAKind;
    private int fourOfAKind;
    private int fullHouse;
    private int lowStraight;
    private int highStraight;
    private int yahtzee;
    private int chance;
    
    
    /**
     * Constructor sets all score values = -1
     * because it's not possible to score a -1.
     * That will tell us whether someone's played in a spot before.
     * Cunning, eh?
     */
    public ScoreCard(){
        setOnes(-1);
        setTwos(-1);
        setThrees(-1);
        setFours(-1);
        setFives(-1);
        setSixes(-1);
        
        setThreeOfAKind(-1);
        setFourOfAKind(-1);
        setFullHouse(-1);
        setLowStraight(-1);
        setHighStraight(-1);
        setYahtzee(-1);
        setChance(-1);
        
        
    } // end constructor
    
    /**
     * has played their ones
     * 
     * @return t/f
     */
    public boolean hasPlayedOnes(){
    	return ones >= 0;
    }
    
    /**
     * has played their twos
     * 
     * @return t/f
     */
    public boolean hasPlayedTwos(){
    	return twos >= 0;
    }
    
    /**
     * has played their threes
     * 
     * @return t/f
     */
    public boolean hasPlayedThrees(){
    	return threes >= 0;
    }
    
    /**
     * has played their fours
     * 
     * @return t/f
     */
    public boolean hasPlayedFours(){
    	return fours >= 0;
    }
    
    /**
     * has played their fives
     * 
     * @return t/f
     */
    public boolean hasPlayedFives(){
    	return fives >= 0;
    }
    
    /**
     * has played their sixes
     * 
     * @return t/f
     */
    public boolean hasPlayedSixes(){
    	return sixes >= 0;
    }
    
    /**
     * has played 3ofkind
     * 
     * @return t/f
     */
    public boolean hasPlayedThreeOfAKind(){
    	return threeOfAKind >= 0;
    }
    
    /**
     * has played 4ofkind
     * 
     * @return t/f
     */
    public boolean hasPlayedFourOfAKind(){
    	return fourOfAKind >= 0;
    }
    
    /**
     * has played played yahtzee
     * 
     * @return t/f
     */
    public boolean hasPlayedYahtzee(){
    	return yahtzee >= 0;
    }
    
    /**
     * has played full house... everywhere you look.
     * 
     * @return t/f
     */
    public boolean hasPlayedFullHouse(){
    	return fullHouse >= 0;
    }
    
    /**
     * has played small straight
     * 
     * @return t/f
     */
    public boolean hasPlayedSmallStraight(){
    	return lowStraight >= 0;
    }
    
    /**
     * has played largestraight (not george)
     * 
     * @return t/f
     */
    public boolean hasPlayedLargeStraight(){
    	return highStraight >= 0;
    }
    
    /**
     * has played chance - no community chest?
     * 
     * @return t/f
     */
    public boolean hasPlayedChance(){
    	return chance >= 0;
    }
    
    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getOnes() {
        if(ones < 0){
            return 0;
        }
        
        return ones;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param ones value
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getTwos() {
        if(twos < 0){
            return 0;
        }
        
        return twos;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param twos value
     */
    public void setTwos(int twos) {
        this.twos = twos;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getThrees() {
        if(threes < 0){
            return 0;
        }
        
        return threes;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param threes value
     */
    public void setThrees(int threes) {
        this.threes = threes;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getFours() {
        if(fours < 0){
            return 0;
        }
        
        return fours;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param fours value
     */
    public void setFours(int fours) {
        this.fours = fours;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getFives() {
        if(fives < 0){
            return 0;
        }
        
        return fives;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param fives value
     */
    public void setFives(int fives) {
        this.fives = fives;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getSixes() {
        if(sixes < 0){
            return 0;
        }
        
        return sixes;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param sixes value
     */
    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getThreeOfAKind() {
        if(threeOfAKind < 0){
            return 0;
        }
        
        return threeOfAKind;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param threeOfAKind value
     */
    public void setThreeOfAKind(int threeOfAKind) {
        this.threeOfAKind = threeOfAKind;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getFourOfAKind() {
        if(fourOfAKind < 0){
            return 0;
        }
        
        return fourOfAKind;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param fourOfAKind value
     */
    public void setFourOfAKind(int fourOfAKind) {
        this.fourOfAKind = fourOfAKind;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getFullHouse() {
        if(fullHouse < 0){
            return 0;
        }
        
        return fullHouse;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param fullHouse value
     */
    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getLowStraight() {
        if(lowStraight < 0){
            return 0;
        }
        
        return lowStraight;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param lowStraight value
     */
    public void setLowStraight(int lowStraight) {
        this.lowStraight = lowStraight;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getHighStraight() {
        if(highStraight < 0){
            return 0;
        }
        
        return highStraight;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param highStraight value
     */
    public void setHighStraight(int highStraight) {
        this.highStraight = highStraight;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getYahtzee() {
        if(yahtzee < 0){
            return 0;
        }
        
        return yahtzee;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @param yahtzee value
     */
    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public int getChance() {
        if(chance < 0){
            return 0;
        }
        
        return chance;
    }

    /**
     * I'm tired of this level of javadoc
     * 
     * @return value
     */
    public void setChance(int chance) {
        this.chance = chance;
    }
    
    /**
     * Display the scorecard.
     */
    public void displayCard(){
    	System.out.println(" ");
    	System.out.println("+---------------+");
    	System.out.println("| Ones          |  " + getOnes() );
    	System.out.println("| Twos          |  " + getTwos() );
    	System.out.println("| Threes        |  " + getThrees() );
    	System.out.println("| Fours         |  " + getFours() );
    	System.out.println("| Fives         |  " + getFives() );
    	System.out.println("| Sixes         |  " + getSixes() );
    	System.out.println("+---------------+" );
    	System.out.println("| Subtotal 1:   |  " + evaluateSubtotal1() );
    	System.out.println("| Bonus:        |  " + evaluateBonus() );
    	System.out.println("+---------------+");
    	System.out.println("| 3 of a Kind   |  " + getThreeOfAKind() );
    	System.out.println("| 4 of a Kind   |  " + getFourOfAKind() );
    	System.out.println("| Full House    |  " + getFullHouse() );
    	System.out.println("| Sm Straight   |  " + getLowStraight() );
    	System.out.println("| Lg Straight   |  " + getHighStraight() );
    	System.out.println("| Yahtzee       |  " + getYahtzee() );
    	System.out.println("| Chance        |  " + getChance() );
    	System.out.println("+---------------+");
    	System.out.println("| Subtotal 2:   |  " + evaluateSubtotal2() );
    	System.out.println("+---------------+");
    	System.out.println("| Total         |  " + evaluateFinalScore() );
    	System.out.println("+---------------+");
    	System.out.println(" ");    	
    }
    
    
    /**
     * see if they get a bonus
     * 
     * @return bonus points received
     */
    public int evaluateBonus(){
    	if(evaluateSubtotal1() > SUBTOTAL_1_BONUS_THRESHOLD){
    		return SUBTOTAL_1_BONUS_AMOUNT;
    	} else {
    		return 0;
    	}
    }
    
    /**
     * get the first subtotal.
     * 
     * @return subtotal
     */
    public int evaluateSubtotal1(){
        int score = getOnes() + getTwos() + getThrees() + getFours() + getFives() + getSixes();
                
        return score;
    }
    
    /**
     * get the second subtotal.
     * 
     * @return subtotal
     */
    public int evaluateSubtotal2(){
        int score = getThreeOfAKind() + getFourOfAKind() + getFullHouse() + getLowStraight() + getHighStraight() + getYahtzee() + getChance();
        
        return score;
    }
    
    /**
     * get the final score
     * 
     * @return the score
     */
    public int evaluateFinalScore(){
        return evaluateSubtotal1() + evaluateBonus() + evaluateSubtotal2();
    }
}

package com.benlink.model;

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
        
        
    }
    
    public boolean hasPlayedOnes(){
    	return ones >= 0;
    }
    public boolean hasPlayedTwos(){
    	return twos >= 0;
    }
    public boolean hasPlayedThrees(){
    	return threes >= 0;
    }
    public boolean hasPlayedFours(){
    	return fours >= 0;
    }
    public boolean hasPlayedFives(){
    	return fives >= 0;
    }
    public boolean hasPlayedSixes(){
    	return sixes >= 0;
    }
    public boolean hasPlayedThreeOfAKind(){
    	return threeOfAKind >= 0;
    }
    public boolean hasPlayedFourOfAKind(){
    	return fourOfAKind >= 0;
    }
    public boolean hasPlayedYahtzee(){
    	return yahtzee >= 0;
    }
    public boolean hasPlayedFullHouse(){
    	return fullHouse >= 0;
    }
    public boolean hasPlayedSmallStraight(){
    	return lowStraight >= 0;
    }
    public boolean hasPlayedLargeStraight(){
    	return highStraight >= 0;
    }
    public boolean hasPlayedChance(){
    	return chance >= 0;
    }
    
    public int getOnes() {
        if(ones < 0){
            return 0;
        }
        
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public int getTwos() {
        if(twos < 0){
            return 0;
        }
        
        return twos;
    }

    public void setTwos(int twos) {
        this.twos = twos;
    }

    public int getThrees() {
        if(threes < 0){
            return 0;
        }
        
        return threes;
    }

    public void setThrees(int threes) {
        this.threes = threes;
    }

    public int getFours() {
        if(fours < 0){
            return 0;
        }
        
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        if(fives < 0){
            return 0;
        }
        
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        if(sixes < 0){
            return 0;
        }
        
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getThreeOfAKind() {
        if(threeOfAKind < 0){
            return 0;
        }
        
        return threeOfAKind;
    }

    public void setThreeOfAKind(int threeOfAKind) {
        this.threeOfAKind = threeOfAKind;
    }

    public int getFourOfAKind() {
        if(fourOfAKind < 0){
            return 0;
        }
        
        return fourOfAKind;
    }

    public void setFourOfAKind(int fourOfAKind) {
        this.fourOfAKind = fourOfAKind;
    }

    public int getFullHouse() {
        if(fullHouse < 0){
            return 0;
        }
        
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getLowStraight() {
        if(lowStraight < 0){
            return 0;
        }
        
        return lowStraight;
    }

    public void setLowStraight(int lowStraight) {
        this.lowStraight = lowStraight;
    }

    public int getHighStraight() {
        if(highStraight < 0){
            return 0;
        }
        
        return highStraight;
    }

    public void setHighStraight(int highStraight) {
        this.highStraight = highStraight;
    }

    public int getYahtzee() {
        if(yahtzee < 0){
            return 0;
        }
        
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public int getChance() {
        if(chance < 0){
            return 0;
        }
        
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
    
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
    
    public int evaluateBonus(){
    	if(evaluateSubtotal1() > SUBTOTAL_1_BONUS_THRESHOLD){
    		return SUBTOTAL_1_BONUS_AMOUNT;
    	} else {
    		return 0;
    	}
    }
    
    public int evaluateSubtotal1(){
        int score = getOnes() + getTwos() + getThrees() + getFours() + getFives() + getSixes();
                
        return score;
    }
    
    public int evaluateSubtotal2(){
        int score = getThreeOfAKind() + getFourOfAKind() + getFullHouse() + getLowStraight() + getHighStraight() + getYahtzee() + getChance();
        
        return score;
    }
    
    public int evaluateFinalScore(){
        return evaluateSubtotal1() + evaluateBonus() + evaluateSubtotal2();
    }
}

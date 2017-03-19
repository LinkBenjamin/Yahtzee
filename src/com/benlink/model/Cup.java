package com.benlink.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.benlink.enums.MenuChoice;

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
    	System.out.println(" ");
    	System.out.println("+-----.-----.-----.-----.-----.-----+");
    	System.out.println("|Die# |  1  |  2  |  3  |  4  |  5  |");
    	System.out.println("+-----.-----.-----.-----.-----.-----+");
    	System.out.println("|Value|  " + die1.getValue() + "  |  " + die2.getValue() + "  |  " + die3.getValue() + "  |  " + die4.getValue() + "  |  " + die5.getValue() + "  |");
    	System.out.println("+-----+-----.-----.-----.-----.-----+");
    } // end Display()

	public int evaluate(MenuChoice choice) {
		int score = 0;
		
		List<Die> dice = new ArrayList<Die>();
		dice.add(die1);
		dice.add(die2);
		dice.add(die3);
		dice.add(die4);
		dice.add(die5);
		
		Collections.sort(dice, (a, b) -> a.compareTo(b));
		
		int ofAKind = countOfAKind(dice); 
		int straightLength = calculateStraight(dice);
		int numberOfDifferentValues = countUniqueValues(dice);
		
		switch(choice){
		case ONES:
			for(Die d: dice){
				if(d.getValue() == 1){
					score += d.getValue();
				}
			}
			break;
		case TWOS:
			for(Die d: dice){
				if(d.getValue() == 2){
					score += d.getValue();
				}
			}
			break;
		case THREES:
			for(Die d: dice){
				if(d.getValue() == 3){
					score += d.getValue();
				}
			}
			break;
		case FOURS:
			for(Die d: dice){
				if(d.getValue() == 4){
					score += d.getValue();
				}
			}
			break;
		case FIVES:
			for(Die d: dice){
				if(d.getValue() == 5){
					score += d.getValue();
				}
			}
			break;
		case SIXES:
			for(Die d: dice){
				if(d.getValue() == 6){
					score += d.getValue();
				}
			}
			break;
		case THREEOFAKIND:
			if(ofAKind >= 3){
				score = sum(dice);
			} else {
				score = 0;
			}
			break;
		case FOUROFAKIND:
			if(ofAKind >= 4){
				score = sum(dice);
			} else {
				score = 0;
			}
			break;
		case FULLHOUSE:
			if(ofAKind == 3 && numberOfDifferentValues == 2){
				score = 25;
			}
			break;
		case SMALLSTRAIGHT:
			if(straightLength >= 4){
				score = 30;
			} else {
				score = 0;
			}
			break;
		case LARGESTRAIGHT:
			if(straightLength == 5){
				score = 40;
			} else {
				score = 0;
			}
			break;
		case YAHTZEE:
			if(ofAKind == 5){
				score = sum(dice);
			} else {
				score = 0;
			}
			break;
		case CHANCE:
			score = sum(dice);
			break;
		default:
			score = 0;
			break;
		}
		return score;
	}

	private int countUniqueValues(List<Die> dice) {
		int uniqueValues = 0;
		int lastValue = 0;
		
		for(Die d: dice){
			if(d.getValue() != lastValue){
				uniqueValues++;
				lastValue = d.getValue();
			}
		}
		
		return uniqueValues;
	}

	private int calculateStraight(List<Die> dice) {
		int returnValue = 0;
		int previousDie = 0;

		for(Die d: dice){
			if(returnValue == 0){
				returnValue = 1;
				previousDie = d.getValue(); 
			} else {
				if(d.getValue() == previousDie + 1){
					returnValue++;
					previousDie = d.getValue();
				}
			}
		}
		return returnValue++;
	}

	private int sum(List<Die> dice) {
		int result = 0;
		
		for(Die d: dice){
			result += d.getValue();
		}
		
		return result;
	}

	private int countOfAKind(List<Die> dice) {
		int largestOfAKind = 0;
		int ofAKind = 0;
		int value = 0;
		
		for(Die d: dice){
			if(value == 0){
				ofAKind = 1;
				value = d.getValue();
			} else {
				if(d.getValue() == value){
					ofAKind++;
				} else {
					if(ofAKind > largestOfAKind){
						largestOfAKind = ofAKind;
					}
					ofAKind = 1;
					value = d.getValue();
				}
			}
		}
		
		if(ofAKind > largestOfAKind){
			largestOfAKind = ofAKind;
		}
		
		return largestOfAKind;
	}
}

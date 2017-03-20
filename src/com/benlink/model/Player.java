package com.benlink.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.benlink.enums.MenuChoice;

/**
 * Players gonna play play play play play...
 * 
 * @author Ben Link
 *
 */
public class Player {
	private String name;
	private ScoreCard scoreCard;
	
	/**
	 * Constructors gonna construct
	 */
	public Player(){
		setScoreCard(new ScoreCard());
	} // end constructor

	/**
	 * gets the Name.  Profound.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	} // end getName

	/**
	 * sets the Name.  Profound.
	 * 
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	} //end setName

	/**
	 * gets the player's scorecard.
	 * 
	 * @return the scorecard.
	 */
	public ScoreCard getScoreCard() {
		return scoreCard;
	} // end getScoreCard

	/**
	 * sets the player's scorecard.
	 * 
	 * @param scoreCard the scorecard.
	 */
	public void setScoreCard(ScoreCard scoreCard) {
		this.scoreCard = scoreCard;
	} // end setScoreCard

	/**
	 * How to take a player's turn.
	 * They can roll any or all of the dice up to 3 distinct times.
	 * Then they have to select where it goes.
	 * 
	 * @param dice  The dice.
	 * @param ioDevice The device.
	 */
	public void takeTurn(Cup dice, Scanner ioDevice) {
		System.out.println("It's " + name + "'s turn. " + name + "'s scorecard: ");
		
		getScoreCard().displayCard();
		
		int subRoundNumber = 1;
		boolean scoreAccepted = false;
		boolean roll1 = true, roll2 = true, roll3 = true, roll4 = true, roll5 = true;
		
		//Outer loop: roll the selected dice.
		//tell 'em what they won.

		do {
			boolean repeatMenu = true;
			
			dice.play(roll1, roll2, roll3, roll4, roll5);
			
			System.out.println(name + " has rolled the following dice: ");
			
			//Inner loop: let 'em select dice to hold and re-roll,
			//or just elect to score right away.
			//they get up to 3 rolls.
			do{
				
				dice.display();
				
				if(subRoundNumber < 3){
					displayHolds(roll1, roll2, roll3, roll4, roll5);
				}
				
				MenuChoice choice = turnMenu(dice, subRoundNumber, ioDevice);
				
				// select the dice to put back, or select a scoring option.
				switch(choice){
				case HOLD1:
					if(roll1){
						System.out.println("Holding Die #1");
					} else {
						System.out.println("Un-holding Die #1");
					}
					roll1 = !roll1;
					break;
				case HOLD2:
					if(roll2){
						System.out.println("Holding Die #2");
					} else {
						System.out.println("Un-holding Die #2");
					}
					roll2 = !roll2;
					break;
				case HOLD3:
					if(roll3){
						System.out.println("Holding Die #3");
					} else {
						System.out.println("Un-holding Die #3");
					}
					roll3 = !roll3;
					break;				
				case HOLD4:
					if(roll4){
						System.out.println("Holding Die #4");
					} else {
						System.out.println("Un-holding Die #4");
					}
					roll4 = !roll4;
					break;				
				case HOLD5:
					if(roll5){
						System.out.println("Holding Die #5");
					} else {
						System.out.println("Un-holding Die #5");
					}
					roll5 = !roll5;
					break;
				case REROLL:
					subRoundNumber++;
					repeatMenu = false;
					break;
					
				default: // Picked a scoring option
					score(dice, choice);
					scoreAccepted = true;
					repeatMenu = false;
					break;
				}
			} while (repeatMenu); //end inner loop
						
		} while (!scoreAccepted && (subRoundNumber <= 3)); //end outer loop
		
	} // end takeTurn

	/**
	 * Display an X on the dice that they've elected to hold.
	 * 
	 * @param roll1 Hold die1?
	 * @param roll2 Hold die2?
	 * @param roll3 Hold die3?
	 * @param roll4 Hold die4?
	 * @param roll5 Hold die5?
	 */
	private void displayHolds(boolean roll1, boolean roll2, boolean roll3, boolean roll4, boolean roll5) {
		System.out.print("|Hold |  ");
		if(roll1){
			System.out.print(" ");
		} else {
			System.out.print("X");
		}
		System.out.print("  |  ");
		if(roll2){
			System.out.print(" ");
		} else {
			System.out.print("X");
		}
		System.out.print("  |  ");
		if(roll3){
			System.out.print(" ");
		} else {
			System.out.print("X");
		}
		System.out.print("  |  ");
		if(roll4){
			System.out.print(" ");
		} else {
			System.out.print("X");
		}
		System.out.print("  |  ");
		if(roll5){
			System.out.print(" ");
		} else {
			System.out.print("X");
		}
		System.out.print("  |");
		System.out.println(" ");
		System.out.println("+-----+-----+-----+-----+-----+-----+");
		
	} // end DisplayHolds

	/**
	 * Set the score in the place on the card that they elected
	 * to put it.
	 * 
	 * @param dice the current dice.
	 * @param choice the place on the card.
	 */
	private void score(Cup dice, MenuChoice choice) {
		int scoreValue = dice.evaluate(choice);
		
		switch(choice){
		case ONES:
			scoreCard.setOnes(scoreValue);
			break;
		case TWOS:
			scoreCard.setTwos(scoreValue);
			break;
		case THREES:
			scoreCard.setThrees(scoreValue);
			break;
		case FOURS:
			scoreCard.setFours(scoreValue);
			break;
		case FIVES:
			scoreCard.setFives(scoreValue);
			break;
		case SIXES:
			scoreCard.setSixes(scoreValue);
			break;
		case THREEOFAKIND:
			scoreCard.setThreeOfAKind(scoreValue);
			break;
		case FOUROFAKIND:
			scoreCard.setFourOfAKind(scoreValue);
			break;
		case FULLHOUSE:
			scoreCard.setFullHouse(scoreValue);
			break;
		case SMALLSTRAIGHT:
			scoreCard.setLowStraight(scoreValue);
			break;
		case LARGESTRAIGHT:
			scoreCard.setHighStraight(scoreValue);
			break;
		case YAHTZEE:
			scoreCard.setYahtzee(scoreValue);
			break;
		case CHANCE:
			scoreCard.setChance(scoreValue);
			break;
		default:
			break;
		} // end switch
	} // end score

	/**
	 * Display the turn menu.
	 * Only display the options they're allowed to pick.
	 * And only allow them to pick the options they're allowed to pick.
	 * 
	 * @param dice the dice.
	 * @param subRoundNumber which roll they're on in their turn (1-3)
	 * @param ioDevice the io device.
	 * @return which option they selected.
	 */
	private MenuChoice turnMenu(Cup dice, int subRoundNumber, Scanner ioDevice) {
		// for each item in the enum
		List<String> validMoves = new ArrayList<String>();
		
		
		for (MenuChoice item: MenuChoice.values()){
			// if it's a scoring move
			if(item.isScoringMove()){
				//		if the user hasn't already placed a value there
				if(!hasPlayed(item)){
					// display the option
					System.out.println(item.getMenuOption() + ": " + item);
					// add it to the list of valid moves this turn
					validMoves.add((item.getMenuOption() + " ").trim());
				}
			
			} else {
				//Only display the non-scoring options if they're allowed
				//to reroll
				if(subRoundNumber < 3){
					// it wasn't a scoring move, so add it.
					System.out.println(item.getMenuOption() + ": " + item);
					// add it to the list of valid moves this turn
					validMoves.add((item.getMenuOption() + " ").trim());
				}
			}
				
		} // end for
		
		// set validResponse = false
		boolean validResponse = false;
		char response;
		
		do{
			// prompt the user to choose an option
			response = askUserChar("Select an option: ", ioDevice);
			
			// validate it
			if(validMoves.contains((response + " ").trim())){
				validResponse = true;
			}	
			
		} while (!validResponse);
		
		// return the valid, selected enum value
		return MenuChoice.getMenuChoiceByMenuOption(response);
	} // end turnMenu

	/**
	 * Find out if they've already played in this slot.
	 * can't overwrite a value we already had.
	 * 
	 * @param item the slot.
	 * @return whether they've played there already.
	 */
	private boolean hasPlayed(MenuChoice item) {
		boolean response = true;
		
		switch(item){
		case ONES:
			response = scoreCard.hasPlayedOnes();
			break;
		case TWOS:
			response = scoreCard.hasPlayedTwos();
			break;
		case THREES:
			response = scoreCard.hasPlayedThrees();
			break;
		case FOURS:
			response = scoreCard.hasPlayedFours();
			break;
		case FIVES:
			response = scoreCard.hasPlayedFives();
			break;
		case SIXES:
			response = scoreCard.hasPlayedSixes();
			break;
		case THREEOFAKIND:
			response = scoreCard.hasPlayedThreeOfAKind();
			break;
		case FOUROFAKIND:
			response = scoreCard.hasPlayedFourOfAKind();
			break;
		case FULLHOUSE:
			response = scoreCard.hasPlayedFullHouse();
			break;
		case SMALLSTRAIGHT:
			response = scoreCard.hasPlayedSmallStraight();
			break;
		case LARGESTRAIGHT:
			response = scoreCard.hasPlayedLargeStraight();
			break;
		case YAHTZEE:
			response = scoreCard.hasPlayedYahtzee();
			break;
		case CHANCE:
			response = scoreCard.hasPlayedChance();
			break;
		default:
			response = true;
			break;
		}
		
		return response;
	} // end hasPlayed
	
    /**
     * Ask the user a question.  Get a character response
     * 
     * @param prompt  What are you asking?
     * @param console The input object
     * @return a String.
     */
    private static char askUserChar(String prompt, Scanner console) {
        
        System.out.print(prompt);
        
        return console.next().trim().charAt(0);
    } //end askUserChar
} // end class Player.

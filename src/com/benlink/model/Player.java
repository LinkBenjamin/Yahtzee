package com.benlink.model;

import java.util.Scanner;

import com.benlink.enums.MenuChoice;

public class Player {
	private String name;
	private ScoreCard scoreCard;
	
	public Player(){
		setScoreCard(new ScoreCard());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ScoreCard getScoreCard() {
		return scoreCard;
	}

	public void setScoreCard(ScoreCard scoreCard) {
		this.scoreCard = scoreCard;
	}

	public void takeTurn(Cup dice, Scanner ioDevice) {
		System.out.println("It's " + name + "'s turn. " + name + "'s scorecard: ");
		
		getScoreCard().displayCard();
		
		int subRoundNumber = 1;
		boolean scoreAccepted = false;
		boolean roll1 = true, roll2 = true, roll3 = true, roll4 = true, roll5 = true;
		
		do {
			dice.play(roll1, roll2, roll3, roll4, roll5);
			
			System.out.println(name + " has rolled the following dice: ");
			dice.display();
			
			// TODO: build a dummy scorecard object with the score values for each type of scoring
			// for this set of dice.  Display that 
			
			boolean repeatMenu = true;
			
			do{
				MenuChoice choice = turnMenu(dice, subRoundNumber);
				
				// select the dice to put back, or select a scoring option.
				switch(choice){
				case HOLD1:
					roll1 = !roll1;
					break;
				case HOLD2:
					roll2 = !roll2;
					break;
				case HOLD3:
					roll3 = !roll3;
					break;				
				case HOLD4:
					roll4 = !roll4;
					break;				
				case HOLD5:
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
			} while (repeatMenu);
			
		} while (!scoreAccepted && (subRoundNumber <= 3));
		
	}

	private void score(Cup dice, MenuChoice choice) {
		// TODO apply the score on the current dice to whichever choice the user selected on their scorecard.
		
	}

	private MenuChoice turnMenu(Cup dice, int subRoundNumber) {
		// for each item in the enum
		// if it's a scoring move
		//		if the user hasn't already placed a value there
		//			display the option
		//			add it to the list of valid moves this turn
		
		// set validResponse = false
		// do 
		// prompt the user to choose an option
		// validate it
		// while not valid response
		
		// return the valid, selected enum value
		return MenuChoice.ONES;
	}
}

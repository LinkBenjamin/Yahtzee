package com.benlink.enums;

/**
 * Menu choices
 * 
 * Each scoring opportunity is labeled with a true, and game actions
 * with a false.  the characters represent the keyboard option that 
 * the user will select to select this value from the menu.
 * 
 * @author Ben Link
 *
 */
public enum MenuChoice {
	ONES(true, 'a'),
	TWOS(true, 'b'),
	THREES(true, 'c'),
	FOURS(true, 'd'),
	FIVES(true, 'e'),
	SIXES(true, 'f'),
	THREEOFAKIND(true, 'g'),
	FOUROFAKIND(true, 'h'),
	FULLHOUSE(true, 'i'),
	SMALLSTRAIGHT(true,'j'),
	LARGESTRAIGHT(true,'k'),
	CHANCE(true, 'l'),
	YAHTZEE(true,'m'),
	
	HOLD1(false, 'n'),
	HOLD2(false, 'o'),
	HOLD3(false, 'p'),
	HOLD4(false, 'q'),
	HOLD5(false, 'r'),
	REROLL(false, 's');
	
	private final boolean scoringMove;
	private final char menuOption;
	
	/**
	 * Constructor initializes the constant values for this instance
	 * 
	 * @param scoringMove scoringMoves are the ones that put a score in a field.
	 * @param menuOption what letter they type to get this option.
	 */
	private MenuChoice(boolean scoringMove, char menuOption){
		this.scoringMove = scoringMove;
		this.menuOption = menuOption;
	} // end constructor
	
	/**
	 * find out if this one is a scoring move.
	 * 
	 * @return t/f
	 */
	public boolean isScoringMove(){
		return scoringMove;
	} // end isScoringMove
	
	/**
	 * get the menu character for this option
	 * 
	 * @return the character.
	 */
	public char getMenuOption(){
		return menuOption;
	} // end getMenuOption
	
	/**
	 * given a character, figure out which enum value they selected.
	 *  
	 * @param option a letter.
	 * @return an enum
	 */
	public static MenuChoice getMenuChoiceByMenuOption(char option){
		for(MenuChoice response: MenuChoice.values()){
			if(response.getMenuOption() == option){
				return response;
			}
		}
		return null;
	} // end getMenuChoiceByMenuOption
}

package com.benlink.enums;

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
	
	private MenuChoice(boolean scoringMove, char menuOption){
		this.scoringMove = scoringMove;
		this.menuOption = menuOption;
	}
	
	public boolean isScoringMove(){
		return scoringMove;
	}
	
	public char getMenuOption(){
		return menuOption;
	}
	
	public static MenuChoice getMenuChoiceByMenuOption(char option){
		for(MenuChoice response: MenuChoice.values()){
			if(response.getMenuOption() == option){
				return response;
			}
		}
		return null;
	}
}

package com.benlink.model;

import java.util.List;
import java.util.Scanner;

/**
 * Play a round of Yahtzee.
 * 
 * @author Ben Link
 *
 */
public class YahtzeeGame {
	public final int ROUND_COUNT = 13; 
	
    private Scanner ioDevice;
    private List<Player> players;
    private Cup dice = new Cup();
    
    /**
     * Constructor requires a Scanner and a List of Players to be provided.
     * 
     * @param device Scanner for keyboard IO
     * @param playerList List of players who are in this round.
     * 
     */
    public YahtzeeGame(Scanner device, List<Player> playerList) {
        setIoDevice(device);
        setPlayers(playerList);
    } // end constructor
    
    /**
     * gets the IO device.  Real shocker.
     * 
     * @return the IO device.
     */
    public Scanner getIoDevice(){
        return ioDevice;
    } // end getIoDevice
    
    /**
     * sets the IO device.  Real shocker.
     * 
     * @param device the IO device.
     */
    public void setIoDevice(Scanner device) { 
        ioDevice = device;
    } // end setIoDevice
    
    /**
     * gets the Player list.   Who knew?
     * 
     * @return the Player List.
     */
    public List<Player> getPlayers() {
        return players;
    } // end getPlayers
    
    /**
     * sets the Player list.  No way...
     * 
     * @param playerList the Player List
     */
    public void setPlayers(List<Player> playerList){
        players = playerList;
    } //end setPlayers
    
    /**
     * Plays the game.  There are a finite number of rounds.
     * There are a known number of players.  2 for loops and we're through.
     */
    public void play() {
        // There are 13 rounds in a game of Yahtzee.  But I'm paranoid that someone might invent a 14th.    	
    	for(int roundNumber = 1; roundNumber <= ROUND_COUNT; roundNumber++){
    		
    		//Each player gets a turn in each round
    		for(Player player: players){
    			
    			player.takeTurn(dice, getIoDevice());
    			
    		}
    		
    	}
    } // end play
    
    /**
     * You'll never believe this but it determines the winner...
     * 
     * @return the winner.
     */
    public Player determineWinner() {
        // figure out who won and send their player object back.
    	int bestScore = 0;
    	Player returnValue = null;
    	
    	for(Player player: players){
    		
    		int myScore = player.getScoreCard().evaluateFinalScore();
    		
    		System.out.println(player.getName() + " scored " + myScore);
    		
    		System.out.println("Scorecard:");
    		
    		player.getScoreCard().displayCard();
    		
    		if(myScore > bestScore) {
    			bestScore = myScore;
    			returnValue = player;
    		}
    	}
    	
    	return returnValue;
    } // end determineWinner
} // end YahtzeeGame class

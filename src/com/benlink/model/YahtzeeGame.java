package com.benlink.model;

import java.util.List;
import java.util.Scanner;

public class YahtzeeGame {
	public final int ROUND_COUNT = 13; 
	
    private Scanner ioDevice;
    private List<Player> players;
    private Cup dice = new Cup();
    
    public YahtzeeGame(Scanner device, List<Player> playerList) {
        setIoDevice(device);
        setPlayers(playerList);
    }
    
    public Scanner getIoDevice(){
        return ioDevice;
    }
    
    public void setIoDevice(Scanner device) { 
        ioDevice = device;
    }
    
    public List<Player> getPlayers() {
        return players;
    }
    
    public void setPlayers(List<Player> playerList){
        players = playerList;
    }
    
    public void play() {
        // There are 13 rounds in a game of Yahtzee.  But I'm paranoid that someone might invent a 14th.    	
    	for(int roundNumber = 1; roundNumber <= ROUND_COUNT; roundNumber++){
    		
    		//Each player gets a turn in each round
    		for(Player player: players){
    			
    			player.takeTurn(dice, getIoDevice());
    			
    		}
    		
    	}
    }
    
    public Player determineWinner() {
        // figure out who won and send their player object back.
    	int bestScore = 0;
    	Player returnValue = null;
    	
    	for(Player player: players){
    		int myScore = player.getScoreCard().evaluateFinalScore();
    		if(myScore > bestScore) {
    			bestScore = myScore;
    			returnValue = player;
    		}
    	}
    	
    	return returnValue;
    }
}

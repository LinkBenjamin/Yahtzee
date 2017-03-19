package com.benlink.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.benlink.model.*;

public class Thing {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        boolean QUIT = false;
        YahtzeeGame game;
        List<Player> players;
        Player winner;
        
        do {
            //Initialize Player List
            players = getPlayerInfo(keyboard);
            
            game = new YahtzeeGame(keyboard, players);
            
            //Play a Game
            game.play();
            
            //Compare Scorecards
            winner = game.determineWinner();
            
            //Announce Winner
            announceWinner(winner);
            
            //Ask if we should play again
            QUIT = !(askUserBoolean("Well, that was a fun game.  Would you like to play again? (y/n): ",keyboard));
        } while (!QUIT);
        
        keyboard.close();
    }
    
    /**
     * getPlayerInfo() assembles a list of players for the current round.  
     * It will at some point need to get their names from the user.
     * 
     * @param console The input device.     * 
     * @return a List of Players who are going to play this round.
     */
    private static List<Player> getPlayerInfo(Scanner console) {
    	List<Player> response = new ArrayList<Player>();
    	int playerCount = 0;
    	
    	do{
    		Player newPlayer = new Player();
    		
    		newPlayer.setName(askUserString("Enter player " + ++playerCount + "'s name: ", console));
            
            //TODO: When you finish making the player
    		
    		response.add(newPlayer);
    		
    	} while (askUserBoolean("Add another player? (y/n):", console));
    	
    	return response;
    }
    
    /**
     * Announce the winning player and show their scorecard
     *
     * @param winner  The Player object of the winning player
     * 
     */
    private static void announceWinner(Player winner){
        System.out.println("The winner is... " + winner.getName() + "!!!!!");
    }
    /**
     * Ask the user a question.  Get a yes or no answer.
     * 
     * @param prompt  What are you asking?
     * @param console The input object
     * @return True = yes, False = no.
     */
    private static boolean askUserBoolean(String prompt, Scanner console) {
        
        boolean response = false;
        boolean valid = false;
        
        System.out.print(prompt);
        
        do{
            String value = console.next();
        
            switch(value.charAt(0)){
                case 'y':
                case 'Y':
                        response = true;
                        valid = true;
                    break;
                case 'n':
                case 'N':
                        response = false;
                        valid = true;
                    break;
                default:
                    System.out.print("Hey. Doofus.  Yes or No only, please? :");
                    valid = false;
                    break;
            }
                    
         } while(!valid);
            
        return response;
    }
    
//    /**
//     * Ask the user a question.  Get an response
//     * 
//     * @param prompt  What are you asking?
//     * @param console The input object
//     * @return a String.
//     */
//    private static int askUserNumber(String prompt, Scanner console) {
//        
//        System.out.print(prompt);
//        
//        return console.nextInt();
//    }
    
        /**
     * Ask the user a question.  Get a String response
     * 
     * @param prompt  What are you asking?
     * @param console The input object
     * @return a String.
     */
    private static String askUserString(String prompt, Scanner console) {
        
        System.out.print(prompt);
        
        return console.next();
    }

}

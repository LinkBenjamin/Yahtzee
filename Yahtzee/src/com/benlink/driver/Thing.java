package com.benlink.driver;

import com.benlink.model.Cup;
import java.util.Scanner;

public class Thing {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        boolean QUIT = false;
        YahtzeeGame game;
        Player winner;
        
        do {
            game = new YahtzeeGame(keyboard);
            
            //Initialize Player List
            game.initialize();
            
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
     * Announce the winning player and show their scorecard
     *
     * @param winner  The Player object of the winning player
     * 
     */
    private static void announceWinner(Player winner){
        System.out.println("Haven't written it yet");
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

}

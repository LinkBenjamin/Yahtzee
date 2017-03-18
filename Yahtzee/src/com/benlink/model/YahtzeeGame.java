package com.benlink.model;

public Class YahtzeeGame() {
    private Scanner ioDevice;
    private List<Player> players;
    
    public YahtzeeGame() {
        setIoDevice(new Scanner(System.in));
    } 
    
    public YahtzeeGame(Scanner device) {
        setIoDevice(device);
    }
    
    public Scanner getIoDevice(){
        return ioDevice;
    }
    
    public void setIoDevice(Scanner device) { 
        ioDevice = device;
    }
    
    
    public initialize() {
        //Get player lists
        
    }
    
    public void play() {
        // Play a round of Yahtzee for all the players in the list.
    }
    
    public Player determineWinner() {
        // figure out who won and send their player object back.
    }
}

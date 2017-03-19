package com.benlink.model;

public Class YahtzeeGame() {
    private Scanner ioDevice;
    private List<Player> players;
    
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
        // Play a round of Yahtzee for all the players in the list.
    }
    
    public Player determineWinner() {
        // figure out who won and send their player object back.
    }
}

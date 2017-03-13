package com.benlink.driver;

import com.benlink.model.Cup;

public class Thing {

    public static void main(String[] args) {
        Cup cup = new Cup();
        
        cup.play(true, true, true, true, true);
        cup.display();
    }

}

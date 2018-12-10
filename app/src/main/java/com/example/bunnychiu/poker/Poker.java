package com.example.bunnychiu.poker;

public class Poker {
    Cards[] cards = new Cards[52];
    public Poker(){
        for (int q = 0 ;q<52 ;q++){
            cards[q] = new Cards(q);
        }
    }


}

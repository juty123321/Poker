package com.example.bunnychiu.poker;

public class Cards {
    char[] flowers = {'H','S','D','C'};
    int value;
    public Cards(int value){
        this.value = value;
    }

    public String get(){
        return value %13 + 1 +" "+ flowers[value/13];
    }
}

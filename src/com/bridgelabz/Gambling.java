package com.bridgelabz;

public class Gambling {
    static int STAKE = 100;
    static int BET = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Game");
        int result = 0;
        int out = (int) (Math.random() * 2);

        if (out == 1){
            System.out.println("Initial balance was " + STAKE);
            System.out.println("You won the game");
            result = STAKE + BET;
            System.out.println("Final balance is " + result);
        }else {
            System.out.println("Initial balance was " + STAKE);
            System.out.println("You won the game");
            result = STAKE - BET;
            System.out.println("Final balance is " + result);
        }
    }
}

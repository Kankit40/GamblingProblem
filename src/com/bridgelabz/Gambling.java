package com.bridgelabz;

import java.util.Stack;

public class Gambling {
    static int STAKE = 100;
    static int BET = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Game");
        int totalAmount = 100;
        int play = 0;

        while (totalAmount >50 && totalAmount<150) {
            play++;
            int out = (int) (Math.random() * 2);
            if (out == 1) {
                System.out.println("You won the game");
                totalAmount = totalAmount +  BET;
                System.out.println("Final balance is " + totalAmount);
            } else {
                System.out.println("You lost the game");
                totalAmount = totalAmount - BET;
                System.out.println("Final balance is " + totalAmount);
            }

        }
        System.out.println("The number of time played are " + play);
    }
}
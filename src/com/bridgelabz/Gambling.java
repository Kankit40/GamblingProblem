package com.bridgelabz;

import java.util.Stack;

public class Gambling {
    static int BET = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Game");
        int won = 0;
        int loss = 0;

        for (int i = 0; i < 20; i++) {

            int totalAmount = 100;
            int play = 0;


            while (totalAmount > 50 && totalAmount < 150) {
                play++;
                int out = (int) (Math.random() * 2);
                if (out == 1) {
                    totalAmount = totalAmount + BET;
                } else {
                    totalAmount = totalAmount - BET;
                }
            }
            int max = totalAmount;
            System.out.println("The number of time played are " + play);
            System.out.println("Total amount in hand " + totalAmount + " on day " + i);
            if (max > 100) {
                won++;
                System.out.println("You won with 50$");
            } else {
                loss++;
                System.out.println("You lost with 50%");
            }
        }
        System.out.println("The number of days won in this month " + won);
        System.out.println("The number of days won in this month " + loss);
    }
}